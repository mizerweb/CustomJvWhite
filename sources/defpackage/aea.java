package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aea extends nq4 {
    public rt2 d;
    public List e;
    public List f;
    public List g;
    public Iterator h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ cea m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aea(cea ceaVar, nq4 nq4Var) {
        super(nq4Var);
        this.m = ceaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.m(null, this);
    }
}
