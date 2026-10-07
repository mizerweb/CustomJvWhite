package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fah extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ jah e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fah(jah jahVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = jahVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
