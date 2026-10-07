package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;
import androidx.work.WorkerParameters;
import defpackage.a4c;
import defpackage.bu6;
import defpackage.c46;
import defpackage.c5f;
import defpackage.ch3;
import defpackage.cq6;
import defpackage.cqk;
import defpackage.czl;
import defpackage.dhi;
import defpackage.dzh;
import defpackage.e70;
import defpackage.ghi;
import defpackage.gka;
import defpackage.gm0;
import defpackage.hjc;
import defpackage.hu4;
import defpackage.i50;
import defpackage.i89;
import defpackage.ifh;
import defpackage.je9;
import defpackage.jhi;
import defpackage.jjf;
import defpackage.k89;
import defpackage.kfi;
import defpackage.khi;
import defpackage.kka;
import defpackage.l89;
import defpackage.lhi;
import defpackage.lii;
import defpackage.lq4;
import defpackage.mhi;
import defpackage.mii;
import defpackage.n5e;
import defpackage.nhi;
import defpackage.nka;
import defpackage.nq4;
import defpackage.ny8;
import defpackage.o5e;
import defpackage.or6;
import defpackage.ore;
import defpackage.otc;
import defpackage.oyj;
import defpackage.p1j;
import defpackage.pia;
import defpackage.poe;
import defpackage.q77;
import defpackage.qfa;
import defpackage.qhi;
import defpackage.qrc;
import defpackage.qw2;
import defpackage.r0m;
import defpackage.r77;
import defpackage.rt2;
import defpackage.sbi;
import defpackage.sfa;
import defpackage.t51;
import defpackage.ubb;
import defpackage.vbi;
import defpackage.vfi;
import defpackage.vuf;
import defpackage.w50;
import defpackage.wja;
import defpackage.wzj;
import defpackage.xfa;
import defpackage.xt4;
import defpackage.zo5;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u000223B£\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\f\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\f\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\f\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\f\u0012\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0\f\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\f\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\f\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\f¢\u0006\u0004\b0\u00101¨\u00064"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadFileAttachWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Lubb;", "needUpdateWorkerProgressNotifUseCase", "Lr77;", "foregroundServiceVisibility", "Lny8;", "Lt51;", "uiBus", "Lnka;", "messageUploadsRepository", "Lqfa;", "messageController", "Lwzj;", "workerService", "Lcq6;", "fileAttachUploader", "Lqw2;", "chatController", "Lhjc;", "outgoingTypingController", "Lcii;", "uploadMessageUseCase", "Lor6;", "fileLoadingNotifications", "Lzed;", "prefs", "Lxhh;", "dispatchers", "Li50;", "fileAttachStatusService", "Lwd4;", "connectionInfo", "", "Lp1j;", "attachUploadConsumers", "Lrs6;", "fileSystem", "Lmii;", "uploadPerfRegistrar", "Lju6;", "files", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lubb;Lr77;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;)V", "dhi", "ehi", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UploadFileAttachWorker extends ForegroundWorker {
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final ny8 D;
    public volatile int E;
    public volatile l89 F;
    public long G;
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
    public final ny8 w;
    public final ny8 x;
    public final ny8 y;
    public final ny8 z;

    public UploadFileAttachWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, ubb ubbVar, r77 r77Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17) {
        super(context, workerParameters, xt4Var, ubbVar, r77Var);
        this.m = new ifh(new vbi(2, this));
        this.n = ny8Var2;
        this.o = ny8Var;
        this.p = ny8Var3;
        this.q = ny8Var4;
        this.r = ny8Var5;
        this.s = ny8Var6;
        this.t = ny8Var7;
        this.u = ny8Var8;
        this.v = ny8Var9;
        this.w = ny8Var10;
        this.x = ny8Var11;
        this.y = ny8Var12;
        this.z = ny8Var13;
        this.A = ny8Var14;
        this.B = ny8Var15;
        this.C = ny8Var16;
        this.D = ny8Var17;
        this.E = -1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object o(UploadFileAttachWorker uploadFileAttachWorker, nq4 nq4Var) {
        khi khiVar;
        if (nq4Var instanceof khi) {
            khiVar = (khi) nq4Var;
            int i = khiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                khiVar.f = i - Integer.MIN_VALUE;
            } else {
                khiVar = new khi(uploadFileAttachWorker, nq4Var);
            }
        } else {
            khiVar = new khi(uploadFileAttachWorker, nq4Var);
        }
        Object obj = khiVar.d;
        Object obj2 = hu4.a;
        int i2 = khiVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.m("UploadFileAttachWorker", "onUploadCancel: %s", uploadFileAttachWorker.p().a);
            khiVar.f = 1;
            if (uploadFileAttachWorker.z(khiVar) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        ConcurrentHashMap.KeySetView keySetView = dhi.a;
        dhi.a(uploadFileAttachWorker.p().a.c);
        uploadFileAttachWorker.F = new k89();
        return sbi.a;
    }

    public final void A(w50 w50Var) {
        gm0.m("UploadFileAttachWorker", "sendTyping %s", p());
        rt2 rt2VarN = ((qw2) this.s.getValue()).N(p().a.b);
        if (rt2VarN == null) {
            gm0.Y(UploadFileAttachWorker.class.getName(), "Early return in sendTyping cuz of chatSync is null");
        } else {
            ((hjc) this.t.getValue()).g(rt2VarN.b.a, w50Var, p().a.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        if (u(r1, r3) == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012d, code lost:
    
        if (u(r1, r3) == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0196, code lost:
    
        if (r10.collect(r1, r3) == r4) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(java.util.concurrent.atomic.AtomicLong r17, defpackage.nq4 r18) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.B(java.util.concurrent.atomic.AtomicLong, nq4):java.lang.Object");
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object g(int i, lq4 lq4Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "UploadFileAttachWorker", zo5.h(i, "onStopWork: reason="), null);
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object j(lq4 lq4Var) {
        ghi ghiVar;
        rt2 rt2VarN;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        rt2 rt2Var;
        Object poeVar;
        String strP;
        String string;
        String str;
        if (lq4Var instanceof ghi) {
            ghiVar = (ghi) lq4Var;
            int i = ghiVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ghiVar.h = i - Integer.MIN_VALUE;
            } else {
                ghiVar = new ghi(this, (nq4) lq4Var);
            }
        } else {
            ghiVar = new ghi(this, (nq4) lq4Var);
        }
        Object obj = ghiVar.f;
        Object obj2 = hu4.a;
        int i2 = ghiVar.h;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                PendingIntent pendingIntentA = oyj.d(this.a).a(this.b.a);
                rt2VarN = ((qw2) this.s.getValue()).N(p().a.b);
                if (rt2VarN == null) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4c.f(a4cVar, je9.g, "UploadFileAttachWorker", "chat is null in getForegroundInfo!", null, null, 8);
                    }
                    ghiVar.d = pendingIntentA;
                    ghiVar.e = rt2VarN;
                    ghiVar.h = 1;
                    if (y(ghiVar) == obj2) {
                        return obj2;
                    }
                    pendingIntent2 = pendingIntentA;
                    rt2Var = rt2VarN;
                } else {
                    pendingIntent = pendingIntentA;
                }
                poeVar = new File(p().b).getName();
                if (poeVar instanceof poe) {
                    poeVar = "";
                }
                Context context = this.a;
                ((or6) this.v.getValue()).getClass();
                strP = zo5.p(context.getString(R.string.tt_worker_attach_upload), " ", (String) poeVar);
                or6 or6Var = (or6) this.v.getValue();
                long j = p().a.b;
                if (rt2VarN != null || (string = rt2VarN.F()) == null) {
                    Context context2 = this.a;
                    ((or6) this.v.getValue()).getClass();
                    string = context2.getString(R.string.tt_worker_attach_upload);
                }
                String str2 = string;
                if (rt2VarN == null) {
                    str = null;
                } else {
                    str = strP;
                }
                return new q77(p().a.hashCode(), or6Var.d(j, null, null, str2, str, this.E, true, pendingIntent), jjf.a);
            }
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rt2Var = ghiVar.e;
            pendingIntent2 = ghiVar.d;
            ch3.d0(obj);
            poeVar = new File(p().b).getName();
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        this.F = new i89();
        pendingIntent = pendingIntent2;
        rt2VarN = rt2Var;
        if (poeVar instanceof poe) {
            poeVar = "";
        }
        Context context3 = this.a;
        ((or6) this.v.getValue()).getClass();
        strP = zo5.p(context3.getString(R.string.tt_worker_attach_upload), " ", (String) poeVar);
        or6 or6Var2 = (or6) this.v.getValue();
        long j2 = p().a.b;
        if (rt2VarN != null) {
            Context context4 = this.a;
            ((or6) this.v.getValue()).getClass();
            string = context4.getString(R.string.tt_worker_attach_upload);
        } else {
            Context context5 = this.a;
            ((or6) this.v.getValue()).getClass();
            string = context5.getString(R.string.tt_worker_attach_upload);
        }
        String str3 = string;
        if (rt2VarN == null) {
            str = null;
        } else {
            str = strP;
        }
        return new q77(p().a.hashCode(), or6Var2.d(j2, null, null, str3, str, this.E, true, pendingIntent), jjf.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01db  */
    /* JADX WARN: Code duplicated, block: B:102:0x01df  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:118:0x0216  */
    /* JADX WARN: Code duplicated, block: B:121:0x0221  */
    /* JADX WARN: Code duplicated, block: B:123:0x0224  */
    /* JADX WARN: Code duplicated, block: B:128:0x0235  */
    /* JADX WARN: Code duplicated, block: B:132:0x026b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:133:0x026c  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e A[PHI: r3
  0x005e: PHI (r3v4 java.util.concurrent.atomic.AtomicLong) = (r3v2 java.util.concurrent.atomic.AtomicLong), (r3v10 java.util.concurrent.atomic.AtomicLong) binds: [B:30:0x00d3, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f8 A[PHI: r1 r3 r6
  0x00f8: PHI (r1v17 java.lang.Object) = (r1v14 java.lang.Object), (r1v1 java.lang.Object) binds: [B:35:0x00f4, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x00f8: PHI (r3v16 sfa) = (r3v7 sfa), (r3v53 sfa) binds: [B:35:0x00f4, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x00f8: PHI (r6v4 java.util.concurrent.atomic.AtomicLong) = (r6v3 java.util.concurrent.atomic.AtomicLong), (r6v10 java.util.concurrent.atomic.AtomicLong) binds: [B:35:0x00f4, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x011a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0144  */
    /* JADX WARN: Code duplicated, block: B:45:0x014a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0154  */
    /* JADX WARN: Code duplicated, block: B:49:0x015c  */
    /* JADX WARN: Code duplicated, block: B:50:0x015f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0169  */
    /* JADX WARN: Code duplicated, block: B:54:0x016d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0175  */
    /* JADX WARN: Code duplicated, block: B:57:0x0179  */
    /* JADX WARN: Code duplicated, block: B:58:0x0187  */
    /* JADX WARN: Code duplicated, block: B:60:0x018b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0191  */
    /* JADX WARN: Code duplicated, block: B:64:0x0193  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:69:0x019d  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:78:0x01af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d9  */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020c, code lost:
    
        if (u(r1, r2) == r8) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0291, code lost:
    
        if (u(r1, r2) == r8) goto L135;
     */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.nq4 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.k(nq4):java.lang.Object");
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /* JADX INFO: renamed from: l */
    public final String getM() {
        String strD = this.b.b.d("workName");
        return strD == null ? "UploadFileAttachWorker" : strD;
    }

    public final gka p() {
        return (gka) this.m.getValue();
    }

    public final qfa q() {
        return (qfa) this.p.getValue();
    }

    public final mii r() {
        return (mii) this.C.getValue();
    }

    public final t51 s() {
        return (t51) this.o.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(sfa sfaVar, nq4 nq4Var) {
        jhi jhiVar;
        c46 c46Var;
        if (nq4Var instanceof jhi) {
            jhiVar = (jhi) nq4Var;
            int i = jhiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jhiVar.f = i - Integer.MIN_VALUE;
            } else {
                jhiVar = new jhi(this, nq4Var);
            }
        } else {
            jhiVar = new jhi(this, nq4Var);
        }
        Object obj = jhiVar.d;
        int i2 = jhiVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            if (sfaVar == null) {
                sfaVar = q().l(p().a.a);
            }
            if (sfaVar != null && sfaVar.j != wja.DELETED && (c46Var = sfaVar.n) != null && c46Var.i() > 0) {
                Iterator it = ((List) c46Var.a).iterator();
                while (it.hasNext()) {
                    if (cqk.d(((e70) it.next()).t, p().a.c)) {
                        return Boolean.FALSE;
                    }
                }
            }
            gm0.W("UploadFileAttachWorker", "cancelUploadIfMessageIsDeleted: message or attach is deleted %s", p());
            jhiVar.f = 1;
            Object objY = y(jhiVar);
            Object obj2 = hu4.a;
            if (objY == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(Throwable th, lq4 lq4Var) {
        lhi lhiVar;
        if (lq4Var instanceof lhi) {
            lhiVar = (lhi) lq4Var;
            int i = lhiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                lhiVar.f = i - Integer.MIN_VALUE;
            } else {
                lhiVar = new lhi(this, lq4Var);
            }
        } else {
            lhiVar = new lhi(this, lq4Var);
        }
        Object obj = lhiVar.d;
        Object obj2 = hu4.a;
        int i2 = lhiVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "UploadFileAttachWorker", "onUploadFailed: " + p().a + ". Worker stopReason=" + i() + ", " + gm0.N(th), th);
                }
            }
            if (th instanceof HttpErrorException) {
                t51 t51VarS = s();
                long j = p().a.b;
                t51VarS.c(new bu6(((HttpErrorException) th).getA()));
            } else if (th instanceof TamErrorException) {
                s().c(new otc(((TamErrorException) th).a));
            }
            this.E = -1;
            sfa sfaVarL = q().l(p().a.a);
            if (sfaVarL == null || sfaVarL.j == wja.DELETED) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    a4c.f(a4cVar2, je9.g, "UploadFileAttachWorker", "failMessageUpload: message is deleted", null, null, 8);
                }
            } else {
                q().p(sfaVarL, xfa.ERROR);
                q().n(p().a.a, p().a.c, new dzh(11));
                s().c(new kfi(p().a.b, p().a.a, false));
            }
            ((wzj) this.q.getValue()).b();
            ((cq6) this.r.getValue()).a(p().a.a, false);
            lhiVar.f = 1;
            if (y(lhiVar) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        this.F = new i89();
        Iterator it = ((List) this.A.getValue()).iterator();
        while (it.hasNext()) {
            ((p1j) it.next()).a(r0m.a(p().d), p().b.hashCode(), p().a.a, p().a.b);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object v(kka kkaVar, lq4 lq4Var) {
        mhi mhiVar;
        vfi vfiVar;
        long j;
        long j2;
        String str;
        sbi sbiVar = sbi.a;
        if (lq4Var instanceof mhi) {
            mhiVar = (mhi) lq4Var;
            int i = mhiVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                mhiVar.j = i - Integer.MIN_VALUE;
            } else {
                mhiVar = new mhi(this, lq4Var);
            }
        } else {
            mhiVar = new mhi(this, lq4Var);
        }
        Object obj = mhiVar.h;
        Object obj2 = hu4.a;
        int i2 = mhiVar.j;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.m("UploadFileAttachWorker", "onUploadProgress %s, %s", p(), kkaVar);
            long j3 = p().a.a;
            String str2 = p().a.c;
            long j4 = p().a.b;
            vfiVar = kkaVar.a;
            this.E = czl.b(vfiVar.e);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - this.G < this.l) {
                ((i50) this.y.getValue()).a(new o5e(j3, vfiVar.f, vfiVar.e, str2, p().d));
                s().c(new kfi(j4, j3, false));
                return sbiVar;
            }
            this.G = jElapsedRealtime;
            mhiVar.d = str2;
            mhiVar.e = vfiVar;
            mhiVar.f = j3;
            mhiVar.g = j4;
            mhiVar.j = 1;
            Object objT = t(null, mhiVar);
            if (objT == obj2) {
                return obj2;
            }
            obj = objT;
            j = j3;
            j2 = j4;
            str = str2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = mhiVar.g;
            long j6 = mhiVar.f;
            vfiVar = mhiVar.e;
            String str3 = mhiVar.d;
            ch3.d0(obj);
            j2 = j5;
            j = j6;
            str = str3;
        }
        if (((Boolean) obj).booleanValue()) {
            this.F = new i89();
            qrc.m(r(), lii.ATTACH_OR_MSG_DELETED, str, null, 28);
            return sbiVar;
        }
        A(r0m.a(vfiVar.a.c()));
        q().n(j, str, new vuf(21, vfiVar));
        ((i50) this.y.getValue()).a(new o5e(j, vfiVar.f, vfiVar.e, str, p().d));
        s().c(new kfi(j2, j, false));
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object w(kka kkaVar, lq4 lq4Var) {
        nhi nhiVar;
        long j;
        long j2;
        if (lq4Var instanceof nhi) {
            nhiVar = (nhi) lq4Var;
            int i = nhiVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhiVar.h = i - Integer.MIN_VALUE;
            } else {
                nhiVar = new nhi(this, lq4Var);
            }
        } else {
            nhiVar = new nhi(this, lq4Var);
        }
        Object obj = nhiVar.f;
        Object obj2 = hu4.a;
        int i2 = nhiVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.m("UploadFileAttachWorker", "onUploadSuccess: key=%s, messageUploadState=%s", p().a, kkaVar);
            long j3 = p().a.a;
            String str = p().a.c;
            long j4 = p().a.b;
            q().n(j3, str, new c5f(kkaVar, 10, this));
            ((i50) this.y.getValue()).a(new n5e(j3, kkaVar.a.f, str, p().d));
            nhiVar.d = j3;
            nhiVar.e = j4;
            nhiVar.h = 1;
            if (y(nhiVar) == obj2) {
                return obj2;
            }
            j = j3;
            j2 = j4;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = nhiVar.e;
            long j6 = nhiVar.d;
            ch3.d0(obj);
            j2 = j5;
            j = j6;
        }
        s().c(new kfi(j2, j, false));
        ((wzj) this.q.getValue()).b();
        this.F = new k89();
        for (p1j p1jVar : (List) this.A.getValue()) {
            r0m.a(p().d);
            p().b.getClass();
            long j7 = p().a.a;
            long j8 = p().a.b;
            p1jVar.getClass();
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[PHI: r0 r1 r5
  0x00bc: PHI (r0v1 ru.ok.tamtam.upload.workers.UploadFileAttachWorker) = (r0v0 ru.ok.tamtam.upload.workers.UploadFileAttachWorker), (r0v8 ru.ok.tamtam.upload.workers.UploadFileAttachWorker) binds: [B:32:0x00b9, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00bc: PHI (r1v16 java.lang.Object) = (r1v14 java.lang.Object), (r1v1 java.lang.Object) binds: [B:32:0x00b9, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00bc: PHI (r5v11 long) = (r5v8 long), (r5v15 long) binds: [B:32:0x00b9, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r5 == r4) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(java.util.concurrent.atomic.AtomicLong r20, defpackage.lq4 r21) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.x(java.util.concurrent.atomic.AtomicLong, lq4):java.lang.Object");
    }

    public final Object y(nq4 nq4Var) {
        gm0.m("UploadFileAttachWorker", "removeUpload %s", p());
        gm0.m("UploadFileAttachWorker", "stopTyping %s", p());
        rt2 rt2VarN = ((qw2) this.s.getValue()).N(p().a.b);
        if (rt2VarN == null) {
            gm0.Y(UploadFileAttachWorker.class.getName(), "Early return in stopTyping cuz of chatSync is null");
        } else {
            ((hjc) this.t.getValue()).c(rt2VarN.b.a, p().a.a);
        }
        Object objZ = z(nq4Var);
        return objZ == hu4.a ? objZ : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(nq4 nq4Var) {
        qhi qhiVar;
        if (nq4Var instanceof qhi) {
            qhiVar = (qhi) nq4Var;
            int i = qhiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qhiVar.f = i - Integer.MIN_VALUE;
            } else {
                qhiVar = new qhi(this, nq4Var);
            }
        } else {
            qhiVar = new qhi(this, nq4Var);
        }
        Object obj = qhiVar.d;
        int i2 = qhiVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                nka nkaVar = (nka) this.n.getValue();
                pia piaVar = p().a;
                qhiVar.f = 1;
                Object objE = nkaVar.e(piaVar, qhiVar);
                hu4 hu4Var = hu4.a;
                if (objE == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
            gm0.m("UploadFileAttachWorker", "removeUploadFromStorage: success %s", p());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V("UploadFileAttachWorker", "removeUploadFromStorage failure", th);
        }
        return sbi.a;
    }
}
