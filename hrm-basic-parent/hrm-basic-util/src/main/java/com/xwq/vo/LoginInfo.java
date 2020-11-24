package com.xwq.vo;

/**
 * @author PARADISE
 */
public class LoginInfo {
    private Long userId;
    private String userName;
    private Long tenantId;
    private String tenantName;

    public LoginInfo() {
    }

    public LoginInfo(Long userId, String userName, Long tenantId, String tenantName) {
        this.userId = userId;
        this.userName = userName;
        this.tenantId = tenantId;
        this.tenantName = tenantName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }
}
