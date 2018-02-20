package io.npcloud.contracts.vrp;

import io.npcloud.contracts.IContract;
import io.npcloud.contracts.vrp.request.VRPContractDetail;
import io.npcloud.contracts.vrp.response.VRPSolution;

import java.util.List;
import java.util.Map;

/**
 * vrp contract solution checker provider
 */
public class VRPContract implements IContract<VRPContractDetail, VRPSolution> {

    public String getName() {
        return "VRPContractDetail";
    }

    public Class getContractClass() {
        return this.getClass();
    }

    @Override
    public Class getSettingClass() {
        return VRPContractDetail.class;
    }

    @Override
    public Class getSolutionClass() {
        return VRPSolution.class;
    }

    public Map<String, Double> getObjectives(VRPSolution vrpSolution) {
        return null;
    }

    public List<String> checkSetting(VRPContractDetail vrpContract) {
        return null;
    }

    public List<String> checkSolution(VRPContractDetail vrpContract,
                                      VRPSolution vrpSolution) {
        return null;
    }
}
