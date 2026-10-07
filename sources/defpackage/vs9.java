package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vs9 extends nq4 {
    public ys9 d;
    public List e;
    public List f;
    public ArrayList g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ys9 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs9(ys9 ys9Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = ys9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return ys9.a(this.i, null, this);
    }
}
