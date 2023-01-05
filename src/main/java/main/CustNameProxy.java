package main;

public class CustNameProxy implements main.CustName {
  private String _endpoint = null;
  private main.CustName custName = null;
  
  public CustNameProxy() {
    _initCustNameProxy();
  }
  
  public CustNameProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustNameProxy();
  }
  
  private void _initCustNameProxy() {
    try {
      custName = (new main.CustNameServiceLocator()).getCustName();
      if (custName != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)custName)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)custName)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (custName != null)
      ((javax.xml.rpc.Stub)custName)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.CustName getCustName() {
    if (custName == null)
      _initCustNameProxy();
    return custName;
  }
  
  public java.lang.String getCustomerFullName(java.lang.String email) throws java.rmi.RemoteException{
    if (custName == null)
      _initCustNameProxy();
    return custName.getCustomerFullName(email);
  }
  
  
}