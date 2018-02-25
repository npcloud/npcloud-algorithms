package io.npcloud.contracts.vrp.request;

import io.npcloud.contracts.vrp.IVerify;

import java.util.List;

/**
 * shipment involved two locations: pickup location and delivery location
 */
public class VRPShipments implements IVerify {
    /**
     * shipment id
     */
    private String id;

    /**
     * shipment name
     */
    private String name;

    /**
     * pickup info
     */
    private VRPPickup pickup;

    /**
     * delivery info
     */
    private VRPDelivery delivery;

    /**
     *For example, if the item that needs to be delivered has two size dimension, volume and weight,
     * it as follow [ 20, 5 ] assuming a volume of 20 and a weight of 5.
     * */
    private List<Integer> size;

    /**
     * skill required for this service
     */
    private List<String> requiredSkills;

    /**
     * Specified valid vehicle id for this service.
     * Empty list means all vehicles are available for this service.
     * If both requiredVehicles and disallowedVehicles are not empty,
     * then requiredVehicles are effective.
     */
    private List<String> requiredVehicles;

    /**
     * If requiredVehicles is empty, then disallowedVehicles is used to exclude
     * the usage of certain vehicles. Empty list means no vehicles is excluded.
     */
    private List<String> disallowedVehicles;

    /**
     * Specifies the priority. Can be 1 = high priority to 10 = low priority.
     * Often there are more services/shipments than the available vehicle fleet can handle.
     * Then you could assign priorities to differentiate high priority tasks from those that
     * can be served later or omitted at all.
     */
    private Integer priority = 1;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VRPPickup getPickup() {
        return pickup;
    }

    public void setPickup(VRPPickup pickup) {
        this.pickup = pickup;
    }

    public VRPDelivery getDelivery() {
        return delivery;
    }

    public void setDelivery(VRPDelivery delivery) {
        this.delivery = delivery;
    }

    public List<Integer> getSize() {
        return size;
    }

    public void setSize(List<Integer> size) {
        this.size = size;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public List<String> getRequiredVehicles() {
        return requiredVehicles;
    }

    public void setRequiredVehicles(List<String> requiredVehicles) {
        this.requiredVehicles = requiredVehicles;
    }

    public List<String> getDisallowedVehicles() {
        return disallowedVehicles;
    }

    public void setDisallowedVehicles(List<String> disallowedVehicles) {
        this.disallowedVehicles = disallowedVehicles;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public List<String> verify(String prefix) {
        return null;
    }
}
