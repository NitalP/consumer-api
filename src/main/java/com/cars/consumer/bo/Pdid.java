package com.cars.consumer.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "pdid")
public class Pdid implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;

    private String application_create_utc;
    private String application_create_name;
    private String application_update_utc;
    private String application_update_name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID pdid_id;

    private String pdid;
    private UUID pcid;
    private String physical_device_id;
    private String software_agent;
    private String email_address;
    private int access_count;

    protected Pdid(){
    }

    public Pdid(String application_create_utc, String application_create_name, String application_update_utc, String application_update_name, String pdid, UUID pcid, String physical_device_id, String software_agent, String email_address, int access_count) {
        this.application_create_utc = application_create_utc;
        this.application_create_name = application_create_name;
        this.application_update_utc = application_update_utc;
        this.application_update_name = application_update_name;
        this.pdid = pdid;
        this.pcid = pcid;
        this.physical_device_id = physical_device_id;
        this.software_agent = software_agent;
        this.email_address = email_address;
        this.access_count = access_count;
    }

    public String getApplication_create_utc() {
        return application_create_utc;
    }

    public void setApplication_create_utc(String application_create_utc) {
        this.application_create_utc = application_create_utc;
    }

    public String getApplication_create_name() {
        return application_create_name;
    }

    public void setApplication_create_name(String application_create_name) {
        this.application_create_name = application_create_name;
    }

    public String getApplication_update_utc() {
        return application_update_utc;
    }

    public void setApplication_update_utc(String application_update_utc) {
        this.application_update_utc = application_update_utc;
    }

    public String getApplication_update_name() {
        return application_update_name;
    }

    public void setApplication_update_name(String application_update_name) {
        this.application_update_name = application_update_name;
    }

    public UUID getPdid_id() {
        return pdid_id;
    }

    public void setPdid_id(UUID pdid_id) {
        this.pdid_id = pdid_id;
    }

    public String getPdid() {
        return pdid;
    }

    public void setPdid(String pdid) {
        this.pdid = pdid;
    }

    public UUID getPcid() {
        return pcid;
    }

    public void setPcid(UUID pcid) {
        this.pcid = pcid;
    }

    public String getPhysical_device_id() {
        return physical_device_id;
    }

    public void setPhysical_device_id(String physical_device_id) {
        this.physical_device_id = physical_device_id;
    }

    public String getSoftware_agent() {
        return software_agent;
    }

    public void setSoftware_agent(String software_agent) {
        this.software_agent = software_agent;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public int getAccess_count() {
        return access_count;
    }

    public void setAccess_count(int access_count) {
        this.access_count = access_count;
    }

    @Override
    public String toString() {
        return "Pdid{" +
                "application_create_utc='" + application_create_utc + '\'' +
                ", application_create_name='" + application_create_name + '\'' +
                ", application_update_utc='" + application_update_utc + '\'' +
                ", application_update_name='" + application_update_name + '\'' +
                ", pdid_id=" + pdid_id +
                ", pdid='" + pdid + '\'' +
                ", pcid=" + pcid +
                ", physical_device_id='" + physical_device_id + '\'' +
                ", software_agent='" + software_agent + '\'' +
                ", email_address='" + email_address + '\'' +
                ", access_count=" + access_count +
                '}';
    }
}
