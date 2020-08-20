package filesystem.response;


import filesystem.FileSystem;
import io.swagger.annotations.ApiModelProperty;
import tpc.model.response.ResponseResult;
import tpc.model.response.ResultCode;

/**
 * @Version 1.0
 * @Author:tpc
 * @Date:2020/8/20
 */
public class UploadFileResult extends ResponseResult {
    @ApiModelProperty(value = "文件信息", example = "true", required = true)
    FileSystem fileSystem;
    public UploadFileResult(ResultCode resultCode, FileSystem fileSystem) {
        super(resultCode);
        this.fileSystem = fileSystem;
    }
}
