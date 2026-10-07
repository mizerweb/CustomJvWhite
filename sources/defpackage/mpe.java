package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mpe extends nq4 {
    public l9b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ppe f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpe(ppe ppeVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = ppeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(this);
    }
}
