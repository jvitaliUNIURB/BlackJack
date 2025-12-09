package Cards;

import Const.Const;

public class Cards implements Const{

    static public class Suits {
        private int suits;

        public Suits (int seed) {
            this.setSuits(seed);
        }

        public int getSuits() {
            return suits;
        }

        public void setSuits(int s) {
            if (s != HEARTS && s != DIAMONDS && s != SPADES && s != CLUBS)
            this.suits = suits;
        }
    }
}
