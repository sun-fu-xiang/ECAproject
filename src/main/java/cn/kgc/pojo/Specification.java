package cn.kgc.pojo;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "这是属性规格实体类")
public class Specification implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "属性规格ID")
	private Integer id;
	@ApiModelProperty(value = "属性规格名")
	private String speName;
	List<SpecificationValue> specificationValues;
	/**
	 * @return the specificationValues
	 */
	public List<SpecificationValue> getSpecificationValues() {
		return specificationValues;
	}
	/**
	 * @param specificationValues the specificationValues to set
	 */
	public void setSpecificationValues(List<SpecificationValue> specificationValues) {
		this.specificationValues = specificationValues;
	}
	public Specification() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Specification [id=" + id + ", speName=" + speName + "]";
	}
	public Specification(Integer id, String speName) {
		super();
		this.id = id;
		this.speName = speName;
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
	 * @return the speName
	 */
	public String getSpeName() {
		return speName;
	}
	/**
	 * @param speName the speName to set
	 */
	public void setSpeName(String speName) {
		this.speName = speName;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
