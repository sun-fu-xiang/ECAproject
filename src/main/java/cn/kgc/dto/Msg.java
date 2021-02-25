package cn.kgc.dto;

import java.util.Map;

public class Msg {
	/**
	 * 状态码
	 */
	private Integer code;
	/**
	 * 信息
	 */
	private String message;
	/**
	 * 返回数据
	 */
	private Map<String, Object> resultMap;
	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the resultMap
	 */
	public Map<String, Object> getResultMap() {
		return resultMap;
	}
	/**
	 * @param resultMap the resultMap to set
	 */
	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}
	@Override
	public String toString() {
		return "Msg [code=" + code + ", message=" + message + ", resultMap=" + resultMap + "]";
	}
	public Msg(Integer code, String message, Map<String, Object> resultMap) {
		super();
		this.code = code;
		this.message = message;
		this.resultMap = resultMap;
	}
	public Msg() {
		super();
		// TODO Auto-generated constructor stub
	}

}
