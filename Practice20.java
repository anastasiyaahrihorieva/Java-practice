class Book {
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Book ^ obj == "Chair";
    }
}

public class Practice20 {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1.equals("Chair"));
    }
}