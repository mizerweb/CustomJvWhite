package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h09 extends nq4 {
    public int d;
    public Iterator e;
    public /* synthetic */ Object f;
    public final /* synthetic */ i09 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h09(i09 i09Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = i09Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return i09.a(this.g, this);
    }
}
