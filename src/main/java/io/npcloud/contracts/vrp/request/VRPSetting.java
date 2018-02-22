package io.npcloud.contracts.vrp.request;

import java.util.List;

public class VRPSetting {

    private List<VRPObjective> objective;

    private List<VRPCostMatrix> costMatrices;

    private List<VRPVehicle> vehicles;

    private List<VRPVehicleType> vehicleTypes;

    private List<VRPService> services;

    private List<VRPShipments> shipments;

    private List<VRPRelation> relations;

    public List<VRPObjective> getObjective() {
        return objective;
    }

    public void setObjective(List<VRPObjective> objective) {
        this.objective = objective;
    }

    public List<VRPCostMatrix> getCostMatrices() {
        return costMatrices;
    }

    public void setCostMatrices(List<VRPCostMatrix> costMatrices) {
        this.costMatrices = costMatrices;
    }

    public List<VRPVehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VRPVehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<VRPVehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VRPVehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public List<VRPService> getServices() {
        return services;
    }

    public void setServices(List<VRPService> services) {
        this.services = services;
    }

    public List<VRPShipments> getShipments() {
        return shipments;
    }

    public void setShipments(List<VRPShipments> shipments) {
        this.shipments = shipments;
    }

    public List<VRPRelation> getRelations() {
        return relations;
    }

    public void setRelations(List<VRPRelation> relations) {
        this.relations = relations;
    }
}
