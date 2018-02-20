package io.npcloud.contracts;

import java.util.List;
import java.util.Map;

public interface IContract<Setting, Solution> {

    String getName();

    Class getContractClass();

    Class getSettingClass();

    Class getSolutionClass();

    Map<String, Double> getObjectives(Solution solution);

    List<String> checkSetting(Setting setting);

    List<String> checkSolution(Setting setting, Solution solution);

}
