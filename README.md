# Optimization Algorithm

This repository is open source definition for optimization problem used in
NPCloud optimization network.

Currently we have support two simple demo problems: DemoContract and TSPContract.
And we are developing the VRP contract and bin packing contract which are more
practically used.

If you are interested in contribution more contract to this repository, please contract
us through email **npc@npcloud.io** first. And you can submit pull request after you finished
your code.

NPCloud will record your contribution and will distribute certain amount of NPC token to
contributors.

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

TSPContract asks for optimization result of Travel Salesman Problem. See


