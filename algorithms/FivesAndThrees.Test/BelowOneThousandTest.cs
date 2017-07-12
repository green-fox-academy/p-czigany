using NUnit.Framework;
using System;

namespace FivesAndThrees.Test
{
    [TestFixture()]
    public class Test
    {
        [Test()]
        public void AddAllMultipliesOfFiveAndThreeBelowOneThousand_Test()
        {
            Assert.AreEqual(23, AddBelow.addMultipliesBelow(new int[]{ 3, 5 }, 10));
        }
    }
}

