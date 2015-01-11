/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;

/**
 *
 * @author TOAN
 */
public interface Remote_Interface extends Remote{
    public String sayHello() throws Exception;
}
