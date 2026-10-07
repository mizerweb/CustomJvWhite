package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class cch implements Closeable {
    public final Surface b;
    public final int c;
    public final Size d;
    public final float[] e;
    public final float[] f;
    public ug4 g;
    public Executor h;
    public final u72 k;
    public final r72 l;
    public final Object a = new Object();
    public boolean i = false;
    public boolean j = false;

    public cch(Surface surface, int i, Size size, zi0 zi0Var, zi0 zi0Var2) {
        float[] fArr = new float[16];
        this.e = fArr;
        float[] fArr2 = new float[16];
        this.f = fArr2;
        this.b = surface;
        this.c = i;
        this.d = size;
        b(fArr, new float[16], zi0Var);
        b(fArr2, new float[16], zi0Var2);
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        try {
            this.l = r72Var;
            r72Var.a = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            u72Var.c(e);
        }
        this.k = u72Var;
    }

    public static void b(float[] fArr, float[] fArr2, zi0 zi0Var) {
        Matrix.setIdentityM(fArr, 0);
        if (zi0Var == null) {
            return;
        }
        Size size = zi0Var.a;
        boolean z = zi0Var.e;
        int i = zi0Var.d;
        wqk.b(fArr);
        wqk.a(fArr, i);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeH = y1i.h(i, size);
        android.graphics.Matrix matrixA = y1i.a(y1i.j(size), y1i.j(sizeH), i, z);
        RectF rectF = new RectF(zi0Var.b);
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeH.getWidth();
        float height = ((sizeH.getHeight() - rectF.height()) - rectF.top) / sizeH.getHeight();
        float fWidth = rectF.width() / sizeH.getWidth();
        float fHeight = rectF.height() / sizeH.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        pf2 pf2Var = zi0Var.c;
        Matrix.setIdentityM(fArr2, 0);
        wqk.b(fArr2);
        if (pf2Var != null) {
            qyj.l("Camera has no transform.", pf2Var.p());
            wqk.a(fArr2, pf2Var.a().d());
            if (pf2Var.k()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.j) {
                    this.j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.l.b(null);
    }

    public final Surface g(us7 us7Var, ug4 ug4Var) {
        boolean z;
        synchronized (this.a) {
            this.h = us7Var;
            this.g = ug4Var;
            z = this.i;
        }
        if (z) {
            l();
        }
        return this.b;
    }

    public final void l() {
        int i;
        Executor executor;
        ug4 ug4Var;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                i = 1;
                if (this.h == null || (ug4Var = this.g) == null) {
                    this.i = true;
                } else if (!this.j) {
                    atomicReference.set(ug4Var);
                    executor = this.h;
                    this.i = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new ewg(this, i, atomicReference));
            } catch (RejectedExecutionException e) {
                tvj.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
            }
        }
    }

    public final void y(float[] fArr, float[] fArr2, boolean z) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, z ? this.e : this.f, 0);
    }
}
