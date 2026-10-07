package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface qy9 extends k79 {
    String B();

    @Override // defpackage.k79
    default boolean h(k79 k79Var) {
        if (!(k79Var instanceof qy9)) {
            return false;
        }
        qy9 qy9Var = (qy9) k79Var;
        return l() == qy9Var.l() && k() == qy9Var.k();
    }

    long k();

    long l();

    t50 u();
}
