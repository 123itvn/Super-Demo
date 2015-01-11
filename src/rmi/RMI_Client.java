/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Naming;

/**
 *
 * @author TOAN
 */
public class RMI_Client {
    public static void main(String[] args) throws Exception{
        String rmi_URL = "rmi://localhost:10000/Jindo";
        Object obj = Naming.lookup(rmi_URL);
        if (obj instanceof Remote_Interface) {
            Remote_Interface ri = (Remote_Interface) Naming.lookup(rmi_URL);
            String str = ri.sayHello();
            System.out.println("Reponse: " + str);
        }
    }
}
