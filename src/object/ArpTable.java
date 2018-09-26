package object;

/**
 * @Author: 束手就擒
 * @Date: 18-9-19 下午2:51
 * @Description:
 */
public class ArpTable {
    private String ipAddress;

    private String hwType;

    private String flags;

    private String hwAddress;

    private String mask;

    private String device;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getHwType() {
        return hwType;
    }

    public void setHwType(String hwType) {
        this.hwType = hwType;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getHwAddress() {
        return hwAddress;
    }

    public void setHwAddress(String hwAddress) {
        this.hwAddress = hwAddress;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "ArpTable{" +
                "ipAddress='" + ipAddress + '\'' +
                ", hwType='" + hwType + '\'' +
                ", flags='" + flags + '\'' +
                ", hwAddress='" + hwAddress + '\'' +
                ", mask='" + mask + '\'' +
                ", device='" + device + '\'' +
                '}';
    }
}
