class recursion{
    static int recursion(int n)    {
        if (n == 0)            return 0;
        return (n % 10 + recursion(n / 10));    }
    public static void main(String args[])
    {        int num = 256;
        int result = recursion(num);        System.out.println("Sum of digits in " +
            num + " is " + result);    }
}