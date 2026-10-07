package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public interface EncoderCallback {
    void onEncodedImage(EncodedImage encodedImage);

    void onFrameDropped(int i);
}
