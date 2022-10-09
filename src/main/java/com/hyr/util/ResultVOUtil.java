package com.hyr.util;

import com.hyr.vo.ResultVO;

/**
 * @author h'y'r
 * #Description ResultVOUtil
 * #Date: 2022/10/6 15:47
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO fail(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(-1);
        return resultVO;
    }
}
