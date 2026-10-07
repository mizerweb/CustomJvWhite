package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ty2 extends nq4 {
    public ni3 d;
    public LinkedHashSet e;
    public ArrayList f;
    public /* synthetic */ Object g;
    public final /* synthetic */ uy2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty2(uy2 uy2Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = uy2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(null, this);
    }
}
