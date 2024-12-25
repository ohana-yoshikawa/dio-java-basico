public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        smartTv.desligar();

        smartTv.aumentarCanal();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);


    }


}
