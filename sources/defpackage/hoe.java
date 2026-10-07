package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hoe extends mq0 {
    public hoe(lq4 lq4Var) {
        super(lq4Var);
        if (lq4Var == null || lq4Var.getContext() == k66.a) {
            return;
        }
        ore.p("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.lq4
    public final vt4 getContext() {
        return k66.a;
    }
}
