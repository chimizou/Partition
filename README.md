# Adneom: Projet Partition

Dans le cadre d'un processus de recrutement il est demandé de développer une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.

## Pour commencer

Veuillez éxecuter les commandes suivantes dans le dossier désiré pour rapatrier le projet en local pour d'éventuels tests/développements:
```
git init
git remote add origin https://github.com/chimizou/Partition.git
git pull origin master
```
### Prérequis

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Compiler 
  NB: Veuillez changer votre variable d'environnement JAVA_HOME pour pointer vers la jdk 8
* [Maven](https://maven.apache.org/) - Dependency Management

### Installation

#### Quelques informations fonctionnelles

La fonction « partition » prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
Exemples d'entrées et sorties :

partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]

#### Lancement des tests

Veuillez exécuter les commandes dans le dossier contenant le projet pour lancer la totalité des tests du projet.
```
mvn test
```

## Auteurs

* **chimizou** - [chimizou](https://github.com/chimizou)
