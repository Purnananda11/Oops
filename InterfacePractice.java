
interface StringManipulation
{
    public String modifiedString(String word);
}

public class InterfacePractice {
    public static void main(String[] args)
    {
        StringManipulation upperCase = (String word) -> word.toUpperCase();
       System.out.println(upperCase.modifiedString("purna"));
        StringManipulation appendhello = (String word) -> {return  "hello" + word;};
        System.out.println(appendhello.modifiedString("purna"));
        StringManipulation reverseWord = (String word) ->{
            StringBuilder reverse = new StringBuilder(word);
            return String.valueOf(reverse.reverse());

        };
        System.out.println("reverse String "+reverseWord.modifiedString("purna"));



    }


}
