package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zza extends nq4 {
    public m8b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a0b f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(a0b a0bVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = a0bVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.o(null, 0L, this);
    }
}
