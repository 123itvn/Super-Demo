/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author TOAN
 */
public class Remote_Object extends UnicastRemoteObject implements Remote_Interface {

    public Remote_Object() throws Exception {
        super();
    }

    @Override
    public String sayHello() throws Exception {
        return "Hello RMI Application";
    }

}
