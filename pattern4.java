public class NumberPatternAlternative {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            int count = 0; 
            int num = 1;    

            while (count < i) {
                if (i % 2 == 0) {
                
                    if (num % 2 == 0) {
                        System.out.print(num);
                        count++;
                    }
                } else {

                    if (num % 2 != 0) {
                        System.out.print(num);
                        count++;
                    }
                }
                num++;
            }
            System.out.println();
        }
    }
}
