package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class tdi extends nq4 {
    public String d;
    public k8b e;
    public long[] f;
    public long[] g;
    public long[] h;
    public Object i;
    public Serializable j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public /* synthetic */ Object x;
    public final /* synthetic */ vdi y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdi(vdi vdiVar, nq4 nq4Var) {
        super(nq4Var);
        this.y = vdiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.e(null, this);
    }
}
