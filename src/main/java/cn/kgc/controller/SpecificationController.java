package cn.kgc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kgc.dto.Msg;
import cn.kgc.pojo.Specification;
import cn.kgc.pojo.SpecificationValue;
import cn.kgc.service.SpecificationService;
import cn.kgc.service.SpecificationValueService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(tags = "这是孙福祥编写的规格属性管理功能")
public class SpecificationController {
	@Autowired
	private SpecificationService specificationService;
	@Autowired
	private SpecificationValueService specificationValueService;
	@ApiOperation(value = "查询所有规格")
	@GetMapping("listSpes")
	public List<Specification> listSpes() {
		return specificationService.listSpecifications();
	}
	@ApiOperation(value = "查询所有规格")
	@GetMapping("listSpesByName/{name}")
	@ApiImplicitParam(name = "name",value = "规格属性名",required = true)
	public List<Specification> listSpesByName(@PathVariable String name) {
		return specificationService.listSpecifications(name);
	}
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value = "规格id",required = true,dataType = "int"),
		@ApiImplicitParam(name="speName",value = "规格名称",required = true)
	})
	@ApiOperation(value = "根据品牌Id修改品牌信息")
	@PutMapping("updateSpe")
	@ApiResponses({
		@ApiResponse(code = 200,message = "响应成功!"),
		@ApiResponse(code = 500,message = "内部错误!")
	})
	public Msg updateSpe(Specification specification) {
		try {
			Msg msg = new Msg(200, "修改成功!", null);
			Map<String,Object> map = new HashMap<>();
			Boolean flag = specificationService.updateSpecification(specification);
			map.put("flag",flag);
			msg.setResultMap(map);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return new Msg(500, "内部服务器错误", null);
		}
	}
	@ApiImplicitParam(name="name",value = "规格名称",required = true)
	@ApiOperation(value = "添加新的规格信息")
	@PostMapping("saveSpe/{name}")
	@ApiResponses({
		@ApiResponse(code = 200,message = "响应成功!"),
		@ApiResponse(code = 500,message = "内部错误!")
	})
	public Msg saveSpe(@PathVariable String name) {
		try {
			Msg msg = new Msg(200, "增加成功!", null);
			Map<String,Object> map = new HashMap<>();
			Boolean flag = specificationService.saveSpecification(name);
			map.put("flag",flag);
			msg.setResultMap(map);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return new Msg(500, "内部服务器错误", null);
		}
	}
	@ApiImplicitParam(name="id",value = "规格id",required = true,dataType = "int")
	@ApiOperation(value = "根据规格Id删除规格信息")
	@DeleteMapping("deleteSpeById/{id}")
	@ApiResponses({
		@ApiResponse(code = 200,message = "响应成功!"),
		@ApiResponse(code = 500,message = "内部错误!")
	})
	public Msg deleteSpeById(@PathVariable Integer id) {
		try {
			Msg msg = new Msg(200, "删除成功!", null);
			Map<String,Object> map = new HashMap<>();
			Boolean flag = specificationService.deleteSpecificationById(id);
			map.put("flag",flag);
			msg.setResultMap(map);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return new Msg(500, "内部服务器错误", null);
		}
	}
	@ApiImplicitParam(name="id",value = "规格id",dataType = "int",required = true)
	@ApiOperation(value = "根据规格Id查询规格的详细信息和该规格的所有属性值")
	@GetMapping("getSpeById/{id}")
	public Specification getSpeById(@PathVariable Integer id) {
		return specificationService.getSpecificationById(id);
	}
	@ApiImplicitParam(name="speId",value = "规格id",dataType = "int",required = true)
	@ApiOperation(value = "根据规格id查询所有属性值")
	@GetMapping("listSpeValues/{speId}")
	public List<SpecificationValue> listSpeValues(@PathVariable Integer speId) {
		return specificationValueService.listSpecificationValuesBySpeId(speId);
	}
	@ApiImplicitParams({
		@ApiImplicitParam(name = "id",value = "属性值id",required = true,dataType = "int"),
		@ApiImplicitParam(name = "value",value = "属性值",required = false),
		@ApiImplicitParam(name = "serial",value = "属性值排序号",required = false,dataType = "int"),
		@ApiImplicitParam(name = "speId",value = "无需填写,不做修改",required = false)
	})
	@ApiOperation(value = "根据属性值Id修改属性值")
	@PutMapping("updateSpeValue")
	@ApiResponses({
		@ApiResponse(code = 200,message = "响应成功!"),
		@ApiResponse(code = 500,message = "内部错误!")
	})
	public Msg updateSpeValue(SpecificationValue specificationValue) {
		try {
			Msg msg = new Msg(200, "修改成功!", null);
			Map<String,Object> map = new HashMap<>();
			Boolean flag = specificationValueService.updateSpecificationValue(specificationValue);
			map.put("flag",flag);
			msg.setResultMap(map);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return new Msg(500, "内部服务器错误", null);
		}
	}
	@ApiImplicitParams({
		@ApiImplicitParam(name = "id",value = "无需填写,自动生成"),
		@ApiImplicitParam(name = "value",value = "属性值",required = true),
		@ApiImplicitParam(name = "serial",value = "属性值排序号",required = true,dataType = "int"),
		@ApiImplicitParam(name = "speId",value = "规格Id",required = true,dataType = "int")
	})
	@ApiOperation(value = "添加新的规格信息")
	@PostMapping("saveSpeValue")
	@ApiResponses({
		@ApiResponse(code = 200,message = "响应成功!"),
		@ApiResponse(code = 500,message = "内部错误!")
	})
	public Msg saveSpeValue(SpecificationValue specificationValue) {
		try {
			Msg msg = new Msg(200, "增加成功!", null);
			Map<String,Object> map = new HashMap<>();
			Boolean flag = specificationValueService.saveSpecificationValue(specificationValue);
			map.put("flag",flag);
			msg.setResultMap(map);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return new Msg(500, "内部服务器错误", null);
		}
	}
	@ApiImplicitParam(name="id",value = "属性值id",required = true,dataType = "int")
	@ApiOperation(value = "根据属性值Id删除属性值")
	@DeleteMapping("deleteSpeValueById/{id}")
	@ApiResponses({
		@ApiResponse(code = 200,message = "响应成功!"),
		@ApiResponse(code = 500,message = "内部错误!")
	})
	public Msg deleteSpeValueById(@PathVariable Integer id) {
		try {
			Msg msg = new Msg(200, "删除成功!", null);
			Map<String,Object> map = new HashMap<>();
			Boolean flag = specificationValueService.deleteSpecificationValueById(id);
			map.put("flag",flag);
			msg.setResultMap(map);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return new Msg(500, "内部服务器错误", null);
		}
	}
	@ApiImplicitParam(name="id",value = "属性值id",dataType = "int",required = true)
	@ApiOperation(value = "根据属性值Id查询属性值的详细信息")
	@GetMapping("getSpeValueById/{id}")
	public SpecificationValue getSpeValueById(@PathVariable Integer id) {
		return specificationValueService.getSpecificationValueById(id);
	}
}
