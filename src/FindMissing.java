
class MissingNo
{
    public int miss(int arr[])
    {
        int res=0;
        int n=arr.length;

        res=((n+1)*(n+2))/2;

        for(int i=0;i<arr.length;i++)
        {
            res-=arr[i];
        }
        return res;
    }
}
public class FindMissing {

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,13};
        MissingNo m=new MissingNo();
        System.out.println("Missing Number="+m.miss(arr));
    }
}
