package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zbh {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final yi0 g;
    public int h;
    public int i;
    public ich k;
    public ybh l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public zbh(int i, int i2, yi0 yi0Var, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = yi0Var;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new ybh(i2, yi0Var.a);
    }

    public final void a(Runnable runnable) {
        wxl.a();
        b();
        this.m.add(runnable);
    }

    public final void b() {
        qyj.l("Edge is already closed.", !this.n);
    }

    public final void c() {
        wxl.a();
        this.l.a();
        this.n = true;
        this.o.clear();
        this.m.clear();
    }

    public final ich d(pf2 pf2Var, boolean z) {
        wxl.a();
        b();
        yi0 yi0Var = this.g;
        ich ichVar = new ich(yi0Var.a, pf2Var, z, yi0Var.c, yi0Var.d, yi0Var.e, new ubh(this, 0));
        try {
            i88 i88Var = ichVar.m;
            ybh ybhVar = this.l;
            Objects.requireNonNull(ybhVar);
            if (ybhVar.g(i88Var, new vbh(ybhVar, 0))) {
                o9b.g(ybhVar.e).b(new wbh(i88Var, 0), zjl.a());
            }
            this.k = ichVar;
            f();
            return ichVar;
        } catch (DeferrableSurface$SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            ichVar.d();
            throw e2;
        }
    }

    public final void e() {
        boolean z;
        wxl.a();
        b();
        ybh ybhVar = this.l;
        ybhVar.getClass();
        wxl.a();
        if (ybhVar.p == null) {
            synchronized (ybhVar.a) {
                z = ybhVar.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new ybh(this.a, this.g.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        hch hchVar;
        Executor executor;
        wxl.a();
        dj0 dj0Var = new dj0(this.d, this.i, this.h, this.c, this.b, this.e);
        ich ichVar = this.k;
        if (ichVar != null) {
            synchronized (ichVar.a) {
                ichVar.n = dj0Var;
                hchVar = ichVar.o;
                executor = ichVar.p;
            }
            if (hchVar != null && executor != null) {
                executor.execute(new ech(hchVar, dj0Var, 0));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((ug4) it.next()).accept(dj0Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append(this.f);
        sb.append(", format=");
        sb.append(this.a);
        sb.append(", resolution=");
        sb.append(this.g.a);
        sb.append(", cropRect=");
        sb.append(this.d);
        sb.append(", rotationDegrees=");
        sb.append(this.i);
        sb.append(", mirroring=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform= ");
        Matrix matrix = this.b;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(y1i.b(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(y1i.e(matrix));
        sb.append(", isClosed=");
        return c0a.p(sb, this.n, '}');
    }
}
