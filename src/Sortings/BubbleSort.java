package Sortings;

class Sorting
{
    int [] sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
public class BubbleSort {

    public static void main(String args[])
    {
        Sorting s=new Sorting();
        int arr[]={12,4,5,6,7,3,9,45};

        System.out.println("Before Sorting");
        for(int i=0;i<arr.length;i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
        arr=s.sort(arr);

        System.out.println("After Sorting");
        for(int i=0;i<arr.length;i++)
            System.out.print(" "+arr[i]);


    }
}
