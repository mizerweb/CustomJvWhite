package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eah extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ jah e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eah(jah jahVar, lq4 lq4Var) {
        super(lq4Var);
        this.e = jahVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return jah.a(this.e, null, this);
    }
}
