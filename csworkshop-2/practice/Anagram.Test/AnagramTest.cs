using NUnit.Framework;
using System;
using Anagram;

namespace Anagram.Test
{
    [TestFixture()]
    public class AnagramTest
    {
        [Test()]
        public void AnagramInputs_Test()
        {
            string[] simpleAnagramWords = {"alma", "mala"};

            Assert.AreEqual(true, Anagram.AreAnagrams(simpleAnagramWords[0], simpleAnagramWords[1]));
    }

        [Test()]
        public void NotAnagramInputs_Test()
        {
            string[] notAnagrams = {"alm", "mala"};

            Assert.AreEqual(false, Anagram.AreAnagrams(notAnagrams[0], notAnagrams[1]));
        }

        [Test()]
        public void DifferentCasingAnagramInputs_Test()
        {
            string[] differentCases = {"AlMa", "maLa"};

            Assert.AreEqual(true, Anagram.AreAnagrams(differentCases[0], differentCases[1]));
        }

        [Test()]
        public void IndentatedAnagramInputs_Test()
        {
            string[] indentated = {"al, ma", "ma. la?"};

        Assert.AreEqual(true, Anagram.AreAnagrams(indentated[0], indentated[1]));
        }

        [Test()]
        public void IndentatedWithUppercaseAnagramInputs_Test()
        {
            string[] indentatedWithUpperCase = {"aL, Ma", "mA. lA?"};

        Assert.AreEqual(true, Anagram.AreAnagrams(indentatedWithUpperCase[0], indentatedWithUpperCase[1]));
        }

        [Test()]
        public void DifferentNumberOfSameCharacters_Test()
        {
            string[] differentNumberOfCharacters = {"aaalma", "mmalla"};

            Assert.AreEqual(false, Anagram.AreAnagrams(differentNumberOfCharacters[0], differentNumberOfCharacters[1]));
        }

        [Test()]
        [ExpectedException(typeof(ArgumentNullException))]
        public void NullValues_Test()
        {
            string[] nullValueStrings = {null, null};

            Anagram.AreAnagrams(nullValueStrings[0], nullValueStrings[1]);
        }

    }
}
