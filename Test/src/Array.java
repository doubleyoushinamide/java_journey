public class Array{
    int[] arr;
    int count;
    public Array( int length){
        arr = new int[length];
    }
    public void insert(int value){
        if (count >= arr.length){
            int[] tempArray = new int[count * 2];
            //preferred the traditional for loop to the System.copy for easy readability
            for (int i = 0; i < count; i++) {
                tempArray[i] = arr[i];
            }
            arr = tempArray;
        }
        arr[count++] = value;
    }
    public void removeAt(int index){
        if (index < 0 || index >= count - 1){
            throw new IllegalArgumentException("---> Out of bounds");
        }
        for (int i = index; i < count; i++) {
            arr[i] = arr[i + 1];
        }
        count--;
    }

    public int findIndex(int value){
        //.......Linear search algorithm.......
        for (int i = 0; i < count; i++)
            if (value == arr[i])
                return i;
        return -1;
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
}