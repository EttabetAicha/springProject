package com.aicha.maska.controller;

import com.aicha.maska.domain.Membre;
import com.aicha.maska.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

@Controller
@RequestMapping("/members")
public class MembreController {

    @Autowired
    private MembreService membreService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(LocalDate.class, new LocalDateEditor("yyyy-MM-dd"));
    }

    private static class LocalDateEditor extends java.beans.PropertyEditorSupport {
        private final DateTimeFormatter dateFormatter;

        public LocalDateEditor(String pattern) {
            this.dateFormatter = DateTimeFormatter.ofPattern(pattern);
        }

        @Override
        public void setAsText(String text) {
            try {
                LocalDate date = LocalDate.parse(text, dateFormatter);
                setValue(date);
            } catch (DateTimeParseException e) {
                setValue(null); // or handle the error as needed
            }
        }
    }

    @GetMapping
    public String listMembres(Model model) {
        List<Membre> membres = membreService.getAllMembres();
        model.addAttribute("members", membres);
        return "listMembres";
    }

    @GetMapping("/add")
    public String showAddMembreForm(Model model) {
        model.addAttribute("membre", new Membre());
        return "addMembre";
    }

    @PostMapping
    public String addMembre(@Valid @ModelAttribute("membre") Membre membre, BindingResult result) {
        if (result.hasErrors()) {
            return "addMembre";
        }
        System.out.println("Date Adhesion: " + membre.getDateadhesion());
        System.out.println("Date Expiration Licence: " + membre.getDateexpirationlicence());

        membreService.addMembre(membre);
        return "redirect:/members";
    }


    @GetMapping("/update/{id}")
    public String showUpdateMembreForm(@PathVariable Integer id, Model model) {
        Membre membre = membreService.getMembreById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid membre Id:" + id));
        model.addAttribute("membre", membre);
        return "updateMembre";
    }

    @PostMapping("/delete/{id}")
    public String deleteMembre(@PathVariable("id") Integer id) {
        Membre membre = membreService.getMembreById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid membre Id:" + id));
        membreService.deleteMembre(id);
        return "redirect:/members";
    }

}
