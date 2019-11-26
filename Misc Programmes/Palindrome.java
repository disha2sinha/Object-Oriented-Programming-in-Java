class Palindrome{
    public static void main(String args[])
    {
        String word=args[0],reverse="";
        int n=word.length(),i;
        for(i=n-1;i>=0;i--)
        {
            reverse=reverse+word.charAt(i);
        }
        System.out.println("Reverse of given word is :"+reverse);
        if(word.equalsIgnoreCase(reverse))
        {
            System.out.println("So the string is Palindrome.");
        }
        else
        {
            System.out.println("So the string is not Palindrome.");
        }
    }
}