package io.npcloud.contracts.vrp.common;

import io.npcloud.contracts.vrp.IVerify;

import java.util.ArrayList;
import java.util.List;

/**
 * Address definition
 */
public class VRPAddress implements IVerify {

    private String locationId;
    private String name;
    private Double lon;
    private Double lat;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Override
    public List<String> verify(String prefix) {
        List<String> errors = new ArrayList<>();
        notEmpty(prefix + ".locationId", locationId, errors);
        notEmpty(prefix + ".name", name, errors);
        validNonNegative(prefix + ".lon", lon, errors);
        validNonNegative(prefix + ".lat", lat, errors);
        return errors;
    }
}
