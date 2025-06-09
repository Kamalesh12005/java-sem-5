class task3 {
    public static void main(String[] args) {
       String a = "aweoirdus";
       int b=0,c=0;
       char[] ab=a.toCharArray();
       for(int i=0;i<ab.length;i++)
       {
           if(ab[i] =='a'||ab[i] =='e'||ab[i] =='i'||ab[i] =='o'||ab[i] =='u')
           {
               b++;
       }
       else
       {
           c++;
       }
       }
       System.out.println("Vowels :"+b);
       System.out.println("Constants :"+c);
    }
}