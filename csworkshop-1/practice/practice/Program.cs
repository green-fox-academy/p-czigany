using System;
using System.Collections.Generic;
using System.Linq;

namespace practice
{
    class MainClass
    {
        public static void Main(string[] args)
        {
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
