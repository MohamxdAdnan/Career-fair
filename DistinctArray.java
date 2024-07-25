public class DistinctArray {
    public static void main(String[] args) {
        int numbers[] ={1,2,3,5};
        System.out.println(isDistinct(numbers));

    }

    public static boolean isDistinct(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]==numbers[j]){
                    return true;
                }
            }
        }return false;
    }
}
