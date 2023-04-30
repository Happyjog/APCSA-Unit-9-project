import java.util.ArrayList;
public class StudioAnime extends Anime{

    private String studio;
    private ArrayList<String> comments;
    private static int madeBy;

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

    public void addComment(String c){
        comments.add(c);
    }

    public void showComments(){
        for(String i: comments){
            System.out.println(i);
        }
    }

    public void addScore(int s){
        
        int n;

        if (studio.equals("ufotable")||studio.equals("WhiteFox")){
            n = s+1;
            super.addScore(n);
        }else if (studio.equals("MAPPA")){
            n = s-1;
            super.addScore(n);
        }else {super.addScore(s);}
    }
}