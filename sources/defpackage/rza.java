package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rza {
    public final l3c a;
    public final String b = rza.class.getName();
    public final dq4 c;

    public rza(xhh xhhVar, l3c l3cVar, eh9 eh9Var) {
        this.a = l3cVar;
        dq4 dq4VarA = cqk.a(((n0c) xhhVar).b().R0(1, "mini-stories-updater"));
        this.c = dq4VarA;
        yab.i0(dq4VarA, null, 0, new awa(eh9Var, this, (lq4) null, 2), 3);
    }

    public final void a(List list) {
        String str = this.b;
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(list.size(), "onStoriesPreviewsUpdated: new urls size -> "), null);
            }
        }
        yab.i0(this.c, null, 0, new awa(this, list, lq4Var, 3), 3);
    }
}
