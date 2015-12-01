package sjsu.cmpe.class273.gateway.repo;

import org.springframework.data.repository.CrudRepository;
import sjsu.cmpe.class273.gateway.dto.Device;

import java.math.BigInteger;

/**
 * Created by squall on 11/12/15.
 */
public interface DeviceRepo extends CrudRepository<BigInteger, String>
{
    Device findBySerialNumber(String sn);
}
