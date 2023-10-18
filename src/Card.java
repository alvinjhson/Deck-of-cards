public class Card {
    private int cardRank;
    private String symbol;

    public Card(int cardRank, String symbol) {
        this.cardRank = cardRank;
        this.symbol = symbol;
    }

    public int getCardRank() {
        return cardRank;
    }

    public String getSymbol() {
        return symbol;
    }

    public String toString(){
        return "The card is " + getSymbol() + getCardRank();
    }
}
