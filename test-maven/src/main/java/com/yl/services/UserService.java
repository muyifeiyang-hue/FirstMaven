package com.yl.services;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiuzhou.center.common.service.BaseService;
import com.jiuzhou.center.common.vo.BaseRespVO;
import com.jiuzhou.center.common.vo.ListVo.ListReqVO;
import com.jiuzhou.center.common.vo.ListVo.ListRespVO;
import com.yl.dao.bo.UserBO;
import com.yl.entity.UserEntity;

/**
 * 业务处理.<p>
 * @author yanglei
 * @Date 2018-01-31 15:36:58
 * @since 1.0
 */
@Controller
 @RequestMapping("/user")
public class UserService extends BaseService {

	@Autowired
	private UserBO userBO;

	/**
	 * 分页查询列表
	 * 
	 * @param reqVO
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public String list(ListReqVO reqVO) {
		List<UserEntity> userList = userBO.queryByPage(reqVO);
		int dataCount = userBO.queryCount(reqVO);

		ListRespVO respVO = new ListRespVO();
		respVO.setAaData(userList);
		respVO.setDataCount(dataCount);

		return respVO.toString();
	}

	/**
	 * 新增
	 * 
	 * @param reqVO
	 * @return
	 */
	public BaseRespVO create(UserEntity user) {
		userBO.create(user);
		return new BaseRespVO();
	}

	/**
	 * 修改
	 * 
	 * @param reqVO
	 * @return
	 */
	public BaseRespVO update(UserEntity user) {
		int updateCount = userBO.update(user);
		if(updateCount > 0){
			return new BaseRespVO();
		}else{
			return new BaseRespVO(2,"没有要修改的记录！");
		}
		
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	public BaseRespVO delete(@Param("id") long[] id) {
		int deleteCount = userBO.batchDeleteById(id);
		if (deleteCount > 0) {
			return new BaseRespVO();
		} else {
			return new BaseRespVO(2, "没有要删除的记录！");
		}
	}

}
