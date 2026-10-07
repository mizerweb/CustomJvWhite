package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class xff extends nq4 {
    public LinkedHashSet d;
    public Iterator e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xde g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xff(xde xdeVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = xdeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.z(this);
    }
}
