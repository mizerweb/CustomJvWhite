package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class ez4 implements o8b {
    public final h91 a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;

    public ez4(h91 h91Var) {
        this.a = h91Var;
    }

    @Override // defpackage.o8b
    public final void l(p8b p8bVar) {
        ru1 ru1Var;
        du1 du1Var;
        yt1 yt1Var;
        boolean z = (cqk.d(this.b, Boolean.valueOf(p8bVar.e)) && cqk.d(this.c, Boolean.valueOf(p8bVar.f)) && cqk.d(this.d, Boolean.valueOf(p8bVar.g)) && cqk.d(this.e, Boolean.valueOf(p8bVar.b))) ? false : true;
        this.b = Boolean.valueOf(p8bVar.e);
        this.c = Boolean.valueOf(p8bVar.f);
        this.d = Boolean.valueOf(p8bVar.g);
        this.e = Boolean.valueOf(p8bVar.b);
        if (!z || (yt1Var = (du1Var = (ru1Var = this.a.a).a).a) == null) {
            return;
        }
        ru1Var.f(ru1Var.c(yt1Var), Collections.singletonList(du1Var));
    }
}
