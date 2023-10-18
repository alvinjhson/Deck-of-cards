public class Card {
    private int type,value;
    private String[] cardSymbol = {"Clubs","Spades","Diamonds","Hearts"};
    private String[] cardRank = {"Ace","king","Queen","Jack","10","9","8","7","6","5","4","3"
    ,"2"};

    public Card(int type, int value) {
        this.type = type;
        this.value = value;
    }



    public String toString(){
        String finalCard = cardRank[value] + " of " + cardSymbol[type];
        return finalCard;
    }
}
