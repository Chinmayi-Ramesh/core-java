class PopCorn {
    
    int popCornid;
    String brand;
    double price;
    
    
    PopCorn() {
        System.out.println("Constructor is executing");
        
        
        {
            System.out.println("This is a block inside constructor");
        }
    }

    
    public void popCornDisplayDetails() {
        System.out.println("The Popcorn details are invoked");
        System.out.println("The Popcorn id is " + popCornid);
        System.out.println("The Popcorn brand is " + brand);
        System.out.println("The Popcorn price is " + price);
    }
}