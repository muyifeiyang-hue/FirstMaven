/**
 * All rights reserved by XinGuoDu Inc.
 */
package com.yl.entity;

import com.jiuzhou.center.common.entity.BaseEntity;

/**
 * <p>
 * @author yanglei
 * @Date 2018-01-31 15:36:58
 * @since 1.0
 */
public class UserEntity extends BaseEntity {
	
	/** serialVersionUID */
    private static final long serialVersionUID = 1L;
	
	/** . */
	private Long id;
	
	/** . */
	private String userName;
	
	/** . */
	private String password;
	
	/** . */
	private Long age;
	
	

    /** set . */
	public void setId(Long id) {
		this.id = id;
	}
	
	/** get . */
	public Long getId() {
		return this.id;
	}
	

    /** set . */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/** get . */
	public String getUserName() {
		return this.userName;
	}
	

    /** set . */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/** get . */
	public String getPassword() {
		return this.password;
	}
	

    /** set . */
	public void setAge(Long age) {
		this.age = age;
	}
	
	/** get . */
	public Long getAge() {
		return this.age;
	}
	
    /** constructor */
	public UserEntity() {
		super();
	}

	/**
	 * constructor.<p>
	 * @param userName			
	 * @param password			
	 * @param age			
	 */
	public UserEntity(String userName,String password,Long age){
		this();
		this.userName = userName;
		this.password = password;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("UserEntity[")
			.append("Id=").append(getId()).append(", ")
			.append("UserName=").append(getUserName()).append(", ")
			.append("Password=").append(getPassword()).append(", ")
			.append("Age=").append(getAge())
		.append("]").toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
	    int result = 1;
	    	result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
	    return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof UserEntity == false) return false;
		if(this == obj) return true;
		UserEntity other = (UserEntity)obj;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		return false;
	}
}
