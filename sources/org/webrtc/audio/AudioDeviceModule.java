package org.webrtc.audio;

import android.media.projection.MediaProjection;

/* JADX INFO: loaded from: classes3.dex */
public interface AudioDeviceModule {
    default long getNative(long j) {
        return getNativeAudioDeviceModulePointer();
    }

    @Deprecated
    default long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    void release();

    void restartAudioRecording(boolean z);

    void setMicrophoneMute(boolean z);

    default boolean setNoiseSuppressorEnabled(boolean z) {
        return false;
    }

    void setOneAnnNoiseSuppressorEnabled(boolean z);

    default boolean setPreferredMicrophoneFieldDimension(float f) {
        return false;
    }

    default void setReadyToPlay() {
    }

    void setSpeakerMute(boolean z);

    void startDeviceAudioShare(MediaProjection mediaProjection);

    void stopDeviceAudioShare();
}
