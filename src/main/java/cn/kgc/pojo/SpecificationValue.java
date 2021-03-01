package cn.kgc.pojo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "这是属性值实体类")
public class SpecificationValue implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "属性值ID")
	private Integer id;
	@ApiModelProperty(value = "属性值的规格ID")
	private Integer speId;
	@ApiModelProperty(value = "属性值")
	private String value;
	@ApiModelProperty(value = "属性值排序号")
	private Integer serial;
	/**
	 * @return the serial
	 */
	public Integer getSerial() {
		return serial;
	}
	/**
	 * @param serial the serial to set
	 */
	public void setSerial(Integer serial) {
		this.serial = serial;
	}
	public SpecificationValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpecificationValue(Integer id, Integer speId, String value) {
		super();
		this.id = id;
		this.speId = speId;
		this.value = value;
	}
	@Override
	public String toString() {
		return "SpecificationValue [id=" + id + ", speId=" + speId + ", value=" + value + "]";
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the speId
	 */
	public Integer getSpeId() {
		return speId;
	}
	/**
	 * @param speId the speId to set
	 */
	public void setSpeId(Integer speId) {
		this.speId = speId;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
