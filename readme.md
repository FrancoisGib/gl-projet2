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