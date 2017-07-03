using System;
using System.Collections.Generic;

namespace battleship
{
    class MainClass
    {
        static int MAPSIZE = 20;
        static int[,] map = new int[MAPSIZE, MAPSIZE];
        static int[,] appearedMap = new int[MAPSIZE, MAPSIZE];
        //column names:
        const List<string> ALPHABET = new List<string>
        {   "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        //# of ships by length:
        const Dictionary<int, int> SHIPS = new Dictionary<int, int>
        {   { 8, 1 }, 
            { 5, 2 }, 
            { 3, 3 }, 
            { 2, 3 }, 
            { 1, 4 }
        };

        public static void Main(string[] args)
        {
        }
    }
}
