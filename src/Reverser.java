public class Reverser {

    public static void main (String[] args){

        String actualSentance = "Hello World";
        String result = "";

        char[] charArray = actualSentance.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(Character.isUpperCase(charArray[i])){
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
            else{
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
            result = charArray[i] + result;
        }
        System.out.println(result);
    }
}
