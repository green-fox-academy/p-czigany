using System;

namespace Fibonacci
{
    public class Fibonacci
    {

        public static int AddAllEvenFibonacciBelow(int number)
        {
            int sum = 0;
            int index = 0;
            int term = 0;
            while (true)
            {
                index++;
                term = FibonacciTerm(index);
                if (term >= number)
                {
                    break;
                }
                if (term % 2 == 0)
                {
                    sum += term;
                }

            }
            return sum;
        }

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

