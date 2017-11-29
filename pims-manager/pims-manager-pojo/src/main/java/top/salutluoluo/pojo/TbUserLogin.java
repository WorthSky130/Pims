package top.salutluoluo.pojo;

import java.util.Date;

public class TbUserLogin {
    private String userGlobalId;

    private String userName;

    private String telephone;

    private String email;

    private String loginPassword;

    private Integer freezing;

    private String freezeReason;

    private String lastPassword;

    private Date lastLoginTime;

    private Date lastOutTime;

    private String lastLoginLocal;

    private String usePlatform;

    private Integer loginFailureTime;

    public String getUserGlobalId() {
        return userGlobalId;
    }

    public void setUserGlobalId(String userGlobalId) {
        this.userGlobalId = userGlobalId == null ? null : userGlobalId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public Integer getFreezing() {
        return freezing;
    }

    public void setFreezing(Integer freezing) {
        this.freezing = freezing;
    }

    public String getFreezeReason() {
        return freezeReason;
    }

    public void setFreezeReason(String freezeReason) {
        this.freezeReason = freezeReason == null ? null : freezeReason.trim();
    }

    public String getLastPassword() {
        return lastPassword;
    }

    public void setLastPassword(String lastPassword) {
        this.lastPassword = lastPassword == null ? null : lastPassword.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastOutTime() {
        return lastOutTime;
    }

    public void setLastOutTime(Date lastOutTime) {
        this.lastOutTime = lastOutTime;
    }

    public String getLastLoginLocal() {
        return lastLoginLocal;
    }

    public void setLastLoginLocal(String lastLoginLocal) {
        this.lastLoginLocal = lastLoginLocal == null ? null : lastLoginLocal.trim();
    }

    public String getUsePlatform() {
        return usePlatform;
    }

    public void setUsePlatform(String usePlatform) {
        this.usePlatform = usePlatform == null ? null : usePlatform.trim();
    }

    public Integer getLoginFailureTime() {
        return loginFailureTime;
    }

    public void setLoginFailureTime(Integer loginFailureTime) {
        this.loginFailureTime = loginFailureTime;
    }
}