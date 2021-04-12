package inheritance;

public class Review extends Restaurant{
    String body;
    String author;
    int numberOfStars;



    public Review( String name,String body, String author, int numberOfStars) {
        //        super(name,  numberOfStars);
        
                this.name = name;
                this.body = body;
                this.author = author;
                this.numberOfStars = numberOfStars;
            }
        
        
            @Override
            public String toString() {
                return "Review info: "+body+" author: "+ author+ " number of stars: "+ numberOfStars;
        
        
            }
            
}
