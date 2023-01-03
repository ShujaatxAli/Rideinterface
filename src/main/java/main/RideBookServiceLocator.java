/**
 * RideBookServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class RideBookServiceLocator extends org.apache.axis.client.Service implements main.RideBookService {

    public RideBookServiceLocator() {
    }


    public RideBookServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RideBookServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RideBook
    private java.lang.String RideBook_address = "http://localhost:8080/RideBooking/services/RideBook";

    public java.lang.String getRideBookAddress() {
        return RideBook_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RideBookWSDDServiceName = "RideBook";

    public java.lang.String getRideBookWSDDServiceName() {
        return RideBookWSDDServiceName;
    }

    public void setRideBookWSDDServiceName(java.lang.String name) {
        RideBookWSDDServiceName = name;
    }

    public main.RideBook getRideBook() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RideBook_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRideBook(endpoint);
    }

    public main.RideBook getRideBook(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.RideBookSoapBindingStub _stub = new main.RideBookSoapBindingStub(portAddress, this);
            _stub.setPortName(getRideBookWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRideBookEndpointAddress(java.lang.String address) {
        RideBook_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.RideBook.class.isAssignableFrom(serviceEndpointInterface)) {
                main.RideBookSoapBindingStub _stub = new main.RideBookSoapBindingStub(new java.net.URL(RideBook_address), this);
                _stub.setPortName(getRideBookWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RideBook".equals(inputPortName)) {
            return getRideBook();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "RideBookService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "RideBook"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RideBook".equals(portName)) {
            setRideBookEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
