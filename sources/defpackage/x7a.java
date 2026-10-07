package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x7a implements k79 {
    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        if (!(k79Var instanceof x7a)) {
            return false;
        }
        x7a x7aVar = (x7a) k79Var;
        return l() == x7aVar.l() && k() == x7aVar.k();
    }

    public abstract boolean i();

    public abstract long k();

    public abstract long l();
}
