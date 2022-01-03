package org.dzone.logic;

import org.dzone.extension.MockTimeExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockTimeExtension.class)
class BusinessLogicClassTest {
    private BusinessLogicClass businessLogicClass = new BusinessLogicClass();

    @Test
    void getLastUpdatedTime_returnMockTime() {
        //WHEN
        String lastUpdatedTime = businessLogicClass.getLastUpdatedTime();

        //THEN
        assertEquals("Last Updated At 2020-04-01T12:45",lastUpdatedTime);
    }
}