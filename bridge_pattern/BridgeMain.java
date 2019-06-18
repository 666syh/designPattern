package bridge_pattern;
public class BridgeMain{
    public static void main(String[] args) {
        HandsetBrand ab;
        ab = new HandsetBrandN();
        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab = new HandsetBrandM();
        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();
    }
}