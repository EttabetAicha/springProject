## CADRE SPRING

Cette application est un système de gestion des utilisateurs de base
construit en utilisant Spring Core sans Spring Boot,
Spring MVC et Spring Data JPA. Elle permet aux utilisateurs d'effectuer des opérations CRUD
telles que la création, la visualisation, la mise à jour et la suppression d'utilisateurs via une interface web.

## Table des matières
- [Structure du projet](#structure-du-projet)
- [Injection de dépendances (DI)](#injection-de-dépendances-di)
- [Inversion de contrôle (IoC)](#inversion-de-contrôle-ioc)
- [Beans Spring](#beans-spring)
- [Portées des beans](#portées-des-beans)
- [ApplicationContext](#applicationcontext)
- [Scan de composants et annotations stéréotypes](#scan-de-composants-et-annotations-stéréotypes)
- [Spring Data JPA](#spring-data-jpa)
- [Spring MVC](#spring-mvc)
- [Installation et configuration](#installation-et-configuration)

### Structure du projet
Le projet suit une structure de répertoires standard Maven :

   ```
src/
├── main/ 
│ ├── java/
│ │ └── com/
│ │ └── aicha/ 
│ │ └── maska/
│ │ ├── config/ 
│ │ ├── controller/
│ │ ├── domain/ 
│ │ ├── repository/ 
│ │ └── service/ 
│ ├── resources/
│ │ └── applicationContext.xml 
│ └── webapp/ 
│ ├── WEB-INF/ 
│ │ └── views/
│ └── jsp/
└── test/ 
└── java/
```
### Injection de dépendances (DI)
L'injection de dépendances (DI) est un modèle de conception utilisé pour implémenter l'IoC, permettant la création d'objets dépendants en dehors d'une classe et fournissant ces objets à une classe de différentes manières.

### Inversion de contrôle (IoC)
L'inversion de contrôle (IoC) est un principe en ingénierie logicielle par lequel le contrôle des objets ou des portions d'un programme est transféré à un conteneur ou un cadre. Dans Spring, l'IoC est réalisé par le biais de l'injection de dépendances.

### Beans Spring
Les beans Spring sont les objets qui forment l'épine dorsale d'une application Spring. Ils sont gérés par le conteneur IoC de Spring.

### Portées des beans
Spring prend en charge différentes portées pour un bean. Les portées les plus courantes sont :
- Singleton : Une seule instance du bean est créée pour le conteneur Spring.
- Prototype : Une nouvelle instance est créée chaque fois que le bean est demandé.

### ApplicationContext
L'`ApplicationContext` est l'interface centrale pour fournir la configuration d'une application. Elle est en lecture seule pendant que l'application est en cours d'exécution mais peut être rechargée si nécessaire.

### Scan de composants et annotations stéréotypes
Spring peut automatiquement découvrir et enregistrer des beans en utilisant le scan de composants. Les annotations stéréotypes telles que `@Component`, `@Service`, `@Repository` et `@Controller` sont utilisées pour déclarer des classes comme beans Spring.

### Spring Data JPA
Spring Data JPA facilite la mise en œuvre des référentiels basés sur JPA. Il fournit un cadre qui fonctionne avec JPA pour offrir un support de référentiel.

### Spring MVC
Spring MVC est un cadre pour la construction d'applications web. Il suit le modèle de conception Model-View-Controller,
qui divise une application en trois composants principaux :
- le modèle: les données de l'application
- la vue: l'interface utilisateur
- le contrôleur: le composant qui gère les requêtes utilisateur et les rendements de vue


### Installation et configuration
1. **Cloner le dépôt :**
   ```sh
   git clone https://github.com/EttabetAicha/springProject.git
   cd springProject
   code .
    ```