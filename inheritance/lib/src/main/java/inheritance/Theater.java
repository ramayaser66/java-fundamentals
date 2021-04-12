package inheritance;

import java.util.ArrayList;

public class Theater {
    String name;
    ArrayList<String> movies = new ArrayList<>();
    int stars;

    public Theater(String name) {
        this.name = name;
    }






    //addMovie function

    public  void addMovie(String movieName){
        movies.add(movieName);

    }


    // removeMovie functions
    public  void removeMovie(String movieName){

        if(movies.contains(movieName)){
            movies.remove(movieName);

        }else{
            System.out.println(" Movie dose not exist");
        }
    }

    //review  function

    Review review;
    public void addReview(String movieName ,String body,String author, int numberOfStars) {
        if(movies.contains(movieName)){
            review = new Review(movieName, body, author, numberOfStars);
            this.stars = numberOfStars;
        }else{
            review = new Review(this.name, body, author, numberOfStars);
            this.stars = numberOfStars;
        }

    }


    @Override
    public String toString() {
        if(review != null){
            return "Theater{" +
                    "name='" + name + '\'' +
                    ", movies=" + movies +
                    '}'+"\n"+ "review: "+review.name+", "+ review.body+", "+review.author+", number Of Stars: "+ review.numberOfStars;
        }else {
            return "Theater{" +
                    "name='" + name + '\'' +
                    ", movies=" + movies +
                    '}';

        }

    }
}

