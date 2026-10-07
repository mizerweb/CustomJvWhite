package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import androidx.core.os.OperationCanceledException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w48 implements n78 {
    public p48 a;
    public volatile int b;
    public volatile int c;
    public volatile boolean e;
    public volatile boolean f;
    public Executor g;
    public ls9 h;
    public ImageWriter i;
    public ByteBuffer n;
    public ByteBuffer o;
    public ByteBuffer p;
    public ByteBuffer q;
    public ByteBuffer r;
    public ByteBuffer s;
    public volatile int d = 1;
    public Rect j = new Rect();
    public Rect k = new Rect();
    public Matrix l = new Matrix();
    public Matrix m = new Matrix();
    public final Object t = new Object();
    public boolean u = true;

    public abstract l78 a(o78 o78Var);

    public final e89 b(final l78 l78Var) throws Throwable {
        Object obj;
        Executor executor;
        final p48 p48Var;
        boolean z;
        ls9 ls9Var;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        a58 a58VarJ;
        a58 a58Var;
        int i = this.e ? this.b : 0;
        Object obj2 = this.t;
        synchronized (obj2) {
            try {
                try {
                    executor = this.g;
                    p48Var = this.a;
                    z = this.e && i != this.c;
                    if (z) {
                        g(l78Var, i);
                    }
                    if (this.e || this.d == 3) {
                        d(l78Var);
                    }
                    try {
                        ls9Var = this.h;
                        try {
                            imageWriter = this.i;
                            byteBuffer = this.n;
                            byteBuffer2 = this.o;
                            byteBuffer3 = this.p;
                            byteBuffer4 = this.q;
                            byteBuffer5 = this.r;
                            byteBuffer6 = this.s;
                        } catch (Throwable th) {
                            th = th;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        if (p48Var == null || executor == null || !this.u) {
            return new g88(1, new OperationCanceledException("No analyzer or executor currently set."));
        }
        int i2 = this.d;
        if (ls9Var != null) {
            if (i2 == 2) {
                a58VarJ = ImageProcessingUtil.d(l78Var, ls9Var, byteBuffer, i, this.f);
            } else {
                if (this.d == 1) {
                    if (this.f) {
                        ImageProcessingUtil.a(l78Var);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        a58VarJ = ImageProcessingUtil.i(l78Var, ls9Var, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                a58Var = null;
            }
            a58Var = a58VarJ;
        } else {
            if (i2 == 3) {
                if (this.f) {
                    ImageProcessingUtil.a(l78Var);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    a58VarJ = ImageProcessingUtil.j(l78Var, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i);
                    a58Var = a58VarJ;
                }
            }
            a58Var = null;
        }
        boolean z2 = a58Var == null;
        final l78 l78Var2 = z2 ? l78Var : a58Var;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.t) {
            if (z && !z2) {
                try {
                    f(l78Var.getWidth(), l78Var.getHeight(), l78Var2.getWidth(), l78Var2.getHeight());
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            this.c = i;
            rect.set(this.k);
            matrix.set(this.m);
        }
        final r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            executor.execute(new Runnable() { // from class: v48
                @Override // java.lang.Runnable
                public final void run() {
                    w48 w48Var = this.a;
                    l78 l78Var3 = l78Var;
                    Matrix matrix2 = matrix;
                    l78 l78Var4 = l78Var2;
                    Rect rect2 = rect;
                    p48 p48Var2 = p48Var;
                    r72 r72Var2 = r72Var;
                    if (!w48Var.u) {
                        r72Var2.d(new OperationCanceledException("ImageAnalysis is detached"));
                        return;
                    }
                    nof nofVar = new nof(l78Var4, null, new sh0(l78Var3.getImageInfo().d(), l78Var3.getImageInfo().getTimestamp(), w48Var.e ? 0 : w48Var.b, matrix2, l78Var3.getImageInfo().c()));
                    if (!rect2.isEmpty()) {
                        nofVar.g(rect2);
                    }
                    p48Var2.j(nofVar);
                    r72Var2.b(null);
                }
            });
            r72Var.a = "analyzeImage";
            return u72Var;
        } catch (Exception e) {
            u72Var.c(e);
            return u72Var;
        }
    }

    public abstract void c();

    public final void d(l78 l78Var) {
        if (this.d != 1 && this.d != 3) {
            if (this.d == 2 && this.n == null) {
                this.n = ByteBuffer.allocateDirect(l78Var.getHeight() * l78Var.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.o == null) {
            this.o = ByteBuffer.allocateDirect(l78Var.getHeight() * l78Var.getWidth());
        }
        this.o.position(0);
        if (this.p == null) {
            this.p = ByteBuffer.allocateDirect((l78Var.getHeight() * l78Var.getWidth()) / 4);
        }
        this.p.position(0);
        if (this.q == null) {
            this.q = ByteBuffer.allocateDirect((l78Var.getHeight() * l78Var.getWidth()) / 4);
        }
        this.q.position(0);
        if (this.d == 3) {
            if (this.r == null) {
                this.r = ByteBuffer.allocateDirect(l78Var.getHeight() * l78Var.getWidth());
            }
            this.r.position(0);
            if (this.s == null) {
                this.s = ByteBuffer.allocateDirect((l78Var.getHeight() * l78Var.getWidth()) / 2);
            }
            this.s.position(0);
        }
    }

    public abstract void e(l78 l78Var);

    public final void f(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = y1i.a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.j);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.k = rect;
        this.m.setConcat(this.l, matrix);
    }

    public final void g(l78 l78Var, int i) {
        ls9 ls9Var = this.h;
        if (ls9Var == null) {
            return;
        }
        ls9Var.a();
        int width = l78Var.getWidth();
        int height = l78Var.getHeight();
        int iE = this.h.e();
        int iN = this.h.n();
        boolean z = i == 90 || i == 270;
        int i2 = z ? height : width;
        if (!z) {
            width = height;
        }
        this.h = new ls9(d3m.a(i2, width, iE, iN));
        if (this.d == 1) {
            ImageWriter imageWriter = this.i;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.i = ImageWriter.newInstance(this.h.getSurface(), this.h.n());
        }
    }

    public final void h(Executor executor, p48 p48Var) {
        if (p48Var == null) {
            c();
        }
        synchronized (this.t) {
            this.a = p48Var;
            this.g = executor;
        }
    }

    public final void i(Matrix matrix) {
        synchronized (this.t) {
            this.l = matrix;
            this.m = new Matrix(this.l);
        }
    }

    public final void j(Rect rect) {
        synchronized (this.t) {
            this.j = rect;
            this.k = new Rect(this.j);
        }
    }

    @Override // defpackage.n78
    public final void n(o78 o78Var) {
        try {
            l78 l78VarA = a(o78Var);
            if (l78VarA != null) {
                e(l78VarA);
            }
        } catch (IllegalStateException e) {
            tvj.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }
}
