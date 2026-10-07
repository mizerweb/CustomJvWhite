package defpackage;

import android.content.Context;
import android.util.Range;
import android.util.Rational;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class he2 {
    public static final ee2 K = new ee2();
    public final ia7 A;
    public final ia7 B;
    public final g8b C;
    public final vn7 D;
    public final vn7 E;
    public final vn7 F;
    public final HashSet G;
    public final Context H;
    public final HashMap I;
    public final long J;
    public fh2 a;
    public int b;
    public igd c;
    public dne d;
    public z58 e;
    public dne f;
    public ExecutorService g;
    public p48 h;
    public u48 i;
    public bui j;
    public fee k;
    public final HashMap l;
    public m1e m;
    public final fx5 n;
    public final fx5 o;
    public final Range p;
    public o09 q;
    public jid r;
    public b9j s;
    public hgd t;
    public final xtj u;
    public final de2 v;
    public int w;
    public final boolean x;
    public boolean y;
    public ch z;

    public he2(Context context) {
        iid iidVar = iid.b;
        bp2 bp2VarB = rkl.b(context);
        p51 p51Var = new p51(21);
        bp2 bp2VarJ = o9b.j(bp2VarB, new due(p51Var), zjl.a());
        this.a = fh2.c;
        this.b = 3;
        this.k = null;
        this.l = new HashMap();
        this.m = dee.q0;
        fx5 fx5Var = fx5.c;
        this.n = fx5Var;
        this.o = fx5Var;
        this.p = yi0.h;
        this.w = -1;
        this.x = true;
        this.y = true;
        this.A = new ia7();
        this.B = new ia7();
        g8b g8bVar = new g8b(new vih(0));
        this.C = g8bVar;
        p51 p51Var2 = new p51(22);
        nm9 nm9Var = new nm9(p51Var2.mo41apply(g8bVar.d()), p51Var2);
        g8b g8bVar2 = nm9Var.o;
        nm9Var.o = g8bVar;
        wxl.d(new d86(g8bVar2, nm9Var, g8bVar, 10));
        this.D = new vn7(24);
        this.E = new vn7(24);
        this.F = new vn7(24);
        this.G = new HashSet();
        this.I = new HashMap();
        this.J = 5000000000L;
        Context contextA = jq4.a(context);
        this.H = contextA;
        r48 r48Var = new r48(2);
        c(r48Var, this.d);
        r48Var.b.m(n68.u0, fx5Var);
        this.c = r48Var.b();
        this.e = e(null);
        this.i = d(null, null, null);
        this.j = g();
        p09 p09Var = (p09) this;
        de2 de2Var = new de2(p09Var);
        o9b.j(bp2VarJ, new due(de2Var), zjl.d());
        this.u = new xtj(contextA);
        this.v = new de2(p09Var);
    }

    public final void a(hgd hgdVar, b9j b9jVar) {
        wxl.a();
        if (this.t != hgdVar) {
            this.t = hgdVar;
            this.c.K(hgdVar);
        }
        boolean z = true;
        if (this.s != null) {
            int iJ = j(b9jVar);
            ww6 ww6Var = iJ != -1 ? new ww6(iJ, 1, (byte) 0) : null;
            int iJ2 = j(this.s);
            if (ww6Var == (iJ2 != -1 ? new ww6(iJ2, 1, (byte) 0) : null)) {
                z = false;
            }
        }
        this.s = b9jVar;
        xtj xtjVar = this.u;
        us7 us7VarD = zjl.d();
        de2 de2Var = this.v;
        synchronized (xtjVar.b) {
            if (((jue) xtjVar.c).canDetectOrientation()) {
                ((HashMap) xtjVar.d).put(de2Var, new lue(de2Var, us7VarD));
                ((jue) xtjVar.c).enable();
            } else {
                tvj.g("CameraController", "The device cannot detect rotation changes.");
            }
        }
        if (z) {
            u();
        }
        t(null);
    }

    public final void b() {
        wxl.a();
        jid jidVar = this.r;
        if (jidVar != null) {
            jidVar.a(this.c, this.e, this.i, this.j);
        }
        this.c.K(null);
        this.q = null;
        this.t = null;
        this.s = null;
        xtj xtjVar = this.u;
        de2 de2Var = this.v;
        synchronized (xtjVar.b) {
            try {
                lue lueVar = (lue) ((HashMap) xtjVar.d).get(de2Var);
                if (lueVar != null) {
                    lueVar.c.set(false);
                    ((HashMap) xtjVar.d).remove(de2Var);
                }
                if (((HashMap) xtjVar.d).isEmpty()) {
                    ((jue) xtjVar.c).disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(r48 r48Var, dne dneVar) {
        if (dneVar != null) {
            r48Var.d(dneVar);
            return;
        }
        b9j b9jVar = this.s;
        if (b9jVar != null) {
            int iJ = j(b9jVar);
            ww6 ww6Var = iJ != -1 ? new ww6(iJ, 1, (byte) 0) : null;
            if (ww6Var != null) {
                r48Var.d(new dne(ww6Var, null, null));
            }
        }
    }

    public final u48 d(Integer num, Integer num2, Integer num3) {
        r48 r48Var = new r48(0);
        w8b w8bVar = r48Var.b;
        if (num != null) {
            w8bVar.m(y48.b, num);
        }
        if (num2 != null) {
            w8bVar.m(y48.c, num2);
        }
        if (num3 != null) {
            w8bVar.m(y48.e, num3);
        }
        c(r48Var, null);
        int i = this.w;
        if (i != -1) {
            w8bVar.m(v68.w0, Integer.valueOf(i));
        }
        y48 y48Var = new y48(dhc.a(w8bVar));
        v68.x(y48Var);
        return new u48(y48Var);
    }

    public final z58 e(Integer num) {
        r48 r48Var = new r48(1);
        w8b w8bVar = r48Var.b;
        if (num != null) {
            w8bVar.m(a68.b, num);
        }
        c(r48Var, this.f);
        int i = this.w;
        if (i != -1) {
            w8bVar.m(v68.w0, Integer.valueOf(i));
        }
        return r48Var.a();
    }

    public final kr6 f() {
        if (this.r == null) {
            tvj.a("CameraController", "Camera not initialized.");
            return null;
        }
        if (this.t == null || this.s == null) {
            tvj.a("CameraController", "PreviewView not attached to CameraController.");
            return null;
        }
        v();
        imi imiVar = new imi();
        imiVar.a(this.c);
        wxl.a();
        if ((this.b & 1) != 0) {
            imiVar.a(this.e);
        }
        wxl.a();
        if ((this.b & 2) != 0) {
            imiVar.a(this.i);
        }
        wxl.a();
        if ((this.b & 4) != 0) {
            imiVar.a(this.j);
        }
        imiVar.a = this.s;
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            imiVar.c.add((xxi) it.next());
        }
        return imiVar.b();
    }

    public final bui g() {
        int iJ;
        ude udeVar = dee.u0;
        vde vdeVar = dee.w0;
        ahc ahcVar = dee.x0;
        o5a o5aVar = dee.s0;
        o5aVar.getClass();
        n4j n4jVar = n4j.e;
        n4j n4jVar2 = n4j.e;
        n4j n4jVar3 = o5aVar.a;
        xb0 xb0Var = o5aVar.b;
        int i = o5aVar.c;
        m1e m1eVar = this.m;
        qyj.k(m1eVar, "The specified quality selector can't be null.");
        n4j n4jVar4 = n4j.e;
        n4j n4jVar5 = new n4j(m1eVar, n4jVar3.b, n4jVar3.c, n4jVar3.d);
        b9j b9jVar = this.s;
        if (b9jVar != null && this.m == dee.q0 && (iJ = j(b9jVar)) != -1) {
            n4jVar5 = new n4j(n4jVar5.a, n4jVar5.b, iJ, n4jVar5.d);
        }
        r48 r48Var = new r48(new dee(null, new o5a(n4jVar5, xb0Var, i), udeVar, udeVar, vdeVar, ahcVar, -1L));
        Range range = this.p;
        bh0 bh0Var = cmi.b1;
        w8b w8bVar = r48Var.b;
        w8bVar.m(bh0Var, range);
        w8bVar.m(v68.y0, 0);
        w8bVar.m(n68.u0, this.n);
        int i2 = this.w;
        if (i2 != -1) {
            w8bVar.m(v68.w0, Integer.valueOf(i2));
        }
        return new bui(new cui(dhc.a(w8bVar)));
    }

    public final e89 h(boolean z) {
        wxl.a();
        if (k()) {
            return ((be2) ((ia) this.q.r()).d).j(z);
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        vn7 vn7Var = this.D;
        vn7Var.getClass();
        wxl.a();
        return f55.m(new fv9(vn7Var, 20, boolValueOf));
    }

    public final f4f i() {
        HashMap map = this.I;
        e4f e4fVar = e4f.b;
        if (map.get(e4fVar) != null) {
            return (f4f) map.get(e4fVar);
        }
        e4f e4fVar2 = e4f.a;
        if (map.get(e4fVar2) != null) {
            return (f4f) map.get(e4fVar2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba A[RETURN] */
    public final int j(b9j b9jVar) {
        int iD;
        String string;
        boolean z;
        int iB;
        Rational rational;
        int iC = b9jVar == null ? 0 : njl.c(b9jVar.c);
        try {
            jid jidVar = this.r;
            if (jidVar != null) {
                nf2 nf2Var = jidVar.a.a.p(this.a).a;
                iD = nf2Var.d();
                try {
                    if (nf2Var.j() != 1) {
                        z = false;
                    }
                } catch (IllegalArgumentException e) {
                    e = e;
                    fh2 fh2Var = this.a;
                    if (fh2Var == null) {
                        string = "null";
                    } else {
                        StringBuilder sb = new StringBuilder("CameraSelector{");
                        Integer numB = fh2Var.b();
                        if (numB != null) {
                            int iIntValue = numB.intValue();
                            if (iIntValue == 0) {
                                sb.append("lensFacing=FRONT");
                            } else if (iIntValue == 1) {
                                sb.append("lensFacing=BACK");
                            } else if (iIntValue != 2) {
                                sb.append("lensFacing=UNKNOWN(");
                                sb.append(numB);
                                sb.append(")");
                            } else {
                                sb.append("lensFacing=EXTERNAL");
                            }
                        } else {
                            sb.append("lensFacing=NOT_SPECIFIED");
                        }
                        sb.append("}");
                        string = sb.toString();
                    }
                    tvj.i("CameraController", "Failed to retrieve CameraInfo for selector: ".concat(string), e);
                }
                iB = njl.b(iC, iD, z);
                rational = b9jVar.b;
                if (iB != 90 || iB == 270) {
                    rational = new Rational(rational.getDenominator(), rational.getNumerator());
                }
                if (rational.equals(ix.a)) {
                    return 0;
                }
                if (rational.equals(ix.c)) {
                    return 1;
                }
                return -1;
            }
            iD = 0;
        } catch (IllegalArgumentException e2) {
            e = e2;
            iD = 0;
        }
        z = true;
        iB = njl.b(iC, iD, z);
        rational = b9jVar.b;
        if (iB != 90) {
            rational = new Rational(rational.getDenominator(), rational.getNumerator());
        } else {
            rational = new Rational(rational.getDenominator(), rational.getNumerator());
        }
        if (rational.equals(ix.a)) {
            return 0;
        }
        if (rational.equals(ix.c)) {
            return 1;
        }
        return -1;
    }

    public final boolean k() {
        return this.q != null;
    }

    public final void l(Integer num, Integer num2, Integer num3, boolean z) {
        p48 p48Var;
        wxl.a();
        if (z) {
            v();
        }
        u48 u48VarD = d(num, num2, num3);
        this.i = u48VarD;
        ExecutorService executorService = this.g;
        if (executorService == null || (p48Var = this.h) == null) {
            return;
        }
        u48VarD.N(executorService, p48Var);
    }

    public final void m(p48 p48Var, p48 p48Var2) {
        if (Objects.equals(p48Var == null ? null : p48Var.b(), p48Var2 == null ? null : p48Var2.b())) {
            return;
        }
        Integer num = (Integer) ((y48) this.i.i).b(y48.b, 0);
        num.intValue();
        l(num, Integer.valueOf(this.i.K()), Integer.valueOf(this.i.L()), true);
        t(null);
    }

    public final void n(fh2 fh2Var) {
        wxl.a();
        if (this.a == fh2Var) {
            return;
        }
        z58 z58Var = this.e;
        Integer numB = fh2Var.b();
        if (z58Var.L() == 3 && numB != null && numB.intValue() != 0) {
            ore.k("Not a front camera despite setting FLASH_MODE_SCREEN");
            return;
        }
        fh2 fh2Var2 = this.a;
        this.a = fh2Var;
        jid jidVar = this.r;
        if (jidVar == null) {
            return;
        }
        jidVar.a(this.c, this.e, this.i, this.j);
        t(new f92((p09) this, 4, fh2Var2));
    }

    public final void o(int i) {
        wxl.a();
        int i2 = this.b;
        if (i == i2) {
            return;
        }
        this.b = i;
        wxl.a();
        if ((this.b & 4) == 0) {
            wxl.a();
            fee feeVar = this.k;
            if (feeVar != null && !feeVar.a.get()) {
                wxl.a();
                fee feeVar2 = this.k;
                if (feeVar2 != null) {
                    feeVar2.close();
                    this.k = null;
                }
            }
        }
        t(new q31((p09) this, i2, i, 1));
    }

    public final void p(int i) {
        wxl.a();
        if (i == 3) {
            Integer numB = this.a.b();
            if (numB != null && numB.intValue() != 0) {
                ore.p("Not a front camera despite setting FLASH_MODE_SCREEN");
                return;
            }
            w();
        }
        z58 z58Var = this.e;
        z58Var.getClass();
        tvj.a("ImageCapture", "setFlashMode: flashMode = " + i);
        if (i != 0 && i != 1 && i != 2) {
            if (i != 3) {
                ore.p(zo5.h(i, "Invalid flash mode: "));
                return;
            }
            if (z58Var.z.a == null) {
                ore.p("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return;
            } else if (z58Var.e() != null) {
                pf2 pf2VarE = z58Var.e();
                if ((pf2VarE != null ? pf2VarE.a().j() : -1) != 0) {
                    ore.p("Not a front camera despite setting FLASH_MODE_SCREEN");
                    return;
                }
            }
        }
        synchronized (z58Var.v) {
            z58Var.x = i;
            z58Var.P();
        }
    }

    public final void q(m1e m1eVar) {
        wxl.a();
        this.m = m1eVar;
        v();
        this.j = g();
        t(null);
    }

    public final e89 r(float f) {
        wxl.a();
        if (k()) {
            return ((be2) ((ia) this.q.r()).d).f(f);
        }
        Float fValueOf = Float.valueOf(f);
        vn7 vn7Var = this.F;
        vn7Var.getClass();
        wxl.a();
        return f55.m(new fv9(vn7Var, 20, fValueOf));
    }

    public abstract o09 s();

    public final void t(Runnable runnable) {
        e89 e89VarD;
        a8a a8aVar;
        a8a a8aVar2;
        try {
            this.q = s();
            if (!k()) {
                tvj.a("CameraController", "Use cases not attached to camera.");
                return;
            }
            b99 b99VarH = ((ja) this.q.a()).b.H();
            ia7 ia7Var = this.A;
            b99 b99Var = ia7Var.m;
            if (b99Var != null && (a8aVar2 = (a8a) ia7Var.l.b(b99Var)) != null) {
                a8aVar2.a.j(a8aVar2);
            }
            ia7Var.m = b99VarH;
            ia7Var.l(b99VarH, new t07(1, ia7Var));
            b99 b99VarU = ((ja) this.q.a()).b.u();
            ia7 ia7Var2 = this.B;
            b99 b99Var2 = ia7Var2.m;
            if (b99Var2 != null && (a8aVar = (a8a) ia7Var2.l.b(b99Var2)) != null) {
                a8aVar.a.j(a8aVar);
            }
            ia7Var2.m = b99VarU;
            ia7Var2.l(b99VarU, new t07(1, ia7Var2));
            vn7 vn7Var = this.D;
            vn7Var.getClass();
            wxl.a();
            amc amcVar = (amc) vn7Var.b;
            if (amcVar != null) {
                e89 e89VarH = h(((Boolean) amcVar.b).booleanValue());
                r72 r72Var = (r72) ((amc) vn7Var.b).a;
                Objects.requireNonNull(r72Var);
                o9b.h(e89VarH, r72Var);
                vn7Var.b = null;
            }
            vn7 vn7Var2 = this.E;
            vn7Var2.getClass();
            wxl.a();
            amc amcVar2 = (amc) vn7Var2.b;
            if (amcVar2 != null) {
                Float f = (Float) amcVar2.b;
                float fFloatValue = f.floatValue();
                wxl.a();
                if (k()) {
                    e89VarD = ((be2) ((ia) this.q.r()).d).d(fFloatValue);
                } else {
                    wxl.a();
                    e89VarD = f55.m(new fv9(vn7Var2, 20, f));
                }
                r72 r72Var2 = (r72) ((amc) vn7Var2.b).a;
                Objects.requireNonNull(r72Var2);
                o9b.h(e89VarD, r72Var2);
                vn7Var2.b = null;
            }
            vn7 vn7Var3 = this.F;
            vn7Var3.getClass();
            wxl.a();
            amc amcVar3 = (amc) vn7Var3.b;
            if (amcVar3 != null) {
                e89 e89VarR = r(((Float) amcVar3.b).floatValue());
                r72 r72Var3 = (r72) ((amc) vn7Var3.b).a;
                Objects.requireNonNull(r72Var3);
                o9b.h(e89VarR, r72Var3);
                vn7Var3.b = null;
            }
        } catch (RuntimeException e) {
            if (runnable != null) {
                runnable.run();
            }
            throw e;
        }
    }

    public final void u() {
        v();
        r48 r48Var = new r48(2);
        c(r48Var, this.d);
        r48Var.b.m(n68.u0, this.o);
        igd igdVarB = r48Var.b();
        this.c = igdVarB;
        hgd hgdVar = this.t;
        if (hgdVar != null) {
            igdVarB.K(hgdVar);
        }
        wxl.a();
        Integer numValueOf = Integer.valueOf(this.e.u);
        int iL = this.e.L();
        this.e = e(numValueOf);
        p(iL);
        Integer num = (Integer) ((y48) this.i.i).b(y48.b, 0);
        num.intValue();
        l(num, Integer.valueOf(this.i.K()), Integer.valueOf(this.i.L()), false);
        this.j = g();
    }

    public final void v() {
        jid jidVar = this.r;
        if (jidVar != null) {
            jidVar.a(this.c, this.e, this.i, this.j);
        }
    }

    public final void w() {
        f4f f4fVarI = i();
        if (f4fVarI == null) {
            tvj.a("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            z58 z58Var = this.e;
            z58Var.getClass();
            i4f i4fVar = new i4f(K);
            z58Var.z = i4fVar;
            z58Var.f().h(i4fVar);
            return;
        }
        z58 z58Var2 = this.e;
        x58 x58Var = f4fVarI.b;
        z58Var2.getClass();
        i4f i4fVar2 = new i4f(x58Var);
        z58Var2.z = i4fVar2;
        z58Var2.f().h(i4fVar2);
        tvj.a("CameraController", "Set ScreenFlash instance to ImageCapture, provided by " + f4fVarI.a.name());
    }
}
