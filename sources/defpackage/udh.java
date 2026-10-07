package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class udh extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ vdh e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udh(vdh vdhVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = vdhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return vdh.a(this.e, null, this);
    }
}
