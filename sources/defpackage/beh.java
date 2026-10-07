package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class beh extends nq4 {
    public img d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ceh f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beh(ceh cehVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = cehVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(null, this);
    }
}
