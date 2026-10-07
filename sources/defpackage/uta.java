package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class uta extends nq4 {
    public kmb d;
    public hua e;
    public Iterator f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ vta i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uta(vta vtaVar, lq4 lq4Var) {
        super(lq4Var);
        this.i = vtaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(this);
    }
}
