package demo5;

import java.util.Scanner;

// 主程序-子程序风格
public class ReverseText {
    public static String reverseByProgram(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // 面向对象风格
    public static class ReverseTextObject {
        private String text;

        public ReverseTextObject(String text) {
            this.text = text;
        }

        public String reverse() {
            return new StringBuilder(text).reverse().toString();
        }
    }

    // 事件系统风格
    public static String reverseByEvent(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要反转的文本: ");
        String text = scanner.nextLine();
        System.out.println("请选择反转风格：");
        System.out.println("1. 使用主程序-子程序");
        System.out.println("2. 使用面向对象");
        System.out.println("3. 使用事件系统");
        System.out.println("4. 使用管道-过滤器");
        System.out.print("请选择[1/2/3/4]: ");
        int style = scanner.nextInt();
        scanner.close();

        if (style == 1) {
            // 主程序-子程序风格
            String reversedText = reverseByProgram(text);
            System.out.println("反转结果(主程序-子程序): " + reversedText);
        } else if (style == 2) {
            // 面向对象风格
            ReverseTextObject reverseTextObject = new ReverseTextObject(text);
            String reversedText = reverseTextObject.reverse();
            System.out.println("反转结果(面向对象): " + reversedText);
        } else if (style == 3) {
//            // 事件系统风格
//            String reversedText = reverseByEvent(text);
//            System.out.println("反转结果(事件系统): " + reversedText);
            ReverseTextEventHandler eventHandler = new ReverseTextEventHandlerImpl();
            ReverseTextEventPublisher eventPublisher = new ReverseTextEventPublisher(eventHandler);
            eventPublisher.publishReverseText(text);

        } else if (style == 4) {
            // 管道-过滤器风格
            TextFilterPipeline pipeline = new TextFilterPipeline()
                    .addFilter(new ReverseTextFilter());
            String result = pipeline.execute(text);
            System.out.println("反转结果(管道-过滤器): " +result);
        } else {
            System.out.println("无效的选择!");
        }
    }
}