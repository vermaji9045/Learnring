package Sortings;
class Selection
{
    int [] sort(int arr[])
    {

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
public class SelectionSort {

    public static void main(String args[])
    {
        Selection s=new Selection();
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
