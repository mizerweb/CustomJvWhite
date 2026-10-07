package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class xa1 extends nq4 {
    public pw d;
    public f9b e;
    public Object f;
    public cd g;
    public pw h;
    public Map i;
    public pw j;
    public Iterator k;
    public mw l;
    public int m;
    public int n;
    public int o;
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ya1 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa1(ya1 ya1Var, nq4 nq4Var) {
        super(nq4Var);
        this.r = ya1Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return ya1.a(this.r, null, this);
    }
}
