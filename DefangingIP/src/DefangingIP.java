public class DefangingIP {
    public static void main(String[] args){
        String ip = "123.444.233";
        defanger(ip);
    }

    public static void defanger(String ip){
        String result = ip.replace(".","[.]");
        System.out.println(result);
    }
}
