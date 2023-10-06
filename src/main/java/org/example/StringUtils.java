package org.example;

public class StringUtils {

    /**
     * Verifica se a string fornecida é um palíndromo.
     *
     * @param candidate A string a ser verificada.
     * @return true se a string for um palíndromo, false caso contrário.
     */
    public static boolean isPalindrome(String candidate) {
        if (candidate == null) {
            return false;
        }

        String cleaned = candidate.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
