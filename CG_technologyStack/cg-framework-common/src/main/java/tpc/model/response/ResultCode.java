package tpc.model.response;

/**
 * @Version 1.0
 * @Author:tpc
 * @Date:2020/8/20
 */
public interface ResultCode {
    //操作是否成功,true为成功，false操作失败
    boolean success();
    //操作代码
    int code();
    //提示信息
    String message();
}
