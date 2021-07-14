public class Product {

    private String productName;

    private long codeBar;

    private float initialPrice;

    private static final float TVA = 0.2F;

    Product(){

    }

    Product(String productName, long codeBar, float initialPrice){
        this.productName = productName;
        this.codeBar = codeBar;
        this.initialPrice = initialPrice;
    }

    //here is the method for price with tax
    public float finalPrice(){
        float result = initialPrice * TVA + initialPrice;
        return result;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getCodeBar() {
        return codeBar;
    }

    public void setCodeBar(long codeBar) {
        this.codeBar = codeBar;
    }

    public float getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(float initialPrice) {
        this.initialPrice = initialPrice;
    }

    public String getInfo() {
        return "Product name: " + this.productName + "\n" +
                "Code Bar: " + this.codeBar + "\n" +
                "Initial Price: " + this.initialPrice + "\n" +
                "Final Price: " + this.finalPrice();
    }
}
