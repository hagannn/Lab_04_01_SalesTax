import java.io.*;

public class Program {
    private static float getPrice(BufferedReader br) throws IOException {
        System.out.print("Enter price: ");
        String line = br.readLine();

        try {
            return Float.parseFloat(line);
        } catch (Exception e) {
            return getPrice(br);
        }

    }

    private static void reportPrice(float price, float tax) {
        System.out.println("Price before tax " + price);
        System.out.println("Price + Tax: " + ((tax + 1) * price));
    }

    public static void main(String[] args) throws IOException {
        float salesTax = 0.05f;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferStream = new BufferedReader(input);
        float price = getPrice(bufferStream);

        reportPrice(price, salesTax);

    }
}
