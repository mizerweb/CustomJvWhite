package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class he4 extends nq4 {
    public boolean d;
    public Object e;
    public Object f;
    public wfe g;
    public vt4 h;
    public wfe i;
    public zpe j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ie4 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he4(ie4 ie4Var, nq4 nq4Var) {
        super(nq4Var);
        this.l = ie4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.h(false, null, this);
    }
}
