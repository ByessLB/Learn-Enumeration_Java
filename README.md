# Enumerations

## Introduction

### Qu'est ce qu'une énumération ?

Une énumération (ou `enum`) en Java est un type de données spécial qui permet de définir un ensemble de constantes nommées. Les énumérations sont utilisées pour représenter des ensembles de valeurs fixes, comme les jours de la semaine, les mois de l'année, ou les directions (nord, sud, est, ouest).

### Pourquoi utiliser des énumérations ?

Les énumérations offrent plusieurs avantages :

- **Type-safety** : Elles permettent de définir des types de données spécifiques, réduisant ainsi les erreurs de type.
- **Lisibilité** : Elles rendent le code plus lisible et plus facile à comprendre.
- **Maintenabilité** : Elles facilitent la maintenance du code en centralisant les constantes.

## Déclaration d'une Enumération

### Syntaxe de Base

Une énumération est déclarée à l'aide du mot-clé `enum`.

```java
public enum JourSemaine {
    LUNDI,
    MARDI,
    MERCREDI,
    JEUDI,
    VENDREDI,
    SAMEDI,
    DIMANCHE;
}
```

### Utilisation d'une Enumération

Les énumérations peuvent être utilisées comme n'importe quel autre type de données.

```java
public class Main {
    public static void main(String[] args) {
        JourSemaine jour = JourSemaine.LUNDI;

        switch (jour) {
            case LUNDI:
                System.out.println("Aujourd'hui est lundi.");
                break;
            case MARDI:
                System.out.println("Aujourd'hui est mardi.");
                break;
            // Ajoutez les autres cas ici
            default:
                System.out.println("Aujourd'hui est un autre jour.");
        }
    }
}
```

## Méthodes et Constructeurs dans les Enumérations

### Ajout de Méthodes

Les énumérations peuvent contenir des méthodes, des constructeurs et des variables d'instance.

```java
public enum JourSemaine {
    LUNDI("Lundi"),
    MARDI("Mardi"),
    MERCREDI("Mercredi"),
    JEUDI("Jeudi"),
    VENDREDI("Vendredi"),
    SAMEDI("Samedi"),
    DIMANCHE("Dimanche")

    private String nomFrancais;

    // Constructeur
    JourSemaine(String nomFrancais) {
        this.nomFrancais = nomFrancais;
    }

    // Méthodes
    public String getNomFrancais() {
        return nomFrancais;
    }
}
```

### Utilisation des Méthodes

```java
public class Main {
    public static void main(String[] args) {
        JourSemaine jour = JourSemaine.LUNDI;
        System.out.println("Le jour en français est : " + jour.getNomFrancais()); // Affiche "Lundi"
    }
}
```

## Méthodes Prédéfinies

### Méthodes de la Classe `Enum`

Les énumérations en Java héritent de la classe `java.lang.Enum`, qui fournit plusieurs méthodes utiles :

- `name()` : Retourne le nom de la constante.
- `ordinal()` : Retourne l'ordre de la constante dans l'énumération (kindex de base 0).
- `values()` : Retourne un tableau contenant toutes les constantes de l'énumération.
- `valueOf(String s)` : Retourne la constante de l'énumération correspondant à la chaîne spécifié.

```java
public class Main {
    public static void main(String[] args) {
        JourSemaine jour = JourSemaine.LUNDI;

        System.out.println("Nom : " + jour.name());
        System.out.println("Position : " + jour.ordinal());

        JourSemaine[] jours = JourSemaine.values();
        for (JourSemaine j : jours) {
            System.out.println(j);
        }

        JourSemaine jourParNom = JourSemaine.valuesOf("MARDI");
        System.out.println("Jour par nom : " + jourParNom);
    }
}
```

## Implémentation d'interfaces

### Enumérations et Interfaces

Les énumérations peuvent implémenter des interfaces, ce qui permet d'ajouter des comportements spécifiques.

```java
public interface JourTravaille {
    boolean estJourTravaille();
}

public enum JourSemaine implements JourTravaille {
    LUNDI("Lundi") {
        @Override
        public boolean estJourTravaille() {
            return true;
        }
    },
    MARDI("Mardi") {
        @Override
        public boolean estJourTravaille() {
            return true;
        }
    },
    MERCREDI("Mercredi") {
        @Override
        public boolean estJourTravaille() {
            return true;
        }
    },
    JEUDI("Jeudi") {
        @Override
        public boolean estJourTravaille() {
            return true;
        }
    },
    VENDREDI("Vendredi") {
        @Override
        public boolean estJourTravaille() {
            return true;
        }
    },
    SAMEDI("Samedi") {
        @Override
        public boolean estJourTravaille() {
            return false;
        }
    },
    DIMANCHE("Dimanche") {
        @Override
        public boolean estJourTravaille() {
            return false;
        }
    };

    private String nomFrancais;

    JourSemaine(String nomFrancais) {
        this.nomFrancais = nomFrancais;
    }

    public String getNomFrancais() {
        return nomFrancais;
    }
}
```

### Utilisation de l'interface

```java
public class Main {
    public static void main(String[] args) {
        JourSemaine jour = JourSemaine.LUNDI;
        System.out.println("Est-ce un jour travaillé ? " + jour.estJourTravaille());
    }
}
```

## Conclusion

Les énumérations en Java sont un moyen puissant et flexible de définir des ensembles de constantes nommées. Elles offrent des avantages et termes de type-safety, de lisibilité et de maintenance du code. En utilisant les énumérations, vous pouvez rendre votre code plus robustre et plus facile à comprendre.
