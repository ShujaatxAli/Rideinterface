/**
 * BookingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class BookingServiceLocator extends org.apache.axis.client.Service implements main.BookingService {

    public BookingServiceLocator() {
    }


    public BookingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Booking
    private java.lang.String Booking_address = "http://localhost:8080/RideBooking/services/Booking";

    public java.lang.String getBookingAddress() {
        return Booking_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BookingWSDDServiceName = "Booking";

    public java.lang.String getBookingWSDDServiceName() {
        return BookingWSDDServiceName;
    }

    public void setBookingWSDDServiceName(java.lang.String name) {
        BookingWSDDServiceName = name;
    }

    public main.Booking getBooking() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Booking_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBooking(endpoint);
    }

    public main.Booking getBooking(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.BookingSoapBindingStub _stub = new main.BookingSoapBindingStub(portAddress, this);
            _stub.setPortName(getBookingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBookingEndpointAddress(java.lang.String address) {
        Booking_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Booking.class.isAssignableFrom(serviceEndpointInterface)) {
                main.BookingSoapBindingStub _stub = new main.BookingSoapBindingStub(new java.net.URL(Booking_address), this);
                _stub.setPortName(getBookingWSDDServiceName());
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
        if ("Booking".equals(inputPortName)) {
            return getBooking();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "BookingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Booking"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Booking".equals(portName)) {
            setBookingEndpointAddress(address);
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
