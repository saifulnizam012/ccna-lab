public class largest {
    public static void main(String[]args){
        int [] numbers = {2, 34, 56,100, 4};
        int large = numbers[0];
        for (int i = 1; i<numbers.length; i++){
            if(numbers[i] > large){
                large=numbers[i];
            }
        }
    }
}
