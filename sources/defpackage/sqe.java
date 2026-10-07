package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sqe extends nq4 {
    public bre d;
    public Iterator e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ bre i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqe(bre breVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = breVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return bre.a(this.i, null, this);
    }
}
