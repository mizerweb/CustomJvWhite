package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
class VideoDecoderWrapper {
    public static VideoDecoder.Callback createDecoderCallback(long j) {
        return new d(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
}
