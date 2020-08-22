package tpc.model.response;

/**
 * @Version 1.0
 * @Author:tpc
 * @Date:2020/8/20
 */
public class QueryResponseResult<T> extends ResponseResult{

    QueryResult<T> queryResult;

    public QueryResponseResult(ResultCode resultCode,QueryResult queryResult){
        super(resultCode);
        this.queryResult = queryResult;
    }

}
