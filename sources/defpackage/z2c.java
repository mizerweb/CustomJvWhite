package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class z2c extends nq4 {
    public Iterator d;
    public /* synthetic */ Object e;
    public final /* synthetic */ i3c f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2c(i3c i3cVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = i3cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
