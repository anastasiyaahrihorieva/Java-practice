class NamesException extends Exception {
    public NamesException() {
        super();
    }

    public NamesException(String message) {
        super(message);
    }

    public NamesException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Practice31 {

    public static void main(String[] args) {
        try {
            throw new NamesException();
        } catch (NamesException e) {
            System.out.println("1.()");
        }

        try {
            throw new NamesException("name is reserved");
        } catch (NamesException e) {
            System.out.println("2. (message)) " + e.getMessage());
        }

        try {
            try {
                Integer.parseInt("abc");
            } catch (NumberFormatException e) {
                throw new NamesException("error and cause", e);
            }
        } catch (NamesException e) {
            System.out.println("3. (message, cause)) \n" + e.getMessage() + "\n" + e.getCause());
        }

    }
}
