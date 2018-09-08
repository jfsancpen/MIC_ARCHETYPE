package ${groupId}.services.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import es.um.services.IServiceTest;

@Service
public class ServiceTestImpl implements IServiceTest {
    
    private Logger LOGGER = Logger.getLogger(ServiceTestImpl.class);

    @Override
    public String test(String id) {
        return "Test";
    }
}