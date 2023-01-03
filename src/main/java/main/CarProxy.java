package main;

public class CarProxy implements main.Car {
  private String _endpoint = null;
  private main.Car car = null;
  
  public CarProxy() {
    _initCarProxy();
  }
  
  public CarProxy(String endpoint) {
    _endpoint = endpoint;
    _initCarProxy();
  }
  
  private void _initCarProxy() {
    try {
      car = (new main.CarServiceLocator()).getCar();
      if (car != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)car)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)car)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (car != null)
      ((javax.xml.rpc.Stub)car)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Car getCar() {
    if (car == null)
      _initCarProxy();
    return car;
  }
  
  public java.lang.String[] getCarInfo() throws java.rmi.RemoteException{
    if (car == null)
      _initCarProxy();
    return car.getCarInfo();
  }
  
  
}