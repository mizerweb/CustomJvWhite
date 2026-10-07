package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class lid extends nq4 {
    public q24 d;
    public List e;
    public Set f;
    public List g;
    public Set h;
    public ArrayList i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nid l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lid(nid nidVar, nq4 nq4Var) {
        super(nq4Var);
        this.l = nidVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, null, false, this);
    }
}
