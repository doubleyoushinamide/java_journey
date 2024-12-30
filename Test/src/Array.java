public class Array {
    private int[] arr;
    private int count;

    public Array(int length) {
        this.arr = new int[length];
        this.count = 0;
    }

    // Method to add an item to the array
    public void add(int item) {
        // Resize the array if it's full
        if (count >= arr.length) { // count = 0... arr = [0,0,0] for length = 3
            int[] tempArray = new int[arr.length * 2]; //addition once-at-a-time
            System.arraycopy(arr, 0, tempArray, 0, arr.length);
            arr = tempArray;
        }
        //if the condition above is false. e.g., arr = [0,0,0]
        //at count < 3:
        arr[count++] = item; //this adds the item starting from count = 0 while counter var is updated
    }

    // Method to remove an item at a specific index
    public void removeAt(int index) { //e.g., arr = [2,4,6,23,5]... at count = 4
        if (index < 0 || index > count) {
            throw new IllegalArgumentException("Index out of bounds.");
        }

        // Shifting elements to the left
        //e.g., arr = [2,4,6,23,5]... removeAt(3);
        //=> arr = [2,4,6,0,5]... at count = 4;
        for (int i = index; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--count] = 0; // Clear the last element
    }

    // Method to check if an item exists in the array
    public boolean lookupBoolean(int target) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Method to find the index of an item in the array
    public int lookupIndex(int target) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Return -1 if the item is not found
    }

    // Method to print the array
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}