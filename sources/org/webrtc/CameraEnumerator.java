package org.webrtc;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface CameraEnumerator {
    default CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CameraConfigurationProvider cameraConfigurationProvider) {
        return createCapturer(str, cameraEventsHandler, null, cameraConfigurationProvider);
    }

    CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper, CameraVideoCapturer.CameraConfigurationProvider cameraConfigurationProvider);

    String[] getDeviceNames();

    List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str);

    boolean isBackFacing(String str);

    boolean isFrontFacing(String str);
}
