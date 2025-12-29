import java.util.Scanner;

public class Huffman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mode (encode/decode): ");
        String mode = scanner.nextLine().toLowerCase().trim();

        System.out.print("Enter input file name: ");
        String inputPath = scanner.nextLine().trim();

        System.out.print("Enter output file name: ");
        String outputPath = scanner.nextLine().trim();

        try {
            if (mode.equals("encode")) {
                Encoder.encodeFile(inputPath, outputPath);
            } else if (mode.equals("decode")) {
                Decoder.decodeFile(inputPath, outputPath);
            } else {
                System.out.println("Invalid mode. Use 'encode' or 'decode'.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}