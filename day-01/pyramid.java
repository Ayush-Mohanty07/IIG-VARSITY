public class pyramid3 {
    public static void main(String[] args) {
        int x= 10; 
        int spaces = x - 1;
        int stars = 1;

        
        for (int i = 1; i <= x; i++) {
             
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            
            for (int j = 1; j <= stars; j++) {
                if (i == x) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == stars) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            
            System.out.println();
            spaces--;
            stars += 2;
        }
    }
}