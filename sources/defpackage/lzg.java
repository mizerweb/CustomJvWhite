package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lzg extends nq4 {
    public rxg d;
    public /* synthetic */ Object e;
    public final /* synthetic */ mzg f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzg(mzg mzgVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = mzgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
