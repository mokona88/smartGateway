package sjsu.cmpe.class273.gateway.api;

import org.springframework.web.bind.annotation.*;

/**
 * Created by squall on 11/12/15.
 */
@RestController
@RequestMapping("/api/v1")
public class DeviceManagementController
{
    @RequestMapping(value = "/{ObjectID}/{ObjectInstID}/{RestID}", method = RequestMethod.PUT)
    private void writeAttribute(
            @PathVariable("ObjectID") String objId,
            @PathVariable("ObjectInstID") String objInstId,
            @PathVariable("ResID") String resId,
            @RequestParam(value = "pmin", required = false) unsigned int pmin,
            @RequestParam(value = "pmax", required = false) unsigned int pmax,
            @RequestParam(value = "gt", required = false) unsigned int maxVal,
            @RequestParam(value = "lt", required = false) unsigned int lessThan,
            @RequestParam(value = "st", require = false) int steps,
            @RequestParam(value = "", required = true) boolean cancel

    )
    {
    }
}
