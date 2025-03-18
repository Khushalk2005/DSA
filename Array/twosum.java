import java.util.Scanner;
public class twosum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int size = sc.nextInt();
        System.out.println("enter a target : ");
        int target = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<arr.length;i++){
            System.out.println("enter a value of array at index "+i+":");
            arr[i] = sc.nextInt();
        }
        for(int j = i;j<arr.length;j++){
            if(arr[i] + arr[j] == target){
                System.out.println(arr[i]+arr[j]);
            }
            else{
                System.out.println("not found ");
            }
        }
        

    }
}