public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smart = new SmartTv();

        System.out.println("TV ligada? " + smart.ligada);
        System.out.println("Canal atual? " + smart.canal);
        System.out.println("Volume atual? " + smart.volume);

        smart.ligar();
        System.out.println("TV ligada? " + smart.ligada);

        smart.desligar();
        System.out.println("TV ligada? " + smart.ligada);

        smart.diminuirVolume(); // 22
        smart.diminuirVolume(); // 21
        smart.diminuirVolume(); // 20
        System.out.println("Volume atual? " + smart.volume);

        smart.mudarCanal(13);
        System.out.println("Canal atual? " + smart.canal);

        smart.diminuirCanal();
        smart.diminuirCanal();
        smart.diminuirCanal();
        System.out.println("Canal atual? " + smart.canal);

    }
}
