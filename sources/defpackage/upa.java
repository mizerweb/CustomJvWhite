package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class upa extends nq4 {
    public rt2 d;
    public opa e;
    public List f;
    public List g;
    public Iterator h;
    public List i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dc9 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upa(dc9 dc9Var, nq4 nq4Var) {
        super(nq4Var);
        this.m = dc9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.F(null, null, null, this);
    }
}
