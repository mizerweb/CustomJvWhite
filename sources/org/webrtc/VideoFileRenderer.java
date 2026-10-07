package org.webrtc;

import android.os.Handler;
import android.os.HandlerThread;
import defpackage.alg;
import defpackage.ewg;
import defpackage.f4g;
import defpackage.nbh;
import defpackage.ore;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public class VideoFileRenderer implements VideoSink {
    private static final String TAG = "VideoFileRenderer";
    private EglBase eglBase;
    private final HandlerThread fileThread;
    private final Handler fileThreadHandler;
    private int frameCount;
    private final int outputFileHeight;
    private final String outputFileName;
    private final int outputFileWidth;
    private final ByteBuffer outputFrameBuffer;
    private final int outputFrameSize;
    private final HandlerThread renderThread;
    private final Handler renderThreadHandler;
    private final FileOutputStream videoOutFile;
    private YuvConverter yuvConverter;

    /* JADX INFO: renamed from: org.webrtc.VideoFileRenderer$1 */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ VideoFileRenderer this$0;
        final /* synthetic */ EglBase.Context val$sharedContext;

        public AnonymousClass1(VideoFileRenderer videoFileRenderer) {
            context = context;
            this.this$0 = videoFileRenderer;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.this$0.eglBase = EglBase.create(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.this$0.eglBase.createDummyPbufferSurface();
            this.this$0.eglBase.makeCurrent();
            this.this$0.yuvConverter = new YuvConverter();
        }
    }

    public VideoFileRenderer(String str, int i, int i2, EglBase.Context context) throws IOException {
        if (i % 2 == 1 || i2 % 2 == 1) {
            ore.p("Does not support uneven width or height");
            throw null;
        }
        this.outputFileName = str;
        this.outputFileWidth = i;
        this.outputFileHeight = i2;
        int i3 = ((i * i2) * 3) / 2;
        this.outputFrameSize = i3;
        this.outputFrameBuffer = ByteBuffer.allocateDirect(i3);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        this.videoOutFile = fileOutputStream;
        fileOutputStream.write(nbh.u("YUV4MPEG2 C420 W", i, " H", i2, " Ip F30:1 A1:1\n").getBytes(Charset.forName("US-ASCII")));
        HandlerThread handlerThread = new HandlerThread("VideoFileRendererRenderThread");
        this.renderThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.renderThreadHandler = handler;
        HandlerThread handlerThread2 = new HandlerThread("VideoFileRendererFileThread");
        this.fileThread = handlerThread2;
        handlerThread2.start();
        this.fileThreadHandler = new Handler(handlerThread2.getLooper());
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable(this) { // from class: org.webrtc.VideoFileRenderer.1
            final /* synthetic */ VideoFileRenderer this$0;
            final /* synthetic */ EglBase.Context val$sharedContext;

            public AnonymousClass1(VideoFileRenderer this) {
                context = context;
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.eglBase = EglBase.create(context, EglBase.CONFIG_PIXEL_BUFFER);
                this.this$0.eglBase.createDummyPbufferSurface();
                this.this$0.eglBase.makeCurrent();
                this.this$0.yuvConverter = new YuvConverter();
            }
        });
    }

    public /* synthetic */ void lambda$release$2(CountDownLatch countDownLatch) {
        this.yuvConverter.release();
        this.eglBase.release();
        this.renderThread.quit();
        countDownLatch.countDown();
    }

    public /* synthetic */ void lambda$release$3() {
        try {
            this.videoOutFile.close();
            Logging.d(TAG, "Video written to disk as " + this.outputFileName + ". The number of frames is " + this.frameCount + " and the dimensions of the frames are " + this.outputFileWidth + "x" + this.outputFileHeight + ".");
            this.fileThread.quit();
        } catch (IOException e) {
            ore.h("Error closing output file", e);
        }
    }

    public /* synthetic */ void lambda$renderFrameOnRenderThread$1(VideoFrame.I420Buffer i420Buffer, VideoFrame videoFrame) {
        YuvHelper.I420Rotate(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), this.outputFrameBuffer, i420Buffer.getWidth(), i420Buffer.getHeight(), videoFrame.getRotation());
        i420Buffer.release();
        try {
            this.videoOutFile.write("FRAME\n".getBytes(Charset.forName("US-ASCII")));
            this.videoOutFile.write(this.outputFrameBuffer.array(), this.outputFrameBuffer.arrayOffset(), this.outputFrameSize);
            this.frameCount++;
        } catch (IOException e) {
            ore.h("Error writing video to disk", e);
        }
    }

    /* JADX INFO: renamed from: renderFrameOnRenderThread */
    public void lambda$onFrame$0(VideoFrame videoFrame) {
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        int i = videoFrame.getRotation() % 180 == 0 ? this.outputFileWidth : this.outputFileHeight;
        int i2 = videoFrame.getRotation() % 180 == 0 ? this.outputFileHeight : this.outputFileWidth;
        float width = buffer.getWidth() / buffer.getHeight();
        float f = i / i2;
        int width2 = buffer.getWidth();
        int height = buffer.getHeight();
        if (f > width) {
            height = (int) ((width / f) * height);
        } else {
            width2 = (int) ((f / width) * width2);
        }
        VideoFrame.Buffer bufferCropAndScale = buffer.cropAndScale((buffer.getWidth() - width2) / 2, (buffer.getHeight() - height) / 2, width2, height, i, i2);
        videoFrame.release();
        VideoFrame.I420Buffer i420 = bufferCropAndScale.toI420();
        bufferCropAndScale.release();
        this.fileThreadHandler.post(new alg(this, i420, videoFrame, 8));
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        videoFrame.retain();
        this.renderThreadHandler.post(new ewg(this, 17, videoFrame));
    }

    public void release() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.renderThreadHandler.post(new ewg(this, 18, countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.fileThreadHandler.post(new f4g(21, this));
        try {
            this.fileThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Logging.e(TAG, "Interrupted while waiting for the write to disk to complete.", e);
        }
    }
}
