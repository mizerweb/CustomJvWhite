package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oe1 extends nq4 {
    public String d;
    public String e;
    public CharSequence f;
    public Long g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ pe1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe1(pe1 pe1Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = pe1Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return pe1.b(this.j, null, this);
    }
}
