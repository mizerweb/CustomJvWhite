package defpackage;

import one.me.stories.core.workers.SaveStoryToGalleryWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class oze extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ SaveStoryToGalleryWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oze(SaveStoryToGalleryWorker saveStoryToGalleryWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = saveStoryToGalleryWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.r(this);
    }
}
