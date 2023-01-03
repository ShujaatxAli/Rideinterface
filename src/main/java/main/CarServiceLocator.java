/**
 * CarServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class CarServiceLocator extends org.apache.axis.client.Service implements main.CarService {

    public CarServiceLocator() {
    }


    public CarServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CarServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Car
    private java.lang.String Car_address = "http://localhost:8080/RideBooking/services/Car";

    public java.lang.String getCarAddress() {
        return Car_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CarWSDDServiceName = "Car";

    public java.lang.String getCarWSDDServiceName() {
        return CarWSDDServiceName;
    }

    public void setCarWSDDServiceName(java.lang.String name) {
        CarWSDDServiceName = name;
    }

    public main.Car getCar() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Car_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCar(endpoint);
    }

    public main.Car getCar(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.CarSoapBindingStub _stub = new main.CarSoapBindingStub(portAddress, this);
            _stub.setPortName(getCarWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCarEndpointAddress(java.lang.String address) {
        Car_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Car.class.isAssignableFrom(serviceEndpointInterface)) {
                main.CarSoapBindingStub _stub = new main.CarSoapBindingStub(new java.net.URL(Car_address), this);
                _stub.setPortName(getCarWSDDServiceName());
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
        if ("Car".equals(inputPortName)) {
            return getCar();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "CarService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Car"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Car".equals(portName)) {
            setCarEndpointAddress(address);
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
