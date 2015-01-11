/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author TOAN
 */
public class RMI_Server {
    public static void main(String[] args) throws Exception{
        Remote_Object ro = new Remote_Object();
        Registry reg = LocateRegistry.createRegistry(10000);
        Naming.rebind("rmi://localhost:10000/Jindo", ro);
        System.out.println("Server is runing...");
    }
}
