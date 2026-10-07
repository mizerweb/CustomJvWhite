package defpackage;

import one.me.stories.core.workers.StoriesCleanupScheduler$StoriesCleanupWorker;

/* JADX INFO: loaded from: classes.dex */
public final class rqg extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ StoriesCleanupScheduler$StoriesCleanupWorker f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqg(StoriesCleanupScheduler$StoriesCleanupWorker storiesCleanupScheduler$StoriesCleanupWorker, nq4 nq4Var) {
        super(nq4Var);
        this.f = storiesCleanupScheduler$StoriesCleanupWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(this);
    }
}
