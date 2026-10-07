package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jlg extends nq4 {
    public clg d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ klg h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlg(klg klgVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = klgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
