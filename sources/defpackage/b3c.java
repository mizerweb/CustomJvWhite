package defpackage;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b3c extends nq4 {
    public File d;
    public pne e;
    public String f;
    public Object g;
    public Iterator h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ i3c n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3c(i3c i3cVar, nq4 nq4Var) {
        super(nq4Var);
        this.n = i3cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.j(null, 0L, null, null, null, null, false, null, this);
    }
}
