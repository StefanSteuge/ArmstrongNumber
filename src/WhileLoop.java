public class WhileLoop {

    public static void main(String[] args) {
        int number = 371, start, end, result = 0;
        start = number;
        while (start != 0) {
            end = start % 10;
            result += Math.pow(end, 3);
            start /= 10;
        }
        if (result == number)
            System.out.println(number + " is an Armstromg number.");
        else
            System.out.println(number + " is not an Armstrong number");
        }
    }

