package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class odi extends nq4 {
    public long d;
    public long e;
    public l9b f;
    public /* synthetic */ Object g;
    public final /* synthetic */ vdi h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odi(vdi vdiVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = vdiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(0L, 0L, this);
    }
}
