package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class y8b extends a9b implements xv8, zv8 {
    public y8b(String str, Class cls) {
        super(l72.NO_RECEIVER, cls, str, "<v#0>", 0);
    }

    @Override // defpackage.xv8
    public final void b() {
        ((y8b) getReflected()).b();
    }

    @Override // defpackage.l72
    public final qv8 computeReflected() {
        zfe.a.getClass();
        return this;
    }

    public Object get() {
        b();
        throw null;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        return get();
    }

    public final void j() {
        ((y8b) getReflected()).j();
    }

    public void k(Object obj) {
        j();
        throw null;
    }
}
