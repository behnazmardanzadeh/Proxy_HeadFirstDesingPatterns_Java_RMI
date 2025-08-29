package com.algocoding;

import java.rmi.Remote;

import java.rmi.RemoteException;

/**
 * extends Remote -->
 * This tells us that
 * the interface is going to be used
 * to support remote calls.
 */
public interface MyRemote extends Remote {
    /**
     * Every remote method call is considered "risky".
     * Declaring RemoteException on every method forces
     * the client to pay attention and acknowledge that
     * things might not work.
     * <p>
     * Be sure arguments and return values are primitives or Serializable
     * String --> this return value is gonna be shipped over wire from
     * the server back to the client, so it must be Serializable.
     * That's how args and return values get packaged up and sent.
    * */
    String sayHello() throws RemoteException;
}
