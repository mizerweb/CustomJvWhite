package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xt0 extends nq4 {
    public Iterator d;
    public List e;
    public long f;
    public long g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ yt0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt0(yt0 yt0Var, nq4 nq4Var) {
        super(nq4Var);
        this.l = yt0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
