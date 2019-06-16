package com.yeasheng.malldemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Desc: 会员实体
 * @author: yansheng
 * @date: 2019/6/16
 */
@Entity
@ApiModel
@Table(name = "ums_member")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
@Getter
@Setter
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@ApiModelProperty(value="id，新建时不传，修改时传")
	private Long id;

	@Column
	@ApiModelProperty(value="会员级别")
	private Long memberLevelId;


	@Column
	@ApiModelProperty(value="会员名称")
	private String username;


	@Column
	private String password;


	@Column
	@ApiModelProperty(value="会员昵称")
	private String nickname;


	@Column
	@ApiModelProperty(value="电话")
	private String phone;


	@Column
	private Integer status;


	@Column
	private Date createTime;


	@Column
	private String icon;


	@Column
	private Integer gender;


	@Column
	private Date birthday;


	@Column
	private String city;


	@Column
	private String job;


	@Column
	private String personalizedSignature;


	@Column
	private Integer sourceType;


	@Column
	private Integer integration;


	@Column
	private Integer growth;


	@Column
	private Integer luckeyCount;


	@Column
	private Integer historyIntegration;


}
