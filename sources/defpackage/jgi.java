package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jgi extends nq4 {
    public hih d;
    public kih e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ zgi h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgi(zgi zgiVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = zgiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.o(null, 0L, this);
    }
}
