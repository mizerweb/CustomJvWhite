package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h0d extends aq implements qih {
    public final boolean f;

    public h0d(long j, boolean z) {
        super(j);
        this.f = z;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        String name = h0d.class.getName();
        String str = "onFail " + yhhVar;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.g, name, str, null, null, 8);
        }
    }

    @Override // defpackage.aq
    public final Object m() {
        ky kyVar = new ky((kfc) null, 6);
        kyVar.a("interactive", this.f);
        return kyVar;
    }
}
