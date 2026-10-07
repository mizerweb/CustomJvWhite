package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sse {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final String d = sse.class.getName();

    public sse(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    public static stc a(rtc rtcVar, String str) {
        return new stc(rtcVar.a, rtcVar.q(), rtcVar.i(), rtcVar.p(), str, rtcVar.r(), rtcVar.k(), rtcVar.m(), rtcVar.o(), rtcVar.h(), rtcVar.s());
    }

    public static rtc c(stc stcVar) {
        qtc qtcVar = new qtc();
        qtcVar.h(stcVar.e());
        qtcVar.k(stcVar.i());
        qtcVar.e(stcVar.b());
        qtcVar.j(stcVar.g());
        qtcVar.l(stcVar.j());
        qtcVar.f(stcVar.c());
        qtcVar.g(stcVar.d());
        qtcVar.i(stcVar.f());
        qtcVar.d(stcVar.a());
        qtcVar.m(qt4.D(stcVar.k()));
        return qtcVar.a();
    }

    public final nuc b() {
        return (nuc) this.a.getValue();
    }

    public final List d(List list) {
        sw swVar = new sw(1, list);
        qe7.k(500, 500);
        return yhf.w0(new kx6(new abg(swVar, 500, 500), new yre(1, this), new nre(2)));
    }
}
