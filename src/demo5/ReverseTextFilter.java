package demo5;

public class ReverseTextFilter implements TextFilter {
    @Override
    public String filter(String text) {
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return reversedText;
    }
}
