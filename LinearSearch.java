import java.util.Scanner;
class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size = scanner.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the value for position "+(i+1));
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the element to search");
        int target = scanner.nextInt();
        int position = linearSearch(arr,target);
        if(position == -1){
            System.out.println("The target value " + target +" was not present in the array list");
        }else{
            System.out.println("The target value " +target +" was present in the array at "+ position + " position");
        }
    }
    public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }
}