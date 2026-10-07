package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class db extends nq4 {
    public String d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ eb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(eb ebVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = ebVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.h(0L, this, null);
    }
}
