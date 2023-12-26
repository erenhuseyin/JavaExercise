package builderdesignpattern;

public class CoffeeStore {

    private String size;
    private Boolean isMilked;
    private Boolean isLactoseFree;
    private Integer price;



    public static class Builder{
        private String size;
        private Boolean isMilked;
        private Boolean isLactoseFree;
        private Integer price;

        public Builder(String size){
            super();
            this.size = size;
        }

        public Builder lactoseFreeChoose(Boolean isLactoseFreeChoose){
            isLactoseFree = isLactoseFreeChoose;
            return this;
        }

        public Builder milkChoose(Boolean isMilkedChoose){
            isMilked = isMilkedChoose;
            return this;
        }

        public Builder priceCounting(Integer coffeePrice){
            price = coffeePrice;
            return this;
        }

        public CoffeeStore build(){
            return new CoffeeStore(this);
        }

    }

    public CoffeeStore(Builder builder) {
        size = builder.size;
        isMilked = builder.isMilked;
        isLactoseFree = builder.isLactoseFree;
        price = builder.price;
    }
}
