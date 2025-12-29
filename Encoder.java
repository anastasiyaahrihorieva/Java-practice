import java.util.*;
import java.io.*;
import java.nio.file.Files;

public class Encoder {
    private static Map<Character, String> huffmanCodes = new HashMap<>();
    private static Node root;

    public static void encodeFile(String inputPath, String outputPath) throws IOException {
        File inputFile = new File(inputPath);
        if (!inputFile.exists()) {
            System.out.println("Source file not found!");
            return;
        }

        byte[] bytes = Files.readAllBytes(inputFile.toPath());
        String content = new String(bytes, "ISO-8859-1");

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : content.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (var entry : freqMap.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        if (pq.isEmpty())
            return;

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            pq.add(new Node(left.freq + right.freq, left, right));
        }
        root = pq.peek();

        huffmanCodes.clear();
        generateCodes(root, "");

        StringBuilder sb = new StringBuilder();
        for (char c : content.toCharArray()) {
            sb.append(huffmanCodes.get(c));
        }

        try (PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream(outputPath), "ISO-8859-1"))) {
            writer.println(freqMap.size());
            for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                writer.println((int) entry.getKey() + ":" + entry.getValue());
            }
            writer.println(sb.toString());
        }

        System.out.println("Successfully encoded to " + outputPath);
    }

    private static void generateCodes(Node node, String code) {
        if (node == null)
            return;
        if (node.isLeaf())
            huffmanCodes.put(node.ch, code.isEmpty() ? "0" : code);
        generateCodes(node.left, code + "0");
        generateCodes(node.right, code + "1");
    }
}