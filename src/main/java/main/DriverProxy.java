package main;

public class DriverProxy implements main.Driver {
  private String _endpoint = null;
  private main.Driver driver = null;
  
  public DriverProxy() {
    _initDriverProxy();
  }
  
  public DriverProxy(String endpoint) {
    _endpoint = endpoint;
    _initDriverProxy();
  }
  
  private void _initDriverProxy() {
    try {
      driver = (new main.DriverServiceLocator()).getDriver();
      if (driver != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)driver)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)driver)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (driver != null)
      ((javax.xml.rpc.Stub)driver)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Driver getDriver() {
    if (driver == null)
      _initDriverProxy();
    return driver;
  }
  
  public java.lang.Object[] getDriverInfo() throws java.rmi.RemoteException{
    if (driver == null)
      _initDriverProxy();
    return driver.getDriverInfo();
  }
  
  
}