package defpackage;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class c3c extends nq4 {
    public Throwable d;
    public File e;
    public y2c f;
    public Iterator g;
    public /* synthetic */ Object h;
    public final /* synthetic */ i3c i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3c(i3c i3cVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = i3cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.o(null, null, null, this);
    }
}
