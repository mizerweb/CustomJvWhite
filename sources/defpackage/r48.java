package defpackage;

import android.os.Build;
import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class r48 implements bmi {
    public final /* synthetic */ int a;
    public final w8b b;

    public r48(w8b w8bVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = w8bVar;
                bh0 bh0Var = wih.T0;
                Class cls = (Class) w8bVar.b(bh0Var, null);
                if (cls != null && !cls.equals(z58.class)) {
                    c.v("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                w8bVar.m(cmi.g1, emi.a);
                w8bVar.m(bh0Var, z58.class);
                bh0 bh0Var2 = wih.S0;
                if (w8bVar.b(bh0Var2, null) == null) {
                    w8bVar.m(bh0Var2, z58.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.b = w8bVar;
                bh0 bh0Var3 = wih.T0;
                Class cls2 = (Class) w8bVar.b(bh0Var3, null);
                if (cls2 != null && !cls2.equals(igd.class)) {
                    c.v("Invalid target class configuration for ", this, ": ", cls2);
                    throw null;
                }
                w8bVar.m(cmi.g1, emi.b);
                w8bVar.m(bh0Var3, igd.class);
                bh0 bh0Var4 = wih.S0;
                if (w8bVar.b(bh0Var4, null) == null) {
                    w8bVar.m(bh0Var4, igd.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                bh0 bh0Var5 = v68.y0;
                if (((Integer) w8bVar.b(bh0Var5, -1)).intValue() == -1) {
                    w8bVar.m(bh0Var5, 2);
                    return;
                }
                return;
            case 3:
                this.b = w8bVar;
                if (!w8bVar.a.containsKey(cui.b)) {
                    ore.p("VideoOutput is required");
                    throw null;
                }
                bh0 bh0Var6 = wih.T0;
                Class cls3 = (Class) w8bVar.b(bh0Var6, null);
                if (cls3 != null && !cls3.equals(bui.class)) {
                    c.v("Invalid target class configuration for ", this, ": ", cls3);
                    throw null;
                }
                w8bVar.m(cmi.g1, emi.d);
                w8bVar.m(bh0Var6, bui.class);
                bh0 bh0Var7 = wih.S0;
                if (w8bVar.b(bh0Var7, null) == null) {
                    w8bVar.m(bh0Var7, bui.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.b = w8bVar;
                bh0 bh0Var8 = wih.T0;
                Class cls4 = (Class) w8bVar.b(bh0Var8, null);
                if (cls4 != null && !cls4.equals(u48.class)) {
                    c.v("Invalid target class configuration for ", this, ": ", cls4);
                    throw null;
                }
                w8bVar.m(cmi.g1, emi.c);
                w8bVar.m(bh0Var8, u48.class);
                bh0 bh0Var9 = wih.S0;
                if (w8bVar.b(bh0Var9, null) == null) {
                    w8bVar.m(bh0Var9, u48.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    public z58 a() {
        Integer numValueOf = Integer.valueOf(np0.n);
        bh0 bh0Var = a68.e;
        w8b w8bVar = this.b;
        Integer num = (Integer) w8bVar.b(bh0Var, null);
        if (num != null) {
            w8bVar.m(n68.s0, num);
        } else {
            w58 w58Var = z58.F;
            bh0 bh0Var2 = a68.f;
            if (Objects.equals(w8bVar.b(bh0Var2, null), 2)) {
                w8bVar.m(n68.s0, 32);
            } else if (Objects.equals(w8bVar.b(bh0Var2, null), 3)) {
                w8bVar.m(n68.s0, 32);
                w8bVar.m(n68.t0, numValueOf);
            } else if (Objects.equals(w8bVar.b(bh0Var2, null), 1)) {
                w8bVar.m(n68.s0, 4101);
                w8bVar.m(n68.u0, fx5.c);
            } else {
                w8bVar.m(n68.s0, numValueOf);
            }
        }
        a68 a68Var = new a68(dhc.a(w8bVar));
        v68.x(a68Var);
        z58 z58Var = new z58(a68Var);
        Size size = (Size) w8bVar.b(v68.z0, null);
        if (size != null) {
            z58Var.y = new Rational(size.getWidth(), size.getHeight());
        }
        qyj.k((Executor) w8bVar.b(vm8.G0, zjl.c()), "The IO executor can't be null");
        bh0 bh0Var3 = a68.c;
        if (w8bVar.a.containsKey(bh0Var3)) {
            Integer num2 = (Integer) w8bVar.i(bh0Var3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                ore.p(qv1.j("The flash mode is not allowed to set: ", num2));
                return null;
            }
            if (num2.intValue() == 3 && w8bVar.b(a68.k, null) == null) {
                ore.p("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return null;
            }
        }
        return z58Var;
    }

    public igd b() {
        ugd ugdVar = new ugd(dhc.a(this.b));
        v68.x(ugdVar);
        igd igdVar = new igd(ugdVar);
        igdVar.v = igd.D;
        return igdVar;
    }

    public void c() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.b.m(v68.y0, 2);
        }
    }

    public final Object d(dne dneVar) {
        switch (this.a) {
            case 0:
                this.b.m(v68.D0, dneVar);
                break;
            case 1:
                this.b.m(v68.D0, dneVar);
                break;
            case 2:
                this.b.m(v68.D0, dneVar);
                break;
            default:
                this.b.m(v68.D0, dneVar);
                break;
        }
        return this;
    }

    @Override // defpackage.ph6
    public final w8b g() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }

    @Override // defpackage.bmi
    public final cmi q() {
        int i = this.a;
        w8b w8bVar = this.b;
        switch (i) {
            case 0:
                return new y48(dhc.a(w8bVar));
            case 1:
                return new a68(dhc.a(w8bVar));
            case 2:
                return new ugd(dhc.a(w8bVar));
            default:
                return new cui(dhc.a(w8bVar));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r48(int i) {
        this(w8b.e(), 0);
        this.a = i;
        switch (i) {
            case 1:
                this(w8b.e(), 1);
                break;
            case 2:
                this(w8b.e(), 2);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r48(u2j u2jVar) {
        this.a = 3;
        w8b w8bVarE = w8b.e();
        w8bVarE.m(cui.b, u2jVar);
        w8bVarE.m(cmi.j1, Boolean.valueOf(u2jVar.e()));
        this(w8bVarE, 3);
    }
}
