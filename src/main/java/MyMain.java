public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int[] result = new int[arr.length];
        int half = arr.length/2;
        int[] firstHalf = new int[half];
        int[] secondHalf = new int[half];
        int count = 0;

        for(int i = 0; i < half; i++) {
            firstHalf[i] = arr[i];
        }

        for(int i = half; i < arr.length; i++) {
            secondHalf[i-half] = arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            if (count % 2 == 0) {result[i] = firstHalf[count/2];}
            else {result[i] = secondHalf[count/2];}
            count++;
        }
        return result;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int rand;
        int placeholder;
        for(int i = 0; i < arr.length; i++) {
            rand = (int) Math.random() * (arr.length-1);
            placeholder = arr[i];
            arr[i] = arr[rand];
            arr[rand] = placeholder;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 22, 24, 26, 28};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(perfectShuffle(arr1));
        System.out.println(selectionShuffle(arr2));
        System.out.println(selectionShuffle(arr3));
    }
}
