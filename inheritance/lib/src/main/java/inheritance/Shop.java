package inheritance;

import jdk.jfr.internal.tool.PrettyWriter;

public class Shop {

    String name;
    String  description;
    int price;
    int stars;

    public Shop(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }


    // functions
    Review review;
    public void addReview(String body,String author, int numberOfStars){
        review = new Review(this.name, body, author, numberOfStars);
        this.stars = numberOfStars;


    }


    @Override
    public String toString() {
        if(review != null){
            return "Shop{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", price=" + price +
                    '}'+"\n"+" review: "+ review.toString();


        }else{
            return "Shop{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", price=" + price +
                    '}';


        }


    }


}
