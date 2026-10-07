package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rfj extends nq4 {
    public ifj d;
    public egj e;
    public String f;
    public mx0 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ sfj i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfj(sfj sfjVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = sfjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.m(null, this);
    }
}
