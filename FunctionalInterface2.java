interface  StringValidator{
    public boolean stringValidator(String word);
}
public class FunctionalInterface2 {
    public static void main(String[] args)
    {
        StringValidator stringvalidator = (String word ) -> word.isEmpty();
        System.out.println("Checks if string is empty or not "+stringvalidator.stringValidator(""));
        StringValidator stringvalidator2 = (String word) -> word.length()>1;
        System.out.println("Check is length of string is 1 or not"+stringvalidator2.stringValidator("a"));
        StringValidator stringvalidator3 = (String word) -> word.equals(new StringBuilder(word).reverse().toString());
        System.out.println("Checking whether string is palindrome "+stringvalidator3.stringValidator("aba"));

    }

}
