class sum{
    public static void main(String[] a) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        sum obj = new sum();
        System.out.println(obj.getSum1(arr));
    }

    int getSum1(int[] number){
        int sum = 0;
        int i = 0;
        int[] array = number;
        while(i < array.length){
            sum += array[i];
            i++;
        }
        return sum;
    }
}
