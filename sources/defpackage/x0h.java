package defpackage;

import java.util.concurrent.CancellationException;
import one.me.stories.core.workers.StoryPublishWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class x0h extends nq4 {
    public wd4 d;
    public CancellationException e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ StoryPublishWorker i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0h(StoryPublishWorker storyPublishWorker, nq4 nq4Var) {
        super(nq4Var);
        this.i = storyPublishWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.k(this);
    }
}
