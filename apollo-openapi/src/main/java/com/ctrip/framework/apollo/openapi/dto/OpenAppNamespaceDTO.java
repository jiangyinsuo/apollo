package com.ctrip.framework.apollo.openapi.dto;

/**
 * @author jys
 */
public class OpenAppNamespaceDTO extends BaseDTO {
    private String name;

    private String appId;

    private String format;

    private boolean isPublic;

    // whether to append namespace prefix for public namespace name
    private boolean appendNamespacePrefix = true;

    private String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean isAppendNamespacePrefix() {
        return appendNamespacePrefix;
    }

    public void setAppendNamespacePrefix(boolean appendNamespacePrefix) {
        this.appendNamespacePrefix = appendNamespacePrefix;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "OpenAppNamespaceDTO{" +
                "name='" + name + '\'' +
                ", appId='" + appId + '\'' +
                ", format='" + format + '\'' +
                ", isPublic=" + isPublic +
                ", appendNamespacePrefix=" + appendNamespacePrefix +
                ", comment='" + comment + '\'' +
                ", dataChangeCreatedBy='" + dataChangeCreatedBy + '\'' +
                ", dataChangeLastModifiedBy='" + dataChangeLastModifiedBy + '\'' +
                ", dataChangeCreatedTime=" + dataChangeCreatedTime +
                ", dataChangeLastModifiedTime=" + dataChangeLastModifiedTime +
                '}';
    }
}
