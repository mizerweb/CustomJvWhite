package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sob extends nq4 {
    public Set d;
    public Iterator e;
    public bpb f;
    public /* synthetic */ Object g;
    public final /* synthetic */ yob h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sob(yob yobVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = yobVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(null, null, this);
    }
}
