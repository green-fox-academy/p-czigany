using System;
using System.Collections.Generic;
using System.Linq;

namespace practice
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            printEvenNumbers(n);
        }

        public static void printEvenNumbers(int[] inputNumbers)
        {
            IEnumerable<int> evenNumbers = inputNumbers.Where(y => y % 2 == 0);
            foreach (int i in evenNumbers)
            {
                Console.WriteLine(i);
            }
        }
    }
}
