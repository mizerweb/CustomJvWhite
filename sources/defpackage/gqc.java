package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gqc extends nq4 {
    public luk d;
    public j9b e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ hqc i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqc(hqc hqcVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = hqcVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(null, this);
    }
}
