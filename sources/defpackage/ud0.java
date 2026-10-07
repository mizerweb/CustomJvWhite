package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ud0 extends nq4 {
    public id0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vd0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud0(vd0 vd0Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = vd0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
