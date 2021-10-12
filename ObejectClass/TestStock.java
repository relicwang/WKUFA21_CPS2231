package ObejectClass;

//Test Stock class
public class TestStock {

	// ORCL, the name Oracle Corporation
	public static void main(String[] args) {
		Stock oracleStock = new Stock("ORCL","Oracle Corporation");
		oracleStock.setCurrentPrice(34.35);
		oracleStock.setPreviousClosingPrice(34.5);
		
		System.out.println(oracleStock.getChangePercent());
	}

}
