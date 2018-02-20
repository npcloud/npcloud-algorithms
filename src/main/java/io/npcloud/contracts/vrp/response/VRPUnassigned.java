package io.npcloud.contracts.vrp.response;

import java.util.ArrayList;
import java.util.List;

public class VRPUnassigned {

    private List<String> services;

    private List<String> shipments;

    private List<String> breaks;

    private List<VRPUnassigned> details;

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

    public List<VRPUnassigned> getDetails() {
        return details;
    }

    public void setDetails(List<VRPUnassigned> details) {
        this.details = details;
    }

    public VRPUnassigned() {
        this.services = new ArrayList<>();
        this.shipments = new ArrayList<>();
        this.breaks = new ArrayList<>();
        this.details = new ArrayList<>();
    }
}
