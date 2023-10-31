package demo2;


//面向对象软件体系结构
public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.input("D:\\软件体系结构\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("D:\\软件体系结构\\output.txt");
        System.out.println("wyr202131061108");

    }
}

