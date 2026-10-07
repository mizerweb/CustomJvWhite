package org.webrtc;

import defpackage.ore;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class VpxEncoderWrapper implements EncoderCallback {
    private EncoderCallback consumerCallback;
    private long encoder;

    public VpxEncoderWrapper() {
        long jNativeCreate = nativeCreate();
        this.encoder = jNativeCreate;
        nativeSetCallback(jNativeCreate, this);
        nativeInit(this.encoder);
    }

    private static native long nativeCreate();

    private static native int nativeEncode(long j, VideoFrame videoFrame, boolean z);

    private static native void nativeInit(long j);

    private static native void nativeRelease(long j);

    private static native void nativeSetCallback(long j, VpxEncoderWrapper vpxEncoderWrapper);

    public void encode(VideoFrame videoFrame, boolean z) {
        long j = this.encoder;
        if (j != 0) {
            nativeEncode(j, videoFrame, z);
        } else {
            ore.k("encoder already released");
        }
    }

    @Override // org.webrtc.EncoderCallback
    public void onEncodedImage(EncodedImage encodedImage) {
        if (this.consumerCallback != null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(encodedImage.buffer.remaining());
            byteBufferAllocate.put(encodedImage.buffer);
            this.consumerCallback.onEncodedImage(EncodedImage.builder().setBuffer(byteBufferAllocate, null).setEncodedHeight(encodedImage.encodedHeight).setEncodedWidth(encodedImage.encodedWidth).setFrameType(encodedImage.frameType).setQp(encodedImage.qp).setRotation(encodedImage.rotation).createEncodedImage());
            encodedImage.release();
        }
    }

    @Override // org.webrtc.EncoderCallback
    public void onFrameDropped(int i) {
        EncoderCallback encoderCallback = this.consumerCallback;
        if (encoderCallback != null) {
            encoderCallback.onFrameDropped(i);
        }
    }

    public void release() {
        nativeRelease(this.encoder);
        this.encoder = 0L;
    }

    public void setConsumerCallback(EncoderCallback encoderCallback) {
        this.consumerCallback = encoderCallback;
    }
}
