package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* JADX INFO: loaded from: classes.dex */
public final class pn0 extends nq4 {
    public int d;
    public HashSet e;
    public HashSet f;
    public Iterator g;
    public /* synthetic */ Object h;
    public final /* synthetic */ BacklogWorker i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn0(BacklogWorker backlogWorker, nq4 nq4Var) {
        super(nq4Var);
        this.i = backlogWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return BacklogWorker.k(this.i, this);
    }
}
