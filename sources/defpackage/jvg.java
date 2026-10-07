package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jvg extends a8j {
    public final oug c;
    public final et3 d;
    public final t3h e;
    public final tug f;
    public final mjg g;
    public final r8e h;
    public final mjg i;
    public final r8e j;
    public final mjg k;
    public final r8e l;
    public final mjg m;
    public final r8e n;
    public final mjg o;
    public final r8e p;
    public final mjg q;
    public final mjg r;
    public final r8e s;
    public final String t;
    public final r8e u;
    public final r8e v;
    public final r8e w;
    public final ic6 x;
    public final ic6 y;

    public jvg(vzg vzgVar, xhh xhhVar, oug ougVar, et3 et3Var, t3h t3hVar, tug tugVar) {
        this.c = ougVar;
        this.d = et3Var;
        this.e = t3hVar;
        this.f = tugVar;
        Boolean bool = Boolean.TRUE;
        mjg mjgVarA = p90.a(bool);
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(-1L);
        this.i = mjgVarA2;
        this.j = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(0);
        this.k = mjgVarA3;
        this.l = new r8e(mjgVarA3);
        mjg mjgVarA4 = p90.a(bool);
        this.m = mjgVarA4;
        this.n = new r8e(mjgVarA4);
        Boolean bool2 = Boolean.FALSE;
        mjg mjgVarA5 = p90.a(bool2);
        this.o = mjgVarA5;
        this.p = new r8e(mjgVarA5);
        mjg mjgVarA6 = p90.a(0);
        this.q = mjgVarA6;
        mjg mjgVarA7 = p90.a(bool2);
        this.r = mjgVarA7;
        r07 r07Var = new r07(mjgVarA6, mjgVarA7, new hvg(3, null), 0);
        dq4 dq4Var = this.b;
        a8g a8gVar = j0g.a;
        this.s = e9i.G0(r07Var, dq4Var, a8gVar, bool);
        this.t = jvg.class.getName();
        this.u = new r8e(p90.a(tugVar instanceof rug ? Long.valueOf(((rug) tugVar).c) : null));
        this.v = new r8e(p90.a(Boolean.valueOf(tugVar instanceof pug)));
        this.w = e9i.G0(e9i.T(new dab(vzgVar.j, this, 15), ((n0c) xhhVar).a()), this.b, a8gVar, r66.a);
        this.x = new ic6(null);
        this.y = new ic6(null);
    }

    public static final pkc B(jvg jvgVar) {
        tug tugVar = jvgVar.f;
        return new pkc(tugVar.x(), btl.b(tugVar.o()), (Long) jvgVar.u.a.getValue());
    }

    public static int D(long j, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((pkc) it.next()).getItemId() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void C() {
        a8j.x(this.x, rt3.b);
    }

    public final void E(long j) {
        Long lValueOf = Long.valueOf(j);
        mjg mjgVar = this.i;
        mjgVar.getClass();
        mjgVar.j(null, lValueOf);
        int iD = D(j, (List) this.w.a.getValue());
        Integer numValueOf = Integer.valueOf(iD);
        if (iD < 0) {
            numValueOf = null;
        }
        Integer numValueOf2 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0);
        mjg mjgVar2 = this.k;
        mjgVar2.getClass();
        mjgVar2.j(null, numValueOf2);
    }

    @Override // defpackage.a8j
    public final void y() {
        this.c.a = null;
    }
}
