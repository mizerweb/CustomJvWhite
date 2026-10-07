package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class fe5 implements dch, SurfaceTexture.OnFrameAvailableListener {
    public final pp5 a;
    public final HandlerThread b;
    public final us7 c;
    public final Handler d;
    public final AtomicBoolean e;
    public final float[] f;
    public final float[] g;
    public final LinkedHashMap h;
    public int i;
    public boolean j;
    public final ArrayList k;

    public fe5(fx5 fx5Var) {
        Map map = Collections.EMPTY_MAP;
        this.e = new AtomicBoolean(false);
        this.f = new float[16];
        this.g = new float[16];
        this.h = new LinkedHashMap();
        this.i = 0;
        this.j = false;
        this.k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new us7(handler);
        this.a = new pp5();
        try {
            h(fx5Var);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    public final void a() {
        if (this.j && this.i == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((cch) it.next()).close();
            }
            Iterator it2 = this.k.iterator();
            while (it2.hasNext()) {
                ((dh0) it2.next()).c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            this.a.q();
            this.b.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new i0(this, runnable2, runnable, 18));
        } catch (RejectedExecutionException e) {
            tvj.i("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // defpackage.dch
    public final e89 c(int i, int i2) {
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            b(new f92(this, 27, new dh0(i, i2, r72Var)), new jj2(19, r72Var));
            r72Var.a = "DefaultSurfaceProcessor#snapshot";
        } catch (Exception e) {
            u72Var.c(e);
        }
        return o9b.g(u72Var);
    }

    @Override // defpackage.dch
    public final void d(cch cchVar) {
        if (this.e.get()) {
            cchVar.close();
            return;
        }
        f92 f92Var = new f92(this, 28, cchVar);
        Objects.requireNonNull(cchVar);
        b(f92Var, new jj2(20, cchVar));
    }

    @Override // defpackage.dch
    public final void e(ich ichVar) {
        if (this.e.get()) {
            ichVar.d();
        } else {
            b(new f92(this, 29, ichVar), new de5(ichVar, 0));
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((dh0) it.next()).c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap g(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        wqk.a(fArr2, i);
        wqk.b(fArr2);
        Size sizeH = y1i.h(i, size);
        pp5 pp5Var = this.a;
        pp5Var.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeH.getHeight() * sizeH.getWidth() * 4);
        qyj.h("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeH.getHeight() * sizeH.getWidth()) * 4);
        qyj.h("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = xg7.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        xg7.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        xg7.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        xg7.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeH.getWidth(), sizeH.getHeight(), 0, 6407, 5121, null);
        xg7.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        xg7.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        xg7.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        xg7.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        xg7.b("glActiveTexture");
        GLES20.glBindTexture(36197, pp5Var.a);
        xg7.b("glBindTexture");
        pp5Var.j = null;
        GLES20.glViewport(0, 0, sizeH.getWidth(), sizeH.getHeight());
        GLES20.glScissor(0, 0, sizeH.getWidth(), sizeH.getHeight());
        vg7 vg7Var = (vg7) pp5Var.l;
        vg7Var.getClass();
        if (vg7Var instanceof wg7) {
            GLES20.glUniformMatrix4fv(((wg7) vg7Var).f, 1, false, fArr2, 0);
            xg7.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        xg7.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeH.getWidth(), sizeH.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        xg7.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        xg7.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        xg7.b("glDeleteFramebuffers");
        int i4 = pp5Var.a;
        GLES20.glActiveTexture(33984);
        xg7.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        xg7.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeH.getWidth(), sizeH.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.f(bitmapCreateBitmap, byteBufferAllocateDirect, sizeH.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void h(fx5 fx5Var) {
        Map map = Collections.EMPTY_MAP;
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            b(new i0(this, fx5Var, r72Var), new ce5());
            r72Var.a = "Init GlRenderer";
        } catch (Exception e) {
            u72Var.c(e);
        }
        try {
            u72Var.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            ore.l("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    public final void i(e5i e5iVar) {
        ArrayList arrayList = this.k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (e5iVar == null) {
            f(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmapG = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    dh0 dh0Var = (dh0) it.next();
                    int i3 = dh0Var.b;
                    int i4 = dh0Var.a;
                    if (i != i3 || bitmapG == null) {
                        if (bitmapG != null) {
                            bitmapG.recycle();
                        }
                        bitmapG = g((Size) e5iVar.b, (float[]) e5iVar.c, i3);
                        i2 = -1;
                        i = i3;
                    }
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmapG.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Surface surface = (Surface) e5iVar.a;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.k(byteArray, surface);
                    dh0Var.c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            f(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f;
        surfaceTexture.getTransformMatrix(fArr);
        e5i e5iVar = null;
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            cch cchVar = (cch) entry.getKey();
            float[] fArr2 = this.g;
            cchVar.y(fArr2, fArr, true);
            int i = cchVar.c;
            if (i == 34) {
                try {
                    this.a.t(surfaceTexture.getTimestamp(), fArr2, surface);
                } catch (RuntimeException e) {
                    tvj.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                qyj.l("Unsupported format: " + i, i == 256);
                qyj.l("Only one JPEG output is supported.", e5iVar == null);
                e5iVar = new e5i(surface, cchVar.d, (float[]) fArr2.clone());
            }
        }
        try {
            i(e5iVar);
        } catch (RuntimeException e2) {
            f(e2);
        }
    }

    @Override // defpackage.dch
    public final void release() {
        if (this.e.getAndSet(true)) {
            return;
        }
        b(new jj2(21, this), new ce5());
    }
}
