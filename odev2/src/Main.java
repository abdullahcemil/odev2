public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String mesaj = "Vade oranı";
//set value
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makines");
        product1.SetDiscount(7);
        product1.setUnitprice(7500);
        product1.setUnisInstock(3);
        product1.setImageUrl("image1.jpg");

       /* product1.name = "Delonghi Kahve Makines";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitsInStock = 3;
        product1.İmageUrl = "bilinmiyor1.jpg";*/
//get
       // System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makines");
        product2.SetDiscount(7);
        product2.setUnitprice(7500);
        product2.setUnisInstock(3);
        product2.setImageUrl("image2.jpg");
       /* product2.name = "Smeg Kahve Makines";
        product2.unitPrice = 6500;
        product2.discount = 8;
        product2.unitsInStock = 2;
        product2.İmageUrl = "bilinmiyor2.jpg";*/

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makines");
        product3.SetDiscount(7);
        product3.setUnitprice(7500);
        product3.setUnisInstock(3);
        product3.setImageUrl("image3.jpg");
       /* product3.name = "Kitchen Aid Kahve Makines";
        product3.unitPrice = 4500;
        product3.discount = 9;
        product3.unitsInStock = 4;
        product3.İmageUrl = "bilinmiyor3.jpg";*/

        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println( "<li> " + product.getName() + "</li>");

        }
        System.out.println("</l>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("054545545454");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Cemil");
        individualCustomer.getLastName("Vançelik");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone(0533333333);
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};




    }
}