using System;

namespace Fibonacci
{
    public class Fibonacci
    {
        public static int FibonacciTerm(int number)
        {
            if (number == 1)
            {
                return 1;
            }
            else if (number == 2)
            {
                return 2;
            }
            else
            {
                return FibonacciTerm(number - 1) + FibonacciTerm(number - 2);
            }
        }
    }
}

