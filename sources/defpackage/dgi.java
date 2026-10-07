package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dgi extends nq4 {
    public ahi d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zgi f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgi(zgi zgiVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = zgiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(null, this);
    }
}
