public class unit9Project {
    public static void main(String[] args){
        Anime Re_Zero = new Anime("Re:Zero", "TV show", false);
        Anime oregairu = new Anime("My Teen Romantic Comedy SNAFU", "TV show", false);
        System.out.println(Re_Zero);
        System.out.println(oregairu);
        System.out.println(Anime.getAnimeCount());
    }
}
