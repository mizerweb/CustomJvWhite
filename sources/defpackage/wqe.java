package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wqe extends nq4 {
    public bre d;
    public ArrayList e;
    public Set f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ bre i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqe(bre breVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = breVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return bre.f(this.i, null, false, this);
    }
}
