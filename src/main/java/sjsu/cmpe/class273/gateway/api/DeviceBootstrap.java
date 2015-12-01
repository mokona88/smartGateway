package sjsu.cmpe.class273.gateway.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sjsu.cmpe.class273.gateway.dto.Device;
import sjsu.cmpe.class273.gateway.repo.DeviceRepo;

/**
 * Created by squall on 11/12/15.
 */
@RestController
@RequestMapping("/bootstrap")
public class DeviceBootstrap
{
    @Autowired
    private DeviceRepo dvRepo;

    @RequestMapping(method = RequestMethod.GET)
    private String bootstrapOperation(
            @RequestParam("manufacturer") String manufacturer,
            @RequestParam("model") String model,
            @RequestParam("reboot") String reboot,
            @RequestParam("supportMode") String supportMode,
            @RequestParam("sn") String sn
    )
    {
        Device dv = dvRepo.findBySerialNumber(sn);
        if (dv.getManufacturer().equals(manufacturer) &&
                dv.getModel().equals(model) &&
                dv.getReboot().equals(reboot) &&
                dv.getSupportMode().equals(supportMode)
           )
        {
            return "Device: " + sn + "-" + model;
        }
        return "Device not recognized.";
    }
}
