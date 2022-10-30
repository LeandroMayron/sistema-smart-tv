public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.mudarCanal(13);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Tv Ligada ? " + smartTv.ligado);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status da tv ?: " + smartTv.ligado);

        smartTv.desligar();
        System.out.println("Novo estatus da tv ?:" + smartTv.ligado);
    }
}
