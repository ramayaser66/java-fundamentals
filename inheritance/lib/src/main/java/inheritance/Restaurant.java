package inheritance;

public class Restaurant {
    String name;
    int stars;
    int price;



    public Restaurant(String name, int stars, int price) {
        if (stars < 0 || stars>5){
            System.out.println("invalid stars rating please rate form 0 to 5 ... ");
        }else{

            this.name = name;
            this.stars = stars;
            this.price = price;
        }

    }

    public Restaurant(String name, int stars) {
//        System.out.println("in restaurant constructor ");
        this.name = name;
        this.stars = stars;
    }


    // functions
    Review review;
    public void addReview(String body,String author, int numberOfStars){
         review = new Review(this.name, body, author, numberOfStars);
        this.stars = numberOfStars;


    }

    @Override
    public String toString(){

        return "restaurant info... name: " +name+" number of stars "+stars+" price "+ price+"\n"+" Review: "+ review.toString();

    }

}
