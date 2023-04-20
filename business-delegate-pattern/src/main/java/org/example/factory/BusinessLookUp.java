package org.example.factory;

import org.example.business.BusinessService;
import org.example.business.EJBService;
import org.example.business.JMSService;

public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
