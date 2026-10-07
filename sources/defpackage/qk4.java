package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class qk4 extends s7g implements med {
    public long u;

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(ek4 ek4Var) {
        izb izbVar = (izb) this.a;
        long j = ek4Var.a;
        izbVar.setId(Long.hashCode(j));
        this.u = ek4Var.o ? j : 0L;
        izbVar.setTitle(ek4Var.b);
        ynh ynhVar = ek4Var.e;
        izbVar.setSubtitle(ynhVar != null ? ynhVar.a(this) : null);
        izbVar.setVerified(ek4Var.i);
        izbVar.i();
        izbVar.setOnClickListener(null);
        CharSequence charSequence = ek4Var.j;
        Uri uri = ek4Var.g;
        izbVar.j(j, charSequence, uri != null ? uri.toString() : null);
        izbVar.setSelectionEnabled(false);
    }

    @Override // defpackage.med
    public final long c() {
        return this.u;
    }
}
