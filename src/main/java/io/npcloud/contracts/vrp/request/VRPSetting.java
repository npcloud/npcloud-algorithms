package io.npcloud.contracts.vrp.request;

import io.npcloud.contracts.vrp.IVerify;

import java.util.ArrayList;
import java.util.List;

/**
 * Vehicle Routing Task input
 */
public class VRPSetting implements IVerify{

    @Override
    public List<String> verify(String prefix) {
        //check individual fields
        List<String> errors = new ArrayList<>();
        notNull(prefix + "objective", objective, errors);
        notNull(prefix + "costMatrices", costMatrices, errors);
        notNull(prefix + "vehicles", vehicles, errors);
        notNull(prefix + "vehicleTypes", vehicleTypes, errors);
        notNull(prefix + "services", services, errors);
        notNull(prefix + "shipments", shipments, errors);
        notNull(prefix + "relations", relations, errors);
        //cross-check: service id match
        //cross-check: vehicle id match
        return null;
    }


    /**
     * specify the objectives of your optimization
     */
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
