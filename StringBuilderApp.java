package be.intecbrussel.hoofdstuk6.stringBuilder;

public class StringBuilderApp
{
    public static void main(String[] args)
    {
        StringBuilder buddha = new StringBuilder("In all heaven and earth, I have no equal.");
        System.out.println(buddha);
        StringBuilder dio = new StringBuilder("Za warudo.");
        System.out.println(buddha.append(" Or only me."));
        System.out.println(buddha.charAt(3));
        buddha.setCharAt(0, 'O');
        System.out.println(buddha);
        System.out.println(buddha.deleteCharAt(8));
        System.out.println(buddha.equals(dio));
        System.out.println(buddha.indexOf("all"));
        System.out.println(buddha.length());
        System.out.println(buddha.replace(0, 22, "Above and below the heavens"));
        System.out.println(buddha.toString());
        System.out.println(buddha.substring(6, 9));
        System.out.println(buddha.reverse());
        System.out.println(buddha.reverse());
        System.out.println(buddha.insert(28, " only I am exalted. Or"));
    }
}
