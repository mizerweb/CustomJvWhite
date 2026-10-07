package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vik extends nq4 {
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zfh f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vik(zfh zfhVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = zfhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        Object objA = this.f.a(null, this);
        return objA == hu4.a ? objA : new roe(objA);
    }
}
