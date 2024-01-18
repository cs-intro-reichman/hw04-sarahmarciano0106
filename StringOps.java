public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(camelCase("tWo    word"));
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String newStr = lowerCase(string);
        char[] lowerVowels = {'a', 'e', 'i', 'o', 'u'};
        char[] upperVowels = {'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < newStr.length(); i++) {
            for (int j = 0; j < lowerVowels.length; j++) {
                if(newStr.charAt(i)==lowerVowels[j]){
                    newStr= newStr.substring(0,i)+ upperVowels[j] + newStr.substring(i+1);
                }
            }
        }
        return newStr;
    }


    public static String camelCase (String string) {
        // Write your code here:
        string = lowerCase(string);
        boolean firstLetter=false;
        for (int i = 1; i < string.length(); i++) {
            int letterInt = string.charAt(i);
            if(string.charAt(i-1)==' ' && string.charAt(i)!=' '){
                if(string.charAt(0)!=' '){
                    firstLetter =true;
                }
                if (firstLetter==true){
                string = string.substring(0, i) +(char)(65+(letterInt-97)) + string.substring(i+1);
                }
                firstLetter =true;
            }
        }
        
        for (int i = 0; i < string.length(); i++) {
            
            if(string.charAt(i)==' '){
                string = string.substring(0, i) + string.substring(i+1);
                i--;
            }
        }
        return string;
    }

    public static int[] allIndexOf (String string, char chr) {
        int arrayLength = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)==chr){
                arrayLength++;
            }
        }
        int[] charIndex = new int[arrayLength];
        int count=0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)==chr){
                charIndex[count]=i;
                count++;
            }
        }
        // Write your code here:
        return charIndex;
    }

    public static String lowerCase(String s) {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            char letter =s.charAt(i);
            int letterInt = s.charAt(i);
            if(letterInt>=65 && letterInt<=90){
                //System.out.println(letterInt);
                letter = (char)(letterInt-65+97);
                //System.out.println(letter);
            }
            newStr += letter;
        }
        return newStr;
    }

}
