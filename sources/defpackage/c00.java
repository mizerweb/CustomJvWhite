package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c00 extends nq4 {
    public s04 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ h00 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c00(h00 h00Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = h00Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.j(null, this);
    }
}
