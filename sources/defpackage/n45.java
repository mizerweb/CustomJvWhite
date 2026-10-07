package defpackage;

import ru.ok.tamtam.android.services.DbCleanUpScheduler$DbCleanUpWorker;

/* JADX INFO: loaded from: classes.dex */
public final class n45 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ DbCleanUpScheduler$DbCleanUpWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n45(DbCleanUpScheduler$DbCleanUpWorker dbCleanUpScheduler$DbCleanUpWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = dbCleanUpScheduler$DbCleanUpWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
