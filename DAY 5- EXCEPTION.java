class Main {
    public static void main(String[] args) {
        int[] numbers = {1,3,5};
        
        try
        {
        System.out.println(numbers[10]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index bound");
        }
}
}