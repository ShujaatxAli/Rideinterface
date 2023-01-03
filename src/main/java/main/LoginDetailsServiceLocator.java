/**
 * LoginDetailsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class LoginDetailsServiceLocator extends org.apache.axis.client.Service implements main.LoginDetailsService {

    public LoginDetailsServiceLocator() {
    }


    public LoginDetailsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginDetailsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LoginDetails
    private java.lang.String LoginDetails_address = "http://localhost:8080/RideBooking/services/LoginDetails";

    public java.lang.String getLoginDetailsAddress() {
        return LoginDetails_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LoginDetailsWSDDServiceName = "LoginDetails";

    public java.lang.String getLoginDetailsWSDDServiceName() {
        return LoginDetailsWSDDServiceName;
    }

    public void setLoginDetailsWSDDServiceName(java.lang.String name) {
        LoginDetailsWSDDServiceName = name;
    }

    public main.LoginDetails getLoginDetails() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoginDetails_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoginDetails(endpoint);
    }

    public main.LoginDetails getLoginDetails(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.LoginDetailsSoapBindingStub _stub = new main.LoginDetailsSoapBindingStub(portAddress, this);
            _stub.setPortName(getLoginDetailsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoginDetailsEndpointAddress(java.lang.String address) {
        LoginDetails_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.LoginDetails.class.isAssignableFrom(serviceEndpointInterface)) {
                main.LoginDetailsSoapBindingStub _stub = new main.LoginDetailsSoapBindingStub(new java.net.URL(LoginDetails_address), this);
                _stub.setPortName(getLoginDetailsWSDDServiceName());
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
        if ("LoginDetails".equals(inputPortName)) {
            return getLoginDetails();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "LoginDetailsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "LoginDetails"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LoginDetails".equals(portName)) {
            setLoginDetailsEndpointAddress(address);
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
