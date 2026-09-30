import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); //создаю сканер а
        
        long X = a.nextLong(); //грузоподъемность
        long A = a.nextLong(); //первый груз
        long B = a.nextLong(); //второй груз
        long C = a.nextLong(); //третий груз
        int max = 0; //переменная для суммы грузов. вне фигурных скобок каждой проверки, чтобы не уничтожалась каждый раз.
        //только A
        
        if (A <= X) {
            out.println("Можно загрузить - A");
            max = 1;
        }
        
        //только B
        if (B <= X) {
            out.println("Можно загрузить - B");
            max = 1;
        }

        //только C
        if (C <= X) {
            out.println("Можно загрузить - C");
            max = 1;
        }

        // A + B
        if (A + B <= X) {
            out.println("Можно загрузить - A и B");
            max = 2;
        }

        // A + C
        if (A + C <= X) {
            out.println("Можно загрузить - A и C");
            max = 2;
        }

        // B + C
        if (B + C <= X) {
            out.println("Можно загрузить - B и C");
            max = 2;
        }

        // A + B + C
        if (A + B + C <= X) {
            out.println("Можно загрузить - A, B и C");
            max = 3;
        }
        if (max == 0) {
            out.println("Ни один груз нельзя загрузить в лифт");
        }

        out.println("Максимальное количество грузов - " + max);
    }
}
