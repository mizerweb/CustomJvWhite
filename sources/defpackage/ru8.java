package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
public class ru8 implements ot8, u76, x74 {
    public final ArrayList a;
    public final qs8 b;
    public final cf7 c;
    public final at8 d;
    public String e;
    public String f;
    public final /* synthetic */ int g;
    public Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ru8(qs8 qs8Var, cf7 cf7Var, int i) {
        this(qs8Var, cf7Var, (char) 0);
        this.g = i;
        switch (i) {
            case 1:
                this(qs8Var, cf7Var, (char) 0);
                this.h = new LinkedHashMap();
                break;
            case 2:
                this(qs8Var, cf7Var, (char) 0);
                this.h = new ArrayList();
                break;
            default:
                this.a.add("primitive");
                break;
        }
    }

    @Override // defpackage.u76
    public final void A(int i) {
        K(kt8.b(Integer.valueOf(i)), (String) J());
    }

    @Override // defpackage.x74
    public final boolean B() {
        return this.d.a;
    }

    @Override // defpackage.u76
    public final void C(String str) {
        K(kt8.c(str), (String) J());
    }

    @Override // defpackage.x74
    public final void D(fif fifVar, int i, float f) {
        G(I(fifVar, i), f);
    }

    public final void E(fif fifVar, int i, aw8 aw8Var, Object obj) {
        this.a.add(I(fifVar, i));
        wvl.b(this, aw8Var, obj);
    }

    public final void F(Object obj, double d) {
        String str = (String) obj;
        K(kt8.b(Double.valueOf(d)), str);
        this.d.getClass();
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new JsonEncodingException(xd2.n(Double.valueOf(d), str, H().toString()));
        }
    }

    public final void G(Object obj, float f) {
        String str = (String) obj;
        K(kt8.b(Float.valueOf(f)), str);
        this.d.getClass();
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw new JsonEncodingException(xd2.n(Float.valueOf(f), str, H().toString()));
        }
    }

    public jt8 H() {
        switch (this.g) {
            case 0:
                jt8 jt8Var = (jt8) this.h;
                if (jt8Var != null) {
                    return jt8Var;
                }
                ore.p("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new cu8((LinkedHashMap) this.h);
            default:
                return new ss8((ArrayList) this.h);
        }
    }

    public final String I(fif fifVar, int i) {
        String strValueOf;
        switch (this.g) {
            case 2:
                strValueOf = String.valueOf(i);
                break;
            default:
                oc9.U(this.b, fifVar);
                strValueOf = fifVar.f(i);
                break;
        }
        return strValueOf;
    }

    public final Object J() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(xw3.O0(arrayList));
    }

    public void K(jt8 jt8Var, String str) {
        switch (this.g) {
            case 0:
                if (str != "primitive") {
                    ore.p("This output can only consume primitives with 'primitive' tag");
                } else if (((jt8) this.h) != null) {
                    ore.p("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                } else {
                    this.h = jt8Var;
                    this.c.invoke(jt8Var);
                }
                break;
            case 1:
                ((LinkedHashMap) this.h).put(str, jt8Var);
                break;
            default:
                ((ArrayList) this.h).add(Integer.parseInt(str), jt8Var);
                break;
        }
    }

    @Override // defpackage.u76
    public final x74 a(fif fifVar) {
        ru8 ru8Var;
        cf7 mVar = ww3.D1(this.a) == null ? this.c : new m(2, this);
        lvb lvbVarD = fifVar.d();
        boolean zD = cqk.d(lvbVarD, c6h.g);
        qs8 qs8Var = this.b;
        if (zD || (lvbVarD instanceof tad)) {
            ru8Var = new ru8(qs8Var, mVar, 2);
        } else if (cqk.d(lvbVarD, c6h.h)) {
            fif fifVarL = lvb.L(qs8Var.b, fifVar.h(0));
            lvb lvbVarD2 = fifVarL.d();
            if (!(lvbVarD2 instanceof rhd) && !cqk.d(lvbVarD2, lif.f)) {
                throw xd2.c(fifVarL);
            }
            gv8 gv8Var = new gv8(qs8Var, mVar, 1);
            gv8Var.j = true;
            ru8Var = gv8Var;
        } else {
            ru8Var = new ru8(qs8Var, mVar, 1);
        }
        String str = this.e;
        if (str != null) {
            if (ru8Var instanceof gv8) {
                gv8 gv8Var2 = (gv8) ru8Var;
                gv8Var2.K(kt8.c(str), "key");
                String strI = this.f;
                if (strI == null) {
                    strI = fifVar.i();
                }
                gv8Var2.K(kt8.c(strI), SdkMetricStatEvent.VALUE_KEY);
            } else {
                String strI2 = this.f;
                if (strI2 == null) {
                    strI2 = fifVar.i();
                }
                ru8Var.K(kt8.c(strI2), str);
            }
            this.e = null;
            this.f = null;
        }
        return ru8Var;
    }

    @Override // defpackage.u76
    public final khb b() {
        return this.b.b;
    }

    @Override // defpackage.x74
    public final void c() {
        if (!this.a.isEmpty()) {
            J();
        }
        this.c.invoke(H());
    }

    @Override // defpackage.u76
    public final void d(double d) {
        F(J(), d);
    }

    @Override // defpackage.x74
    public final void e(fif fifVar, int i, long j) {
        K(kt8.b(Long.valueOf(j)), I(fifVar, i));
    }

    @Override // defpackage.u76
    public final void f(byte b) {
        K(kt8.b(Byte.valueOf(b)), (String) J());
    }

    @Override // defpackage.u76
    public final u76 g(fif fifVar) {
        ArrayList arrayList = this.a;
        if (ww3.D1(arrayList) == null) {
            return new ru8(this.b, this.c, 0).g(fifVar);
        }
        if (this.e != null) {
            this.f = fifVar.i();
        }
        String str = (String) J();
        if (z4h.b(fifVar)) {
            return new w1(this, str);
        }
        if (z4h.a(fifVar)) {
            return new w1(this, str, fifVar);
        }
        arrayList.add(str);
        return this;
    }

    @Override // defpackage.x74
    public final void h(fif fifVar, int i, boolean z) {
        K(kt8.a(Boolean.valueOf(z)), I(fifVar, i));
    }

    @Override // defpackage.x74
    public final void i(fif fifVar, int i, aw8 aw8Var, Object obj) {
        this.a.add(I(fifVar, i));
        t(aw8Var, obj);
    }

    @Override // defpackage.x74
    public final void j(fif fifVar, int i, double d) {
        F(I(fifVar, i), d);
    }

    @Override // defpackage.x74
    public final void k(nhd nhdVar, int i, byte b) {
        K(kt8.b(Byte.valueOf(b)), I(nhdVar, i));
    }

    @Override // defpackage.u76
    public final void l(fif fifVar, int i) {
        K(kt8.c(fifVar.f(i)), (String) J());
    }

    @Override // defpackage.x74
    public final void m(nhd nhdVar, int i, short s) {
        K(kt8.b(Short.valueOf(s)), I(nhdVar, i));
    }

    @Override // defpackage.x74
    public final void n(fif fifVar, int i, String str) {
        K(kt8.c(str), I(fifVar, i));
    }

    @Override // defpackage.x74
    public void o(fif fifVar, int i, aw8 aw8Var, Object obj) {
        switch (this.g) {
            case 1:
                if (obj != null || this.d.d) {
                    E(fifVar, i, aw8Var, obj);
                }
                break;
            default:
                E(fifVar, i, aw8Var, obj);
                break;
        }
    }

    @Override // defpackage.u76
    public final void p(long j) {
        K(kt8.b(Long.valueOf(j)), (String) J());
    }

    @Override // defpackage.x74
    public final u76 q(nhd nhdVar, int i) {
        String strI = I(nhdVar, i);
        fif fifVarH = nhdVar.h(i);
        if (z4h.b(fifVarH)) {
            return new w1(this, strI);
        }
        if (z4h.a(fifVarH)) {
            return new w1(this, strI, fifVarH);
        }
        this.a.add(strI);
        return this;
    }

    @Override // defpackage.u76
    public final x74 r(fif fifVar, int i) {
        return a(fifVar);
    }

    @Override // defpackage.u76
    public final void s() {
        String str = (String) ww3.D1(this.a);
        if (str == null) {
            this.c.invoke(zt8.INSTANCE);
        } else {
            K(zt8.INSTANCE, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    @Override // defpackage.u76
    public final void t(aw8 aw8Var, Object obj) {
        String strA;
        Object objD1 = ww3.D1(this.a);
        qs8 qs8Var = this.b;
        if (objD1 == null) {
            fif fifVarL = lvb.L(qs8Var.b, aw8Var.d());
            if ((fifVarL.d() instanceof rhd) || fifVarL.d() == lif.f) {
                new ru8(qs8Var, this.c, 0).t(aw8Var, obj);
                return;
            }
        }
        boolean z = aw8Var instanceof f3;
        int i = qs8Var.a.i;
        if (!z) {
            int iD = qt4.D(i);
            if (iD != 0) {
                if (iD == 1) {
                    lvb lvbVarD = aw8Var.d().d();
                    if (cqk.d(lvbVarD, c6h.f) || cqk.d(lvbVarD, d6h.f)) {
                        strA = tjl.a(qs8Var, aw8Var.d());
                    }
                } else if (iD != 2) {
                    ore.o();
                    return;
                }
            }
            strA = null;
        } else if (i != 1) {
            strA = tjl.a(qs8Var, aw8Var.d());
        } else {
            strA = null;
        }
        if (z) {
            f3 f3Var = (f3) aw8Var;
            if (obj == null) {
                ore.d(((uad) f3Var).d(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            } else {
                wjl.b(f3Var, this, obj);
                throw null;
            }
        }
        if (strA != null) {
            String strI = aw8Var.d().i();
            this.e = strA;
            this.f = strI;
        }
        aw8Var.a(this, obj);
    }

    @Override // defpackage.u76
    public final void u(short s) {
        K(kt8.b(Short.valueOf(s)), (String) J());
    }

    @Override // defpackage.u76
    public final void v(boolean z) {
        K(kt8.a(Boolean.valueOf(z)), (String) J());
    }

    @Override // defpackage.u76
    public final void w(float f) {
        G(J(), f);
    }

    @Override // defpackage.u76
    public final void x(char c) {
        K(kt8.c(String.valueOf(c)), (String) J());
    }

    @Override // defpackage.x74
    public final void y(int i, int i2, fif fifVar) {
        K(kt8.b(Integer.valueOf(i2)), I(fifVar, i));
    }

    @Override // defpackage.x74
    public final void z(nhd nhdVar, int i, char c) {
        K(kt8.c(String.valueOf(c)), I(nhdVar, i));
    }

    public ru8(qs8 qs8Var, cf7 cf7Var, char c) {
        this.a = new ArrayList();
        this.b = qs8Var;
        this.c = cf7Var;
        this.d = qs8Var.a;
    }
}
