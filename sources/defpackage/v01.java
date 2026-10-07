package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v01 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ w01 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v01(w01 w01Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = w01Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
