package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r83 extends nq4 {
    public g83 d;
    public Iterator e;
    public /* synthetic */ Object f;
    public final /* synthetic */ t83 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r83(t83 t83Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = t83Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return t83.a(this.g, null, this);
    }
}
