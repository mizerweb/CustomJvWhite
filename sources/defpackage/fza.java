package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fza extends nq4 {
    public List d;
    public Collection e;
    public Iterator f;
    public w73 g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gza l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fza(gza gzaVar, nq4 nq4Var) {
        super(nq4Var);
        this.l = gzaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return gza.a(this.l, null, this);
    }
}
