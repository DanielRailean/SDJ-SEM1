package test;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("192.168.43.12", 2910);

        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        Scanner keyboard = new Scanner(System.in);

        while (true){
            System.out.println("Enter the first term:");
            double f = keyboard.nextDouble();
            keyboard.nextLine();
            outputStream.writeObject(f);

            System.out.println("Enter the operation ("+")");
            String op = keyboard.nextLine();
            outputStream.writeObject(op);

            System.out.println("Enter the second term:");
            double s = keyboard.nextDouble();
            keyboard.nextLine();
            outputStream.writeObject(s);

            double response = (double)inputStream.readObject();

            System.out.println("RESULT: "+response);

        }


    }
}
