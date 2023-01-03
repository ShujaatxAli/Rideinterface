package main;

public class LoginDetailsProxy implements main.LoginDetails {
  private String _endpoint = null;
  private main.LoginDetails loginDetails = null;
  
  public LoginDetailsProxy() {
    _initLoginDetailsProxy();
  }
  
  public LoginDetailsProxy(String endpoint) {
    _endpoint = endpoint;
    _initLoginDetailsProxy();
  }
  
  private void _initLoginDetailsProxy() {
    try {
      loginDetails = (new main.LoginDetailsServiceLocator()).getLoginDetails();
      if (loginDetails != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)loginDetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)loginDetails)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (loginDetails != null)
      ((javax.xml.rpc.Stub)loginDetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.LoginDetails getLoginDetails() {
    if (loginDetails == null)
      _initLoginDetailsProxy();
    return loginDetails;
  }
  
  public int getLoginInfo(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException{
    if (loginDetails == null)
      _initLoginDetailsProxy();
    return loginDetails.getLoginInfo(email, pass);
  }
  
  
}