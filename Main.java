import java.util.*;
public class Main{
    public static void main(String[] args){
        Anime reZero = new Anime("Re:Zero Starting Life in Another World", "TV show", false);
        

        //use of addscore method
        reZero.addScore(9);
        reZero.addScore(10);
        
        Anime dbz = new Anime();

        StudioAnime Jojo = new StudioAnime("Jojo's Bizzare Adventure", "TV show", false, "David Productions");

        //addComment method for StudioAnime class
        Jojo.addComment("Awesome!");
        Jojo.addComment("Cool!");
        Jojo.addComment("Nice!");

        //showComments method for StudioAnime class
        Jojo.showComments();


        //System.out.println(reZero);
        //System.out.println(dbz);
        
        //equals methods
        System.out.println(dbz.equals(reZero));
        System.out.println(reZero.equals(reZero));
        
       System.out.println(reZero.calculateScore());

       AnimeEpisode oregairu = new AnimeEpisode("My Teen Romantic Comedy SNAFU", "TV show", false, "Studio Feel", 36);

        //addComment methods here for overriden version
        oregairu.addComment("Awesome ep!", 1);
        oregairu.addComment("cool ep!", 2);
        oregairu.addComment("heartwarming.", 12);
        oregairu.addComment("naisu", 6);
        oregairu.addComment("good stuff", 3);

        //shows comments that are overriden for AnimeEpisode class.
        oregairu.showComments();

        ArrayList<Anime> animeList = new ArrayList<Anime>();

        //adds objects to the arraylist
        animeList.add(reZero);
        animeList.add(oregairu);
        animeList.add(Jojo);
        animeList.add(dbz);
        animeList.add(new Anime("KonoSuba: God's Blessing on This Wonderful World!", "TV show", false));
        
        Anime yourName = new StudioAnime("Your Name", "Movie", false, "CoMix Wave Films");

        animeList.add(yourName);

        Anime hyouka = new AnimeEpisode("Hyouka", "TV show", false, "Kyoto Animaion", 22);

        animeList.add(hyouka);

        Anime codeGeass = new AnimeEpisode("Code Geass: Lelouch of the Rebellion", "TV show", true, "Sunrise", 50);

        animeList.add(codeGeass);

        AnimeEpisode onePiece = new AnimeEpisode("One Piece", "TV show", false, "TOHO Animation", 1060);

        animeList.add(onePiece);

        StudioAnime steinsGate = new AnimeEpisode("Steins;Gate", "TV show", false, "White Fox", 24);
        
        animeList.add(steinsGate);

        //prints toString of the objects within the arraylist
        for(Anime i: animeList){
            System.out.println(i);
        }

        //watch 1060 episode, then add one to the count of total episodes.
        onePiece.watched(onePiece.getEpCount());
        onePiece.addNewEps(1);

        System.out.println(onePiece);
        
        //use of overridden score methods, finding the studio to be White Fox and adding 1 to the score entered.
        steinsGate.addScore(10);
        System.out.println(steinsGate.calculateScore());
        
        //equls method for super and subclass.
        System.out.println(reZero.equals(onePiece));
        




        
    }
}