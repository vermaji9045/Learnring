import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Arrays;

class Binray
{
    int search(int arr[],int l,int r,int item) {

        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == item)
                return mid + 1;

            if (arr[mid] > item) {
                return search(arr, l, mid - 1, item);
            } else {
                return search(arr, mid + 1, r, item);
            }
        }
        else

        return -1;
    }

}
public class BinaryS {

    public static void main(String args[])
    {
        int arr[]={84,7,35,12,47,90,36,76,67};
        Arrays.sort(arr);
        int item=76;
        int r=arr.length;
        Binray b=new Binray();
        int res=b.search(arr,0,r,item);

        if(res==-1)
        {
           System.out.println("Iteam not found");

        }
        else
        {
            System.out.println("Iteam" +item+ "found at location"  +res);
        }
    }
}
