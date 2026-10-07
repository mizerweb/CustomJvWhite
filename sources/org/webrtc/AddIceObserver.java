package org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public interface AddIceObserver {
    void onAddFailure(RTCErrorType rTCErrorType, String str);

    void onAddSuccess();
}
