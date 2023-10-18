import java.util.Scanner;

public class Card {
    Scanner sc = new Scanner(System.in);
    private int type,value;
    private String[] cardSymbol = {"Clubs","Spades","Diamonds","Hearts"};
    private String[] cardRank = {"Ace","king","Queen","Jack","10","9","8","7","6","5","4","3"
            ,"2"};

    public Card(int type, int value) {
        this.type = type;
        this.value = value;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public void compareCards() {
        Card card1 = new Card(0,0);
        Card card2 = new Card(0,0);

        System.out.println("Pick the first card");
        int card1Rank = sc.nextInt();
        card1.setValue(card1Rank);
        int card1Symbol = sc.nextInt();
        card1.setType(card1Symbol);
        System.out.println(card1);
        System.out.println("Pick the Second card");
        int card2Rank = sc.nextInt();
        card2.setValue(card2Rank);
        int card2Symbol = sc.nextInt();
        card2.setType(card2Symbol);
        System.out.println(card2);

        if (card1.equals(card2)){
            System.out.println("These cards are the same");
        }else System.out.println("Not the same cards");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Card card = (Card) obj;
        return value == card.value && type == card.type;
    }

@Override
    public String toString(){
        String finalCard = cardRank[value] + " of " + cardSymbol[type];
        return finalCard;
    }
}
