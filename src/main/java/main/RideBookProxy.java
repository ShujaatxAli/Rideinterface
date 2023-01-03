package main;

public class RideBookProxy implements main.RideBook {
  private String _endpoint = null;
  private main.RideBook rideBook = null;
  
  public RideBookProxy() {
    _initRideBookProxy();
  }
  
  public RideBookProxy(String endpoint) {
    _endpoint = endpoint;
    _initRideBookProxy();
  }
  
  private void _initRideBookProxy() {
    try {
      rideBook = (new main.RideBookServiceLocator()).getRideBook();
      if (rideBook != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)rideBook)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)rideBook)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (rideBook != null)
      ((javax.xml.rpc.Stub)rideBook)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.RideBook getRideBook() {
    if (rideBook == null)
      _initRideBookProxy();
    return rideBook;
  }
  
  public void bookARide(java.lang.String pick, java.lang.String drop, int ID, java.lang.String fare) throws java.rmi.RemoteException{
    if (rideBook == null)
      _initRideBookProxy();
    rideBook.bookARide(pick, drop, ID, fare);
  }
  
  
}