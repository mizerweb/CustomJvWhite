package defpackage;

import java.io.File;
import one.me.stories.core.workers.SaveStoryToGalleryWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class mze extends nq4 {
    public int d;
    public File e;
    public /* synthetic */ Object f;
    public final /* synthetic */ SaveStoryToGalleryWorker g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mze(SaveStoryToGalleryWorker saveStoryToGalleryWorker, nq4 nq4Var) {
        super(nq4Var);
        this.g = saveStoryToGalleryWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.g(0, this);
    }
}
