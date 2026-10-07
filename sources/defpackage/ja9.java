package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ja9 extends nq4 {
    public rt2 d;
    public List e;
    public ArrayList f;
    public Object g;
    public Object h;
    public String i;
    public String j;
    public int k;
    public int l;
    public boolean m;
    public long n;
    public long o;
    public /* synthetic */ Object p;
    public final /* synthetic */ na9 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja9(na9 na9Var, nq4 nq4Var) {
        super(nq4Var);
        this.q = na9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.o(null, null, null, 0, false, this);
    }
}
