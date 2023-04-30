import java.util.ArrayList;
public class AnimeEpisode extends StudioAnime{
    public class CommentedEpisode{

        private int epNumber;
        private String comment;

        public CommentedEpisode(int en, String c){
            epNumber = en;
            comment = c;
        }
        public int getEpNumber(){return epNumber;}
        public String getComment(){return comment;}

    }

    private int epCount;
    private int epWatched;
    private ArrayList<CommentedEpisode> epComments;


    public AnimeEpisode(){
        super();
        epCount = 0;
        epWatched = 0;
        epComments = new ArrayList<CommentedEpisode>();
    }
    public AnimeEpisode(String n, String t, boolean m, String s, int c){
        super(n, t, m, s);
        epCount = c;
        epComments = new ArrayList<CommentedEpisode>();
    }

    public int getEpCount(){return epCount;}
    public int getEpWatched(){return epWatched;}

    public String toString(){
        return super.toString() + "in which you have watched " + epWatched + "/" + epCount;
    }

    public boolean equals(Object other){
        AnimeEpisode ae = (AnimeEpisode) other;
        return super.equals(ae) && epCount == ae.getEpCount();
    }

    public void watched(int w){
        epWatched += w;
    }
    public void addNewEps(int ne){
        epCount += ne;
    }

    public void addComment(String c, int ep){
        epComments.add(new CommentedEpisode(ep, c));
    }

    public void showComments(){
        super.showComments();
        System.out.println("Comments for episodes: ");

        int small;

        for (int i = 0; i < epComments.size()-1; i++){  
            small = i;  
              
            for (int j = i+1; j < epComments.size(); j++){  
                if (epComments.get(i).getEpNumber() < epComments.get(small).getEpNumber()){  
                    small = j;
                }
            }    
        CommentedEpisode temp = epComments.get(small);  
        epComments.set(small, epComments.get(i));  
        epComments.set(i,temp);
        }  

        for(CommentedEpisode i: epComments){
            System.out.println("EP" + i.getEpNumber() + ": " + i.getComment());
        }
    }  
}
