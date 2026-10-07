package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class mfb extends nq4 {
    public kk1 d;
    public ArrayList e;
    public ArrayList f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ofb i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfb(ofb ofbVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = ofbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, 0L, null, null, this);
    }
}
