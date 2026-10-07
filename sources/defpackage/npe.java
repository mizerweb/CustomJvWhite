package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class npe extends nq4 {
    public j9b d;
    public Iterator e;
    public int f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ppe j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npe(ppe ppeVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = ppeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(this);
    }
}
