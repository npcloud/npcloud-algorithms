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
public interface IContract<Setting, Solution, Objective> {

    String getName();

    Class getContractClass();

    Class getSettingClass();

    Class getSolutionClass();

    Objective getObjectives(Solution solution);

    List<String> checkSetting(Setting setting);

    List<String> checkSolution(Setting setting, Solution solution);

}
```

[1] **getName**: return the name of the algorithm, for example, "VRPContract" for VRP algorithm

[2] **getContractClass**: return the class path for the implementation

[3] **getSettingClass**: return the class path for algorithm input

[4] **getSolutionClass**: return the class path for algorithm output

[5] **getObjectives**: return a summary view of algorithm output, for example the key performance
metrics of the result

[6] **checkSetting**: method to verify the algorithm input, and return a list of errors. It will return
an empty list or null value if no input error is found.

[7] **checkSolution**: check the solution and return a list of errors. It will return
an empty list or null value if not solution error if found.


## DemoContract

DemoContract is a very simple contract, it asks for sum of two integers (See DemoContractSetting),
and algorithm suppler should return the sum in DemoContractSolution format.

### Task setting

Task setting contains two integer number

```java
public class DemoContractSetting {

    private Integer left;

    private Integer right;
}
```

### Task solution

Task solution should return the sum

```java
public class DemoContractSolution {
    private Integer sum;
}
```

## TSPContract

TSPContract asks for optimization result of Travel Salesman Problem. See TspContract for details.


### Task setting

Task input contains a list of points.
And each point contains a point id, x coordinate value and y coordinate value.

```java

public class TspPoint {
    private String id;
    private Double x;
    private Double y;
}

public class TspSetting {
    private List<TspPoint> points;
}
```

### Task solution

Solution result contains a travel path passing all points and returning to the first point
, and the total distance travelled.  For example, if there are three point 1,2 and 3,
 then valid travel points can be [1,2,3] or [2,3,1], etc.

```java
public class TspSolution {
    private Double distance;
    private List<String> travelPoints;
 }
```

## VRPContract

VRPContract is an Vehicle Routing optimization task contract. See [VRP](vrp.md) for detail information.

