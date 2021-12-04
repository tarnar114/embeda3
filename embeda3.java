import java.util.*;
public class embeda3{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String scale="none";
        String config="none";
        String in="none";
        do{
            System.out.println("is sytem going to be small, medium or large scaled?(enter small=small scaled,medium=medium scaled, large=large scaled");
            scale=scan.next();
        }while(!scale.equals("small")&&!scale.equals("medium")&&!scale.equals("large"));
        if (scale.equals("small")){
            do {
                System.out.println("is system going to be inside of a mobile/portable device");
                System.out.println("y=yes,n=no (cant enter anything else)");
                in=scan.next();
            } while (!in.equals("n")&&!in.equals("y"));
            if (in.equals("y")){
                config="mobile";
                System.out.println("you need a "+config+" system that is "+scale+" scaled");
                scan.close();
                return;
            }

        }
        System.out.println("---------------------------------------------------------");
        do {
            System.out.println("is your system going to need to be connected to the network and comm with web servers");
            System.out.println("y=yes,n=no (cant enter anything else)");
            in=scan.next();
            
        } while (!in.equals("n")&&!in.equals("y"));
        if (in.equals("y")){
            config="network based";
            System.out.println("you need a "+config+" system that is "+scale+" scaled");
            scan.close();
            return;
        }
        System.out.println("---------------------------------------------------------");
        do {
            System.out.println("is your system going to need a host system");
            System.out.println("y=yes,n=no (cant enter anything else)");
            in=scan.next();
            
        } while (!in.equals("n")&&!in.equals("y"));
        if (in.equals("n")){
            config="stand alone";
            System.out.println("you need a "+config+" system that is "+scale+" scaled");
            scan.close();
            return;
        }
        System.out.println("---------------------------------------------------------");
        do {
            System.out.println("does your system prioritize task completion");
            System.out.println("y=yes,n=no (cant enter anything else)");
            in=scan.next();
            
        } while (!in.equals("n")&&!in.equals("y"));
        if (in.equals("y")){
            config="Soft Real Time";
            System.out.println("you need a "+config+" system that is "+scale+" scaled");
            scan.close();
            return;
        }
        System.out.println("---------------------------------------------------------");
        do {
            System.out.println("does your system have strict deadlines");
            System.out.println("y=yes,n=no (cant enter anything else)");
            in=scan.next();
            
        } while (!in.equals("n")&&!in.equals("y"));
        if (in.equals("y")){
            config="Hard Real Time";
            System.out.println("you need a "+config+" system that is "+scale+" scaled");
            scan.close();
            return;
        }
        System.out.println("you dont want anything bye");
        scan.close();
        return;
    }
}
