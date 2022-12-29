
class Searcing
{
    public int Search(int arr[],int no)
    {
        int s=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==no)
            {
                s=i;
            }
        }
        return s;
    }
}

public class LinerS {

    public static void main(String args [])
    {
        int k=12;
        int arr[]={32,11,4,54,33,12};
        Searcing s=new Searcing();
        int number=s.Search(arr,k);

        System.out.println("Number fund at location="+number);
    }
}
