package defpackage;

import android.net.Uri;
import java.io.File;
import one.me.stories.core.workers.SaveStoryToGalleryWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class rze extends nq4 {
    public String d;
    public File e;
    public Uri f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ SaveStoryToGalleryWorker i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rze(SaveStoryToGalleryWorker saveStoryToGalleryWorker, nq4 nq4Var) {
        super(nq4Var);
        this.i = saveStoryToGalleryWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.t(0L, this, null);
    }
}
