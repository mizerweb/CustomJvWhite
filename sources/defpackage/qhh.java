package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class qhh implements v97 {
    public final b1k b;
    public g85 c;
    public qme d;
    public final ArrayList e;
    public final ArrayDeque a = new ArrayDeque();
    public boolean f = false;

    public qhh(b1k b1kVar) {
        wxl.a();
        this.b = b1kVar;
        this.e = new ArrayList();
    }

    @Override // defpackage.v97
    public final void a(w97 w97Var) {
        zjl.d().execute(new phh(this, 1));
    }

    public final void b() {
        int i;
        wxl.a();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        ArrayDeque arrayDeque = this.a;
        Iterator it = arrayDeque.iterator();
        while (true) {
            i = 5;
            if (!it.hasNext()) {
                break;
            }
            gj0 gj0Var = (gj0) it.next();
            gj0Var.c.execute(new ewg(gj0Var, i, imageCaptureException));
        }
        arrayDeque.clear();
        for (qme qmeVar : new ArrayList(this.e)) {
            qmeVar.getClass();
            wxl.a();
            if (!qmeVar.d.b.isDone()) {
                wxl.a();
                qmeVar.g = true;
                bp2 bp2Var = qmeVar.i;
                Objects.requireNonNull(bp2Var);
                bp2Var.cancel(true);
                qmeVar.e.d(imageCaptureException);
                qmeVar.f.b(null);
                wxl.a();
                gj0 gj0Var2 = qmeVar.a;
                gj0Var2.c.execute(new ewg(gj0Var2, i, imageCaptureException));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        u72 u72Var;
        zc2 zc2Var;
        i88 i88Var;
        wxl.a();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (this.d != null) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.f) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        g85 g85Var = this.c;
        g85Var.getClass();
        wxl.a();
        if (((js8) g85Var.c).l() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        gj0 gj0Var = (gj0) this.a.poll();
        if (gj0Var == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        qme qmeVar = new qme(gj0Var, this);
        int i = 0;
        boolean z = true;
        qyj.l(null, !(this.d != null));
        this.d = qmeVar;
        wxl.a();
        qmeVar.c.b.b(new phh(this, 0), zjl.a());
        this.e.add(qmeVar);
        wxl.a();
        qmeVar.d.b.b(new ewg(this, 4, qmeVar), zjl.a());
        g85 g85Var2 = this.c;
        wxl.a();
        u72 u72Var2 = qmeVar.c;
        g85Var2.getClass();
        wxl.a();
        gl2 gl2Var = (gl2) ((a68) g85Var2.a).b(a68.d, new gl2(Arrays.asList(new bn2())));
        Objects.requireNonNull(gl2Var);
        int i2 = g85.f;
        g85.f = i2 + 1;
        zg0 zg0Var = (zg0) g85Var2.e;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(gl2Var.hashCode());
        List<bn2> list = gl2Var.a;
        Objects.requireNonNull(list);
        for (bn2 bn2Var : list) {
            j28 j28Var = new j28();
            hl2 hl2Var = (hl2) g85Var2.b;
            int i3 = i;
            j28Var.b = hl2Var.c;
            j28Var.o(hl2Var.b);
            j28Var.m(gj0Var.k);
            i88 i88Var2 = zg0Var.c;
            int i4 = zg0Var.g;
            ArrayList arrayList2 = zg0Var.h;
            Objects.requireNonNull(i88Var2);
            g85 g85Var3 = g85Var2;
            ((HashSet) j28Var.c).add(i88Var2);
            if (arrayList2.size() > 1 && (i88Var = zg0Var.d) != null) {
                ((HashSet) j28Var.c).add(i88Var);
            }
            i88 i88Var3 = zg0Var.e;
            if ((i88Var3 != null ? 1 : i3) != 0) {
                Objects.requireNonNull(i88Var3);
                ((HashSet) j28Var.c).add(i88Var3);
            }
            if (f3m.d(i4) || i4 == 32) {
                if (((ImageCaptureRotationOptionQuirk) rk5.a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                    bh0 bh0Var = hl2.f;
                } else {
                    ((w8b) j28Var.d).m(hl2.f, Integer.valueOf(gj0Var.g));
                }
                bh0 bh0Var2 = hl2.g;
                Rect rect = gj0Var.e;
                Size size = zg0Var.f;
                RectF rectF = y1i.a;
                if (rect.left == 0 && rect.top == 0) {
                    u72Var = u72Var2;
                    if (rect.width() == size.getWidth()) {
                        rect.height();
                        size.getHeight();
                    }
                } else {
                    u72Var = u72Var2;
                }
                ((w8b) j28Var.d).m(bh0Var2, Integer.valueOf(gj0Var.h));
            } else {
                u72Var = u72Var2;
            }
            j28Var.o(bn2Var.a.b);
            ((g9b) j28Var.f).a.put(strValueOf, Integer.valueOf(i3));
            ((g9b) j28Var.f).a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i2));
            j28Var.n(zg0Var.a);
            if (arrayList2.size() > 1 && (zc2Var = zg0Var.b) != null) {
                j28Var.n(zc2Var);
            }
            arrayList.add(j28Var.q());
            z = true;
            i = i3;
            g85Var2 = g85Var3;
            gl2Var = gl2Var;
            u72Var2 = u72Var;
        }
        int i5 = i;
        boolean z2 = z;
        fik fikVar = new fik(arrayList, 9, qmeVar);
        hjd hjdVar = new hjd(gl2Var, gj0Var, qmeVar, u72Var2, i2);
        g85 g85Var4 = this.c;
        g85Var4.getClass();
        wxl.a();
        ((zg0) g85Var4.e).j.accept(hjdVar);
        wxl.a();
        z58 z58Var = (z58) this.b.b;
        synchronized (z58Var.v) {
            try {
                if (z58Var.v.get() == null) {
                    z58Var.v.set(Integer.valueOf(z58Var.L()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z58 z58Var2 = (z58) this.b.b;
        wxl.a();
        bp2 bp2VarJ = o9b.j(z58Var2.f().m(arrayList, z58Var2.u, z58Var2.w), new due(new eu6(22)), zjl.a());
        o9b.a(bp2VarJ, new phf(this, 6, fikVar), zjl.d());
        wxl.a();
        if (qmeVar.i != null) {
            z2 = i5;
        }
        qyj.l("CaptureRequestFuture can only be set once.", z2);
        qmeVar.i = bp2VarJ;
    }
}
