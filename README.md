# Optimization Algorithm

This repository is open source definition for optimization problems used in
NPCloud optimization network.

Currently we support two simple example problems: DemoContract and TSPContract.
And we are developing the VRP contract and bin packing contract which are more
practically used.

If you are interested in contribution more algorithms to this repository, please contract
us first through email **npc@npcloud.io** first. And you can submit pull request after you finished
your code.

## Contract Interface

Any algorithm should implement following interface. Setting and Solution are two
generic type for algorithm input and algorithm output.

```java
public interface IContract<Setting, Solution> {

    String getName();

    Class getContractClass();

    Class getSettingClass();

    Class getSolutionClass();

    Map<String, Double> getObjectives(Solution solution);

    List<String> checkSetting(Setting setting);

    List<String> checkSolution(Setting setting, Solution solution);

}
```

[1] getName: return the name of the algorithm, for example, "VRPContract" for VRP algorithm

[2] getContractClass: return the class path for the implementation

[3] getSettingClass: return the class path for algorithm input

[4] getSolutionClass: return the class path for algorithm output

[5] getObjectives: return a summary view of algorithm output, for example the key performance
metrics of the result

[6] checkSetting: method to verify the algorithm input, and return a list of errors. It will return
an empty list or null value if no input error is found.

[7] checkSolution: check the solution and return a list of errors. It will return
an empty list or null value if not solution error if found.


## DemoContract

DemoContract is a very simple contract, it asks for sum of two integers (See DemoContractSetting),
and algorithm suppler should return the sum in DemoContractSolution format.

## TSPContract

TSPContract asks for optimization result of Travel Salesman Problem. See TspContract for details.


