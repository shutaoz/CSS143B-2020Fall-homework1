public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution

        int low = 0;
        int high = data.length-1;

        while(high >= low) {

            int mid = low + ((high - low) / 2);
            //when Target is bigger than mid
            if(target > data[mid]) low = mid + 1;
            //when Target is smaller than mid
            else if( target < data[mid]) high = mid - 1;
            //when Target equals mid
            else return mid;








        }

        return -1;

    }
}
