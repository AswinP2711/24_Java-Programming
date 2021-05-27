public class Nine {
    public static void main(String[] args) {
        int size=42;
        switch (size) {
            case 29:
                System.out.println("Small");
                break;

            case 42:
                System.out.println("Medium");
                break;

            case 44:
                System.out.println("Large");
                break;

            case 46:
                System.out.println("Extra Large");
                break;
        
            default:
                System.out.println("Unknown");
                break;
        }
    }
}
