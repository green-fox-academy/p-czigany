using System;
using System.Collections.Generic;
using System.Text.RegularExpressions;

namespace Anagram
{
    public class Anagram
    {
        public static bool AreAnagrams(string firstOne, string secondOne)
        {
            if (firstOne == null || secondOne == null)
            {
                throw new ArgumentNullException();
            }
            var lettersInFirst = MakeLetterList(firstOne);
            var lettersInSecond = MakeLetterList(secondOne);
            if (lettersInFirst.Count != lettersInSecond.Count)
            {
                return false;
            }
            return RemoveLetters(lettersInFirst, lettersInSecond).Count == 0;
        }

        private static List<char> MakeLetterList(string stringToDeconstruct)
        {
            var lowerCase = stringToDeconstruct.ToLower();
            var noPunctuation = Regex.Replace(lowerCase, "[^a-z0-9]", "");
            var onlyLetters = noPunctuation.ToCharArray();

            var stringAsList = new List<char>();
            foreach (var letter in onlyLetters)
            {
                stringAsList.Add(letter);
            }
            return stringAsList;
        }

        private static List<char> RemoveLetters(IEnumerable<char> toRemove, List<char> removeFrom)
        {
            foreach (var letter in toRemove)
            {
                if (removeFrom.Contains(letter))
                {
                    removeFrom.Remove(letter);
                }
            }
            return removeFrom;
        }
    }
}
