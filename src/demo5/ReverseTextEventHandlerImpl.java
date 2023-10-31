package demo5;

public class ReverseTextEventHandlerImpl implements ReverseTextEventHandler {
    @Override
    public void onReverseText(ReverseTextEvent event) {
        String reversedText = "";
        String text = event.getText();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        // 在这里可以对倒序后的文本进行处理，比如打印输出或者其他操作
        System.out.println("反转结果(事件系统): " +reversedText);
    }
}
