package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oei extends nq4 {
    public long d;
    public oo e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ pei i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oei(pei peiVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = peiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(0L, null, this);
    }
}
