/*Write a recursive method, vowels that returns the number of
        vowels in a string. also write a program for your method*/
public class Vowelss {

    static int isVowel(char ch)
    {
        ch=Character.toUpperCase(ch);
        if(ch== 'A'|| ch=='E' || ch=='I'|| ch=='O' || ch=='U')
            return 1;
        else return 0;
    }
    static int countVowels(String str, int n)
    {
        if(n==1)
            return isVowel(str.charAt(n-1));
        return countVowels(str,n-1)+isVowel(str.charAt(n-1));
    }
    public static void main(String args[])
    {
        String str=" a bcds e ";
        System.out.println("the vowel is "+countVowels(str,str.length()));
    }
}

