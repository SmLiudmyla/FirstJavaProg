public class SwichCase {
    public static void main(String[] args) {
        calc(5, 2, '+');
        calc(5, 2, '-');
        calc(5, 2, '/');
        calc(5, 2, '*');
        calc(5, 2, '?');
    }

    static void calc(double paramA, double paramB, char operation) {

        double result = 0;

        switch (operation) {
            case '+':
                result = paramA + paramB;
                break;
            case '-':
                result = paramA - paramB;
                break;
            case '/':
                result = paramA / paramB;
                break;
            case '*':
                result = paramA * paramB;
                break;
            default:
                System.out.println("INCORRECT OPERATION!");
        }

        System.out.println("Calc result: " + result);

    }
}


