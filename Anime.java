public class Anime{

    private String name;
    private String type;
    private boolean isMature;
    private double score;
    private double scoreCount;
    private static int animeCount = 0;

    public Anime(){
        name = "Unnamed anime " + (animeCount + 1);
        type = "N/A";
        isMature = false;
        score = 0.0;
        scoreCount = 0;
        animeCount++;
    }
    public Anime(String n, String t, boolean m){
        name = n;
        type = t;
        isMature = m;
        score = 0.0;
        scoreCount = 0;
        animeCount++;
    }
    
    public String getName(){return name;}
    public String getType(){return type;}
    public boolean getRating(){return isMature;}
    public void setName(String n){name = n;}
    public void setType(String t){type = t;}
    public void setScore(boolean m){isMature = m;}
    public static String getAnimeCount(){return "There are currently " + animeCount + " anime in your list.";}
    public String toString(){
        if(isMature == true){
            return "The anime " + name + " is a " + type + " that is mature "; 
        }else{
            return "The anime " + name + " is a " + type + " that is family friendly ";  
        }
    }
    public boolean equals(Object other){
        Anime a = (Anime)other;
        if(this.name.equals(a.getName())&&this.type.equals(a.getType())&&this.isMature == a.getRating()){
            return true;
        }else{return false;}
    }
    //adds a double (score) to the rating of the show.
    public void addScore(double r){
        score += r;
        scoreCount += 1;
    }
    
    //calculates the rating of the anime based on the inputs added on addRating mathod.
    public String calculateScore(){
        return "The rating score for " + name + " is " + score/scoreCount +  "/10.";
    }
    

}