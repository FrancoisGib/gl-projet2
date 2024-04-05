## Projet 2 Génie Logiciel - François Gibier

### Suppression de méthodes inutiles

Suppression des méthodes inutiles et depréciées dans la classe **AbstractDownloader** du package ***downloader*** de **webmagic-core**.
Methodes supprimées:
- onSuccess
- onError
<br/>[Lien de la modification](https://github.com/FrancoisGib/gl-projet2/commit/899ffc95e36ec7a69a8ca89b9b61209770b6d0d2)

### Suppression de dépendances inutiles dans un pom.xml

Suppression de deux dépendances inutilisées dans le **pom.xml** du package **webmagic-samples**.
Les deux dépendances supprimées sont:
- jackson-core
- jackson-annotations
<br/>[Lien de la modification](https://github.com/FrancoisGib/gl-projet2/commit/c73049b061e6f7e687218432d6c0b95ecb3ca2b3)

### Traduction de commentaires et de documentations du chinois vers l'anglais

Traduction de deux classes du chinois vers l'anglais, les classes traduites sont:
- **HttpClientGenerator** du package ***downloader*** dans webmagic-core
- **CustomRedirectStrategy** du package ***downloader*** dans webmagic-core
Le traducteur utilisé est **DeepL**.
<br/>[Lien de la modification](https://github.com/FrancoisGib/gl-projet2/commit/33fb81930e688055d2966d616d961fcb65052361)

### Ajout, migration de documentations sur les attributs, deletion de documentations inutiles

Ajout, suppression, migration dans les attributs de documentations de la classe **Site** du package webmagic-core
<br/>[Lien de la modification](https://github.com/FrancoisGib/gl-projet2/commit/468d1b3896ec6923dc56ec107474baded1a2a292)

### Suppression de code déprécié

Suppression de code déprécié dans la classe WebDriverPool, la méthode supprimée est la méthode setJavascriptEnabled, c'est une méthode dépréciée depuis 2012 et qu'il ne faut plus utiliser. Voici un article parlant de la dépréciation de la méthode. [article](https://googlesamples.github.io/android-custom-lint-rules/checks/SetJavaScriptEnabled.md.html)
<br/>[Lien de la modification](https://github.com/FrancoisGib/gl-projet2/commit/796065b722389c3db04bbf11701f9a1316d11223)

### Fix de selenium et modification du test (test à ignorer car ce n'est pas le seul problème)

Selenium posait problème dans le projet et empêchait de build, j'ai fixé le problème dans la classe **WebDriverPool** en décomposant seulement en ***ChromeOptions*** et ***FirefoxOptions***, pour ce qui est du test, j'ai repris le code d'une méthode afin d'initialiser correctement le caps.
<br/>[Lien de la modification](https://github.com/FrancoisGib/gl-projet2/commit/e5880db88470b85ceca3a71a4e8d28255eba398c)

### Suppression de code commenté

Suppression de code commenté dans 7 fichiers différents, ce sont des bouts de code ou des phrases commentées qui ne servent à rien.
<br/>[Lien de la modification](https://github.com/FrancoisGib/gl-projet2/commit/8d05158fb63405425212c45795c469850bde3465)

### Creation d'une template method remplacant un switch (et modification du test associé, mais qui sera remodifié plus tard)

Création d'une template method dans la classe **ScriptProcessor** du package ***webmagic-scripts***, j'ai modifié l'enum Language en une classe abstraite et fait hériter chacun des anciens élements de l'enum pour en faire une template method, ceci fait respecter le single responsibility principle et créé une couche d'abstraction ce qui est préférable.
<br/>[Lien de la modification](https://github.com/FrancoisGib/gl-projet2/commit/702b68d58bb9d58817400ff5afa8b412f2c6c678)

### Suppression de code inutilisé

Suppression de méthodes, attributs inutilisés dans différents fichiers du projet.
<br/>[Lien de la modification](https://github.com/FrancoisGib/gl-projet2/commit/cfbea0ea421cee3ebdd140a04ba3d3fa026c00e9)
<br/>Et j'ai aussi dû fixer un test associé à du code supprimé.
<br/>[Lien de la modification](https://github.com/FrancoisGib/gl-projet2/commit/3916ef5631ae20bc238b61b2076e2bb76d4c9509)

### Ajout de lombok pour supprimer les getters et setters

Lombok est une librairie qui sert à enlever les getters et setters d'une classe en mettant au dessus de l'attribut concerné ```@Getter``` ou ```@Setter```, j'ai donc ajouté cette librairie à un des packages du projet et j'ai enlevé les getters et setters dans les classes où je pouvais le faire.
<br/>[Lien de la modification](https://github.com/FrancoisGib/gl-projet2/commit/53c808054103bb1eb83de0ec19d738cdd85a9411)

### Ajout d'une template method pour la méthode readOptions dans ScriptConsole

J'ai ajouté une template method pour pouvoir avoir plus facilement et proprement des extensions des paramètres console.
Pour cela j'ai donc créé plusieurs options dans le fichier **CommandLineOptions** et migrer une fonction statique dans le fichier **ConfigLogger**.
Ce changement utilise le polymorphisme au lieu d'avoir beaucoup de if inutiles et réduit les responsabilités de la classe **ScriptConsole** en déléguant les différentes options de configuration à **CommandLineOption**.
De plus ce changement permet d'enlever des dépendances dans la classe **ScriptConsole** ce qui réduit sa visibilité.
<br/>[Lien de la modification](https://github.com/FrancoisGib/gl-projet2/commit/5fed705c047bc6c7da6c726b3b5936064c4e4a96)

### Refactor d'un des plus grosses méthode du projet (processSingle) en implémentant deux strategy pattern

J'ai refactoriser la méthode **processSingle** de la classe ***PageModelExtractor*** dans webmagic-extension.
J'ai d'abord eu une approche avec une stratégie de selection de soit une liste de chaînes de caractères ou une chaîne simple, couplé avec une autre stratégie pour ajouter directement des attributs à la classe passée en paramètres.
Je me suis vite rendu compte que ce n'était pas la meilleure option car je dupliquais mon code dans les classes **SingleSelection** et **MultipleSelection** et ce qui faisait que mon pattern n'était pas vraiment mieux que la méthode de base de webmagic.
<br/>[Lien de la première version](https://github.com/FrancoisGib/gl-projet2/commit/1dd7d71d0f5d7e7e0fe1d8d84a05a1cd1b7ab96b)
<br/>J'ai donc opté pour une autre stratégie, au lieu d'avoir la stratégie de sélection simple ou multiple, j'ai préféré redéfinir l'enum source de la classe FieldExtractor en interface et implémenter pour les différents types de contenus les deux cas (simple et multiple).
Cet interface permet donc d'ajouter facilement d'autres types de contenus et aussi de réduire encore la classe ***PageModelExtractor*** qui a déjà beaucoup trop de responsabilités. De plus, implémenter les sources de cette façon délègue aussi du travail de la classe ***FieldExtractor*** et surtout permet d'être beaucoup plus lisible et compréhensible.
<br/>[Lien de la deuxième version](https://github.com/FrancoisGib/gl-projet2/commit/7405263554ba7c7e6eaad178f153a8c4fff38583)

J'ai effectué des pull request sur le dépôt de webmagic, les deux versions ont été acceptés (il y a maintenant la deuxième version sur le dépôt du projet).

### Migration des méthodes privées en fin de classe, ensuite protected et enfin plus haut public

Une bonne pratique est de mettre dans une classe les méthodes privées ensembles, protected ensebmeles et public ensembles car cela permet de savoir rapidement où chercher dans un fichier si on en a besoin. J'ai donc migrer ces méthodes dans une dizaine de classes.
<br/>[Lien de la deuxième version](https://github.com/FrancoisGib/gl-projet2/commit/8b62a24b7ed1b37892fbe288e3cffa38a0891fdb)

## Conclusion sur la matière

Ayant pour projet de continuer mes études en Master Génie Logiciel, il était primordial que j'aime cette matière, et ce fût le cas, j'ai moins aimé la partie 1 du projet ce qui est normal car ce n'est que de l'analyse et non du développement, mais cette étape est nécessaire pour réaliser la partie 2 du projet. J'ai beaucoup aimé dénicher les problèmes à corriger et améliorer de webmagic car corriger du code est totalement différent que de l'implémenter soi-même. On se rend vite compte que quand un projet est mal structuré à la base, il est très dur de le corriger et qu'il est donc important de réfléchir à une bonne conception au début du projet.
Avant le début de la matière, j'avais déjà connaissance de beaucoup de sujets abordés dans cette matière car j'ai lu le livre Clean Code de Robert C. Martin il y a environ 6 mois car la conception (la bonne conception) est ce qui m'intéresse. C'est donc avec cette matière que je conforte l'idée de vouloir poursuivre mes études en Master Génie Logiciel.
