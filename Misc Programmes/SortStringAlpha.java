class SortStringAlpha{
    public static void main(String args[])
    {
        int length=Integer.parseInt(args[0]);
        String city[]= new String [length]; 
        String temp;
        int i,j;
        for(i=0;i<length;i++)
        {
            city[i]=args[i+1];
        }
        for(i=0;i<length;i++)
        {
            for(j=i+1;j<length;j++)
            {
                if(city[i].compareTo(city[j])>0)
                {
                    temp=city[i];
                    city[i]=city[j];
                    city[j]=temp;
                }
            }
        }
        System.out.println("Cities in alphabetical order:");
        for(i=0;i<length;i++)
        {
            System.out.println(city[i]);
        }
    }
}