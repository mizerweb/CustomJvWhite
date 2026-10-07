package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zic {
    public final long a;
    public final String b;
    public final b50 c;
    public final bjc d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final ng5 h;
    public final eka i;

    public zic(s60 s60Var) {
        this.a = s60Var.a;
        this.b = s60Var.b;
        this.c = (b50) s60Var.e;
        this.d = (bjc) s60Var.f;
        this.e = s60Var.c;
        this.f = s60Var.d;
        this.g = (List) s60Var.g;
        this.h = (ng5) s60Var.h;
        this.i = (eka) s60Var.i;
    }

    public final mw a() {
        mw mwVar = new mw(0);
        mwVar.put("cid", Long.valueOf(this.a));
        String str = this.b;
        if (!ch3.r(str)) {
            mwVar.put("text", str);
        }
        mwVar.put("detectShare", Boolean.valueOf(this.e));
        b50 b50Var = this.c;
        if (b50Var != null && b50Var.size() > 0) {
            mwVar.put("attaches", b50Var);
        }
        bjc bjcVar = this.d;
        if (bjcVar != null) {
            mwVar.put("link", bjcVar);
        }
        mwVar.put("isLive", Boolean.valueOf(this.f));
        List list = this.g;
        if (list != null) {
            mwVar.put("elements", list);
        }
        ng5 ng5Var = this.h;
        if (ng5Var != null) {
            mwVar.put("delayedAttributes", ng5Var.c());
        }
        eka ekaVar = this.i;
        if (ekaVar != null) {
            mwVar.put("type", ekaVar.a);
        }
        return mwVar;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        int iO = tre.O(this.g);
        StringBuilder sbT = qt4.t(this.a, "OutgoingMessage{cid=", ", text=", "***");
        nbh.G(sbT, ", attaches=", strValueOf, ", link=", strValueOf2);
        qv1.v(", detectShare=", ", live='", sbT, this.e, this.f);
        return qv1.o(sbT, "', elements=", iO, "}");
    }
}
