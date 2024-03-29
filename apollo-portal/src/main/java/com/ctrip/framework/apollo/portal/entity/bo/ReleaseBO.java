package com.ctrip.framework.apollo.portal.entity.bo;

import com.ctrip.framework.apollo.common.dto.ReleaseDTO;

import java.util.Set;

/**
 * @author jys
 */
public class ReleaseBO {

    private ReleaseDTO baseInfo;

    private Set<KVEntity> items;

    public ReleaseDTO getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(ReleaseDTO baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Set<KVEntity> getItems() {
        return items;
    }

    public void setItems(Set<KVEntity> items) {
        this.items = items;
    }

}
