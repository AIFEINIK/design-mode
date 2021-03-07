package org.example.service.model;

/**
 * @author Feinik
 * @discription
 * @date 2021/3/6
 * @since 1.0.0
 */
public class Order {

    private String oid;
    private String remark;
    private String address;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
