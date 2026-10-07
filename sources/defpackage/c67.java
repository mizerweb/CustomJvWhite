package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c67 extends nq4 {
    public List d;
    public List e;
    public long[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ d67 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c67(d67 d67Var, nq4 nq4Var) {
        super(nq4Var);
        this.l = d67Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return d67.B(this.l, this);
    }
}
