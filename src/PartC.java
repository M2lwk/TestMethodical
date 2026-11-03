public class PartC {
    public static void main(String[] args) {

        
        int i = 0;
        boolean run = true;
        do {
            System.out.println("Hello");
            i++;
            if (i == 3) {
                run = false;
            }
        } while (run);

    }
}