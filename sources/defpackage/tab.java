package defpackage;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tab {
    public static boolean a;
    public static final int[] b = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] c = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] d = {12445, 13120, 12344, 12344};
    public static final int[] e = {12445, 13632, 12344, 12344};
    public static final int[] f = {12344};

    public static final int a(int i, int i2, int i3) {
        int i4 = i - (i % 16);
        int i5 = i4 / i2;
        if (i5 == 9) {
            return i4;
        }
        int i6 = i2 * 9;
        int i7 = i6 % 16;
        if (i7 == 0) {
            return i6;
        }
        int i8 = i6 - i7;
        int i9 = 9 - i5;
        int i10 = i3 - i8;
        return (i9 <= 0 || i10 <= 0) ? i8 : (Math.min(i9, i10 / 16) * 16) + i8;
    }

    public static void b(int i, int i2) throws GlUtil$GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        lvb.Z("Create a OpenGL context first or run the GL methods on an OpenGL thread.", i3 > 0);
        if (i < 0 || i2 < 0) {
            throw new GlUtil$GlException("width or height is less than 0");
        }
        if (i > i3 || i2 > i3) {
            throw new GlUtil$GlException(zo5.h(i3, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static void c(int i, int i2, int i3) throws GlUtil$GlException {
        GLES20.glBindTexture(i, i2);
        e();
        GLES20.glTexParameteri(i, 10240, i3);
        e();
        GLES20.glTexParameteri(i, 10241, i3);
        e();
        GLES20.glTexParameteri(i, 10242, 33071);
        e();
        GLES20.glTexParameteri(i, 10243, 33071);
        e();
    }

    public static void d(String str) throws GlUtil$GlException {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbZ = zo5.z(str, ", error code: 0x");
        sbZ.append(Integer.toHexString(iEglGetError));
        throw new GlUtil$GlException(sbZ.toString(), c98.r(Integer.valueOf(iEglGetError)));
    }

    public static void e() throws GlUtil$GlException {
        StringBuilder sb = new StringBuilder();
        oc9.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z = false;
        int i = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i2 = i + 1;
            int iB = r88.b(objArrCopyOf.length, i2);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i] = numValueOf;
            z = true;
            i = i2;
        }
        if (z) {
            throw new GlUtil$GlException(sb.toString(), c98.j(objArrCopyOf, i));
        }
    }

    public static void f(String str, boolean z) throws GlUtil$GlException {
        if (!z) {
            throw new GlUtil$GlException(str);
        }
    }

    public static void g() throws GlUtil$GlException {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        e();
    }

    public static Parcelable h(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList i(List list, Parcelable.Creator creator) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(h((Parcelable) list.get(i), creator));
        }
        return arrayList;
    }

    public static float[] j() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static EGLContext k(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil$GlException {
        boolean z = true;
        lvb.R(Arrays.equals(iArr, b) || Arrays.equals(iArr, c));
        if (i != 2 && i != 3) {
            z = false;
        }
        lvb.R(z);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, u(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
        if (eGLContextEglCreateContext == null || eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglTerminate(eGLDisplay);
            throw new GlUtil$GlException(zo5.h(i, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
        }
        e();
        return eGLContextEglCreateContext;
    }

    public static EGLSurface l(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil$GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (x("EGL_KHR_surfaceless_context")) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, u(eGLDisplay, b), new int[]{12375, 1, 12374, 1, 12344}, 0);
            d("Error creating a new EGL Pbuffer surface");
        }
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext);
        d("Error making context current");
        r(0, 1, 1);
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static long m() throws GlUtil$GlException {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        e();
        if (iArr[0] < 3) {
            return 0L;
        }
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        e();
        GLES20.glFlush();
        e();
        return jGlFenceSync;
    }

    public static int n(int i, int i2, boolean z) throws GlUtil$GlException {
        if (z) {
            b(i, i2);
            int iS = s();
            c(3553, iS, 9729);
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 5131, null);
            e();
            return iS;
        }
        b(i, i2);
        int iS2 = s();
        c(3553, iS2, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        e();
        return iS2;
    }

    public static void o(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil$GlException {
        if (eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        d("Error releasing context");
        if (eGLContext == null || eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        EGL14.eglDestroyContext(eGLDisplay, eGLContext);
        d("Error destroying context");
    }

    public static void p(EGLDisplay eGLDisplay, EGLSurface eGLSurface) throws GlUtil$GlException {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        d("Error destroying surface");
    }

    public static synchronized void q() {
        if (!a) {
            yab.m0("native-imagetranscoder");
            a = true;
        }
    }

    public static void r(int i, int i2, int i3) throws GlUtil$GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            GLES20.glBindFramebuffer(36160, i);
        }
        e();
        GLES20.glViewport(0, 0, i2, i3);
        e();
    }

    public static int s() throws GlUtil$GlException {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        e();
        return iArr[0];
    }

    public static EGLDisplay t() throws GlUtil$GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        f("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        f("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        e();
        return eGLDisplayEglGetDisplay;
    }

    public static EGLConfig u(EGLDisplay eGLDisplay, int[] iArr) throws GlUtil$GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new GlUtil$GlException("eglChooseConfig failed.");
    }

    public static float[] v() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean w() {
        return Build.VERSION.SDK_INT >= 33 && x("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean x(String str) {
        String strEglQueryString = EGL14.eglQueryString(t(), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static void y(Bitmap bitmap, int i) throws GlUtil$GlException {
        b(bitmap.getWidth(), bitmap.getHeight());
        c(3553, i, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        e();
    }
}
