package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class uj3 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ tj3 f;
    public yx6 g;
    public List h;
    public List i;
    public List j;
    public Collection k;
    public Iterator l;
    public Collection m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj3(tj3 tj3Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = tj3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
