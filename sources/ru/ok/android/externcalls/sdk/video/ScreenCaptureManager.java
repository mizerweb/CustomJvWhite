package ru.ok.android.externcalls.sdk.video;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/video/ScreenCaptureManager;", "", "", "enabled", "isFastScreenShareEnabled", "Lsbi;", "setScreenCaptureEnabled", "(ZZ)V", "setAudioCaptureEnabled", "(Z)V", "isScreenCaptureEnabled", "()Z", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ScreenCaptureManager {
    boolean isScreenCaptureEnabled();

    void setAudioCaptureEnabled(boolean enabled);

    void setScreenCaptureEnabled(boolean enabled, boolean isFastScreenShareEnabled);
}
