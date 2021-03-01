package cn.kgc.mapper;

import java.util.List;

import cn.kgc.pojo.Specification;

public interface SpecificationMapper {
	/**
	 * 查询所有规格属性
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
	Integer updateSpecification(Specification specification);
	/**
	 * 增加规格属性
	 * @param name
	 * @return
	 */
	Integer saveSpecification(String name);
	/**
	 * 根据id删除规格属性
	 * @param id
	 * @return
	 */
	Integer deleteSpecificationById(Integer id);
}
