using System;

namespace anagram
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Please type in two strings. Press Enter after each.");
            string firstString = Console.ReadLine();
            string secondString = Console.ReadLine();
            if (Anagram.AreAnagrams(firstString, secondString))
            {
                Console.WriteLine("YES, they are anagrams indeed!");
            }
            else
            {
                Console.WriteLine("NO, they are not anagrams.");
            }
        }
    }
}
