package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class nk7 extends nq4 {
    public ArrayList d;
    public Iterator e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ qk7 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk7(qk7 qk7Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = qk7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
