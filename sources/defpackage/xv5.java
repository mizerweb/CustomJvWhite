package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class xv5 extends pp5 {
    public int n = -1;
    public int o = -1;
    public final uvc p;
    public final uvc q;

    public xv5(uvc uvcVar, uvc uvcVar2) {
        this.p = uvcVar;
        this.q = uvcVar2;
    }

    @Override // defpackage.pp5
    public final oh0 n(fx5 fx5Var) {
        Map map = Collections.EMPTY_MAP;
        oh0 oh0VarN = super.n(fx5Var);
        this.n = xg7.h();
        this.o = xg7.h();
        return oh0VarN;
    }

    @Override // defpackage.pp5
    public final void q() {
        super.q();
        this.n = -1;
        this.o = -1;
    }

    public final void v(long j, Surface surface, cch cchVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        xg7.d((AtomicBoolean) this.b, true);
        xg7.c((Thread) this.d);
        gi0 gi0VarL = l(surface);
        if (gi0VarL == xg7.j) {
            gi0VarL = h(surface);
            if (gi0VarL == null) {
                return;
            } else {
                ((HashMap) this.c).put(surface, gi0VarL);
            }
        }
        gi0 gi0Var = gi0VarL;
        EGLSurface eGLSurface = gi0Var.a;
        if (surface != ((Surface) this.j)) {
            o(eGLSurface);
            this.j = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        w(gi0Var, cchVar, surfaceTexture, this.p, this.n, true);
        w(gi0Var, cchVar, surfaceTexture2, this.q, this.o, false);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.e, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.e, eGLSurface)) {
            return;
        }
        tvj.g("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        s(surface, false);
    }

    public final void w(gi0 gi0Var, cch cchVar, SurfaceTexture surfaceTexture, uvc uvcVar, int i, boolean z) {
        u(i);
        int i2 = gi0Var.b;
        int i3 = gi0Var.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        cchVar.y(fArr2, fArr, z);
        vg7 vg7Var = (vg7) this.l;
        vg7Var.getClass();
        if (vg7Var instanceof wg7) {
            GLES20.glUniformMatrix4fv(((wg7) vg7Var).f, 1, false, fArr2, 0);
            xg7.b("glUniformMatrix4fv");
        }
        amc amcVar = (amc) uvcVar.c;
        Object obj = amcVar.a;
        Object obj2 = amcVar.b;
        Size size = new Size((int) (((Float) amcVar.a).floatValue() * i2), (int) (((Float) obj2).floatValue() * i3));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        amc amcVar2 = (amc) uvcVar.b;
        if (((Float) obj).floatValue() != 0.0f || ((Float) obj2).floatValue() != 0.0f) {
            Matrix.translateM(fArr4, 0, ((Float) amcVar2.a).floatValue() / ((Float) obj).floatValue(), ((Float) amcVar2.b).floatValue() / ((Float) obj2).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(vg7Var.b, 1, false, fArr5, 0);
        xg7.b("glUniformMatrix4fv");
        GLES20.glUniform1f(vg7Var.c, 1.0f);
        xg7.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        xg7.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
