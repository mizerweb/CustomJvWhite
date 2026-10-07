package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ma9 extends nq4 {
    public ArrayList d;
    public LinkedHashMap e;
    public k8b f;
    public Iterator g;
    public rt2 h;
    public ArrayList i;
    public List j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ na9 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma9(na9 na9Var, nq4 nq4Var) {
        super(nq4Var);
        this.s = na9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.r(null, this);
    }
}
