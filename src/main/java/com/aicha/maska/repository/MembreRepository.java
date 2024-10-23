package com.aicha.maska.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aicha.maska.domain.Membre;
@Repository
public interface MembreRepository extends JpaRepository<Membre, Integer> {
}
