**L'exercice de Palindrome :
Erreur originale : L'exception StringIndexOutOfBounds est survenue parce que l'instruction j++ de la boucle while incrémentait j au-delà des limites de la chaîne de caractères,
ce qui entraînait un accès invalide à l'index.
Correction : L'instruction j++ a été remplacée par j-- pour décrémenter j au lieu de l'incrémenter. Cela permet de s'assurer que j se déplace vers le milieu de la chaîne de caractères,
en restant dans des limites valides. L'instruction i++ a été ajoutée pour déplacer i vers le milieu également, ce qui permet de comparer correctement les caractères.
(Le code corrigé est dans le dossier nommé PalindromeModfified)

**L'exercice 'Anagram : 
Condition de boucle incorrecte : La boucle for itère i <= s1.length(), ce qui tenterait d'accéder à s1.charAt(s1.length()), provoquant une exception IndexOutOfBoundsException.
Corrcetion : Pour résoudre ce problème , on limilte la boucle à la taille du string -1. 
(Le code corrigé est dans le dossier nommé AnagrameModfified)
