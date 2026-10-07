package defpackage;

import java.util.ArrayList;
import java.util.Set;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class d32 {
    public static final Set o;
    public final jb1 a;
    public final CidLogger b;
    public final zfh c;
    public final vn7 d;
    public final ih e;
    public final esh f;
    public final n11 g;
    public final xva h;
    public final u3m i;
    public final pc8 j;
    public final jj0 k;
    public final g85 l;
    public final xtj m;
    public final so2 n;

    static {
        ma6 ma6Var = e32.c;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            arrayList.add(((e32) y1Var.next()).a);
        }
        o = ww3.X1(arrayList);
    }

    public d32(jb1 jb1Var, CidLogger cidLogger, zfh zfhVar, so2 so2Var, vn7 vn7Var, ih ihVar, esh eshVar, n11 n11Var, xt1 xt1Var) {
        eshVar.getClass();
        xt1Var.getClass();
        this.a = jb1Var;
        this.b = cidLogger;
        this.c = zfhVar;
        this.d = vn7Var;
        this.e = ihVar;
        this.f = eshVar;
        this.g = n11Var;
        this.h = new xva(29, false);
        v88 v88Var = xt1Var.r;
        this.i = v88Var.e0 ? new ec8() : new dc8();
        this.j = new pc8(cidLogger, v88Var.f0);
        jj0 jj0Var = new jj0();
        jj0Var.a = new uvc(20);
        jj0Var.b = new fi9();
        jj0Var.c = new fi9();
        jj0Var.d = new fi9();
        jj0Var.e = new fi9();
        jj0Var.f = new fi9();
        jj0Var.g = new uw(1);
        jj0Var.h = new uw(1);
        jj0Var.i = new uw(1);
        jj0Var.j = new ex8(29);
        this.k = jj0Var;
        g85 g85Var = new g85();
        g85Var.a = new uvc(20);
        g85Var.b = new ex8(29);
        g85Var.c = new uvc(20);
        g85Var.d = new fi9();
        g85Var.e = new fi9();
        this.l = g85Var;
        this.m = new xtj(9);
        this.n = new so2(28);
    }
}
