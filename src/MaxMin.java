import java.util.Scanner;

class MaxNo
{

    int max=0,min=0;

    public void maxNo(int arr[])
    {
        max=arr[0];
        min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }

        System.out.println("Max="+ max );

         System.out.println("Min="+ min);
    }
}
public class MaxMin {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MaxNo m = new MaxNo();

        Scanner s = new Scanner(System.in);


        System.out.println("Enter Size of Array");
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();

        }

        m.maxNo(arr);
    }
}


