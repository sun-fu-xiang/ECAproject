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
import cn.kgc.pojo.Brand;
import cn.kgc.service.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(tags = "这是孙福祥编写的品牌管理功能")
public class BrandController {
	@Autowired
	private BrandService brandService;
	@ApiOperation(notes = "查询所有品牌",value = "显示所有品牌信息")
	@GetMapping("listBrands")
	public List<Brand> listBrands() {
		return brandService.listBrands();
	}
	@ApiOperation(value = "根据品牌名模糊查询品牌信息")
	@GetMapping("listBrandsByName/{name}")
	@ApiImplicitParam(name="name",value = "品牌名",required = true)
	public List<Brand> listBrandsByName(@PathVariable String name) {
		return brandService.listBrandsByName(name);
	}
	@ApiImplicitParam(name="id",value = "品牌id",dataType = "int",required = true)
	@ApiOperation(value = "根据品牌Id查询品牌信息")
	@GetMapping("getBrandById/{id}")
	public Brand getBrandById(@PathVariable Integer id) {
		return brandService.getBrandById(id);
	}
	@ApiImplicitParam(name="id",value = "品牌id",required = true,dataType = "int")
	@ApiOperation(value = "根据品牌Id修改品牌信息")
	@PutMapping("updateBrand")
	@ApiResponses({
		@ApiResponse(code = 200,message = "响应成功!"),
		@ApiResponse(code = 500,message = "内部错误!")
	})
	public Msg updateBrand(Brand brand) {
		try {
			Msg msg = new Msg(200, "修改成功!", null);
			Map<String,Object> map = new HashMap<>();
			Boolean flag = brandService.updateBrand(brand);
			map.put("flag",flag);
			msg.setResultMap(map);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return new Msg(500, "内部服务器错误", null);
		}
	}
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value = "品牌id无需填写,自动生成",required = false),
		@ApiImplicitParam(name="name",value = "品牌名称",required = true),
		@ApiImplicitParam(name="sort",value = "品牌排序",required = true)
	})
	@ApiOperation(value = "添加新的品牌信息")
	@PostMapping("saveBrand")
	@ApiResponses({
		@ApiResponse(code = 200,message = "响应成功!"),
		@ApiResponse(code = 500,message = "内部错误!")
	})
	public Msg saveBrand(Brand brand) {
		try {
			Msg msg = new Msg(200, "增加成功!", null);
			Map<String,Object> map = new HashMap<>();
			Boolean flag = brandService.saveBrand(brand);
			map.put("flag",flag);
			msg.setResultMap(map);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return new Msg(500, "内部服务器错误", null);
		}
	}
	@ApiImplicitParam(name="id",value = "品牌id",required = true)
	@ApiOperation(value = "根据品牌Id删除品牌信息")
	@DeleteMapping("deleteBrandById/{id}")
	@ApiResponses({
		@ApiResponse(code = 200,message = "响应成功!"),
		@ApiResponse(code = 500,message = "内部错误!")
	})
	public Msg deleteBrandById(@PathVariable Integer id) {
		try {
			Msg msg = new Msg(200, "删除成功!", null);
			Map<String,Object> map = new HashMap<>();
			Boolean flag = brandService.deleteBrandById(id);
			map.put("flag",flag);
			msg.setResultMap(map);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return new Msg(500, "内部服务器错误", null);
		}
	}
}
