package com.example.data.response;


import lombok.Data;

/**
 * 文件上传结果
 *
 * @author fuguangwei
 * @date 2023-01-29
 */
@Data
public class FileUploadResponse {

    /**
     * 路径
     */
    private String path;

    /**
     * 文件名
     */
    private String fileName;
}
