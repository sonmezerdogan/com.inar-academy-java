package chapters.chapter_07;

public class deckCards {
    public static void main(String[] args) {
        String[] cardSuit= {"Spade", "Heart", "Diamond", "Club"};
        String[] cardNumber= {"Ace","2","3","3","4","5","6","7","8","9","Jack","Queen","King"};

        int[] deck= new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i]=i;
        }
        for (int i = 0; i < deck.length; i++) {
            int randomIndex=(int)(Math.random()*52);

            int tempIndex=deck[i];
            deck[i]=deck[randomIndex];
            deck[randomIndex]=tempIndex;
        }
        for (int i = 0; i < cardSuit.length; i++) {
            String cardType= cardSuit[deck[i]/13];
            String cardNum= cardNumber[deck[i]%13];
            System.out.println(cardType+" "+cardNum);

        }
    }
}
