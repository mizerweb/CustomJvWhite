package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gge extends sb8 {
    public final boolean l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final String p = gge.class.getName();

    public gge(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, boolean z) {
        this.l = z;
        this.m = ny8Var;
        this.n = ny8Var2;
        this.o = ny8Var3;
    }

    public static final ylc w0(gge ggeVar, usb usbVar, Uri uri) {
        whd whdVar;
        ggeVar.getClass();
        w78 w78VarB = w78.b(usbVar.b.a);
        uri.getClass();
        w78VarB.a = uri;
        v78 v78VarA = w78VarB.a();
        es0 es0Var = usbVar.b;
        String str = es0Var.b;
        pjd pjdVar = es0Var.c;
        Object obj = es0Var.d;
        u78 u78Var = es0Var.e;
        boolean zG = es0Var.g();
        boolean zF = es0Var.f();
        synchronized (es0Var) {
            whdVar = es0Var.h;
        }
        oof oofVar = new oof(v78VarA, str, null, pjdVar, obj, u78Var, zG, zF, whdVar, es0Var.l);
        t68 t68VarX0 = ggeVar.x0();
        lq0 lq0Var = usbVar.a;
        t68VarX0.getClass();
        return new ylc(oofVar, new usb(lq0Var, oofVar));
    }

    @Override // defpackage.sb8
    public final Map E(ep6 ep6Var, int i) {
        return x0().E((usb) ep6Var, i);
    }

    @Override // defpackage.sb8
    public final void V(ep6 ep6Var, int i) {
        x0().getClass();
        ((usb) ep6Var).f = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.sb8
    public final ep6 m(lq0 lq0Var, es0 es0Var) {
        x0().getClass();
        return new usb(lq0Var, es0Var);
    }

    @Override // defpackage.sb8
    public final void v(ep6 ep6Var, qg7 qg7Var) {
        usb usbVar = (usb) ep6Var;
        if (this.l) {
            y0(usbVar, qg7Var, true);
        } else {
            x0().v(usbVar, qg7Var);
        }
    }

    public final t68 x0() {
        return (t68) this.m.getValue();
    }

    public final void y0(usb usbVar, qg7 qg7Var, boolean z) {
        es0 es0Var = usbVar.b;
        Object obj = es0Var.d;
        q78 q78Var = obj instanceof q78 ? (q78) obj : null;
        if (q78Var == null) {
            x0().v(usbVar, qg7Var);
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        wfe wfeVar = new wfe();
        q78 q78Var2 = q78Var;
        mkc mkcVar = new mkc(atomicBoolean, qg7Var, z, this, usbVar, q78Var2);
        if (((dge) this.n.getValue()).c(es0Var.a.b)) {
            es0Var.a(new ege(atomicBoolean, wfeVar, yab.i0((wmi) this.o.getValue(), null, 0, new fge(usbVar, this, q78Var2, qg7Var, mkcVar, wfeVar, atomicBoolean, null), 3)));
        } else {
            x0().v(usbVar, mkcVar);
        }
    }
}
