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
            List<char> lettersInFirst = MakeLetterList(firstOne);
            List<char> lettersInSecond = MakeLetterList(secondOne);
            if (lettersInFirst.Count != lettersInSecond.Count)
            {
                return false;
            }
            if (RemoveLetters(lettersInFirst, lettersInSecond).Count != 0)
            {
                return false;
            }
            return true;
        }

        private static List<char> MakeLetterList(string stringToDeconstruct)
        {
            string lowerCase = stringToDeconstruct.ToLower();
            string noPunctuation = Regex.Replace(lowerCase, "[^a-z0-9]", "");
            char[] onlyLetters = noPunctuation.ToCharArray();

            List<char> stringAsList = new List<char>();
            foreach (var letter in onlyLetters)
            {
                stringAsList.Add(letter);
            }
            return stringAsList;
        }

        private static List<char> RemoveLetters(List<char> toRemove, List<char> removeFrom)
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
