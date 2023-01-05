package main;

public class RideHistoryProxy implements main.RideHistory {
  private String _endpoint = null;
  private main.RideHistory rideHistory = null;
  
  public RideHistoryProxy() {
    _initRideHistoryProxy();
  }
  
  public RideHistoryProxy(String endpoint) {
    _endpoint = endpoint;
    _initRideHistoryProxy();
  }
  
  private void _initRideHistoryProxy() {
    try {
      rideHistory = (new main.RideHistoryServiceLocator()).getRideHistory();
      if (rideHistory != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)rideHistory)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)rideHistory)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (rideHistory != null)
      ((javax.xml.rpc.Stub)rideHistory)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.RideHistory getRideHistory() {
    if (rideHistory == null)
      _initRideHistoryProxy();
    return rideHistory;
  }
  
  public java.lang.Object[] getRideHistory(int ID) throws java.rmi.RemoteException{
    if (rideHistory == null)
      _initRideHistoryProxy();
    return rideHistory.getRideHistory(ID);
  }
  
  
}