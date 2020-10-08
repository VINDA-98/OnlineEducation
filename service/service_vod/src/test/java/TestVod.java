import com.aliyun.vod.upload.impl.UploadVideoImpl;
import com.aliyun.vod.upload.req.UploadVideoRequest;
import com.aliyun.vod.upload.resp.UploadVideoResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoRequest;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse;
import org.junit.Test;

import java.util.List;

public class TestVod {

    public static void main(String[] args) {
        String accessKeyId = "LTAI4G1gxt7tHossFAFyaBqp";
        String accessKeySecret = "8NKnVKP6MlkwsRcHRAZxg5ssSyeRxb";

        String title = "1-VindaAndZed";   //上传之后文件名称

        //String fileName = "F:/6 - What If I Want to Move Faster.mp4";  //本地文件路径和名称
        String fileName = "G:/01 Qt_stduy/2017112963/4/build-Test-Desktop_Qt_5_12_1_MinGW_64_bit-Debug/debug/media/video/ZED.mp4";  //本地文件路径和名称
        //上传视频的方法
        UploadVideoRequest request = new UploadVideoRequest(accessKeyId, accessKeySecret, title, fileName);
        /* 可指定分片上传时每个分片的大小，默认为2M字节 */
        request.setPartSize(2 * 1024 * 1024L);
        /* 可指定分片上传时的并发线程数，默认为1，(注：该配置会占用服务器CPU资源，需根据服务器情况指定）*/
        request.setTaskNum(1);

        UploadVideoImpl uploader = new UploadVideoImpl();
        UploadVideoResponse response = uploader.uploadVideo(request);

        if (response.isSuccess()) {
            System.out.print("VideoId=" + response.getVideoId() + "\n");
        } else {
            /* 如果设置回调URL无效，不影响视频上传，可以返回VideoId同时会返回错误码。其他情况上传失败时，VideoId为空，此时需要根据返回错误码分析具体错误原因 */
            System.out.print("VideoId=" + response.getVideoId() + "\n");
            System.out.print("ErrorCode=" + response.getCode() + "\n");
            System.out.print("ErrorMessage=" + response.getMessage() + "\n");
        }
    }

    //1 根据视频iD获取视频播放地址
//    @Test
//    public void getPlayUrl() throws Exception{
//        //创建初始化对象
//        DefaultAcsClient client = InitObject.initVodClient("LTAI4G1gxt7tHossFAFyaBqp", "8NKnVKP6MlkwsRcHRAZxg5ssSyeRxb");
//
//        //创建获取视频地址request和response
//        GetPlayInfoRequest request = new GetPlayInfoRequest();
//        GetPlayInfoResponse response = new GetPlayInfoResponse();
//
//        //向request对象里面设"置视频id
//        request.setVideoId("74587ce8a1df4809a9abb8960d283576");
//
//        //调用初始化对象里面的方法，传递request，获取数据
//        response = client.getAcsResponse(request);
//
//        List<GetPlayInfoResponse.PlayInfo> playInfoList = response.getPlayInfoList();
//        //播放地址
//        for (GetPlayInfoResponse.PlayInfo playInfo : playInfoList) {
//            System.out.print("PlayInfo.PlayURL = " + playInfo.getPlayURL() + "\n");
//        }
//        //Base信息
//        System.out.print("VideoBase.Title = " + response.getVideoBase().getTitle() + "\n");
//    }

    @Test
    public void test01() {
        int arr[][] = new int[][]{{1, 2}, {3, 4}};
        //双层   for-each
        System.out.println("---------------------");
        for (int[] is : arr) {
            for (int i : is) {
                System.out.print(i);
            }
        }

        System.out.println();
        for (int j = arr.length - 1; j >= 0; j--) {
            //里层循环的次数是每一个一维数组元素的个数
            for (int i = arr[j].length - 1; i >= 0; i--) {
                System.out.print(arr[j][i]);
            }
        }

    }


    @Test
    public void test02() {
        int [] data = new int[]{1,2,3,4};
        int sum = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <=3; j++) {
                for (int k = 0; k <=3 ; k++) {
                    if(i!=j && j!=k && i!=k){
                        System.out.print(" "+data[i]+data[j]+data[k]+" ");
                        sum++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
