public class class108_02 { // flagの使い方
    public static void main(String[] args){

        byte Read = 1;
        byte write = 0b00000010;
        byte execute = 4;
        byte delete = 0b00001000;

        byte permissinons = (byte) (Read | write);

        boolean canRead = (permissinons & Read) != 0;
        System.out.println(canRead);

        boolean canExecute = (permissinons & execute) != 0;
        System.out.println(canExecute);

    }
}
