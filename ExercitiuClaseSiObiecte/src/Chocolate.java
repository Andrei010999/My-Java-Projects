 public class Chocolate extends Product {

    private double weight;

    Chocolate(String productName, long codeBar, float initialPrice , double weight){
        super.setProductName(productName);
        super.setCodeBar(codeBar);
        super.setInitialPrice(initialPrice);
        this.weight = weight;
    }


     @Override
     public String getInfo() {
         return super.getInfo() + "\n" +
                 "Weight: " + weight;
     }
 }