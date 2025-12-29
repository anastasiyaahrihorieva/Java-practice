import java.util.*;
import java.io.*;
import java.nio.file.Files;

public class Decoder {
    public static void decodeFile(String inputPath, String outputPath) throws IOException {
        File inputFile = new File(inputPath);
        if (!inputFile.exists()) {
            System.out.println("Compressed file not found!");
            return;
        }

        List<String> lines = Files.readAllLines(inputFile.toPath(), java.nio.charset.StandardCharsets.ISO_8859_1);

        if (lines.isEmpty()) {
            System.out.println("File is empty!");
            return;
        }

        int uniqueChars = Integer.parseInt(lines.get(0));
        System.out.println("Unique chars: " + uniqueChars);

        if (uniqueChars <= 0) {
            System.out.println("No unique characters found!");
            return;
        }

        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 1; i <= uniqueChars; i++) {
            String[] parts = lines.get(i).split(":");
            if (parts.length != 2) {
                System.out.println("Invalid format in frequency table!");
                return;
            }
            char ch = (char) Integer.parseInt(parts[0]);
            int freq = Integer.parseInt(parts[1]);
            freqMap.put(ch, freq);
        }

        System.out.println("Frequency map: " + freqMap);

        Node tempRoot;
        if (freqMap.size() == 1) {
            char ch = freqMap.keySet().iterator().next();
            tempRoot = new Node(ch, freqMap.get(ch));
        } else {
            PriorityQueue<Node> pq = new PriorityQueue<>();
            for (var entry : freqMap.entrySet()) {
                pq.add(new Node(entry.getKey(), entry.getValue()));
            }

            if (pq.size() == 0) {
                System.out.println("Priority queue is empty!");
                return;
            }

            while (pq.size() > 1) {
                Node left = pq.poll();
                Node right = pq.poll();
                pq.add(new Node(left.freq + right.freq, left, right));
            }
            tempRoot = pq.peek();
        }

        if (tempRoot == null) {
            System.out.println("Root is null!");
            return;
        }

        String encodedData = lines.get(uniqueChars + 1);
        System.out.println("Encoded data: " + encodedData);

        StringBuilder decodedContent = new StringBuilder();

        if (tempRoot.isLeaf()) {
            int length = encodedData.length();
            for (int i = 0; i < length; i++) {
                decodedContent.append(tempRoot.ch);
            }
        } else {
            Node current = tempRoot;
            for (int i = 0; i < encodedData.length(); i++) {
                current = (encodedData.charAt(i) == '0') ? current.left : current.right;
                if (current != null && current.isLeaf()) {
                    decodedContent.append(current.ch);
                    current = tempRoot;
                }
            }
        }

        Files.write(new File(outputPath).toPath(), decodedContent.toString().getBytes("ISO-8859-1"));
        System.out.println("Successfully decoded to " + outputPath);
    }
}