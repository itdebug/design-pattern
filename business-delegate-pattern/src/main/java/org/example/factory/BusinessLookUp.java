package org.example.factory;

import org.example.businessdelegate.BusinessService;
import org.example.businessdelegate.EJBService;
import org.example.businessdelegate.JMSService;

public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
