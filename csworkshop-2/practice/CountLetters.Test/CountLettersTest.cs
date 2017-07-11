using NUnit.Framework;
using System;
using CountLetters;

using System.Collections.Generic;

namespace CountLetters.Test
{
    [TestFixture()]
    public class Test
    {
        [Test()]
        public void StringInput_Test()
        {
            string inputText = "dfsfdeF?$";
            Dictionary<char, int> expected = new Dictionary<char, int>()
            {
                {'d', 2},
                {'f', 2},
                {'s', 1},
                {'e', 1},
                {'F', 1},
                {'?', 1},
                {'$', 1}
            };
            Assert.AreEqual(expected, CountLetters.LetterCount(inputText));
        }

        [Test()]
        public void StringInputDifferentOrder_Test()
        {
            string inputText = "dfsfdeF?$";
            Dictionary<char, int> expected = new Dictionary<char, int>()
            {
                {'f', 2},
                {'s', 1},
                {'e', 1},
                {'F', 1},
                {'?', 1},
                {'$', 1},
                {'d', 2}
            };
            Assert.AreEqual(expected, CountLetters.LetterCount(inputText));
        }

        [Test()]
        public void StringInputWithWrongExpectation_Test()
        {
            string inputText = "dfsfdeF?$";
            Dictionary<char, int> expected = new Dictionary<char, int>()
            {
                {'d', 1},
                {'f', 2},
                {'s', 1},
                {'e', 1},
                {'F', 2},
                {'?', 1},
                {'$', 1}
            };
            Assert.AreNotEqual(expected, CountLetters.LetterCount(inputText));
        }

        [Test()]
        [ExpectedException(typeof(ArgumentNullException))]
        public void NullInput_Test()
        {
            string inputText = null;
            Dictionary<char, int> expected = new Dictionary<char, int>();
            CountLetters.LetterCount(inputText);
        }

        [Test()]
        public void HungarianCharactersInput_Test()
        {
            string inputText = "dősődeŰ?$";
            Dictionary<char, int> expected = new Dictionary<char, int>()
            {
                {'d', 2},
                {'ő', 2},
                {'s', 1},
                {'e', 1},
                {'Ű', 1},
                {'?', 1},
                {'$', 1}
            };
            Assert.AreEqual(expected, CountLetters.LetterCount(inputText));
        }
    }
}
