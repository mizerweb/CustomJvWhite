package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vda extends nq4 {
    public rt2 d;
    public Iterator e;
    public /* synthetic */ Object f;
    public final /* synthetic */ cea g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vda(cea ceaVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = ceaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, null, this);
    }
}
