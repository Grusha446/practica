import java.util.ArrayList;
import java.util.List;

public class IntFilter {
    public static void main(String [] args)
    {
        NumbFilt numbFilt = arr ->
        {
            List<Integer> newArr = new ArrayList<>();
            for (int i = 0; i < arr.length; i++)
            {
               if(arr[i] %2 != 0)
               {
                   newArr.add(arr[i]);
               }
            }
            System.out.println(newArr);
        };
        int[] Arr = {5, 35, 123, 4, 1, 8, 7};
        numbFilt.method(Arr);
    }
}
interface NumbFilt
{
    void method(int[] arr);
}
