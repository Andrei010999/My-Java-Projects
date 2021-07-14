public class Wine extends Product {

    private int volume;

    Wine(String productName, long codeBar, float initialPrice, int volume){
        super.setProductName(productName);
        super.setCodeBar(codeBar);
        super.setInitialPrice(initialPrice);
        this.volume = volume;
    }

    //override method for price with tax and alcohol extra tax
    @Override
    public float finalPrice() {
        float pretDejaCrescut = super.finalPrice();
        float pretFinal = pretDejaCrescut * 1.1F + pretDejaCrescut;
        return pretFinal;
    }

    @Override
    public String getInfo() {
        return "Product name: " + super.getProductName() + "\n" +
                "Code Bar: " + super.getCodeBar() + "\n" +
                "Initial Price: " + super.getInitialPrice() + "\n" +
                "Final Price: " + this.finalPrice() + "\n" +
                "Volume: " + volume;
    }

}