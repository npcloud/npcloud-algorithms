package io.npcloud.contracts.vrp.response;

public class VRPUnassignedDetail {

    public enum UsassignedCode {
        CANNOT_SERVER_REQUIRED_SKILL(1),
        CANNOT_VISIT_WITH_TIME_WINDOW(2),
        CANOT_FIT_INTO_ANY_VEHICLE(3),
        CANNOT_ASSIGNED_DUE_TO_MAX_DIST(4),
        CANNOT_ASSIGNED_DUE_TO_RELATION(5),
        CANNOT_ASSIGNED_DUE_TO_ALLOW_VEHICLE(6),
        CANNOT_ASSIGN_DUE_TO_MAX_TIME_IN_VECHICLE(7),
        DRIVER_DOES_NOT_NEED_BREAK(9),
        CANNOT_ASSIGN_DUE_TO_DISALLOWED_VECHICLE(10),
        CANNOT_ASSIGN_DUE_TO_MAX_DRIVE_TIME(11),
        CANNOT_ASSIGN_DUE_TO_MAX_JOB(12),
        CANNOT_ASSIGN_DUE_TO_MAX_ACTIVITY(13),
        LOCATION_CANNOT_BE_ACCESSED(14),
        ;

        private int code;

        UsassignedCode(int code) {
            this.code = code;
        }
    }

    private String id;

    private Integer code;

    private String reason;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
