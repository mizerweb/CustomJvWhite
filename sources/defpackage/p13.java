package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p13 extends nq4 {
    public rt2 d;
    public fda e;
    public List f;
    public List g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ r13 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p13(r13 r13Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = r13Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, this);
    }
}
