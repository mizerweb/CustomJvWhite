package androidx.camera.core.impl;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"androidx/camera/core/impl/CameraValidator$CameraIdListIncorrectException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraValidator$CameraIdListIncorrectException extends Exception {
    public final int a;

    public CameraValidator$CameraIdListIncorrectException(int i, RuntimeException runtimeException) {
        super("Expected camera missing from device.", runtimeException);
        this.a = i;
    }
}
