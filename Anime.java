public class Anime{

    private String name;
    private String type;
    private boolean isMature;
    private static int animeCount = 0;

    public Anime(){
        name = "Unnamed anime " + animeCount + 1;
        type = "N/A";
        isMature = false;
    }
    public Anime(String n, String t, boolean m){
        name = n;
        type = t;
        isMature = m;
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
            return "The anime " + name + " is a " + type + " that is family-friendly.";  
        }
    }

    
}