package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qy6 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ ra1 f;
    public yx6 g;
    public Iterator h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy6(ra1 ra1Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = ra1Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
