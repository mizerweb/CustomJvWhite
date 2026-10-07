package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes4.dex */
public interface wm7 {
    void I(EGLDisplay eGLDisplay);

    EGLSurface g(EGLDisplay eGLDisplay, Object obj, int i, boolean z);

    dn7 o(int i, int i2, int i3);

    EGLSurface q(EGLContext eGLContext, EGLDisplay eGLDisplay);

    EGLContext y(EGLDisplay eGLDisplay, int i, int[] iArr);
}
