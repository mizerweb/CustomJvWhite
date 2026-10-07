package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class wda extends nq4 {
    public rt2 d;
    public Iterator e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ cea h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wda(cea ceaVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = ceaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(null, null, this);
    }
}
