public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        //bubble sort using for loop
        int placeHolder;
        for(int i = 0; i < data.length - 1; ++i) {
            for(int j = 0; j < data.length - i - 1; ++j) {
                if (data[i] > data[i + 1]) {
                    placeHolder = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = placeHolder;

                }
            }

        }

    }
}
