package Sub2;

public class dowhile {
    public static void main(String[] args){

        int b = 1;

        for(int i = 0; i < 10 ; i++ ){
            for(int j = 0; j < 10 ; j ++){
                System.out.print(b++ + "  ");
                if(b == 10){
                    b = 1;
                }

            }
            System.out.println();

        }
    }
}
