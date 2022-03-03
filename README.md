# Tutoriel sur l'accessibilité Android

Ce tutoriel est une initiation à l'accessibilité en abordant les outils et quelques notions.

## Outils

- [TalkBack](https://support.google.com/accessibility/android/answer/6283677) (déficients visuel)

TalkBack est un lecteur d'écran Google préinstallé sur les appareils Android. Il vous permet de contrôler votre appareil sans regarder l'écran. 
Pour l'activer, appuyez simultanément sur les deux touches de volume.

- [Switch Access](https://support.google.com/accessibility/android/answer/6122836) (déficents moteur) 

Switch Access vous permet d'utiliser un ou plusieurs contacteurs au lieu de l'écran tactile pour interagir avec votre appareil Android. Cette fonctionnalité est utile si vous ne pouvez pas interagir directement avec votre appareil.

- L'application [Accessibility Scanner](https://play.google.com/store/apps/details?id=com.google.android.apps.accessibility.auditor)

Accessibility Scanner est un outil qui sugère des améliorations en matière d'accessibilité pour les applications Android. Aucune compétence technique n'est nécessaire pour l'utiliser.

- Guidelines [W3C](https://www.w3.org/Translations/WCAG20-fr/)

Document officiel contenant la liste des règles pour l'accessibilité

## Notions de base

#### Les couleurs
1. Contraste entre les couleurs : le ratio recommandé doit être **supérieur ou égale à 4,50**. Une petite aide pour le calcul : [https://contrast-ratio.com/](https://contrast-ratio.com/)
2. L'information via la couleur : une information ne doit pas être donnée uniquement par la couleur (exemple : une erreur ne doit pas uniquement être signalée par la couleur rouge. Elle doit être accompagnée par un message).

#### Les labels
Les boutons, zones cliquables, images etc. n'ont pas forcément de description par défaut. C'est cette dernière qui sera énnoncée par le lecteur d'écran (TalkBack). S'il n'y en a pas, l'utilisateur malvoyant ne peut donc pas connaître la fonctionnalité du bouton. Il est donc important de la compléter, c'est facile et rapide, ne l'oubliez pas.

#### La zone de clique 
La zone de clique doit être suffisement grande pour qu'une personne malvoiyante, ou avec déficence motrice puisse y avoir accès sans difficulté.
Il est estimé que la taille est suffisante à partir d'**une zone de 48px par 48px**.

#### Lisibilité et zoom
Ne pas fixer la taille des écrans car ils doivent être lisibles et scrollables lorsque l'écran est zoommé.

## Exercice

1. Tester l'application tel qu'elle est actuellement
    - Activer le TalkBack : faire lire l'écran à l'outil et regarder les zones encadrées
    - Scanner l'écran avec l'outil *Accessibility Scanner* : des remarques d'amélioration peuvent être proposées
    - Dans Android Studio, ouvrir les fichiers `.xml` et regarder s'il ya. des warning sur les components

2. Effectuer les modifications suggérées par Android Studio et *Accessibility Scanner*. Tester à nouveau l'application avec le TalkBack
