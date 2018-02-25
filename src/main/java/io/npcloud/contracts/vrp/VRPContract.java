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
public class VRPContract implements IContract<VRPSetting, VRPSolution, VRPObjective> {

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

    public VRPObjective getObjectives(VRPSolution vrpSolution) {
        VRPObjective objective = new VRPObjective();
        objective.setDistance(vrpSolution.getDistance());
        objective.setTransportTime(vrpSolution.getTransportTime());
        objective.setCompletionTime(vrpSolution.getCompletionTime());
        objective.setMaxOperationTime(vrpSolution.getMaxOperationTime());
        objective.setUnassigned(vrpSolution.getUnassigned());

        return objective;
    }

    public List<String> checkSetting(VRPSetting vrpContract) {
        return null;
    }

    public List<String> checkSolution(VRPSetting vrpContract,
                                      VRPSolution vrpSolution) {
        return null;
    }
}
