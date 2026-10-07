package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class djb extends nq4 {
    public hkb d;
    public st2 e;
    public q24 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ejb h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djb(ejb ejbVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = ejbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
