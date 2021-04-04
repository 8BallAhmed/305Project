/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit305project;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 * @author Ahmed
 */
public class ServerThread extends Thread {

    private Appointee appointee;
    ObjectInputStream ois;
    Socket s;

    public ServerThread(Socket s) throws IOException, ClassNotFoundException {
        this.s = s;
        ois = new ObjectInputStream(s.getInputStream());
        readAppointee();
    }
    
    
    public void readAppointee() throws IOException, ClassNotFoundException{
        Object o;
        Appointee appointee;
        while(true){
            try{
                o = ois.readObject();
                if(o instanceof Appointee){
                    appointee = (Appointee)o;
                }
                break;
            }catch(IOException e){
                
            }catch(ClassNotFoundException e){
                
            }
        }
    }

    @Override
    public void run() {

    }

}
