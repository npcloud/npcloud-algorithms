package io.npcloud.contracts.demo;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import io.npcloud.contracts.IContract;

import java.util.List;
import java.util.Map;

/**
 * A demo optimization contract which simply ask for sum of two integers
 */
public class DemoContract implements
        IContract<DemoContractSetting, DemoContractSolution> {

    public String getName() {
        return DemoContract.class.getName();
    }

    public Class getContractClass() {
        return this.getClass();
    }

    @Override
    public Class getSettingClass() {
        return DemoContractSetting.class;
    }

    @Override
    public Class getSolutionClass() {
        return DemoContractSolution.class;
    }

    public Map<String, Number> getObjectives(DemoContractSolution demoContractSolution) {
        return ImmutableMap.of();
    }


    public List<String> checkSetting(DemoContractSetting setting) {
        if(setting.getRight() == null ||
                setting.getLeft() == null){
            return ImmutableList.of("left or right is null ");
        }
        return null;
    }

    public List<String> checkSolution(DemoContractSetting setting, DemoContractSolution solution) {
        if(solution.getSum() == null){
            return ImmutableList.of("sum is null");
        }
        if(setting.getLeft() + setting.getRight() == solution.getSum()){
            return null;
        }else{
            return ImmutableList.of("not equal");
        }
    }

}
