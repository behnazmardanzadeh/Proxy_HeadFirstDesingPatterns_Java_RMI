package com.algocoding;

import java.rmi.Naming;

/**
 *
 * <p>
 *      Now that you’ve got a remote service,
 *      you have to make it available to remote clients.
 *      You do this by instantiating it and putting it into the RMI registry (which
 *      must be running or this line of code fails).
 *      When you register the implementation object,
 *      the RMI system actually puts the stub in the registry,
 *      since that’s what the client really needs.
 *      Register your service using
 *      the static rebind() method of the java.rmi.Naming class.
 * </p>
 *
 * "RemoteHello" --> Give your service a name
 * (that that clients can use to look it up in the registry)
 * and register it with RMI registry.
 * When you bind the service object,
 * RMI swaps the service for the stub
 * and puts the stub in the registry.
 */

public class Main {
    public static void main(String[] args) {
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

