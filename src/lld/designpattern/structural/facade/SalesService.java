package lld.designpattern.structural.facade;

// Subsystem service — handles one part of checkout
public class SalesService {
    public void saveAndClose(String transId) {
        System.out.println("Sales saved and closed for transID : " + transId);
    }
}
