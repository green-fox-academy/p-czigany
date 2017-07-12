using System;

namespace FivesAndThrees
{
    public class AddBelow
    {
        public static int addMultipliesBelow(int[] multipliesOf, int below)
        {
            int sum = 0;

            for (int i = 1; i < below; i++)
            {
                for (int j = 0; j < multipliesOf.Length; j++)
                {
                    if (i % multipliesOf[j] == 0)
                    {
                        sum += i;
                        break;
                    }
                }                    
            }
            return sum;
        }
    }
}
