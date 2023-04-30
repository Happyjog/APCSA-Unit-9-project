public class Main{
    public static void main(String[] args){
        Anime reZero = new Anime("Re:Zero Starting Life in Another World", "TV show", false);
        
        Anime dbz = new Anime();


        System.out.println(reZero);
        System.out.println(dbz);
        
        reZero.addScore(9);
        reZero.addScore(10);
        System.out.println(dbz.equals(reZero));
        System.out.println(reZero.equals(reZero));
        
        System.out.println(reZero.calculateScore());
    }
}