package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x7f extends nq4 {
    public String d;
    public c79 e;
    public c79 f;
    public utc g;
    public /* synthetic */ Object h;
    public final /* synthetic */ z7f i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7f(z7f z7fVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = z7fVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
