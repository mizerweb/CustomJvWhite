package defpackage;

import one.me.stories.core.workers.StoryPublishWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class z0h extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ StoryPublishWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0h(StoryPublishWorker storyPublishWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = storyPublishWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.u(null, this);
    }
}
