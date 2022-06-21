package partice;

public class Main {
    public static void main(String[] args) {
        PhonePay p = new PhonePay(890909090, 48000, 3000);
        p.setAccountName("Abi");
        //System.out.println(p.getBalance());

        Facebook facebook = new Facebook("abhi", "abhi1234", "button");
        facebook.setRestPassword("Ram1234");

        PrimeVideo primeVideo = new PrimeVideo("allMovies","NewRelease","AllTypeofVideos","searchformovies");
        primeVideo.setMyStuff("Downloads");
    }
}
