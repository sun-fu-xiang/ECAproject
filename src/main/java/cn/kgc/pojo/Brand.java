package cn.kgc.pojo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "这是商品品牌实体类")
public class Brand implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "品牌ID")
	private Integer id;
	@ApiModelProperty(value = "品牌名称")
	private String name;
	@ApiModelProperty(value = "描述")
	private String describe;
	@ApiModelProperty(value = "排序")
	private Integer sort;
	public Brand() {
		super();
	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", describe=" + describe + ", sort=" + sort + "]";
	}
	public Brand(Integer id, String name, String describe, Integer sort) {
		super();
		this.id = id;
		this.name = name;
		this.describe = describe;
		this.sort = sort;
	}
	public Brand(Integer id) {
		super();
		this.id = id;
	}
	public Brand(String name) {
		super();
		this.name = name;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the describe
	 */
	public String getDescribe() {
		return describe;
	}
	/**
	 * @param describe the describe to set
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	/**
	 * @return the sort
	 */
	public Integer getSort() {
		return sort;
	}
	/**
	 * @param sort the sort to set
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
