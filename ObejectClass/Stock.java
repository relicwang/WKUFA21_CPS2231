package ObejectClass;



public class Stock {
	/**Data Fieldes**/
	
	/**Date Field: Symbol**/
	String symbol;
	
	/**Date Field: Name**/
	String name;
	
	/**Date Field: previousClosingPrice**/
	double previousClosingPrice;
	
	/**Date Field: currentPrice**/
	double currentPrice;
	
	/**No-arg Constructor**/
	Stock(){
		
	}
	
	
	/**Constructor takes symbol and stock name value**/
	Stock(String newSymbol, String newName){
		symbol=newSymbol;
		name  = newName;
	}
	
	//Signature: getChangePercent: -> double
	//Purpose:  Returns the percentage changed from
	//          previousClosingPrice to currentPrice.
	double getChangePercent() {
		return (previousClosingPrice-currentPrice)/previousClosingPrice*100;
	}
	
	//Signature: setPreviousClosingPrice: double -> void
	//Purpose:  Set PreviousClosingPrice
	void setPreviousClosingPrice(double newPrevsClosingPrice) {
		previousClosingPrice=newPrevsClosingPrice;
	}
	
	
	//Signature: setCurrentPrice
	//Purpose:  Set CurrentPrice
	void setCurrentPrice(double newCurrentPrice) {
		currentPrice=newCurrentPrice;
	}
	
	
}
