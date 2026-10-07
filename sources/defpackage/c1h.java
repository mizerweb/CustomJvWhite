package defpackage;

import one.me.stories.core.workers.StoryPublishWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class c1h extends nq4 {
    public q1h d;
    public /* synthetic */ Object e;
    public final /* synthetic */ StoryPublishWorker f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1h(StoryPublishWorker storyPublishWorker, nq4 nq4Var) {
        super(nq4Var);
        this.f = storyPublishWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return StoryPublishWorker.p(this.f, this);
    }
}
