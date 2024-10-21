public class Runner {
    public static void main(String[] args) {
        AndroidHeadset hs = new HeadsetAdapter();
        ListenMusic lm = new ListenMusic(hs);
        lm.listenSong("listening");

    }
}
