package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ekj extends nq4 {
    public dkj d;
    public /* synthetic */ Object e;
    public final /* synthetic */ hkj f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekj(hkj hkjVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = hkjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, null, this);
    }
}
