package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ynb extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ aob e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynb(aob aobVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = aobVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, 0L, 0L, this);
    }
}
