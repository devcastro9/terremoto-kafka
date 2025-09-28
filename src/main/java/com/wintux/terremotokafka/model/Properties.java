package com.wintux.terremotokafka.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Properties {
    private BigDecimal mag;
    private String place;
    private Long time;
    private Long updated;
    private Integer tz;
    private String url;
    private Integer felt;
    private BigDecimal cdi;
    private BigDecimal mmi;
    private String alert;
    private String status;
    private Integer tsunami;
    private Integer sig;
    private String net;
    private String code;
    private String ids;
    private String sources;
    private String types;
    private Integer nst;
    private BigDecimal dmin;
    private BigDecimal rms;
    private BigDecimal gap;
    private String magType;
    private String type;
    private Map<String, List<Product>> products;

    public BigDecimal getMag() {
        return mag;
    }

    public void setMag(BigDecimal mag) {
        this.mag = mag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Integer getTz() {
        return tz;
    }

    public void setTz(Integer tz) {
        this.tz = tz;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getFelt() {
        return felt;
    }

    public void setFelt(Integer felt) {
        this.felt = felt;
    }

    public BigDecimal getCdi() {
        return cdi;
    }

    public void setCdi(BigDecimal cdi) {
        this.cdi = cdi;
    }

    public BigDecimal getMmi() {
        return mmi;
    }

    public void setMmi(BigDecimal mmi) {
        this.mmi = mmi;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTsunami() {
        return tsunami;
    }

    public void setTsunami(Integer tsunami) {
        this.tsunami = tsunami;
    }

    public Integer getSig() {
        return sig;
    }

    public void setSig(Integer sig) {
        this.sig = sig;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public Integer getNst() {
        return nst;
    }

    public void setNst(Integer nst) {
        this.nst = nst;
    }

    public BigDecimal getDmin() {
        return dmin;
    }

    public void setDmin(BigDecimal dmin) {
        this.dmin = dmin;
    }

    public BigDecimal getRms() {
        return rms;
    }

    public void setRms(BigDecimal rms) {
        this.rms = rms;
    }

    public BigDecimal getGap() {
        return gap;
    }

    public void setGap(BigDecimal gap) {
        this.gap = gap;
    }

    public String getMagType() {
        return magType;
    }

    public void setMagType(String magType) {
        this.magType = magType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, List<Product>> getProducts() {
        return products;
    }

    public void setProducts(Map<String, List<Product>> products) {
        this.products = products;
    }
}
