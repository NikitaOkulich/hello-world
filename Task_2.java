package HomeWork_6;

public class Task_2
{
    public static void main(String[] args) {
        String a = "100a";
        try {
            int b = Integer.parseInt(a);
            System.out.println(b);


        } catch (NumberFormatException e) {
            System.out.println("Incorrect Number Format");
        }
    }
}
