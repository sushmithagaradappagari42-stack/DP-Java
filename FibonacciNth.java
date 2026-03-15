class FibonacciNth
{
public static void main(String args[])
{
int n = 7;   
int a = 0, b = 1, c = 0;
if(n == 1)
{
System.out.println("Nth Fibonacci number = " + a);
}
else if(n == 2)
{
System.out.println("Nth Fibonacci number = " + b);
}
else
{
for(int i = 3; i <= n; i++)
{
c = a + b;
a = b;
b = c;
}
System.out.println("Nth Fibonacci number = " + c);
}
}
}