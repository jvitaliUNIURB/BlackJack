package Cards;

import java.util.*;

public class Deck {
    private Stack<Cards> deck;
    private static final int n_decks = 4;

    public Deck()
    {
        this.deck = new Stack<>();
        restore();
        shuffle();
    }

    public void restore(){
        for (int i = 0; i < n_decks; i++)
        {
            for (Suits s: Suits.values())
            {
                for (Ranks r : Ranks.values())
                {
                    this.deck.push(new Cards(s,r));
                }
            }
        }
    }
    public void shuffle(){
        ArrayList<Cards> a = new ArrayList<>();
        int i;
        while(!deck.isEmpty())
        {
            a.add(deck.pop());
        }
        while (!a.isEmpty())
        {
            i = new Random().nextInt(a.size());
            deck.push(a.remove(i));
        }
    }
    public Cards draw(){
        if (deck.isEmpty()) return null;
        return deck.pop();
    }

}
