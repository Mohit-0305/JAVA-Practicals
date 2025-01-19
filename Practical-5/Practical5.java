class Practical5{    
    public static void main(String[] a){
        Practical5 obj = new Practical5();
        System.out.println(obj.getFactorial1(5));
        System.out.println(obj.getFactorial2(6));
        System.out.println(obj.getFactorial3(5));
    }

    int getFactorial1(int number){
        int fact1 = 1;
        for(int i = 1; i <= number;i++){
            fact1 *= i;
        }
        return fact1;
    }

    int getFactorial2(int number) {
        int fact2 = 1;
        int num = number;
        while (num > 0) {
            fact2 *= num;
            num--;
        }
        return fact2;
    }

    int getFactorial3(int number){
        if(number <= 1){
            return 1;
        }
        return number*getFactorial3(number-1);
    }

}
