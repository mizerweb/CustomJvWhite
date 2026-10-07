package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ywe extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ dxe e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywe(dxe dxeVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = dxeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.f(this);
    }
}
