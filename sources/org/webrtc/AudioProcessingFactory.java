package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public interface AudioProcessingFactory {
    default long createNative(long j) {
        return createNative();
    }

    @Deprecated
    default long createNative() {
        return 0L;
    }
}
