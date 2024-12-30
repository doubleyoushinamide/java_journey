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
    public void removeAt(){

    }
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
            //System.out.print("]");
        }
    }
}