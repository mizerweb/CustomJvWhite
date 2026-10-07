package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.media3.common.util.GlUtil$GlException;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class v30 implements kt9, gqb {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;

    public v30(String str, String str2) throws GlUtil$GlException {
        this.a = 1;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.b = iGlCreateProgram;
        tab.e();
        c(iGlCreateProgram, 35633, str);
        c(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        tab.f("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.d = new xm7[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.b;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i4 = 0; i4 < i3; i4++) {
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
            }
            String str3 = new String(bArr, 0, i3);
            xm7 xm7Var = new xm7(str3, GLES20.glGetAttribLocation(i2, str3));
            ((xm7[]) this.d)[i] = xm7Var;
            ((HashMap) this.f).put(str3, xm7Var);
        }
        this.g = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.b, 35718, iArr4, 0);
        this.e = new ym7[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int[] iArr6 = new int[1];
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, iArr6, 0, bArr2, 0);
            for (int i8 = 0; i8 < i7; i8++) {
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
            }
            String str4 = new String(bArr2, 0, i7);
            ym7 ym7Var = new ym7(str4, GLES20.glGetUniformLocation(i6, str4), iArr6[0]);
            ((ym7[]) this.e)[i5] = ym7Var;
            ((HashMap) this.g).put(str4, ym7Var);
        }
        tab.e();
    }

    public static void a(v30 v30Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        euc eucVar;
        LoudnessCodecController loudnessCodecController;
        y30 y30Var = (y30) v30Var.e;
        MediaCodec mediaCodec = (MediaCodec) v30Var.d;
        HandlerThread handlerThread = y30Var.b;
        lvb.b0(y30Var.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(y30Var, handler);
        y30Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((mt9) v30Var.f).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (eucVar = (euc) v30Var.g) != null && ((loudnessCodecController = (LoudnessCodecController) eucVar.d) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            lvb.b0(((HashSet) eucVar.b).add(mediaCodec));
        }
        v30Var.b = 1;
    }

    public static final void b(baj bajVar, View view, ViewTreeObserver viewTreeObserver) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(bajVar);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(bajVar);
        }
    }

    public static void c(int i, int i2, String str) throws GlUtil$GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        tab.f(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        tab.e();
    }

    public static String w(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public void A(String str, float[] fArr) {
        ym7 ym7Var = (ym7) ((HashMap) this.g).get(str);
        ym7Var.getClass();
        System.arraycopy(fArr, 0, ym7Var.c, 0, fArr.length);
    }

    public void B(int i, String str) {
        ym7 ym7Var = (ym7) ((HashMap) this.g).get(str);
        ym7Var.getClass();
        ym7Var.d[0] = i;
    }

    public void C(int i, int i2, String str) {
        ym7 ym7Var = (ym7) ((HashMap) this.g).get(str);
        ym7Var.getClass();
        ym7Var.e = i;
        ym7Var.f = i2;
    }

    public void D(Object obj) {
        Iterator it;
        int i;
        synchronized (this.d) {
            try {
                if (Objects.equals(((AtomicReference) this.e).getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.b + 1;
                this.b = i2;
                if (this.c) {
                    return;
                }
                this.c = true;
                Iterator it2 = ((CopyOnWriteArraySet) this.g).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((sjg) it2.next()).a(i2);
                    } else {
                        synchronized (this.d) {
                            try {
                                if (this.b == i2) {
                                    this.c = false;
                                    return;
                                } else {
                                    it = ((CopyOnWriteArraySet) this.g).iterator();
                                    i = this.b;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        it2 = it;
                        i2 = i;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public af7 d(br4 br4Var) {
        View view;
        View view2 = br4Var.getView();
        br4 targetController = br4Var.getTargetController();
        View view3 = targetController != null ? targetController.getView() : null;
        if (view2 == null) {
            if (view3 == null) {
                return new va(22);
            }
            view2 = view3;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        baj bajVar = new baj(this, view3, view2);
        viewTreeObserver.addOnPreDrawListener(bajVar);
        br4Var.addLifecycleListener(new aaj(this, viewTreeObserver, bajVar, view2));
        WeakHashMap weakHashMap = i7j.a;
        if (!view2.isAttachedToWindow()) {
            view = view2;
            view.addOnAttachStateChangeListener(new z9j(view, viewTreeObserver, bajVar, view, 0));
        } else if (view2.isAttachedToWindow()) {
            view = view2;
            view.addOnAttachStateChangeListener(new z9j(view, viewTreeObserver, bajVar, view, 1));
        } else {
            b(bajVar, view2, viewTreeObserver);
            view = view2;
        }
        return new l9j(bajVar, view, viewTreeObserver);
    }

    @Override // defpackage.kt9
    public void e(int i, ty4 ty4Var, long j, int i2) {
        ((mt9) this.f).e(i, ty4Var, j, i2);
    }

    @Override // defpackage.gqb
    public e89 f() {
        Object obj = ((AtomicReference) this.e).get();
        return obj instanceof wi0 ? new g88(1, ((wi0) obj).a) : o9b.f(obj);
    }

    @Override // defpackage.kt9
    public void flush() {
        ((mt9) this.f).flush();
        ((MediaCodec) this.d).flush();
        y30 y30Var = (y30) this.e;
        synchronized (y30Var.a) {
            y30Var.l++;
            Handler handler = y30Var.c;
            String str = vqi.a;
            handler.post(new c3(7, y30Var));
        }
        ((MediaCodec) this.d).start();
    }

    public void g() throws GlUtil$GlException {
        for (xm7 xm7Var : (xm7[]) this.d) {
            FloatBuffer floatBuffer = xm7Var.b;
            lvb.W(floatBuffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(xm7Var.a, xm7Var.c, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(xm7Var.a);
            tab.e();
        }
        for (ym7 ym7Var : (ym7[]) this.e) {
            boolean z = this.c;
            int[] iArr = ym7Var.d;
            float[] fArr = ym7Var.c;
            int i = ym7Var.a;
            int i2 = ym7Var.b;
            if (i2 == 5124) {
                GLES20.glUniform1iv(i, 1, iArr, 0);
                tab.e();
            } else if (i2 == 5126) {
                GLES20.glUniform1fv(i, 1, fArr, 0);
                tab.e();
            } else if (i2 != 35678 && i2 != 35815 && i2 != 36198) {
                switch (i2) {
                    case 35664:
                        GLES20.glUniform2fv(i, 1, fArr, 0);
                        tab.e();
                        break;
                    case 35665:
                        GLES20.glUniform3fv(i, 1, fArr, 0);
                        tab.e();
                        break;
                    case 35666:
                        GLES20.glUniform4fv(i, 1, fArr, 0);
                        tab.e();
                        break;
                    case 35667:
                        GLES20.glUniform2iv(i, 1, iArr, 0);
                        tab.e();
                        break;
                    case 35668:
                        GLES20.glUniform3iv(i, 1, iArr, 0);
                        tab.e();
                        break;
                    case 35669:
                        GLES20.glUniform4iv(i, 1, iArr, 0);
                        tab.e();
                        break;
                    default:
                        switch (i2) {
                            case 35675:
                                GLES20.glUniformMatrix3fv(i, 1, false, fArr, 0);
                                tab.e();
                                break;
                            case 35676:
                                GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
                                tab.e();
                                break;
                            default:
                                ore.k(zo5.h(i2, "Unexpected uniform type: "));
                                return;
                        }
                        break;
                }
            } else {
                if (ym7Var.e == 0) {
                    ore.k("No call to setSamplerTexId() before bind.");
                    return;
                }
                GLES20.glActiveTexture(ym7Var.f + 33984);
                tab.e();
                tab.c(i2 == 35678 ? 3553 : 36197, ym7Var.e, (i2 == 35678 || !z) ? 9729 : 9728);
                if (i2 == 35678) {
                    if (ym7Var.g == 9987) {
                        GLES20.glGenerateMipmap(3553);
                        tab.e();
                    }
                    GLES20.glTexParameteri(3553, 10241, ym7Var.g);
                    tab.e();
                }
                GLES20.glUniform1i(i, ym7Var.f);
                tab.e();
            }
        }
    }

    @Override // defpackage.kt9
    public ByteBuffer getInputBuffer(int i) {
        return ((MediaCodec) this.d).getInputBuffer(i);
    }

    @Override // defpackage.kt9
    public ByteBuffer getOutputBuffer(int i) {
        return ((MediaCodec) this.d).getOutputBuffer(i);
    }

    @Override // defpackage.kt9
    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        y30 y30Var = (y30) this.e;
        synchronized (y30Var.a) {
            try {
                mediaFormat = y30Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.kt9
    public void h(long j, int i, int i2, int i3) {
        ((mt9) this.f).h(j, i, i2, i3);
    }

    @Override // defpackage.kt9
    public void i() {
        ((MediaCodec) this.d).detachOutputSurface();
    }

    @Override // defpackage.gqb
    public void j(eqb eqbVar) {
        synchronized (this.d) {
            x(eqbVar);
        }
    }

    @Override // defpackage.kt9
    public void k(int i) {
        ((MediaCodec) this.d).setVideoScalingMode(i);
    }

    @Override // defpackage.kt9
    public void l(Surface surface) {
        ((MediaCodec) this.d).setOutputSurface(surface);
    }

    @Override // defpackage.kt9
    public void m(int i) {
        ((MediaCodec) this.d).releaseOutputBuffer(i, false);
    }

    @Override // defpackage.gqb
    public void n(Executor executor, eqb eqbVar) {
        sjg sjgVar;
        synchronized (this.d) {
            x(eqbVar);
            sjgVar = new sjg((AtomicReference) this.e, executor, eqbVar);
            ((HashMap) this.f).put(eqbVar, sjgVar);
            ((CopyOnWriteArraySet) this.g).add(sjgVar);
        }
        sjgVar.a(0);
    }

    @Override // defpackage.kt9
    public boolean o(due dueVar) {
        y30 y30Var = (y30) this.e;
        synchronized (y30Var.a) {
            y30Var.o = dueVar;
        }
        return true;
    }

    @Override // defpackage.kt9
    public void p(int i, long j) {
        ((MediaCodec) this.d).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.kt9
    public int q() {
        ((mt9) this.f).a();
        y30 y30Var = (y30) this.e;
        synchronized (y30Var.a) {
            try {
                y30Var.b();
                int i = -1;
                if (y30Var.l > 0 || y30Var.m) {
                    return -1;
                }
                jr3 jr3Var = y30Var.d;
                int i2 = jr3Var.a;
                int i3 = jr3Var.b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = ((int[]) jr3Var.d)[i2];
                    jr3Var.a = (i2 + 1) & jr3Var.c;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kt9
    public int r(MediaCodec.BufferInfo bufferInfo) {
        ((mt9) this.f).a();
        y30 y30Var = (y30) this.e;
        synchronized (y30Var.a) {
            try {
                y30Var.b();
                if (y30Var.l > 0 || y30Var.m) {
                    return -1;
                }
                jr3 jr3Var = y30Var.e;
                int i = jr3Var.a;
                int i2 = jr3Var.b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = ((int[]) jr3Var.d)[i];
                jr3Var.a = jr3Var.c & (i + 1);
                if (i3 >= 0) {
                    y30Var.h.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) y30Var.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    y30Var.h = (MediaFormat) y30Var.g.remove();
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kt9
    public void release() {
        euc eucVar;
        euc eucVar2;
        switch (this.a) {
            case 0:
                try {
                    if (this.b == 1) {
                        ((mt9) this.f).shutdown();
                        y30 y30Var = (y30) this.e;
                        synchronized (y30Var.a) {
                            y30Var.m = true;
                            y30Var.b.quit();
                            y30Var.a();
                        }
                    }
                    this.b = 2;
                    if (this.c) {
                        return;
                    }
                    try {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 30 && i < 33) {
                            ((MediaCodec) this.d).stop();
                            break;
                        }
                        return;
                    } finally {
                        if (Build.VERSION.SDK_INT >= 35 && (eucVar2 = (euc) this.g) != null) {
                            eucVar2.I((MediaCodec) this.d);
                        }
                        ((MediaCodec) this.d).release();
                        this.c = true;
                    }
                } catch (Throwable th) {
                    if (!this.c) {
                        try {
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 30 && i2 < 33) {
                                ((MediaCodec) this.d).stop();
                            }
                        } finally {
                            if (Build.VERSION.SDK_INT >= 35 && (eucVar = (euc) this.g) != null) {
                                eucVar.I((MediaCodec) this.d);
                            }
                            ((MediaCodec) this.d).release();
                            this.c = true;
                        }
                        break;
                    }
                    throw th;
                }
                break;
            default:
                synchronized (this.f) {
                    try {
                        if (this.c) {
                            return;
                        }
                        this.c = true;
                        sgg sggVar = (sgg) this.g;
                        if (sggVar != null) {
                            sggVar.b(null);
                        }
                        this.g = null;
                        yab.i0((gu4) this.d, null, 0, new hpf(this, null, 25), 3);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }

    @Override // defpackage.kt9
    public void s(su6 su6Var) {
        y30 y30Var = (y30) this.e;
        qe qeVar = new qe(this, 5, su6Var);
        synchronized (y30Var.a) {
            y30Var.b();
            qeVar.run();
        }
    }

    @Override // defpackage.kt9
    public void setParameters(Bundle bundle) {
        ((mt9) this.f).setParameters(bundle);
    }

    @Override // defpackage.kt9
    public void t(ArrayList arrayList) {
        ((MediaCodec) this.d).subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.kt9
    public void u(yt9 yt9Var, Handler handler) {
        ((MediaCodec) this.d).setOnFrameRenderedListener(new t30(this, yt9Var, 0), handler);
    }

    @Override // defpackage.kt9
    public void v(ArrayList arrayList) {
        ((MediaCodec) this.d).unsubscribeFromVendorParameters(arrayList);
    }

    public void x(eqb eqbVar) {
        sjg sjgVar = (sjg) ((HashMap) this.f).remove(eqbVar);
        if (sjgVar != null) {
            sjgVar.c.set(false);
            ((CopyOnWriteArraySet) this.g).remove(sjgVar);
        }
    }

    public void y(float[] fArr) {
        xm7 xm7Var = (xm7) ((HashMap) this.f).get("aFramePosition");
        xm7Var.getClass();
        xm7Var.b = (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
        xm7Var.c = 4;
    }

    public void z(String str, float f) {
        ym7 ym7Var = (ym7) ((HashMap) this.g).get(str);
        ym7Var.getClass();
        ym7Var.c[0] = f;
    }

    public v30(gu4 gu4Var, z2 z2Var) {
        this.a = 4;
        this.d = gu4Var;
        this.e = z2Var;
        Object obj = new Object();
        this.f = obj;
        synchronized (obj) {
            this.g = yab.i0(gu4Var, null, 0, new fpf(this, null, 19), 3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v30(Context context, String str, String str2) {
        this(vqi.U(context, str), vqi.U(context, str2));
        this.a = 1;
    }

    public v30(Object obj) {
        this.a = 2;
        this.d = new Object();
        this.b = 0;
        this.c = false;
        this.f = new HashMap();
        this.g = new CopyOnWriteArraySet();
        this.e = new AtomicReference(obj);
    }

    public v30(int i, Class cls) {
        this.a = 3;
        this.b = i;
        this.d = cls;
        this.e = new Rect();
        this.f = new ArrayList();
        this.g = new WeakReference(null);
    }

    public v30(MediaCodec mediaCodec, HandlerThread handlerThread, mt9 mt9Var, euc eucVar) {
        this.a = 0;
        this.d = mediaCodec;
        this.e = new y30(handlerThread);
        this.f = mt9Var;
        this.g = eucVar;
        this.b = 0;
    }
}
