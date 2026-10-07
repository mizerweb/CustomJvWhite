package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vad extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ zad e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vad(zad zadVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = zadVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
