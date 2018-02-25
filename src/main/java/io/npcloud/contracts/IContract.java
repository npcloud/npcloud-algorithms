package io.npcloud.contracts;

import java.util.List;
import java.util.Map;

/**
 * IContract  interface
 * @param <Setting> class of task setting
 * @param <Solution> class of task solution
 */
public interface IContract<Setting, Solution> {

    /**
     * algorithm name
     * @return
     */
    String getName();

    /**
     * full class name of the optimization contract
     * @return
     */
    Class getContractClass();

    /**
     * full class name of the optimization task setting
     * @return
     */
    Class getSettingClass();

    /**
     * full class name of solution for the task
     * @return
     */
    Class getSolutionClass();

    /**
     * extra key objectives from full solution
     * @param solution
     * @return
     */
    Map<String, Number> getObjectives(Solution solution);

    /**
     * verify task settings
     * @param setting
     * @return error list
     */
    List<String> checkSetting(Setting setting);

    /**
     * verify solution
     * @param setting
     * @param solution
     * @return error list
     */
    List<String> checkSolution(Setting setting, Solution solution);

}
