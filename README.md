# Modification de la méthode `isValidMove` dans la classe `Reine`

## Objectif
Remplacer la méthode `isValidMove` dans la classe `Reine` pour implémenter la logique de déplacement spécifique à la reine aux échecs.

## Étapes réalisées

1. **Compréhension des règles de la reine** :
   - La reine combine les mouvements de la tour et du fou.
   - Elle peut se déplacer horizontalement, verticalement et diagonalement, sans limitation de cases (tant qu'aucune pièce ne bloque son chemin).

2. **Modification de la méthode `isValidMove`** :
   - Ajout de la vérification des déplacements valides pour la reine.
