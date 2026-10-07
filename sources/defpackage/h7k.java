package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class h7k extends nq4 {
    public Object d;
    public Object e;
    public Serializable f;
    public cf7 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ddk i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7k(ddk ddkVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = ddkVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, null, null, this);
    }
}
