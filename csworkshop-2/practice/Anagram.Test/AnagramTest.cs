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
            string first = "alma";
            string second = "mala";

            Assert.AreEqual(true, Anagram.AreAnagrams(first, second));
        }

        [Test()]
        public void NotAnagramInputs_Test()
        {
            string first = "alm";
            string second = "mala";

            Assert.AreEqual(false, Anagram.AreAnagrams(first, second));
        }

        [Test()]
        public void UppercaseAnagramInputs_Test()
        {
            string first = "AlMa";
            string second = "maLa";

            Assert.AreEqual(true, Anagram.AreAnagrams(first, second));
        }

        [Test()]
        public void IndentatedAnagramInputs_Test()
        {
            string first = "al, ma";
            string second = "ma. la?";

            Assert.AreEqual(true, Anagram.AreAnagrams(first, second));
        }

        [Test()]
        public void IndentatedWithUppercaseAnagramInputs_Test()
        {
            string first = "aL, Ma";
            string second = "mA. lA?";

            Assert.AreEqual(true, Anagram.AreAnagrams(first, second));
        }

        [Test()]
        public void DifferentNumberOfSameCharacters_Test()
        {
            string first = "aaalma";
            string second = "mmalla";

            Assert.AreEqual(false, Anagram.AreAnagrams(first, second));
        }

        [Test()]
        [ExpectedException(typeof(ArgumentNullException))]
        public void NullValues_Test()
        {
            string first = null;
            string second = null;

            Anagram.AreAnagrams(first, second);
        }

    }
}
