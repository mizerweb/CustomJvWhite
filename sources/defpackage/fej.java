package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fej extends nq4 {
    public es8 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ rej f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fej(rej rejVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = rejVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, this);
    }
}
