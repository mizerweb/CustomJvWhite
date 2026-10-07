package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class vqe extends nq4 {
    public bre d;
    public rqe e;
    public ArrayList f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ bre i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqe(bre breVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = breVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return bre.e(this.i, null, null, false, this);
    }
}
