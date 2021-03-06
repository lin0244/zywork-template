package top.zywork.dto;

import java.util.Date;

/**
 * 流程记录DTO<br />
 * 创建于2017-10-14
 *
 * @author 王振宇
 * @version 1.0
 */
public class ProcessDTO extends BaseDTO {
    private static final long serialVersionUID = 7719428192338649813L;

    private String name;
    private String path;
    private String description;
    private Long userId;
    private Date createTime;
    private Integer isDeploy;
    private Date deployTime;
    private Integer isActive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDeploy() {
        return isDeploy;
    }

    public void setIsDeploy(Integer isDeploy) {
        this.isDeploy = isDeploy;
    }

    public Date getDeployTime() {
        return deployTime;
    }

    public void setDeployTime(Date deployTime) {
        this.deployTime = deployTime;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
}
