package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ope extends nq4 {
    public nuh d;
    public l9b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ppe g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ope(ppe ppeVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = ppeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, this);
    }
}
