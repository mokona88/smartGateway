package sjsu.cmpe.class273.gateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjsu.cmpe.class273.gateway.dto.Device;
import sjsu.cmpe.class273.gateway.repo.DeviceRepo;

import javax.annotation.PostConstruct;

/**
 * Created by squall on 11/30/15.
 */
@Service
public class DBLoader
{
    private final DeviceRepo dvRepo;

    @Autowired
    public DBLoader(DeviceRepo pBsRepo)
    {
        super();
        dvRepo = pBsRepo;
    }

    @PostConstruct
    private void initDatabase()
    {
        dvRepo.deleteAll();

        Device dv = new Device();
        dv.setManufacturer("a");
        dv.setModel("1.0");
        dv.setReboot("1.0");
        dv.setSupportMode("read");
        dv.setSerialNumber("12345");

        dvRepo.save(dv);
    }

}
