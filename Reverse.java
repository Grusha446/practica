public class Reverse {
    public static void main(String [] args)
    {
        Revers revers = sb ->
        {
          sb.reverse();
        };
        StringBuilder stringBuilder = new StringBuilder("Ale");
        revers.reverse(stringBuilder);
        System.out.println(stringBuilder);
    }
}
interface Revers
{
    void reverse(StringBuilder sb);
}