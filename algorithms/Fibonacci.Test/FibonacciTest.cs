using NUnit.Framework;
using System;

namespace Fibonacci.Test
{
    [TestFixture()]
    public class Test
    {
        [Test()]
        public void FirstTerm_Test()
        {
            Assert.AreEqual(1, Fibonacci.FibonacciTerm(1));
        }

        [Test()]
        public void SecondTerm_Test()
        {
            Assert.AreEqual(2, Fibonacci.FibonacciTerm(2));
        }

        [Test()]
        public void ThirdTerm_Test()
        {
            Assert.AreEqual(3, Fibonacci.FibonacciTerm(3));
        }

        [Test()]
        public void FourthTerm_Test()
        {
            Assert.AreEqual(5, Fibonacci.FibonacciTerm(4));
        }

    }
}

