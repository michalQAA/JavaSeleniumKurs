public class lekcja86v2 {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,3,5,7,0};

        for(int i=0; i<(numbers.length/2); i++) {
            int temp = numbers[i]; // dla i =0 1
            numbers[i] = numbers[numbers.length-1-i]; // 4 -> 0
            numbers[numbers.length-1-i] = temp; // 1
        }
        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
