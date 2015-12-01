package sjsu.cmpe.class273.gateway.repo;

import org.springframework.data.repository.CrudRepository;
import sjsu.cmpe.class273.gateway.dto.Device;

/**
 * Created by squall on 11/12/15.
 */
public interface DeviceRepo extends CrudRepository<Device, String>
{
    Device findBySerialNumber(String sn);
}
