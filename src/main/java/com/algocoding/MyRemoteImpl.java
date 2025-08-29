package com.algocoding;

import java.io.Serial;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 * <p>
 *     A remote object is just an object whose methods
 *     can be called from another JVM (possibly on another machine).
 * </p>
 *
 * <p>
 *     Remote objects need extra runtime behavior —
 *     like listening for remote calls, marshalling arguments,
 *     and sending back results.
 *     <p>
 *         UnicastRemoteObject (in java.rmi.server) is a helper class
 *         that already implements the “plumbing” for a simple RMI object.
 *     </p>
 * </p>
 *
 * <p>
 *     When you make a remote service with Java RMI(Remote Method Invocation),
 *     your class needs special behavior so it can be called from another JVM.
 * </p>
 *
 * <p>
 *    The simplest way is to extend UnicastRemoteObject,
 *    which already has that behavior built in.
 * </p>
 *
 * <p>
 *     Because UnicastRemoteObject is Serializable,
 *     your class inherits that capability.
 * </p>
 *
 * <p>
 *     It’s a good idea to also define a serialVersionUID constant
 *     to maintain serialization compatibility.
 * </p>
 *
 */

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    /**
     * <p>
     *     It’s a good idea to also define a serialVersionUID constant
     *     to maintain serialization compatibility.
     * </p>
     */
    @Serial
    private static final long serialVersionUID = 1L;


    /**
     * We need this no-arg constructor to handle
     * the RemoteException which is thrown by UnicastRemoteObject
     * constructor.
     *
     * <p>
     *     as you know,
     *     when a class is instantiated,
     *     its superclass constructor is always called.
     *     If your superclass constructor throws an exception,
     *     you have no choice but to declare that
     *     your constructor also throws an exception.
     * </p>
    * */

    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }
}
