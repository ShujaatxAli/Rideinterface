package main;

public class CustIDProxy implements main.CustID {
  private String _endpoint = null;
  private main.CustID custID = null;
  
  public CustIDProxy() {
    _initCustIDProxy();
  }
  
  public CustIDProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustIDProxy();
  }
  
  private void _initCustIDProxy() {
    try {
      custID = (new main.CustIDServiceLocator()).getCustID();
      if (custID != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)custID)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)custID)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (custID != null)
      ((javax.xml.rpc.Stub)custID)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.CustID getCustID() {
    if (custID == null)
      _initCustIDProxy();
    return custID;
  }
  
  public int getCustomerID(java.lang.String email) throws java.rmi.RemoteException{
    if (custID == null)
      _initCustIDProxy();
    return custID.getCustomerID(email);
  }
  
  
}