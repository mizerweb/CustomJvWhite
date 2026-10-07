package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class v2i extends u2i {
    public final /* synthetic */ mw a;
    public final /* synthetic */ w2i b;

    public v2i(w2i w2iVar, mw mwVar) {
        this.b = w2iVar;
        this.a = mwVar;
    }

    @Override // defpackage.u2i, defpackage.q2i
    public final void c(r2i r2iVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(r2iVar);
        r2iVar.B(this);
    }
}
