package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class beb extends s7g {
    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(udb udbVar) {
        l1c l1cVar = (l1c) this.a;
        l1cVar.setId(Long.hashCode(udbVar.a));
        w78 w78VarD = w78.d(Uri.parse(udbVar.b));
        w78VarD.d = new bne(gm0.K(yl5.d().getDisplayMetrics().density * 64.0f), gm0.K(64.0f * yl5.d().getDisplayMetrics().density), 0.0f, 12);
        l1c.j(l1cVar, w78VarD.a(), null, 6);
    }
}
