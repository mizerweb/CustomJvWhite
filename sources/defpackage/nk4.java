package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nk4 extends nq4 {
    public List d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ pk4 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk4(pk4 pk4Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = pk4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return pk4.e(this.g, this);
    }
}
