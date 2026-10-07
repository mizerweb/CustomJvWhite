package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pn6 extends nq4 {
    public m8b d;
    public List e;
    public ArrayList f;
    public LinkedHashMap g;
    public /* synthetic */ Object h;
    public final /* synthetic */ un6 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn6(un6 un6Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = un6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.r(null, this);
    }
}
