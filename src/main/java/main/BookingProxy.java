package main;

public class BookingProxy implements main.Booking {
  private String _endpoint = null;
  private main.Booking booking = null;
  
  public BookingProxy() {
    _initBookingProxy();
  }
  
  public BookingProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookingProxy();
  }
  
  private void _initBookingProxy() {
    try {
      booking = (new main.BookingServiceLocator()).getBooking();
      if (booking != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)booking)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)booking)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (booking != null)
      ((javax.xml.rpc.Stub)booking)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Booking getBooking() {
    if (booking == null)
      _initBookingProxy();
    return booking;
  }
  
  public java.lang.Object[] getBookingInfo() throws java.rmi.RemoteException{
    if (booking == null)
      _initBookingProxy();
    return booking.getBookingInfo();
  }
  
  
}