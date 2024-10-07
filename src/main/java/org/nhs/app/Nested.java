public class Nested{
    public static void main(String args[]){
        for(int num1 = 1; num1 <= 5; num1++){
            
            for(int count1 = 1; count1 <= num1; count1++){
                System.out.print(num1);

            }
            System.out.println();
        }

        for(int num2 = 1; num2 <= 5; num2++){
                for(int dot = 5 - num2; dot > 0; dot--) {
                    System.out.print(".");

                }
                for(int count2 = 1; count2 < num2; count2++){
                    System.out.print(num2);

                }
            System.out.print(num2);
            System.out.println();

        }

        for(int num3 = 1; num3 <= 5; num3++){
            for(int dot2 = 0; dot2 < 5 - num3; dot2++){
                System.out.print(".");

            }
            
            System.out.print(num3);
            
            for(int dot3 = 0; dot3 < num3 - 1; dot3++){
                System.out.print(".");
            }
            System.out.println();
        }

        
 /*for(int number = 1; number <= 5; number++){
    for (int counter = 1; counter <= 4; counter++){
        System.out.print(number);
    }
    System.out.println();

 }*/
    }

    
}
