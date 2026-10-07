package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class hi8 extends nq4 {
    public q24 d;
    public gda e;
    public Long f;
    public ArrayList g;
    public uy3 h;
    public Iterator i;
    public long j;
    public long k;
    public long l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ki8 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi8(ki8 ki8Var, nq4 nq4Var) {
        super(nq4Var);
        this.s = ki8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(0L, null, this, null, null, false, false);
    }
}
