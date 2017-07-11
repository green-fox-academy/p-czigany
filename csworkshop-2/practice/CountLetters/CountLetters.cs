using System;
using System.Collections.Generic;

namespace CountLetters
{
    public class CountLetters
    {
        public static Dictionary<char, int> LetterCount(string toCount)
        {
            if (toCount == null)
            {
                throw new ArgumentNullException();
            }
            var characters = new Dictionary<char, int>();
            foreach (var character in toCount.ToCharArray())
            {
                if (!characters.ContainsKey(character))
                {
                    characters.Add(character, 0);
                }
                int currentValue;
                characters.TryGetValue(character, out currentValue);
                characters.Remove(character);
                characters.Add(character, currentValue + 1);
            }
            return characters;
        }
    }
}
