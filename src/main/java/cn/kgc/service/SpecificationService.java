package cn.kgc.service;

import java.util.List;

import cn.kgc.pojo.Specification;

public interface SpecificationService {

	/**
	 * 查询所有规格属性
	 * @return
	 */
	List<Specification> listSpecifications();
	/**
	 * 模糊查询规格属性
	 * @return
	 */
	List<Specification> listSpecifications(String name);
	/**
	 * 根据id查询规格属性
	 * @param id
	 * @return
	 */
	Specification getSpecificationById(Integer id);
	/**
	 * 修改规格属性
	 * @param name
	 * @return
	 */
	Boolean updateSpecification(Specification specification);
	/**
	 * 增加规格属性
	 * @param name
	 * @return
	 */
	Boolean saveSpecification(String name);
	/**
	 * 根据id删除规格属性
	 * @param id
	 * @return
	 */
	Boolean deleteSpecificationById(Integer id);

}
