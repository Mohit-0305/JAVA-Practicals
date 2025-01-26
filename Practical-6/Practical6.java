class Practical6{
    public static void main(String[] a) {
        Practical6 obj = new Practical6();
        System.out.println("Display Pattern 1 :");
        obj.displaypattern1(3);
        System.out.println("Display Pattern 2 :");
        obj.displaypattern2(3);
        System.out.println("Display Pattern 3 :");
        obj.displaypattern3(4);
    }

   
    void displaypattern1(int size){
        boolean a = true;
        int i, j, space,k, stars;
        
        for(i=1 ; i<= size ; i++){
            space = size - i;
            stars = 2*i - 1;
            a = true;
            for(j=1 ; j<=space ; j++){
                System.out.print(" ");
            }
            for(k=1 ; k<=stars ; k++){
                if (a == true) {
                    System.out.print("+");
                }else{
                    System.out.print(" ");
                }
                a = !a;
            }
            System.out.println("");
        }
        for(i=size-1 ; i>0 ; i--){
            space = size - i;
            stars = 2*i - 1;
            a = true;
            for(j=1 ; j<=space ; j++){
                System.out.print(" ");
            }
            for(k=1 ; k<=stars ; k++){
                if (a == true) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                a = !a;
            }
            System.out.println("");
        }
    }
    
    void displaypattern2(int size){
        int i,j,k,space,stars;
        for(i=1 ; i<=size ; i++){
            space = size - i;
            stars = 2*i - 1;
            for(j=1 ; j<=space ; j++){
                System.out.print(" ");
            }
            for(k=1 ; k<=stars ; k++){
                System.out.print("+");
            }
            System.out.println("");
        }
        for(i=size-1 ; i>0 ; i--){
            space = size - i;
            stars = 2*i - 1;
            for(j=1 ; j<= space ; j++){
                System.out.print(" ");
            }
            for(k=1 ; k<=stars ; k++){
                System.out.print("+");
            }
            System.out.println("");
        }
    }
    
    void displaypattern3(int size){
        boolean a = true;
        int i, j, space,k, stars;
        
        for(i=1 ; i<= size ; i++){
            space = size - i;
            stars = 2*i - 1;
            for(j=1 ; j<=space ; j++){
                System.out.print(" ");
            }
            for(k=1 ; k<=stars ; k++){
                if (a == true) {
                    System.out.print("*");
                }else{
                    System.out.print("+");
                }
                a = !a;
            }
            System.out.println("");
        }
        a = true;
        for(i=size ; i>0 ; i--){
            space = size - i;
            stars = 2*i - 1;
            for(j=1 ; j<=space ; j++){
                System.out.print(" ");
            }
            for(k=1 ; k<=stars ; k++){
                if (a == true) {
                    System.out.print("*");
                }else{
                    System.out.print("+");
                }
                a = !a;
            }
            System.out.println("");
        }
    }
}
