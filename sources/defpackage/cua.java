package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cua extends nq4 {
    public kmb d;
    public ArrayList e;
    public l8b f;
    public l8b g;
    public Iterator h;
    public d83 i;
    public List j;
    public List k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ hua p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cua(hua huaVar, nq4 nq4Var) {
        super(nq4Var);
        this.p = huaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.r(null, this);
    }
}
