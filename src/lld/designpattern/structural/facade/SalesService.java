package lld.designpattern.structural.facade;

public class SalesService {
    public void saveAndClose(String transId) {
        System.out.println("Sales saved and closed for transID : " + transId);
    }
}
