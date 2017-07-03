using System;
using System.Linq;

namespace practice2
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            printOddAverage(n);
        }

        public static void printOddAverage(int[] inputNumbers)
        {
            double oddAverage = inputNumbers.Where(y => y % 2 != 0)
                                            .Average();
            Console.WriteLine(oddAverage);           
        }
    }
}
