public class HeadsetAdapter implements AndroidHeadset{
    IphoneHeadset ihs= new IphoneHeadset();

    @Override
    public void giveSound(String str) {
        ihs.giveQualitySound(str);
    }
}
