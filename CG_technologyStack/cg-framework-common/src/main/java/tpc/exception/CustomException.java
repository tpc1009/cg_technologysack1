package tpc.exception;


import tpc.model.response.ResultCode;

/**
 * @Version 1.0
 * @Author:tpc
 * @Date:2020/8/20
 */
public class CustomException extends RuntimeException {
    //错误代码
    ResultCode resultCode;

    public CustomException(ResultCode resultCode){
        this.resultCode = resultCode;
    }
    public ResultCode getResultCode(){
        return resultCode;
    }
}
