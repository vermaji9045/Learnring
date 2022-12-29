package Sortings;

class InsSort
{
    int [] sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
public class InsertionSort {

    public static void main(String args[])
    {
        InsSort s=new InsSort();
        int arr[]={12,65,6,43,44,2,1};
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
