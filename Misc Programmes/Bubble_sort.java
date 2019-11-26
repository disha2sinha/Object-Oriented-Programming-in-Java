class Bubble_sort{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        int i;
        int a[]=new int[n];
        for (i=0;i<n;i++){
            a[i]=Integer.parseInt(args[i+1]);
        }
        int j,temp;
        for(i=0;i<n;i++)
            {
                for(j=0;j<n-i-1;j++)
                    {
                        if(a[j]>a[j+1])
                            {
                                temp=a[j];
                                a[j]=a[j+1];
                                a[j+1]=temp;
                            }
                    }
            }
        System.out.println("Numbers in ascending order:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}