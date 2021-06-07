package pl.lublin.wsei.java.cwiczenia.mylib;

public class StringFun {

    public static boolean IsPalindrome(String word) {
//        public static String capitalize(String word)
//        {
//            String[] tokens = StringUtils.split(word);
//            for(int i = 0; i < tokens.length; i++)
//                tokens[i] = StringUtils.capitalize(tokens[i]);
//            return StringUtils.join(tokens,' ');
//        }
        return false;
    }
        public static void StringFunAnarchize(String word){
            String inputText = word;
            String result = "";
            int index = 0;

            char[] tabOfChars = inputText.toCharArray();
            for (char c : tabOfChars) {
                if(index % 2 == 0){
                    result = result + String.valueOf(c).toUpperCase();

                }else{
                    result = result + String.valueOf(c);
                }

                index++;

            }

            System.out.println("Zmodyfikowany tekst: "+ result);


        }

}


