package defpackage;

import ru.ok.tamtam.workmanager.BacklogWorker;

/* JADX INFO: loaded from: classes.dex */
public final class nn0 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ BacklogWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn0(BacklogWorker backlogWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = backlogWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
