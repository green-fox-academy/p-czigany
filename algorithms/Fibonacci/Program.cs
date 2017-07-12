using System;

namespace Fibonacci
{
    class MainClass
    {
        private const int UNDER = 4000000;

        public static void Main(string[] args)
        {
            Console.WriteLine(Fibonacci.AddAllEvenFibonacciBelow(UNDER));
        }
    }
}
