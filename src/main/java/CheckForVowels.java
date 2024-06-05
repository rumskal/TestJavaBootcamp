public class CheckForVowels {
//    public static void main(String[] args) {
//        String input = "3JHAEOYuqpl8X";
//        boolean hasVowels = hasVowels(input);
//        System.out.println(hasVowels);
//                }

    public boolean hasVowels(String input) {
        if(input == null || input == ""){
            return false;
        }
        input = input.toLowerCase();
        return  input.contains("a") ||
                input.contains("e") ||
                input.contains("i") ||
                input.contains("o") ||
                input.contains("u");

    }
}
