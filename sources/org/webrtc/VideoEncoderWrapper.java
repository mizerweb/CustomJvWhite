package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
class VideoEncoderWrapper {
    public static VideoEncoder.Callback createEncoderCallback(long j) {
        return new d(j);
    }

    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    public static native void nativeOnEncodedFrame(long j, EncodedImage encodedImage);
}
