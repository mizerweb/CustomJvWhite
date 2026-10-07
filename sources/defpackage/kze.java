package defpackage;

import java.io.File;
import one.me.stories.core.workers.SaveStoryToGalleryWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class kze implements o18 {
    public final /* synthetic */ SaveStoryToGalleryWorker a;

    public kze(SaveStoryToGalleryWorker saveStoryToGalleryWorker) {
        this.a = saveStoryToGalleryWorker;
    }

    @Override // defpackage.o18
    public final Object a(nq4 nq4Var) {
        qrc.o(this.a.q(), ls5.USER_CANCELLED, this.a.x, null, null, 28);
        return sbi.a;
    }

    @Override // defpackage.o18
    public final Object c(nq4 nq4Var, String str, boolean z, boolean z2) {
        SaveStoryToGalleryWorker saveStoryToGalleryWorker = this.a;
        if (z2) {
            qrc.o(saveStoryToGalleryWorker.q(), ls5.NOT_ENOUGH_SPACE, this.a.x, null, null, 28);
        } else {
            qrc.o(saveStoryToGalleryWorker.q(), ls5.INTERRUPTED_UNKNOWN, this.a.x, null, str, 20);
        }
        return sbi.a;
    }

    @Override // defpackage.o18
    public final Object d(nq4 nq4Var) {
        qrc.o(this.a.q(), ls5.URL_EXPIRED_FOR_NON_AUDIO, this.a.x, null, null, 28);
        return sbi.a;
    }

    @Override // defpackage.o18
    public final Object e(float f, long j, long j2, nq4 nq4Var) {
        Object objO = SaveStoryToGalleryWorker.o(this.a, j2, nq4Var);
        return objO == hu4.a ? objO : sbi.a;
    }

    @Override // defpackage.o18
    public final String f() {
        return this.a.w;
    }

    @Override // defpackage.o18
    public final Object g(File file, nq4 nq4Var) {
        this.a.q().B(this.a.x);
        return sbi.a;
    }
}
