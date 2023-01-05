/**
 * CustIDServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class CustIDServiceLocator extends org.apache.axis.client.Service implements main.CustIDService {

    public CustIDServiceLocator() {
    }


    public CustIDServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustIDServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustID
    private java.lang.String CustID_address = "http://localhost:8080/RideBooking/services/CustID";

    public java.lang.String getCustIDAddress() {
        return CustID_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustIDWSDDServiceName = "CustID";

    public java.lang.String getCustIDWSDDServiceName() {
        return CustIDWSDDServiceName;
    }

    public void setCustIDWSDDServiceName(java.lang.String name) {
        CustIDWSDDServiceName = name;
    }

    public main.CustID getCustID() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustID_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustID(endpoint);
    }

    public main.CustID getCustID(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.CustIDSoapBindingStub _stub = new main.CustIDSoapBindingStub(portAddress, this);
            _stub.setPortName(getCustIDWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustIDEndpointAddress(java.lang.String address) {
        CustID_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.CustID.class.isAssignableFrom(serviceEndpointInterface)) {
                main.CustIDSoapBindingStub _stub = new main.CustIDSoapBindingStub(new java.net.URL(CustID_address), this);
                _stub.setPortName(getCustIDWSDDServiceName());
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
        if ("CustID".equals(inputPortName)) {
            return getCustID();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "CustIDService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "CustID"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustID".equals(portName)) {
            setCustIDEndpointAddress(address);
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
