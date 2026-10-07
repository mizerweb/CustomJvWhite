package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a4c;
import defpackage.af7;
import defpackage.ch3;
import defpackage.er5;
import defpackage.gm0;
import defpackage.hu4;
import defpackage.ifh;
import defpackage.ir5;
import defpackage.je9;
import defpackage.jjf;
import defpackage.lq4;
import defpackage.n0c;
import defpackage.nq4;
import defpackage.ny8;
import defpackage.or6;
import defpackage.ore;
import defpackage.pjh;
import defpackage.poe;
import defpackage.pq5;
import defpackage.q77;
import defpackage.r77;
import defpackage.rq5;
import defpackage.rt2;
import defpackage.sbi;
import defpackage.ubb;
import defpackage.ufe;
import defpackage.vfe;
import defpackage.w93;
import defpackage.wre;
import defpackage.xhh;
import defpackage.xn3;
import defpackage.xt4;
import defpackage.zo5;
import java.io.File;
import kotlin.Metadata;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bó\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\f\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\f\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\f\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\f\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\f¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileAttachWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Lubb;", "needUpdateWorkerProgressNotifUseCase", "Lr77;", "foregroundServiceVisibility", "Lny8;", "Lxn3;", "chatsRepository", "Lor6;", "fileLoadingNotifications", "Lxhh;", "dispatchers", "Le5d;", "pmsProperties", "Lrs6;", "fileSystem", "Lsua;", "messagesRepository", "Lq18;", "downloader", "Lc2a;", "mediaProcessor", "Lt51;", "uiBus", "Ldr6;", "fileDownloadedNotifier", "Lwd4;", "connectionInfo", "Li50;", "fileAttachStatusService", "Los5;", "downloadRegistrar", "Lct9;", "mediaCacheRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lubb;Lr77;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DownloadFileAttachWorker extends ForegroundWorker {
    public final ny8 A;
    public CharSequence B;
    public String C;
    public final ifh D;
    public final ifh E;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final ifh w;
    public final ifh x;
    public final ny8 y;
    public final ny8 z;

    public DownloadFileAttachWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, ubb ubbVar, r77 r77Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14) {
        super(context, workerParameters, xt4Var, ubbVar, r77Var);
        this.m = ny8Var5;
        this.n = ny8Var6;
        this.o = ny8Var7;
        this.p = ny8Var8;
        this.q = ny8Var9;
        this.r = ny8Var10;
        this.s = ny8Var11;
        this.t = ny8Var12;
        this.u = ny8Var13;
        this.v = ny8Var14;
        final int i = 0;
        this.w = new ifh(new af7(this) { // from class: gr5
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x00df  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v20 java.lang.Object, still in use, count: 2, list:
                  (r1v20 java.lang.Object) from 0x00db: PHI (r1 I:??) = (r1v14 java.lang.Object), (r1v20 java.lang.Object) binds: [B:26:0x00da, B:33:0x00db] A[DONT_GENERATE, DONT_INLINE]
                  (r1v20 java.lang.Object) from 0x00d3: CHECK_CAST (ns5) (r1v20 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // defpackage.af7
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 254
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gr5.invoke():java.lang.Object");
            }
        });
        final int i2 = 1;
        this.x = new ifh(new af7(this) { // from class: gr5
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x00df  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v20 java.lang.Object, still in use, count: 2, list:
                  (r1v20 java.lang.Object) from 0x00db: PHI (r1 I:??) = (r1v14 java.lang.Object), (r1v20 java.lang.Object) binds: [B:26:0x00da, B:33:0x00db] A[DONT_GENERATE, DONT_INLINE]
                  (r1v20 java.lang.Object) from 0x00d3: CHECK_CAST (ns5) (r1v20 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // defpackage.af7
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 254
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gr5.invoke():java.lang.Object");
            }
        });
        this.y = ny8Var;
        this.z = ny8Var2;
        this.A = ny8Var3;
        this.B = "";
        this.C = "";
        this.D = new ifh(new wre(this, ny8Var3, ny8Var4, 15));
        final int i3 = 2;
        this.E = new ifh(new af7(this) { // from class: gr5
            public final /* synthetic */ DownloadFileAttachWorker b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x00df  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v20 java.lang.Object, still in use, count: 2, list:
                  (r1v20 java.lang.Object) from 0x00db: PHI (r1 I:??) = (r1v14 java.lang.Object), (r1v20 java.lang.Object) binds: [B:26:0x00da, B:33:0x00db] A[DONT_GENERATE, DONT_INLINE]
                  (r1v20 java.lang.Object) from 0x00d3: CHECK_CAST (ns5) (r1v20 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // defpackage.af7
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 254
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gr5.invoke():java.lang.Object");
            }
        });
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /* JADX INFO: renamed from: e */
    public final xt4 getI() {
        return ((n0c) ((xhh) this.A.getValue())).d();
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object g(int i, lq4 lq4Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "workers:DownloadFileAttachWorker", zo5.h(i, "File download. onStopWork with reason "), null);
            }
        }
        Object objP = ((er5) this.D.getValue()).p((w93) lq4Var);
        return objP == hu4.a ? objP : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:41:0x00e2, B:43:0x00f0, B:46:0x00f7, B:47:0x00fe), top: B:55:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:41:0x00e2, B:43:0x00f0, B:46:0x00f7, B:47:0x00fe), top: B:55:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object j(lq4 lq4Var) {
        ir5 ir5Var;
        vfe vfeVar;
        vfe vfeVar2;
        ufe ufeVar;
        DownloadFileAttachWorker downloadFileAttachWorker;
        vfe vfeVar3;
        vfe vfeVar4;
        String str;
        Object poeVar;
        File fileK;
        CharSequence charSequence;
        if (lq4Var instanceof ir5) {
            ir5Var = (ir5) lq4Var;
            int i = ir5Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ir5Var.j = i - Integer.MIN_VALUE;
            } else {
                ir5Var = new ir5(this, (nq4) lq4Var);
            }
        } else {
            ir5Var = new ir5(this, (nq4) lq4Var);
        }
        Object obj = ir5Var.h;
        hu4 hu4Var = hu4.a;
        int i2 = ir5Var.j;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                ufe ufeVar2 = new ufe();
                ufeVar2.a = -1;
                vfeVar = new vfe();
                vfeVar2 = new vfe();
                vfeVar2.a = -1L;
                rq5 rq5VarL = ((er5) this.D.getValue()).l();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "workers:DownloadFileAttachWorker", "operation.state=" + rq5VarL, null);
                    }
                }
                pq5 pq5Var = rq5VarL instanceof pq5 ? (pq5) rq5VarL : null;
                if (pq5Var != null) {
                    ufeVar2.a = pq5Var.b();
                    vfeVar.a = pq5Var.c();
                    vfeVar2.a = pq5Var.a();
                }
                if (vfeVar2.a == -1 || this.B.length() != 0) {
                    ufeVar = ufeVar2;
                } else {
                    xn3 xn3Var = (xn3) this.y.getValue();
                    long j = vfeVar2.a;
                    ir5Var.d = ufeVar2;
                    ir5Var.e = vfeVar;
                    ir5Var.f = vfeVar2;
                    ir5Var.g = this;
                    ir5Var.j = 1;
                    rt2 rt2VarH = xn3Var.h(j);
                    if (rt2VarH == hu4Var) {
                        return hu4Var;
                    }
                    ufeVar = ufeVar2;
                    obj = rt2VarH;
                    downloadFileAttachWorker = this;
                    vfeVar3 = vfeVar;
                    vfeVar4 = vfeVar2;
                }
                str = this.C;
                fileK = ((er5) this.D.getValue()).k();
                if (fileK != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                poeVar = fileK.getName();
                return new q77(((Number) this.x.getValue()).intValue(), ((or6) this.z.getValue()).d(vfeVar2.a, new Long(vfeVar.a), new Long(((pjh) this.w.getValue()).a()), this.B, str + " " + (poeVar instanceof poe ? "" : poeVar), ufeVar.a, false, (PendingIntent) this.E.getValue()), jjf.a);
            }
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            downloadFileAttachWorker = ir5Var.g;
            vfeVar4 = ir5Var.f;
            vfeVar3 = ir5Var.e;
            ufeVar = ir5Var.d;
            ch3.d0(obj);
            fileK = ((er5) this.D.getValue()).k();
            if (fileK != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            poeVar = fileK.getName();
            if (poeVar instanceof poe) {
            }
            return new q77(((Number) this.x.getValue()).intValue(), ((or6) this.z.getValue()).d(vfeVar2.a, new Long(vfeVar.a), new Long(((pjh) this.w.getValue()).a()), this.B, str + " " + (poeVar instanceof poe ? "" : poeVar), ufeVar.a, false, (PendingIntent) this.E.getValue()), jjf.a);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        rt2 rt2Var = (rt2) obj;
        if (rt2Var != null) {
            rt2Var.K0();
            charSequence = rt2Var.j;
            if (charSequence == null) {
                charSequence = "";
            }
        } else {
            charSequence = "";
        }
        downloadFileAttachWorker.B = charSequence;
        vfeVar2 = vfeVar4;
        vfeVar = vfeVar3;
        str = this.C;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r6 == r4) goto L28;
     */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.nq4 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.jr5
            if (r0 == 0) goto L13
            r0 = r6
            jr5 r0 = (defpackage.jr5) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            jr5 r0 = new jr5
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            hu4 r4 = defpackage.hu4.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.ch3.d0(r6)
            goto L81
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r5)
            r5 = 0
            return r5
        L31:
            defpackage.ch3.d0(r6)
            goto L69
        L35:
            defpackage.ch3.d0(r6)
            ny8 r6 = r5.z
            java.lang.Object r6 = r6.getValue()
            or6 r6 = (defpackage.or6) r6
            r6.getClass()
            r6 = 2131824563(0x7f110fb3, float:1.9281957E38)
            android.content.Context r1 = r5.a
            java.lang.String r6 = r1.getString(r6)
            r5.C = r6
            r0.f = r3
            r6 = -1
            boolean r6 = r5.m(r6)
            if (r6 != 0) goto L5d
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r6 < r1) goto L64
        L5d:
            java.lang.Object r6 = r5.n(r0)
            if (r6 != r4) goto L64
            goto L66
        L64:
            sbi r6 = defpackage.sbi.a
        L66:
            if (r6 != r4) goto L69
            goto L80
        L69:
            ifh r6 = r5.D
            java.lang.Object r6 = r6.getValue()
            er5 r6 = (defpackage.er5) r6
            xva r1 = new xva
            r3 = 12
            r1.<init>(r3, r5)
            r0.f = r2
            java.lang.Object r6 = defpackage.er5.n(r6, r1, r0)
            if (r6 != r4) goto L81
        L80:
            return r4
        L81:
            l89 r6 = (defpackage.l89) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileAttachWorker.k(nq4):java.lang.Object");
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final String l() {
        String strD = this.b.b.d("taskName");
        return strD == null ? "workers:DownloadFileAttachWorker" : strD;
    }
}
