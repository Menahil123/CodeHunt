public class ArrayUsingSortingMaxMin {
    int max;
    int min;
}
class Sorting{
    static ArrayUsingSortingMaxMin getMaxMin(int [] arr, int n){
        ArrayUsingSortingMaxMin MaxMin=new ArrayUsingSortingMaxMin();
        MaxMin.min=arr[0];
        MaxMin.max=arr[n-1];
        return MaxMin;
    }
    public static void main (String[]args){
        int [] arr={1000,400,100,2000,600,800};
        int arr_size= arr.length;
        ArrayUsingSortingMaxMin MaxMin=getMaxMin(arr,arr_size);
        System.out.println("Minimum element is " +MaxMin.min);
        System.out.println("Maximum element is " + MaxMin.max);
    }
}
