using System;
using System.Collections.Generic;

namespace CountLetters
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Please type in a line of text, then press the Enter key.");
            var inputString = Console.ReadLine();
            var characters = CountLetters.LetterCount(inputString);
            foreach (var key in characters.Keys)
            {
                int value;
                characters.TryGetValue(key, out value);
                Console.WriteLine(key + " -> " + value);
            }
        }
    }
}
