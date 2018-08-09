package com.cars.consumer.bo;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "core")
public class Core {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID core_id;

    private UUID pcid;
    private boolean disabled_flag;
    private String disabled_utc;
    private String reenable_utc;
    private String status_reason;

    protected Core(){

    }

    public Core(UUID pcid, boolean disabled_flag, String disabled_utc, String reenable_utc,String status_reason) {
        this.pcid = pcid;
        this.disabled_flag = disabled_flag;
        this.disabled_utc = disabled_utc;
        this.reenable_utc = reenable_utc;
        this.status_reason =  status_reason;
    }

    public UUID getCore_id() {
        return core_id;
    }

    public void setCore_id(UUID core_id) {
        this.core_id = core_id;
    }

    public UUID getPcid() {
        return pcid;
    }

    public void setPcid(UUID pcid) {
        this.pcid = pcid;
    }

    public boolean isDisabled_flag() {
        return disabled_flag;
    }

    public void setDisabled_flag(boolean disabled_flag) {
        this.disabled_flag = disabled_flag;
    }

    public String getDisabled_utc() {
        return disabled_utc;
    }

    public void setDisabled_utc(String disabled_utc) {
        this.disabled_utc = disabled_utc;
    }

    public String getReenable_utc() {
        return reenable_utc;
    }

    public void setReenable_utc(String reenable_utc) {
        this.reenable_utc = reenable_utc;
    }

    public String getStatus_reason() {
        return status_reason;
    }

    public void setStatus_reason(String status_reason) {
        this.status_reason = status_reason;
    }

    @Override
    public String toString() {
        return "Core{" +
                "core_id=" + core_id +
                ", pcid=" + pcid +
                ", disabled_flag=" + disabled_flag +
                ", disabled_utc='" + disabled_utc + '\'' +
                ", reenable_utc='" + reenable_utc + '\'' +
                ", status_reason='" + status_reason + '\'' +
                '}';
    }


}
