public class Filter {
    public static void main(String [] args)
    {
        Opfilt opfilt = arr ->
        {
          for (int i = 0; i < arr.length; i++)
          {
              if(arr[i].startsWith("a"))
              {
                  System.out.println(arr[i]);
              }
              else
              {
                  arr[i] = null;
              }
          }
        };
        String[] Arr = {"apple", "boom", "dgadg", "sgas"};
        opfilt.filter(Arr);
        System.out.println(Arr);
    }
}
interface Opfilt
{
    void filter(String[] arr);
}