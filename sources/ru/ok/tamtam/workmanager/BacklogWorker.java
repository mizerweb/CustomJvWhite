package ru.ok.tamtam.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.e5d;
import defpackage.ew5;
import defpackage.ghb;
import defpackage.lw5;
import defpackage.ny8;
import defpackage.qe7;
import defpackage.xt4;
import defpackage.xyj;
import java.util.HashSet;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0011\u0012BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/ok/tamtam/workmanager/BacklogWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lxt4;", "workCoroutineDispatcher", "Lny8;", "Lxhh;", "dispatchers", "Lxyj;", "workManager", "Le5d;", "pmsProperties", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lny8;Lny8;Lny8;)V", "vd7", "BacklogWorkerException", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BacklogWorker extends SdkCoroutineWorker {
    public static BacklogWorker m;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final Object j;
    public final HashSet k;
    public volatile boolean l;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/workmanager/BacklogWorker$BacklogWorkerException;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BacklogWorkerException extends IssueKeyException {
        public final String a;
        public final Throwable b;

        public BacklogWorkerException(String str, Throwable th) {
            super("ONEME-38937", str, th);
            this.a = str;
            this.b = th;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.b;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.a;
        }
    }

    public BacklogWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        super(context, workerParameters, xt4Var);
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = new Object();
        this.k = new HashSet();
    }

    public static final long j(BacklogWorker backlogWorker) {
        ghb ghbVar = ew5.b;
        int iIntValue = ((Number) ((e5d) backlogWorker.i.getValue()).i0.a(e5d.S6[58]).i()).intValue();
        if (iIntValue < 1) {
            iIntValue = 1;
        }
        return ew5.g(qe7.O(iIntValue, lw5.SECONDS));
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[LOOP:0: B:41:0x010c->B:46:0x0125, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0132  */
    /* JADX WARN: Code duplicated, block: B:57:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x018c A[LOOP:1: B:60:0x0186->B:62:0x018c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01ce -> B:70:0x01d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01db -> B:70:0x01d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01ff -> B:70:0x01d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0230 -> B:70:0x01d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x023f -> B:70:0x01d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x024e -> B:70:0x01d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object k(ru.ok.tamtam.workmanager.BacklogWorker r17, defpackage.nq4 r18) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.k(ru.ok.tamtam.workmanager.BacklogWorker, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (m(r0) == r5) goto L21;
     */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.lq4 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.nn0
            if (r0 == 0) goto L13
            r0 = r7
            nn0 r0 = (defpackage.nn0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L1a
        L13:
            nn0 r0 = new nn0
            nq4 r7 = (defpackage.nq4) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.d
            int r1 = r0.f
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            defpackage.ch3.d0(r7)
            goto L50
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r2
        L33:
            defpackage.ch3.d0(r7)
            goto L47
        L37:
            defpackage.ch3.d0(r7)
            ru.ok.tamtam.workmanager.BacklogWorker.m = r6
            r0.f = r4
            r66 r7 = defpackage.r66.a
            java.lang.Object r7 = r6.o(r7, r0)
            if (r7 != r5) goto L47
            goto L4f
        L47:
            r0.f = r3
            java.lang.Object r6 = r6.m(r0)
            if (r6 != r5) goto L50
        L4f:
            return r5
        L50:
            ru.ok.tamtam.workmanager.BacklogWorker.m = r2
            k89 r6 = new k89
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.d(lq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:23:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object l(java.util.List r8, defpackage.nq4 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ln0
            if (r0 == 0) goto L13
            r0 = r9
            ln0 r0 = (defpackage.ln0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            ln0 r0 = new ln0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.g
            int r1 = r0.i
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            int r7 = r0.f
            wfe r8 = r0.e
            java.util.List r1 = r0.d
            java.util.List r1 = (java.util.List) r1
            defpackage.ch3.d0(r9)
            goto L75
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r2
        L34:
            wfe r9 = defpackage.nbh.p(r9)
            r9.a = r7
            r7 = 0
            r6 = r9
            r9 = r8
            r8 = r6
        L3e:
            r1 = 10
            if (r7 <= r1) goto L45
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L45:
            java.lang.Object r1 = r8.a
            ru.ok.tamtam.workmanager.BacklogWorker r1 = (ru.ok.tamtam.workmanager.BacklogWorker) r1
            ny8 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            xhh r1 = (defpackage.xhh) r1
            n0c r1 = (defpackage.n0c) r1
            xt4 r1 = r1.b()
            sfd r4 = new sfd
            r5 = 19
            r4.<init>(r8, r9, r2, r5)
            r5 = r9
            java.util.List r5 = (java.util.List) r5
            r0.d = r5
            r0.e = r8
            r0.f = r7
            r0.i = r3
            java.lang.Object r1 = defpackage.yab.K0(r1, r4, r0)
            hu4 r4 = defpackage.hu4.a
            if (r1 != r4) goto L72
            return r4
        L72:
            r6 = r1
            r1 = r9
            r9 = r6
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L86
            java.lang.Object r9 = r8.a
            ru.ok.tamtam.workmanager.BacklogWorker r9 = (ru.ok.tamtam.workmanager.BacklogWorker) r9
            int r7 = r7 + r3
            r8.a = r9
            r9 = r1
            goto L3e
        L86:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.l(java.util.List, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0069 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #0 {, blocks: (B:17:0x0043, B:19:0x0069), top: B:34:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0091 -> B:29:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(defpackage.nq4 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.mn0
            if (r0 == 0) goto L13
            r0 = r9
            mn0 r0 = (defpackage.mn0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            mn0 r0 = new mn0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.e
            hu4 r1 = defpackage.hu4.a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            wfe r8 = r0.d
            defpackage.ch3.d0(r9)
            goto L94
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            r8 = 0
            return r8
        L30:
            wfe r9 = defpackage.nbh.p(r9)
            r9.a = r8
            r8 = r9
        L37:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r2 = r8.a
            ru.ok.tamtam.workmanager.BacklogWorker r2 = (ru.ok.tamtam.workmanager.BacklogWorker) r2
            java.lang.Object r2 = r2.j
            monitor-enter(r2)
            java.lang.String r4 = "BACKLOG_WORKER"
            java.lang.String r5 = "checkStayAliveAndRunIfNeeded %d"
            java.lang.Object r6 = r8.a     // Catch: java.lang.Throwable -> L7c
            ru.ok.tamtam.workmanager.BacklogWorker r6 = (ru.ok.tamtam.workmanager.BacklogWorker) r6     // Catch: java.lang.Throwable -> L7c
            java.util.HashSet r6 = r6.k     // Catch: java.lang.Throwable -> L7c
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L7c
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Throwable -> L7c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object[] r6 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L7c
            defpackage.gm0.m(r4, r5, r6)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r4 = r8.a     // Catch: java.lang.Throwable -> L7c
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4     // Catch: java.lang.Throwable -> L7c
            java.util.HashSet r4 = r4.k     // Catch: java.lang.Throwable -> L7c
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r4 != 0) goto L7e
            java.lang.Object r4 = r8.a     // Catch: java.lang.Throwable -> L7c
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4     // Catch: java.lang.Throwable -> L7c
            java.util.HashSet r4 = r4.k     // Catch: java.lang.Throwable -> L7c
            r9.addAll(r4)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r4 = r8.a     // Catch: java.lang.Throwable -> L7c
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4     // Catch: java.lang.Throwable -> L7c
            java.util.HashSet r4 = r4.k     // Catch: java.lang.Throwable -> L7c
            r4.clear()     // Catch: java.lang.Throwable -> L7c
            goto L7e
        L7c:
            r8 = move-exception
            goto L9e
        L7e:
            monitor-exit(r2)
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L9b
            java.lang.Object r2 = r8.a
            ru.ok.tamtam.workmanager.BacklogWorker r2 = (ru.ok.tamtam.workmanager.BacklogWorker) r2
            r0.d = r8
            r0.g = r3
            java.lang.Object r9 = r2.o(r9, r0)
            if (r9 != r1) goto L94
            return r1
        L94:
            java.lang.Object r9 = r8.a
            ru.ok.tamtam.workmanager.BacklogWorker r9 = (ru.ok.tamtam.workmanager.BacklogWorker) r9
            r8.a = r9
            goto L37
        L9b:
            sbi r8 = defpackage.sbi.a
            return r8
        L9e:
            monitor-exit(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.m(nq4):java.lang.Object");
    }

    public final xyj n() {
        return (xyj) this.h.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0 A[Catch: all -> 0x0047, CancellationException -> 0x0176, TryCatch #2 {CancellationException -> 0x0176, all -> 0x0047, blocks: (B:15:0x003e, B:31:0x0091, B:36:0x00a0, B:40:0x00ce, B:42:0x00ea, B:44:0x00f0, B:47:0x0107, B:50:0x0111, B:55:0x0122, B:59:0x013b, B:65:0x014f, B:22:0x005a, B:25:0x006b, B:28:0x007a), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea A[Catch: all -> 0x0047, CancellationException -> 0x0176, TryCatch #2 {CancellationException -> 0x0176, all -> 0x0047, blocks: (B:15:0x003e, B:31:0x0091, B:36:0x00a0, B:40:0x00ce, B:42:0x00ea, B:44:0x00f0, B:47:0x0107, B:50:0x0111, B:55:0x0122, B:59:0x013b, B:65:0x014f, B:22:0x005a, B:25:0x006b, B:28:0x007a), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0 A[Catch: all -> 0x0047, CancellationException -> 0x0176, TryCatch #2 {CancellationException -> 0x0176, all -> 0x0047, blocks: (B:15:0x003e, B:31:0x0091, B:36:0x00a0, B:40:0x00ce, B:42:0x00ea, B:44:0x00f0, B:47:0x0107, B:50:0x0111, B:55:0x0122, B:59:0x013b, B:65:0x014f, B:22:0x005a, B:25:0x006b, B:28:0x007a), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0105  */
    /* JADX WARN: Code duplicated, block: B:47:0x0107 A[Catch: all -> 0x0047, CancellationException -> 0x0176, PHI: r0 r4 r5 r6 r10 r12 r13 r14 r15
  0x0107: PHI (r0v28 java.lang.Object) = (r0v38 java.lang.Object), (r0v1 java.lang.Object) binds: [B:45:0x0103, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r4v8 int) = (r4v9 int), (r4v13 int) binds: [B:45:0x0103, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r5v4 int) = (r5v5 int), (r5v0 int) binds: [B:45:0x0103, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r6v3 int) = (r6v4 int), (r6v0 int) binds: [B:45:0x0103, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r10v5 int) = (r10v6 int), (r10v0 int) binds: [B:45:0x0103, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r12v6 int) = (r12v7 int), (r12v13 int) binds: [B:45:0x0103, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r13v7 int) = (r13v8 int), (r13v14 int) binds: [B:45:0x0103, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r14v3 int) = (r14v4 int), (r14v20 int) binds: [B:45:0x0103, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r15v4 java.util.List) = (r15v5 java.util.List), (r15v11 java.util.List) binds: [B:45:0x0103, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0176, all -> 0x0047, blocks: (B:15:0x003e, B:31:0x0091, B:36:0x00a0, B:40:0x00ce, B:42:0x00ea, B:44:0x00f0, B:47:0x0107, B:50:0x0111, B:55:0x0122, B:59:0x013b, B:65:0x014f, B:22:0x005a, B:25:0x006b, B:28:0x007a), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111 A[Catch: all -> 0x0047, CancellationException -> 0x0176, PHI: r4 r5 r6 r10 r12 r13 r14 r15
  0x0111: PHI (r4v6 int) = (r4v8 int), (r4v9 int) binds: [B:48:0x010d, B:41:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r5v3 int) = (r5v4 int), (r5v5 int) binds: [B:48:0x010d, B:41:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r6v2 int) = (r6v3 int), (r6v4 int) binds: [B:48:0x010d, B:41:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r10v4 int) = (r10v5 int), (r10v6 int) binds: [B:48:0x010d, B:41:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r12v3 int) = (r12v6 int), (r12v7 int) binds: [B:48:0x010d, B:41:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r13v4 int) = (r13v7 int), (r13v8 int) binds: [B:48:0x010d, B:41:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r14v1 int) = (r14v3 int), (r14v4 int) binds: [B:48:0x010d, B:41:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r15v3 java.util.List) = (r15v4 java.util.List), (r15v5 java.util.List) binds: [B:48:0x010d, B:41:0x00e8] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0176, all -> 0x0047, blocks: (B:15:0x003e, B:31:0x0091, B:36:0x00a0, B:40:0x00ce, B:42:0x00ea, B:44:0x00f0, B:47:0x0107, B:50:0x0111, B:55:0x0122, B:59:0x013b, B:65:0x014f, B:22:0x005a, B:25:0x006b, B:28:0x007a), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122 A[Catch: all -> 0x0047, CancellationException -> 0x0176, TryCatch #2 {CancellationException -> 0x0176, all -> 0x0047, blocks: (B:15:0x003e, B:31:0x0091, B:36:0x00a0, B:40:0x00ce, B:42:0x00ea, B:44:0x00f0, B:47:0x0107, B:50:0x0111, B:55:0x0122, B:59:0x013b, B:65:0x014f, B:22:0x005a, B:25:0x006b, B:28:0x007a), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0137  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x0143  */
    /* JADX WARN: Code duplicated, block: B:62:0x0145  */
    /* JADX WARN: Code duplicated, block: B:64:0x014b  */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x016c -> B:69:0x0170). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o(java.util.List r19, defpackage.nq4 r20) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.o(java.util.List, nq4):java.lang.Object");
    }
}
