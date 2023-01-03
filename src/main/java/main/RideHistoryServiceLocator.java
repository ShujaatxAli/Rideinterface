/**
 * RideHistoryServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class RideHistoryServiceLocator extends org.apache.axis.client.Service implements main.RideHistoryService {

    public RideHistoryServiceLocator() {
    }


    public RideHistoryServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RideHistoryServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RideHistory
    private java.lang.String RideHistory_address = "http://localhost:8080/RideBooking/services/RideHistory";

    public java.lang.String getRideHistoryAddress() {
        return RideHistory_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RideHistoryWSDDServiceName = "RideHistory";

    public java.lang.String getRideHistoryWSDDServiceName() {
        return RideHistoryWSDDServiceName;
    }

    public void setRideHistoryWSDDServiceName(java.lang.String name) {
        RideHistoryWSDDServiceName = name;
    }

    public main.RideHistory getRideHistory() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RideHistory_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRideHistory(endpoint);
    }

    public main.RideHistory getRideHistory(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.RideHistorySoapBindingStub _stub = new main.RideHistorySoapBindingStub(portAddress, this);
            _stub.setPortName(getRideHistoryWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRideHistoryEndpointAddress(java.lang.String address) {
        RideHistory_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.RideHistory.class.isAssignableFrom(serviceEndpointInterface)) {
                main.RideHistorySoapBindingStub _stub = new main.RideHistorySoapBindingStub(new java.net.URL(RideHistory_address), this);
                _stub.setPortName(getRideHistoryWSDDServiceName());
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
        if ("RideHistory".equals(inputPortName)) {
            return getRideHistory();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "RideHistoryService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "RideHistory"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RideHistory".equals(portName)) {
            setRideHistoryEndpointAddress(address);
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
