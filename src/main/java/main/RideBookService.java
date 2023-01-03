/**
 * RideBookService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface RideBookService extends javax.xml.rpc.Service {
    public java.lang.String getRideBookAddress();

    public main.RideBook getRideBook() throws javax.xml.rpc.ServiceException;

    public main.RideBook getRideBook(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
