public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * 2;
            }
            System.out.println(arr[0]); // Accessing a valid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds: " + e.getMessage());
        }
    }
}