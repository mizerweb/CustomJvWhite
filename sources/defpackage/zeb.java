package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zeb extends nq4 {
    public xib d;
    public j9b e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ kfb i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zeb(kfb kfbVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = kfbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
