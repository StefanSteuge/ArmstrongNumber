public class ForLoop {

    public static void main(String[] args) {
        int num = 9474, start, end, result = 0, n = 0;
        start = num;
        for (;start != 0; start /= 10) {
            n++;
        }
        start = num;
        for (;start != 0; start /= 10) {
            end = start % 10;
            result += Math.pow(end, n);
        }
        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
