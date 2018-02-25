package io.npcloud.contracts.vrp.request;

import com.google.common.collect.ImmutableList;
import io.npcloud.contracts.vrp.IVerify;
import io.npcloud.contracts.vrp.common.VRPAddress;

import java.util.List;

/**
 * Service involved only one location
 */
public class VRPService implements IVerify{
    /**
     * service id
     */
    private String id;

    /**
     * service work type: pickup, delivery, service
     * service: no items as loaded or unloaded
     * pickup: items are loaded after the service for rest of the travel
     * delivery: existing items are unloaded after service
     */
    private String workType = "pickup";

    /**
     * name of the service
     */
    private String name;

    /**
     * service address
     */
    private VRPAddress address;

    /**
     * how long will the vehicle stay at location
     */
    private Long duration = 0L;

    /**
     *For example, if the item that needs to be delivered has two size dimension, volume and weight,
     * it as follow [ 20, 5 ] assuming a volume of 20 and a weight of 5.
     */
    private List<Integer> size = ImmutableList.of(0);

    /**
     * List of time window.
     * Unix timestamp are used in VRPTimeWindow
     */
    private VRPTimeWindow timeWindow;

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

    /**
     * Specifies the preparation time in seconds. It can be used to model
     * parking lot search time since if you have 3 identical locations in a row,
     *it only falls due once.
     */
    private Long preparationTime = 0L;

    /**
     * Specifies the maximum time in seconds a delivery can stay in the vehicle.
     * It only works with services of "type":"delivery".
     */
    private Long maxTimeInVehicle = 0L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VRPAddress getAddress() {
        return address;
    }

    public void setAddress(VRPAddress address) {
        this.address = address;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public List<Integer> getSize() {
        return size;
    }

    public void setSize(List<Integer> size) {
        this.size = size;
    }

    public VRPTimeWindow getTimeWindow() {
        return timeWindow;
    }

    public void setTimeWindow(VRPTimeWindow timeWindow) {
        this.timeWindow = timeWindow;
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

    public Long getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Long preparationTime) {
        this.preparationTime = preparationTime;
    }

    public Long getMaxTimeInVehicle() {
        return maxTimeInVehicle;
    }

    public void setMaxTimeInVehicle(Long maxTimeInVehicle) {
        this.maxTimeInVehicle = maxTimeInVehicle;
    }

    @Override
    public List<String> verify(String prefix) {
        return null;
    }
}
