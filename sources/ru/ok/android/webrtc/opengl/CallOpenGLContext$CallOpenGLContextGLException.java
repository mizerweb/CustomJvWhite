package ru.ok.android.webrtc.opengl;

import defpackage.zo5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ru/ok/android/webrtc/opengl/CallOpenGLContext$CallOpenGLContextGLException", "Lru/ok/android/webrtc/opengl/CallOpenGLContext$CallOpenGLContextException;", "webrtc-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallOpenGLContext$CallOpenGLContextGLException extends CallOpenGLContext$CallOpenGLContextException {
    public CallOpenGLContext$CallOpenGLContextGLException(int i, String str) {
        super(zo5.p(str, ": 0x", Integer.toHexString(i)));
    }
}
