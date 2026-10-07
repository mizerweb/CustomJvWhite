package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ogi extends nq4 {
    public long d;
    public long e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ zgi h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogi(zgi zgiVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = zgiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return zgi.d(this.h, null, null, 0L, this);
    }
}
