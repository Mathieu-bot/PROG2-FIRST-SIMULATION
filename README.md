# Exercices sur les Streams Java

## Niveau facile

1. **Filtrer les nombres pairs**  
   **Description :** Étant donné une `List<Integer>`, retourner une nouvelle liste contenant uniquement des nombres pairs.  
   **Signature :** `List<Integer> filterEvenNumbers(List<Integer> numbers)`

2. **Chaînes en majuscules**  
   **Description :** Étant donné une liste de chaînes de caractères, renvoie une liste dans laquelle chaque chaîne est en majuscules.  
   **Signature :** `List<String> toUpperCase(List<String> words)`

3. **Compter les mots commençant par “A”**  
   **Description :** Renvoie le nombre de chaînes de caractères de la liste commençant par la lettre “A” (sensible à la casse).  
   **Signature :** `long countWordsStartingWithA(List<String> words)`

---

## Niveau intermédiaire

4. **Tri par longueur**  
   **Description :** Étant donné une liste de chaînes de caractères, les retourner triées par longueur croissante.  
   **Signature :** `List<String> sortByLength(List<String> words)`

5. **Somme des carrés**  
   **Description :** Renvoie la somme des carrés de tous les entiers d'une liste.  
   **Signature :** `int sumOfSquares(List<Integer> numbers)`

6. **Supprimer les doublons puis trier**  
   **Description :** Étant donné une liste d'entiers, renvoyer une liste triée sans doublons.  
   **Signature :** `List<Integer> distinctSorted(List<Integer> numbers)`

7. **Chaîne la plus longue**  
   **Description :** Trouver la chaîne de caractères la plus longue dans une liste.  
   **Signature :** `Optional<String> findLongestString(List<String> words)`

---

## Niveau avancé

8. **Regrouper les mots par leur première lettre**  
   **Description :** Regrouper les chaînes d'une liste en fonction de leur première lettre.  
   **Signature :** `Map<Character, List<String>> groupByFirstLetter(List<String> words)`

9. **Trouver l'élément le plus fréquent**  
   **Description :** Renvoie l'élément le plus fréquent dans une liste de chaînes de caractères.  
   **Signature :** `Optional<String> mostFrequent(List<String> words)`

10. **Flat Map vers caractères**  
    **Description :** À partir d'une liste de chaînes de caractères, renvoie une liste de tous les caractères utilisés.  
    **Signature :** `List<Character> extractCharacters(List<String> words)`
