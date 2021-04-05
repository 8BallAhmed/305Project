package cpit305project;

import java.io.*;
import java.net.*;

public class ClientSide {

    private Appointee appointee;

    public ClientSide() {
    }

    public ClientSide(Appointee p) {
        appointee = p;
    }

    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 8900);
            OutputStream os = client.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            ClientSide c = new ClientSide();
            oos.writeObject(c.appointee);
        } catch (UnknownHostException e) {

        } catch (IOException ee) {

        }
    }

    @Override
    public String toString() {
        return "Name: " + appointee.getName() + "\tAge: " + appointee.getAge()
                + "\tDiabetes: " + appointee.isDiabetic() + "\tObesity: " + appointee.isObese();
    }

}
