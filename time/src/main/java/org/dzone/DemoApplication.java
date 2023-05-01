package org.dzone;

import org.dzone.logic.BusinessLogicClass;

public class DemoApplication {
    public static void main(String[] args) {
        BusinessLogicClass bussinesLogic =  new BusinessLogicClass();
        String currentTime = bussinesLogic.getLastUpdatedTime();
        System.out.println(currentTime);
    }
}
