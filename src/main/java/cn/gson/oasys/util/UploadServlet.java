package cn.gson.oasys.util;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@WebServlet("/files")
public class UploadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            /**
             * 需求：接收前台页面传递的数据【普通数据/文件数据】
             * 1.解析请求
             * 2.区分数据【FileItem】
             * 		1.遍历List集合
             * 		2.判断FileItem的数据类型【普通数据/文件数据】
             * 3.存储文件数据
             */
            //为基于磁盘的文件项创建工厂
            FileItemFactory factory = new DiskFileItemFactory();
            //创建一个新的文件上传处理程序
            ServletFileUpload upload = new ServletFileUpload(factory);
            //解析请求
            List<FileItem> items = upload.parseRequest(req);
            //遍历List集合
            for (FileItem fileItem : items) {
                if (fileItem.isFormField()) {
                    //普通数据
                    System.out.println(fileItem.getFieldName()+"==="+fileItem.getString("UTF-8"));
                }else{
                    //文件数据
                    /**
                     * 问题：存储的路径应该是动态获取
                     * 		upload文件夹的带盘符的路径需要动态获取
                     * 问题：给存储的文件重新命名
                     * 需求：只能上传图片
                     * 		判断MIME类型
                     */
                    //动态获取文件夹的真实路径
                    String realPath = getServletContext().getRealPath("/upload");
                    //获取上传的文件名
                    String fileName = fileItem.getName();

                    /**
                     * 获取MIME类型，判断是否为图片
                     */
                    String mimeType = getServletContext().getMimeType(fileName);
                    if (mimeType==null||!mimeType.startsWith("image/")) {
                        return;
                    }
                    //重新给上传的文件命名
                    String newName = UUID.randomUUID().toString()+"."+ FilenameUtils.getExtension(fileName);
                    File f = new File(realPath,newName);
                    fileItem.write(f);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
