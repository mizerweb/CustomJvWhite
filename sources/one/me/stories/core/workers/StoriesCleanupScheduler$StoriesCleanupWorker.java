package one.me.stories.core.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.erg;
import defpackage.et3;
import defpackage.ltg;
import defpackage.xt4;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"one/me/stories/core/workers/StoriesCleanupScheduler$StoriesCleanupWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Lltg;", "publishRepository", "Lerg;", "draftRepository", "Let3;", "clientPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lltg;Lerg;Let3;)V", "stories-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StoriesCleanupScheduler$StoriesCleanupWorker extends SdkCoroutineWorker {
    public final ltg g;
    public final erg h;
    public final et3 i;

    public StoriesCleanupScheduler$StoriesCleanupWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, ltg ltgVar, erg ergVar, et3 et3Var) {
        super(context, workerParameters, xt4Var);
        this.g = ltgVar;
        this.h = ergVar;
        this.i = et3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r13 == r2) goto L28;
     */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.lq4 r13) {
        /*
            r12 = this;
            je9 r0 = defpackage.je9.d
            boolean r1 = r13 instanceof defpackage.rqg
            if (r1 == 0) goto L15
            r1 = r13
            rqg r1 = (defpackage.rqg) r1
            int r2 = r1.g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.g = r2
            goto L1c
        L15:
            rqg r1 = new rqg
            nq4 r13 = (defpackage.nq4) r13
            r1.<init>(r12, r13)
        L1c:
            java.lang.Object r13 = r1.e
            hu4 r2 = defpackage.hu4.a
            int r3 = r1.g
            r4 = 0
            java.lang.Class<one.me.stories.core.workers.StoriesCleanupScheduler$StoriesCleanupWorker> r5 = one.me.stories.core.workers.StoriesCleanupScheduler$StoriesCleanupWorker.class
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L3d
            if (r3 == r7) goto L37
            if (r3 != r6) goto L31
            defpackage.ch3.d0(r13)
            goto L86
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r12)
            return r4
        L37:
            long r7 = r1.d
            defpackage.ch3.d0(r13)
            goto L79
        L3d:
            defpackage.ch3.d0(r13)
            java.lang.String r13 = r5.getName()
            a4c r3 = defpackage.gm0.f
            if (r3 != 0) goto L49
            goto L54
        L49:
            boolean r8 = r3.b(r0)
            if (r8 == 0) goto L54
            java.lang.String r8 = "Work started"
            r3.c(r0, r13, r8, r4)
        L54:
            et3 r13 = r12.i
            s7f r13 = (defpackage.s7f) r13
            long r8 = r13.f()
            ghb r13 = defpackage.ew5.b
            r13 = 49
            lw5 r3 = defpackage.lw5.HOURS
            long r10 = defpackage.qe7.O(r13, r3)
            long r10 = defpackage.ew5.g(r10)
            long r8 = r8 - r10
            ltg r13 = r12.g
            r1.d = r8
            r1.g = r7
            java.lang.Object r13 = r13.c(r8, r1)
            if (r13 != r2) goto L78
            goto L85
        L78:
            r7 = r8
        L79:
            erg r12 = r12.h
            r1.d = r7
            r1.g = r6
            java.lang.Object r13 = r12.c(r7, r1)
            if (r13 != r2) goto L86
        L85:
            return r2
        L86:
            java.util.List r13 = (java.util.List) r13
            java.lang.String r12 = r5.getName()
            a4c r1 = defpackage.gm0.f
            if (r1 != 0) goto L91
            goto La6
        L91:
            boolean r2 = r1.b(r0)
            if (r2 == 0) goto La6
            int r13 = r13.size()
            java.lang.String r2 = "Deleted "
            java.lang.String r3 = " story drafts"
            java.lang.String r13 = defpackage.c0a.k(r13, r2, r3)
            r1.c(r0, r12, r13, r4)
        La6:
            k89 r12 = new k89
            r12.<init>()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stories.core.workers.StoriesCleanupScheduler$StoriesCleanupWorker.d(lq4):java.lang.Object");
    }
}
