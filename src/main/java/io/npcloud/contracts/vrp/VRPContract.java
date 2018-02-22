package io.npcloud.contracts.vrp;

import io.npcloud.contracts.IContract;
import io.npcloud.contracts.vrp.request.VRPSetting;
import io.npcloud.contracts.vrp.response.VRPSolution;

import java.util.List;
import java.util.Map;

/**
 * vrp contract solution checker provider
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

    public Map<String, Double> getObjectives(VRPSolution vrpSolution) {
        return null;
    }

    public List<String> checkSetting(VRPSetting vrpContract) {
        return null;
    }

    public List<String> checkSolution(VRPSetting vrpContract,
                                      VRPSolution vrpSolution) {
        return null;
    }
}
