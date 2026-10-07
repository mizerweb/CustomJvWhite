package one.me.stories.core.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a4c;
import defpackage.b1h;
import defpackage.bpg;
import defpackage.ch3;
import defpackage.erg;
import defpackage.ewi;
import defpackage.gm0;
import defpackage.hu4;
import defpackage.ifh;
import defpackage.j95;
import defpackage.je9;
import defpackage.jjf;
import defpackage.lq4;
import defpackage.ltg;
import defpackage.n0h;
import defpackage.nq4;
import defpackage.ny8;
import defpackage.or6;
import defpackage.ore;
import defpackage.oyj;
import defpackage.poe;
import defpackage.q77;
import defpackage.qv1;
import defpackage.r77;
import defpackage.roe;
import defpackage.sbi;
import defpackage.ubb;
import defpackage.wzg;
import defpackage.xt4;
import defpackage.y0h;
import defpackage.zo5;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;
import ru.ok.tamtam.upload.workers.ForegroundWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002!\"B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\f\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\f¢\u0006\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lone/me/stories/core/workers/StoryPublishWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Lubb;", "needUpdateWorkerProgressNotifUseCase", "Lr77;", "foregroundServiceVisibility", "Lny8;", "Lnzg;", "storiesPrepareUseCase", "Lb3h;", "storiesUploadUseCase", "Lu1h;", "storiesSendUseCase", "Lerg;", "storiesDraftRepository", "Lltg;", "storiesPublishRepository", "Ln0h;", "storyPublishProgressStore", "Lb0h;", "storyPublishEvents", "Lor6;", "fileLoadingNotifications", "Lwd4;", "connectionInfo", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lubb;Lr77;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;)V", "a", "b", "stories-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StoryPublishWorker extends ForegroundWorker {
    public final ifh m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final String w;
    public volatile int x;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/stories/core/workers/StoryPublishWorker$a;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "Lone/me/stories/core/models/DraftId;", "draftId", "", "stopReason", "", "exception", "<init>", "(JILjava/lang/Throwable;)V", "stories-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends IssueKeyException {
        public a(long j, int i, Throwable th) {
            super("53348", zo5.g(i, j, "Story publish draftId=", " cancellation was failed by reason = "), th);
        }
    }

    public StoryPublishWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, ubb ubbVar, r77 r77Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9) {
        super(context, workerParameters, xt4Var, ubbVar, r77Var);
        this.m = new ifh(new bpg(3, this));
        this.n = ny8Var;
        this.o = ny8Var2;
        this.p = ny8Var3;
        this.q = ny8Var4;
        this.r = ny8Var5;
        this.s = ny8Var6;
        this.t = ny8Var7;
        this.u = ny8Var8;
        this.v = ny8Var9;
        this.w = StoryPublishWorker.class.getName();
        this.x = -1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        if (r14.u(r0, r1) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0105, code lost:
    
        if (r15.b(r5, 1.0f, r1) == r2) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o(one.me.stories.core.workers.StoryPublishWorker r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stories.core.workers.StoryPublishWorker.o(one.me.stories.core.workers.StoryPublishWorker, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ac A[PHI: r13
  0x00ac: PHI (r13v16 java.lang.Object) = (r13v15 java.lang.Object), (r13v1 java.lang.Object) binds: [B:27:0x00a8, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0104  */
    /* JADX WARN: Code duplicated, block: B:51:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0124 A[PHI: r2
  0x0124: PHI (r2v10 java.lang.Object) = (r2v4 java.lang.Object), (r2v13 java.lang.Object) binds: [B:52:0x0121, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:59:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        if (r13.c(r6, r0) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        if (r12.u(r13, r0) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0131, code lost:
    
        if (r12.u(r13, r0) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0152, code lost:
    
        if (r12.u(r13, r0) == r1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p(one.me.stories.core.workers.StoryPublishWorker r12, defpackage.nq4 r13) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stories.core.workers.StoryPublishWorker.p(one.me.stories.core.workers.StoryPublishWorker, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r13.u(r0, r1) == r2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q(one.me.stories.core.workers.StoryPublishWorker r13, defpackage.nq4 r14) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stories.core.workers.StoryPublishWorker.q(one.me.stories.core.workers.StoryPublishWorker, nq4):java.lang.Object");
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object g(int i, lq4 lq4Var) {
        String str = this.w;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(i, "onStopWork was called with reason "), null);
            }
        }
        Object objT = t((nq4) lq4Var);
        return objT == hu4.a ? objT : sbi.a;
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object j(lq4 lq4Var) {
        PendingIntent pendingIntentA = oyj.d(this.a).a(this.b.a);
        or6 or6Var = (or6) this.u.getValue();
        Context context = this.a;
        ((or6) this.u.getValue()).getClass();
        return new q77(Long.hashCode(s().a), or6Var.d(0L, null, null, context.getString(R.string.tt_worker_attach_upload), null, this.x, true, pendingIntentA), jjf.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x01e6 A[Catch: all -> 0x006c, CancellationException -> 0x0071, TryCatch #5 {CancellationException -> 0x0071, all -> 0x006c, blocks: (B:22:0x0067, B:94:0x01d1, B:96:0x01d9, B:98:0x01df, B:104:0x0201, B:101:0x01e6, B:103:0x01ec, B:29:0x007d, B:87:0x01b2, B:89:0x01ba, B:91:0x01c0, B:32:0x008a, B:80:0x0193, B:82:0x019b, B:84:0x01a1, B:35:0x0097, B:77:0x0182, B:38:0x00a4, B:74:0x0172), top: B:123:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:107:0x021c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0260  */
    /* JADX WARN: Code duplicated, block: B:121:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:62:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0130 A[Catch: all -> 0x014c, CancellationException -> 0x0151, TryCatch #6 {CancellationException -> 0x0151, all -> 0x014c, blocks: (B:60:0x0129, B:70:0x0155, B:63:0x0130, B:65:0x0136), top: B:121:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0170  */
    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    /* JADX WARN: Code duplicated, block: B:77:0x0182 A[Catch: all -> 0x006c, CancellationException -> 0x0071, PHI: r4 r7
  0x0182: PHI (r4v7 int) = (r4v5 int), (r4v8 int) binds: [B:75:0x017e, B:35:0x0097] A[DONT_GENERATE, DONT_INLINE]
  0x0182: PHI (r7v8 int) = (r7v6 int), (r7v9 int) binds: [B:75:0x017e, B:35:0x0097] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {CancellationException -> 0x0071, all -> 0x006c, blocks: (B:22:0x0067, B:94:0x01d1, B:96:0x01d9, B:98:0x01df, B:104:0x0201, B:101:0x01e6, B:103:0x01ec, B:29:0x007d, B:87:0x01b2, B:89:0x01ba, B:91:0x01c0, B:32:0x008a, B:80:0x0193, B:82:0x019b, B:84:0x01a1, B:35:0x0097, B:77:0x0182, B:38:0x00a4, B:74:0x0172), top: B:123:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0193 A[Catch: all -> 0x006c, CancellationException -> 0x0071, PHI: r0 r4 r7
  0x0193: PHI (r0v25 java.lang.Object) = (r0v24 java.lang.Object), (r0v1 java.lang.Object) binds: [B:78:0x018f, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]
  0x0193: PHI (r4v9 int) = (r4v7 int), (r4v10 int) binds: [B:78:0x018f, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]
  0x0193: PHI (r7v10 int) = (r7v8 int), (r7v11 int) binds: [B:78:0x018f, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {CancellationException -> 0x0071, all -> 0x006c, blocks: (B:22:0x0067, B:94:0x01d1, B:96:0x01d9, B:98:0x01df, B:104:0x0201, B:101:0x01e6, B:103:0x01ec, B:29:0x007d, B:87:0x01b2, B:89:0x01ba, B:91:0x01c0, B:32:0x008a, B:80:0x0193, B:82:0x019b, B:84:0x01a1, B:35:0x0097, B:77:0x0182, B:38:0x00a4, B:74:0x0172), top: B:123:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:82:0x019b A[Catch: all -> 0x006c, CancellationException -> 0x0071, TryCatch #5 {CancellationException -> 0x0071, all -> 0x006c, blocks: (B:22:0x0067, B:94:0x01d1, B:96:0x01d9, B:98:0x01df, B:104:0x0201, B:101:0x01e6, B:103:0x01ec, B:29:0x007d, B:87:0x01b2, B:89:0x01ba, B:91:0x01c0, B:32:0x008a, B:80:0x0193, B:82:0x019b, B:84:0x01a1, B:35:0x0097, B:77:0x0182, B:38:0x00a4, B:74:0x0172), top: B:123:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a1 A[Catch: all -> 0x006c, CancellationException -> 0x0071, TryCatch #5 {CancellationException -> 0x0071, all -> 0x006c, blocks: (B:22:0x0067, B:94:0x01d1, B:96:0x01d9, B:98:0x01df, B:104:0x0201, B:101:0x01e6, B:103:0x01ec, B:29:0x007d, B:87:0x01b2, B:89:0x01ba, B:91:0x01c0, B:32:0x008a, B:80:0x0193, B:82:0x019b, B:84:0x01a1, B:35:0x0097, B:77:0x0182, B:38:0x00a4, B:74:0x0172), top: B:123:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b2 A[Catch: all -> 0x006c, CancellationException -> 0x0071, PHI: r0 r4 r7
  0x01b2: PHI (r0v31 java.lang.Object) = (r0v29 java.lang.Object), (r0v1 java.lang.Object) binds: [B:85:0x01ae, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x01b2: PHI (r4v11 int) = (r4v9 int), (r4v12 int) binds: [B:85:0x01ae, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x01b2: PHI (r7v12 int) = (r7v10 int), (r7v13 int) binds: [B:85:0x01ae, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {CancellationException -> 0x0071, all -> 0x006c, blocks: (B:22:0x0067, B:94:0x01d1, B:96:0x01d9, B:98:0x01df, B:104:0x0201, B:101:0x01e6, B:103:0x01ec, B:29:0x007d, B:87:0x01b2, B:89:0x01ba, B:91:0x01c0, B:32:0x008a, B:80:0x0193, B:82:0x019b, B:84:0x01a1, B:35:0x0097, B:77:0x0182, B:38:0x00a4, B:74:0x0172), top: B:123:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba A[Catch: all -> 0x006c, CancellationException -> 0x0071, TryCatch #5 {CancellationException -> 0x0071, all -> 0x006c, blocks: (B:22:0x0067, B:94:0x01d1, B:96:0x01d9, B:98:0x01df, B:104:0x0201, B:101:0x01e6, B:103:0x01ec, B:29:0x007d, B:87:0x01b2, B:89:0x01ba, B:91:0x01c0, B:32:0x008a, B:80:0x0193, B:82:0x019b, B:84:0x01a1, B:35:0x0097, B:77:0x0182, B:38:0x00a4, B:74:0x0172), top: B:123:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01c0 A[Catch: all -> 0x006c, CancellationException -> 0x0071, TryCatch #5 {CancellationException -> 0x0071, all -> 0x006c, blocks: (B:22:0x0067, B:94:0x01d1, B:96:0x01d9, B:98:0x01df, B:104:0x0201, B:101:0x01e6, B:103:0x01ec, B:29:0x007d, B:87:0x01b2, B:89:0x01ba, B:91:0x01c0, B:32:0x008a, B:80:0x0193, B:82:0x019b, B:84:0x01a1, B:35:0x0097, B:77:0x0182, B:38:0x00a4, B:74:0x0172), top: B:123:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d1 A[Catch: all -> 0x006c, CancellationException -> 0x0071, PHI: r0 r4 r7
  0x01d1: PHI (r0v37 java.lang.Object) = (r0v35 java.lang.Object), (r0v1 java.lang.Object) binds: [B:92:0x01cd, B:22:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x01d1: PHI (r4v13 int) = (r4v11 int), (r4v15 int) binds: [B:92:0x01cd, B:22:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x01d1: PHI (r7v14 int) = (r7v12 int), (r7v15 int) binds: [B:92:0x01cd, B:22:0x0067] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {CancellationException -> 0x0071, all -> 0x006c, blocks: (B:22:0x0067, B:94:0x01d1, B:96:0x01d9, B:98:0x01df, B:104:0x0201, B:101:0x01e6, B:103:0x01ec, B:29:0x007d, B:87:0x01b2, B:89:0x01ba, B:91:0x01c0, B:32:0x008a, B:80:0x0193, B:82:0x019b, B:84:0x01a1, B:35:0x0097, B:77:0x0182, B:38:0x00a4, B:74:0x0172), top: B:123:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d9 A[Catch: all -> 0x006c, CancellationException -> 0x0071, TryCatch #5 {CancellationException -> 0x0071, all -> 0x006c, blocks: (B:22:0x0067, B:94:0x01d1, B:96:0x01d9, B:98:0x01df, B:104:0x0201, B:101:0x01e6, B:103:0x01ec, B:29:0x007d, B:87:0x01b2, B:89:0x01ba, B:91:0x01c0, B:32:0x008a, B:80:0x0193, B:82:0x019b, B:84:0x01a1, B:35:0x0097, B:77:0x0182, B:38:0x00a4, B:74:0x0172), top: B:123:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01df A[Catch: all -> 0x006c, CancellationException -> 0x0071, TryCatch #5 {CancellationException -> 0x0071, all -> 0x006c, blocks: (B:22:0x0067, B:94:0x01d1, B:96:0x01d9, B:98:0x01df, B:104:0x0201, B:101:0x01e6, B:103:0x01ec, B:29:0x007d, B:87:0x01b2, B:89:0x01ba, B:91:0x01c0, B:32:0x008a, B:80:0x0193, B:82:0x019b, B:84:0x01a1, B:35:0x0097, B:77:0x0182, B:38:0x00a4, B:74:0x0172), top: B:123:0x002c }] */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0244, code lost:
    
        if (u(r12, r5) == r6) goto L117;
     */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.nq4 r20) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stories.core.workers.StoryPublishWorker.k(nq4):java.lang.Object");
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /* JADX INFO: renamed from: l */
    public final String getM() {
        String strD = this.b.b.d("workName");
        return strD == null ? this.w : strD;
    }

    public final n0h r() {
        return (n0h) this.s.getValue();
    }

    public final wzg s() {
        return (wzg) this.m.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object t(nq4 nq4Var) {
        y0h y0hVar;
        boolean z;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof y0h) {
            y0hVar = (y0h) nq4Var;
            int i = y0hVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                y0hVar.g = i - Integer.MIN_VALUE;
            } else {
                y0hVar = new y0h(this, nq4Var);
            }
        } else {
            y0hVar = new y0h(this, nq4Var);
        }
        Object obj = y0hVar.e;
        Object obj2 = hu4.a;
        int i2 = y0hVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            int i3 = i();
            z = i3 == -512 || i3 == 1 || i3 == 13;
            if (z) {
                String str = this.w;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.g(i(), s().a, "Story publish draftId=", " was cancelled by reason="), null);
                    }
                }
                ltg ltgVar = (ltg) this.r.getValue();
                long j = s().a;
                y0hVar.d = z;
                y0hVar.g = 1;
                if (ltgVar.a(j, y0hVar) != obj2) {
                }
            } else {
                Throwable aVar = new a(s().a, i(), null);
                y0hVar.d = z;
                y0hVar.g = 3;
                if (u(aVar, y0hVar) != obj2) {
                    return sbiVar;
                }
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i2 == 3) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = y0hVar.d;
        ch3.d0(obj);
        erg ergVar = (erg) this.q.getValue();
        ergVar.f().b(s().a, s().b);
        n0h n0hVarR = r();
        long j2 = s().a;
        y0hVar.d = z;
        y0hVar.g = 2;
        if (n0hVarR.f(j2, y0hVar) == obj2) {
            return obj2;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r12.a(r4, r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(java.lang.Throwable r12, defpackage.nq4 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.z0h
            if (r0 == 0) goto L13
            r0 = r13
            z0h r0 = (defpackage.z0h) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            z0h r0 = new z0h
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.d
            hu4 r1 = defpackage.hu4.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2c
            defpackage.ch3.d0(r13)
            goto Lb4
        L2c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            return r5
        L32:
            defpackage.ch3.d0(r13)
            goto L85
        L36:
            defpackage.ch3.d0(r13)
            java.lang.String r13 = r11.w
            a4c r2 = defpackage.gm0.f
            if (r2 != 0) goto L40
            goto L6e
        L40:
            je9 r6 = defpackage.je9.f
            boolean r7 = r2.b(r6)
            if (r7 == 0) goto L6e
            boolean r7 = r12 instanceof one.me.stories.core.workers.StoryPublishWorker.b
            if (r7 == 0) goto L50
            r7 = r12
            one.me.stories.core.workers.StoryPublishWorker$b r7 = (one.me.stories.core.workers.StoryPublishWorker.b) r7
            goto L51
        L50:
            r7 = r5
        L51:
            if (r7 == 0) goto L59
            one.me.stories.core.workers.a r7 = r7.a
            if (r7 == 0) goto L59
            java.lang.String r5 = r7.a
        L59:
            if (r5 != 0) goto L5d
            java.lang.String r5 = ""
        L5d:
            wzg r7 = r11.s()
            long r7 = r7.a
            java.lang.String r9 = "Story publish failed: draftId="
            java.lang.String r10 = ". "
            java.lang.String r5 = defpackage.ewi.d(r7, r9, r10, r5)
            r2.c(r6, r13, r5, r12)
        L6e:
            ny8 r12 = r11.r
            java.lang.Object r12 = r12.getValue()
            ltg r12 = (defpackage.ltg) r12
            wzg r13 = r11.s()
            long r5 = r13.a
            r0.f = r4
            java.lang.Object r12 = r12.e(r5, r0)
            if (r12 != r1) goto L85
            goto Lb3
        L85:
            ny8 r12 = r11.q
            java.lang.Object r12 = r12.getValue()
            erg r12 = (defpackage.erg) r12
            wzg r13 = r11.s()
            azg r13 = r13.b
            wzg r2 = r11.s()
            long r4 = r2.a
            twg r12 = r12.f()
            r2 = 3
            r12.c(r13, r4, r2)
            n0h r12 = r11.r()
            wzg r11 = r11.s()
            long r4 = r11.a
            r0.f = r3
            java.lang.Object r11 = r12.a(r4, r0)
            if (r11 != r1) goto Lb4
        Lb3:
            return r1
        Lb4:
            sbi r11 = defpackage.sbi.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stories.core.workers.StoryPublishWorker.u(java.lang.Throwable, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object v(nq4 nq4Var) {
        b1h b1hVar;
        Object poeVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof b1h) {
            b1hVar = (b1h) nq4Var;
            int i = b1hVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                b1hVar.f = i - Integer.MIN_VALUE;
            } else {
                b1hVar = new b1h(this, nq4Var);
            }
        } else {
            b1hVar = new b1h(this, nq4Var);
        }
        Object obj = b1hVar.d;
        Object obj2 = hu4.a;
        int i2 = b1hVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                if (m(this.x)) {
                    b1hVar.f = 1;
                    if (n(b1hVar) == obj2) {
                        return obj2;
                    }
                }
                return sbiVar;
            }
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            poeVar = sbiVar;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str = this.w;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, qv1.k("prepareNotificationIfNeed was failed due to ", thA.getLocalizedMessage()), thA);
                }
            }
        }
        return sbiVar;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B'\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/stories/core/workers/StoryPublishWorker$b;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "Lone/me/stories/core/models/DraftId;", "draftId", "", "exception", "Lone/me/stories/core/workers/a;", "step", "<init>", "(JLjava/lang/Throwable;Lone/me/stories/core/workers/a;)V", "stories-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends IssueKeyException {
        public final one.me.stories.core.workers.a a;

        public b(long j, Throwable th, one.me.stories.core.workers.a aVar) {
            super("53348", ewi.d(j, "Story publish draftId=", " was failed. ", aVar.a), th);
            this.a = aVar;
        }

        public /* synthetic */ b(long j, Throwable th, one.me.stories.core.workers.a aVar, int i, j95 j95Var) {
            this(j, th, (i & 4) != 0 ? one.me.stories.core.workers.a.UNKNOWN : aVar);
        }
    }
}
