package sjsu.cmpe.class273.gateway.dto;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

/**
 * Created by squall on 11/12/15.
 */
@Document
public class Device
{
    @Id
    private String _id;
    private String manufacturer;
    private String model;
    private String reboot;
    private String supportMode;
    private String serialNumber;

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getReboot()
    {
        return reboot;
    }

    public void setReboot(String reboot)
    {
        this.reboot = reboot;
    }

    public String getSupportMode()
    {
        return supportMode;
    }

    public void setSupportMode(String supportMode)
    {
        this.supportMode = supportMode;
    }

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }
}
