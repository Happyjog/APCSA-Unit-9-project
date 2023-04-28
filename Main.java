public class Main{
    public static void main(String[] args){
        Anime reZero = new Anime("Re:Zero Starting Life in Another World", "TV show", false);
        
        System.out.println(reZero);
        
        reZero.addRating(9);
        reZero.addRating(10);
        
        System.out.println(reZero.calculateRating());
    }
}