package conteudo1;

public class MetodosMaisUsadosDaClasseString {
    public static void main(String[] args) {
        // Informações Básicas
        String str = "Hello World";
        System.out.println("Length: " + str.length()); // Retorna o comprimento da string (11 caracteres)
        System.out.println("Is Empty: " + str.isEmpty()); // Verifica se a string está vazia (false)

        System.out.println("=============================================================================================================================================");

        // Comparação
        String str1 = "Java";
        String str2 = "java";
        System.out.println("Equals: " + str1.equals("Java")); // Compara duas strings (true, pois são idênticas)
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2)); // Ignora maiúsculas/minúsculas (true)
        System.out.println("Compare To: " + str1.compareTo(str2)); // Compara lexicograficamente (-32, diferença de código ASCII)
        System.out.println("Compare To Ignore Case: " + str1.compareToIgnoreCase(str2)); // Ignora maiúsculas/minúsculas (0, pois são iguais)
        System.out.println("Starts With: " + str.startsWith("Hel")); // Verifica se começa com "Hel" (true)
        System.out.println("Ends With: " + str.endsWith("rld")); // Verifica se termina com "rld" (true)
        System.out.println("Contains: " + str.contains("lo")); // Verifica se contém "lo" (true)

        System.out.println("=============================================================================================================================================");

        // Busca
        System.out.println("Index Of 'o': " + str.indexOf('o')); // Índice da primeira ocorrência de 'o' (4)
        System.out.println("Index Of 'o' from index 5: " + str.indexOf('o', 5)); // Procura 'o' a partir do índice 5 (7)
        System.out.println("Index Of 'World': " + str.indexOf("World")); // Índice do início da substring "World" (6)
        System.out.println("Last Index Of 'o': " + str.lastIndexOf('o')); // Última ocorrência de 'o' (7)
        System.out.println("Last Index Of 'o' before index 6: " + str.lastIndexOf('o', 6)); // Última ocorrência de 'o' até índice 6 (4)
        System.out.println("Last Index Of 'lo': " + str.lastIndexOf("lo")); // Última ocorrência de "lo" (3)

        System.out.println("=============================================================================================================================================");

        // Extração
        System.out.println("Char At index 1: " + str.charAt(1)); // Obtém o caractere na posição 1 ('e')
        System.out.println("Substring from index 6: " + str.substring(6)); // Retorna a substring a partir do índice 6 ("World")
        System.out.println("Substring from 0 to 5: " + str.substring(0, 5)); // Retorna de 0 a 4 ("Hello")
        String[] words = str.split(" "); // Divide a string em palavras
        System.out.println("Split: " + words[0] + ", " + words[1]); // Exibe as palavras separadas (Hello, World)

        System.out.println("=============================================================================================================================================");

        // Modificação
        String spaced = "   Trim me!   ";
        System.out.println("Trim: " + spaced.trim()); // Remove espaços extras no início e fim ("Trim me!")
        System.out.println("To Lower Case: " + str.toLowerCase()); // Converte para minúsculas ("hello world")
        System.out.println("To Upper Case: " + str.toUpperCase()); // Converte para maiúsculas ("HELLO WORLD")
        System.out.println("Replace 'l' with '*': " + str.replace('l', '*')); // Substitui 'l' por '*' (He**o Wor*d)
        System.out.println("Replace All 'o' with '0': " + str.replaceAll("o", "0")); // Substitui todas ocorrências de 'o' por '0' (Hell0 W0rld)
        System.out.println("Replace First 'o' with '0': " + str.replaceFirst("o", "0")); // Substitui apenas a primeira ocorrência (Hell0 World)

        System.out.println("=============================================================================================================================================");

        // Conversão
        char[] charArray = str.toCharArray(); // Converte a string para um array de caracteres
        System.out.println("To Char Array: " + new String(charArray)); // Exibe "Hello World"
        System.out.println("Value Of 123: " + String.valueOf(123)); // Converte número para string ("123")

        System.out.println("=============================================================================================================================================");

        // Outros
        System.out.println("Matches regex '[A-Za-z ]+': " + str.matches("[A-Za-z ]+")); // Verifica se contém apenas letras e espaços (true)
        System.out.println("Concat: " + str.concat("!!!")); // Concatena "!!!" à string (Hello World!!!)
        System.out.println("Join: " + String.join(", ", "Apple", "Banana", "Cherry")); // Une strings separadas por ", " (Apple, Banana, Cherry)
        System.out.println("Format: " + String.format("%s has %d apples", "John", 5)); // Formata a string (John has 5 apples)

        System.out.println("=============================================================================================================================================");

        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is awesome"); // Adiciona " is awesome"
        System.out.println("Append: " + sb.toString()); // Java is awesome
        sb.insert(5, "very "); // Insere "very " na posição 5
        System.out.println("Insert: " + sb.toString()); // Java very is awesome
        sb.replace(5, 10, "super "); // Substitui "very " por "super "
        System.out.println("Replace: " + sb.toString()); // Java super is awesome
        sb.delete(5, 11); // Remove "super "
        System.out.println("Delete: " + sb.toString()); // Java is awesome
        sb.reverse(); // Inverte a string
        System.out.println("Reverse: " + sb.toString()); // emosewa si avaJ

        System.out.println("=============================================================================================================================================");
    }
}
