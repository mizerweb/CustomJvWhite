package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o2k extends nq4 {
    public j4k d;
    public /* synthetic */ Object e;
    public final /* synthetic */ j4k f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2k(j4k j4kVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = j4kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(this);
    }
}
