public class Anime{

    private String name;
    private String type;
    private boolean isMature;
    private double rating;
    private double ratingCount;
    private static int animeCount = 0;

    public Anime(){
        name = "Unnamed anime " + animeCount + 1;
        type = "N/A";
        isMature = false;
        rating = 0.0;
        ratingCount = 0;
        animeCount++;
    }
    public Anime(String n, String t, boolean m){
        name = n;
        type = t;
        isMature = m;
        rating = 0.0;
        ratingCount = 0;
        animeCount++;
    }
    
    public String getName(){return name;}
    public String getType(){return type;}
    public boolean getRating(){return isMature;}
    public void setName(String n){name = n;}
    public void setType(String t){type = t;}
    public void setRating(boolean m){isMature = m;}
    public static String getAnimeCount(){return "There are currently " + animeCount + " anime in your list.";}
    public String toString(){
        if(isMature == true){
            return "The anime " + name + " is a " + type + " that is mature."; 
        }else{
            return "The anime " + name + " is a " + type + " that is family friendly.";  
        }
    }
    
    public void addRating(double r){
        rating += r;
        ratingCount += 1;
    }
    
    public String calculateRating(){
        return "The rating for " + name + " is " + rating/ratingCount +  "/10.";
    }
    
    public 
    
}