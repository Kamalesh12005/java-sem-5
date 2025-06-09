class Main {
    void full_time(double salary)
    {
        System.out.println("The salary for Full time workers is "+salary);
    }
    void part_time(int hour,int salp)
    {
        double a=hour*salp;
        System.out.println("The part time workers paid for theri work is "+a);
    }
    void free_lancer(int hours,int paid)
    {
        int bonus=3000;
        double sal = hours*paid+bonus;
        System.out.println("the stipend paid for the freelancer is "+sal);
        
    }
    
    public static void main(String[] args) {
        Main m=new Main();
        m.full_time(50000);
        m.part_time(30,250);
        m.free_lancer(12,100);
        
   
    }
}