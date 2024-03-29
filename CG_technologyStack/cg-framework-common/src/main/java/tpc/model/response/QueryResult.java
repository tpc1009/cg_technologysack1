package tpc.model.response;

import java.util.List;

/**
 * @Version 1.0
 * @Author:tpc
 * @Date:2020/8/20
 */
public class QueryResult<T> {

    //数据列表
    private List<T> list;
    //数据总数
    private long total;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "QueryResult{" +
                "list=" + list +
                ", total=" + total +
                '}';
    }
}
