import java.util.ArrayList;
public class StudioAnime extends Anime{

    private String studio;
    private ArrayList<String> comments;

    public StudioAnime(){
        super();
        studio = "N/A";
        comments = new ArrayList<String>();
    }
    public StudioAnime(String n, String t, boolean m, String s){
        super(n, t, m);
        studio = s;
        comments = new ArrayList<String>();
    }

    public String getStudio(){return studio;}
    public void setStudio(String s){studio = s;}

    public String toString(){
        return super.toString() + "and was made by " + studio;
    }

    public boolean equals(Object other){
        StudioAnime sa = (StudioAnime)other;
        return super.equals(sa) && sa.getStudio().equals(studio);
    }

    //adds the string inputted to an arraylist.
    public void addComment(String c){
        comments.add(c);
    }

    //prints the comments added in previous method.
    public void showComments(){
        System.out.println("Comments on studio: ");
        for(String i: comments){
            System.out.println(i);
        }
    }

    //overwritten method of addscore where if the studio is a certain string, it adds or subtracts to the score accordingly.
    public void addScore(double s){
        
        double n;

        if (studio.equals("ufotable")||studio.equals("White Fox")){
            n = s+1;
            super.addScore(n);
        }else if (studio.equals("MAPPA")){
            n = s-1;
            super.addScore(n);
        }else {super.addScore(s);}
    }
    
}