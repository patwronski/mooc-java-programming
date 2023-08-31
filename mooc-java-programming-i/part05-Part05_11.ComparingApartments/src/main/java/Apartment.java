
public class Apartment {
    
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int calcPriceTotal(){
        return this.squares * this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment comparedSquares){
        return this.squares > comparedSquares.squares;
    }
    
    public int priceDifference(Apartment comparedPrice){
        if (this.calcPriceTotal() - comparedPrice.calcPriceTotal() < -1){
            return (this.calcPriceTotal() - comparedPrice.calcPriceTotal()) * -1;
        }
        return this.calcPriceTotal() - comparedPrice.calcPriceTotal();
    }
    
    public boolean moreExpensiveThan(Apartment comparedMoreExpensive){
        return this.calcPriceTotal() > comparedMoreExpensive.calcPriceTotal();
    }
}
