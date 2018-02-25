package io.npcloud.contracts.vrp.response;

import io.npcloud.contracts.vrp.IVerify;

import java.util.ArrayList;
import java.util.List;

/**
 * unassigned services or shipments
 */
public class VRPUnassigned implements IVerify {

    //list of unsigned service
    private List<String> services;

    //list of unsigned shipments
    private List<String> shipments;

    //list of unsigned breaks to corresponding route
    private List<String> breaks;


    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public List<String> getShipments() {
        return shipments;
    }

    public void setShipments(List<String> shipments) {
        this.shipments = shipments;
    }

    public List<String> getBreaks() {
        return breaks;
    }

    public void setBreaks(List<String> breaks) {
        this.breaks = breaks;
    }

    public VRPUnassigned() {
        this.services = new ArrayList<>();
        this.shipments = new ArrayList<>();
        this.breaks = new ArrayList<>();
    }

    @Override
    public List<String> verify(String prefix) {
        List<String> errors = new ArrayList<>();
        return errors;
    }
}
