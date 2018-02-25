package io.npcloud.contracts.vrp;

import com.google.common.collect.ImmutableMap;
import io.npcloud.contracts.IContract;
import io.npcloud.contracts.vrp.request.VRPSetting;
import io.npcloud.contracts.vrp.response.VRPSolution;

import java.util.List;
import java.util.Map;

/**
 * Vehicle Routing Problem Contract
 */
public class VRPContract implements IContract<VRPSetting, VRPSolution> {

    public String getName() {
        return "VRPSetting";
    }

    public Class getContractClass() {
        return this.getClass();
    }

    @Override
    public Class getSettingClass() {
        return VRPSetting.class;
    }

    @Override
    public Class getSolutionClass() {
        return VRPSolution.class;
    }

    public Map<String, Number> getObjectives(VRPSolution vrpSolution) {
        ImmutableMap.Builder builder =  ImmutableMap.builder().put("distance", vrpSolution.getDistance())
                               .put("numberOfVehicles", vrpSolution.getNumberVehicles())
                                .put("transportTime", vrpSolution.getTransportTime())
                               .put( "completionTime", vrpSolution.getCompletionTime())
                                .put("maxOperationTime", vrpSolution.getMaxOperationTime())
                                .put("unassignedShipments", vrpSolution.getUnassigned().getShipments().size())
                                .put("unassignedServices", vrpSolution.getUnassigned().getServices().size());
        return builder.build();
    }

    public List<String> checkSetting(VRPSetting vrpContract) {
        return null;
    }

    public List<String> checkSolution(VRPSetting vrpContract,
                                      VRPSolution vrpSolution) {
        return null;
    }
}
