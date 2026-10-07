package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fe extends s7g {
    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(oc ocVar) {
        izb izbVar = (izb) this.a;
        izbVar.setId(Long.hashCode(ocVar.g));
        izbVar.setTitle(ocVar.b);
        izbVar.setSubtitle(ocVar.c.b(izbVar.getContext()));
        izbVar.i();
        izbVar.setOnClickListener(null);
        izbVar.setVerified(ocVar.f);
        izbVar.j(ocVar.a, ocVar.e, ocVar.d);
        izbVar.setSelectionEnabled(false);
    }
}
