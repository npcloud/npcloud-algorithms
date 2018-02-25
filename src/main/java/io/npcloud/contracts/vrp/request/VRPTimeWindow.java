package io.npcloud.contracts.vrp.request;

import io.npcloud.contracts.vrp.IVerify;

import java.util.ArrayList;
import java.util.List;

/**
 * Time window object
 */
public class VRPTimeWindow implements IVerify {
    /**
     * unix timestamp in second for window start
     */
    private Long earliest;

    /**
     * unix timestamp in second for window end
     */
    private Long latest;

    public Long getEarliest() {
        return earliest;
    }

    public void setEarliest(Long earliest) {
        this.earliest = earliest;
    }

    public Long getLatest() {
        return latest;
    }

    public void setLatest(Long latest) {
        this.latest = latest;
    }

    @Override
    public List<String> verify(String prefix) {
        List<String> errors = new ArrayList<>();
        validNonNegative(prefix + ".earliest", earliest, errors);
        validNonNegative(prefix + ".latest", latest, errors);
        if(errors.size() == 0){
            if(earliest >= latest){
                errors.add(prefix + " earliest should be less than latest");
            }

            if(earliest <= System.currentTimeMillis() / 1000){
                errors.add(prefix + ".earliest : time already passed");
            }

            if(latest <= System.currentTimeMillis() / 1000){
                errors.add(prefix + ".latest : time already passed");
            }
        }
        return errors;
    }
}
