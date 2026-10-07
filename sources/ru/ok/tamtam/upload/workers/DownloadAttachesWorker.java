package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a3j;
import defpackage.a4c;
import defpackage.af7;
import defpackage.bq5;
import defpackage.bye;
import defpackage.c25;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.cq5;
import defpackage.cqk;
import defpackage.czl;
import defpackage.d70;
import defpackage.e5d;
import defpackage.e70;
import defpackage.e9i;
import defpackage.er5;
import defpackage.ew5;
import defpackage.ghb;
import defpackage.gm0;
import defpackage.hu4;
import defpackage.i89;
import defpackage.ifh;
import defpackage.ifi;
import defpackage.ixl;
import defpackage.j3;
import defpackage.j60;
import defpackage.jd3;
import defpackage.je9;
import defpackage.jjf;
import defpackage.k89;
import defpackage.l89;
import defpackage.lq4;
import defpackage.lrg;
import defpackage.lw5;
import defpackage.mdh;
import defpackage.n61;
import defpackage.nq4;
import defpackage.ns5;
import defpackage.ny8;
import defpackage.o60;
import defpackage.oc9;
import defpackage.ojh;
import defpackage.or6;
import defpackage.ore;
import defpackage.pjh;
import defpackage.poe;
import defpackage.pvb;
import defpackage.q77;
import defpackage.qe7;
import defpackage.r77;
import defpackage.rsl;
import defpackage.rt2;
import defpackage.sbi;
import defpackage.sfa;
import defpackage.sq6;
import defpackage.th2;
import defpackage.tz;
import defpackage.u60;
import defpackage.ubb;
import defpackage.umb;
import defpackage.up8;
import defpackage.us0;
import defpackage.vp5;
import defpackage.vze;
import defpackage.w3m;
import defpackage.wp5;
import defpackage.wy2;
import defpackage.xf5;
import defpackage.xn3;
import defpackage.xp5;
import defpackage.xt4;
import defpackage.y60;
import defpackage.yp5;
import defpackage.zo5;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00011B\u009d\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\f\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\f\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\f\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\f\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\f\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\f\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\f\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\f¢\u0006\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadAttachesWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Lubb;", "needUpdateWorkerProgressNotifUseCase", "Lr77;", "foregroundServiceVisibility", "Lny8;", "Lxn3;", "chatRepository", "Lor6;", "fileLoadingNotifications", "Lrs6;", "fileSystem", "Lsua;", "messagesRepository", "Lq18;", "downloader", "Lc2a;", "mediaProcessor", "Lpvb;", "api", "Lt51;", "uiBus", "Ldr6;", "fileDownloadedNotifier", "Lxhh;", "dispatchers", "Lwd4;", "connectionInfo", "Li50;", "fileAttachStatusService", "Lvze;", "saveToGalleryFromUrlUseCase", "Los5;", "downloadRegistrar", "Lifi;", "messagesUpdateLocalAttachStatusUseCase", "Lct9;", "mediaCacheRepository", "Le5d;", "pmsProperties", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lubb;Lr77;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;Lny8;)V", "osl", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DownloadAttachesWorker extends ForegroundWorker {
    public final String A;
    public final long[] B;
    public final ns5 C;
    public final ny8 D;
    public final ny8 E;
    public final ny8 F;
    public final ny8 G;
    public final CopyOnWriteArrayList H;
    public volatile int I;
    public final ConcurrentHashMap J;
    public CharSequence K;
    public int L;
    public final String M;
    public final ifh N;
    public final ifh O;
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
    public final ny8 w;
    public final ny8 x;
    public final ny8 y;
    public final long z;

    public DownloadAttachesWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, ubb ubbVar, r77 r77Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17) {
        long[] jArr;
        super(context, workerParameters, xt4Var, ubbVar, r77Var);
        this.m = ny8Var3;
        this.n = ny8Var4;
        this.o = ny8Var5;
        this.p = ny8Var6;
        this.q = ny8Var7;
        this.r = ny8Var8;
        this.s = ny8Var9;
        this.t = ny8Var10;
        this.u = ny8Var11;
        this.v = ny8Var12;
        this.w = ny8Var14;
        this.x = ny8Var16;
        this.y = ny8Var17;
        this.z = this.b.b.c(ApiProtocol.PARAM_CHAT_ID, -1L);
        this.A = this.b.b.d("attachLocalId");
        Object obj = this.b.b.a.get("messageIds");
        final int i = 0;
        if (obj instanceof Object[]) {
            int length = ((Object[]) obj).length;
            c25 c25Var = new c25(0, obj);
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = ((Number) c25Var.invoke(Integer.valueOf(i2))).longValue();
            }
        } else {
            jArr = null;
        }
        this.B = jArr;
        this.C = rsl.b(this.b.b.b("place", ns5.UNKNOWN.a()));
        this.D = ny8Var;
        this.E = ny8Var2;
        this.F = ny8Var13;
        this.G = ny8Var15;
        this.H = new CopyOnWriteArrayList();
        this.J = new ConcurrentHashMap();
        this.K = "";
        this.L = R.string.file_downloading_progress_media;
        this.M = "worker:multi-attaches-downloader";
        this.N = new ifh(new af7(this) { // from class: tp5
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                DownloadAttachesWorker downloadAttachesWorker = this.b;
                switch (i3) {
                    case 0:
                        return oyj.d(downloadAttachesWorker.a).a(downloadAttachesWorker.b.a);
                    default:
                        long j = downloadAttachesWorker.z;
                        long[] jArr2 = downloadAttachesWorker.B;
                        return Integer.valueOf((((int) (j ^ (jArr2 != null ? a.Z0(jArr2) : 0L))) * 31) + 948410367);
                }
            }
        });
        final int i3 = 1;
        this.O = new ifh(new af7(this) { // from class: tp5
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                DownloadAttachesWorker downloadAttachesWorker = this.b;
                switch (i4) {
                    case 0:
                        return oyj.d(downloadAttachesWorker.a).a(downloadAttachesWorker.b.a);
                    default:
                        long j = downloadAttachesWorker.z;
                        long[] jArr2 = downloadAttachesWorker.B;
                        return Integer.valueOf((((int) (j ^ (jArr2 != null ? a.Z0(jArr2) : 0L))) * 31) + 948410367);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1 A[PHI: r1
  0x00d1: PHI (r1v9 e70) = (r1v1 e70), (r1v10 e70) binds: [B:36:0x00ad, B:41:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public static final Object o(DownloadAttachesWorker downloadAttachesWorker, e70 e70Var, sfa sfaVar, nq4 nq4Var) {
        bq5 bq5Var;
        String strB;
        Object obj;
        boolean z;
        ConcurrentHashMap concurrentHashMap;
        e70 e70Var2 = e70Var;
        if (nq4Var instanceof bq5) {
            bq5Var = (bq5) nq4Var;
            int i = bq5Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                bq5Var.h = i - Integer.MIN_VALUE;
            } else {
                bq5Var = new bq5(downloadAttachesWorker, nq4Var);
            }
        } else {
            bq5Var = new bq5(downloadAttachesWorker, nq4Var);
        }
        bq5 bq5Var2 = bq5Var;
        Object objB = bq5Var2.f;
        int i2 = bq5Var2.h;
        Object obj2 = hu4.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(objB);
                return objB;
            }
            if (i2 == 2) {
                String str = bq5Var2.e;
                e70 e70Var3 = bq5Var2.d;
                ch3.d0(objB);
                strB = str;
                e70Var2 = e70Var3;
                obj = obj2;
            } else {
                if (i2 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e70Var2 = bq5Var2.d;
                ch3.d0(objB);
            }
            z = ((Boolean) objB).booleanValue();
            concurrentHashMap = downloadAttachesWorker.J;
            if (z) {
                concurrentHashMap.put(new Long(e70Var2.b.i), new Float(100.0f));
                return new k89();
            }
            concurrentHashMap.put(new Long(e70Var2.b.i), new Float(0.0f));
            return new i89();
        }
        ch3.d0(objB);
        if (e70Var2.a == y60.j) {
            cf7 n61Var = new n61(16, downloadAttachesWorker.p.getValue());
            bq5Var2.d = null;
            bq5Var2.h = 1;
            Object objR = downloadAttachesWorker.r(e70Var2, sfaVar, n61Var, bq5Var2);
            return objR == obj2 ? obj2 : objR;
        }
        boolean zD = e70Var2.d();
        o60 o60Var = e70Var2.b;
        if (zD) {
            if (o60Var != null) {
                strB = o60Var.a();
            } else {
                strB = null;
            }
        } else if (o60Var != null) {
            strB = o60Var.b(us0.e);
        } else {
            strB = null;
        }
        ifi ifiVar = (ifi) downloadAttachesWorker.G.getValue();
        long j = downloadAttachesWorker.z;
        long j2 = sfaVar.a;
        obj = obj2;
        String str2 = e70Var2.t;
        bq5Var2.d = e70Var2;
        bq5Var2.e = strB;
        bq5Var2.h = 2;
        if (ifiVar.a(j, j2, str2, u60.c, bq5Var2) == obj) {
            return obj;
        }
        if (strB != null) {
            vze vzeVar = (vze) downloadAttachesWorker.F.getValue();
            boolean z2 = e70Var2.b.e;
            bq5Var2.d = e70Var2;
            bq5Var2.e = null;
            bq5Var2.h = 3;
            objB = vzeVar.b(strB, z2, bq5Var2);
            if (objB == obj) {
                return obj;
            }
            if (((Boolean) objB).booleanValue()) {
            }
        }
        concurrentHashMap = downloadAttachesWorker.J;
        if (z) {
            concurrentHashMap.put(new Long(e70Var2.b.i), new Float(100.0f));
            return new k89();
        }
        concurrentHashMap.put(new Long(e70Var2.b.i), new Float(0.0f));
        return new i89();
    }

    public static final Object p(DownloadAttachesWorker downloadAttachesWorker, e70 e70Var, e70 e70Var2, sfa sfaVar, mdh mdhVar) {
        d70 d70Var = e70Var.d;
        if (d70Var == null) {
            return new i89();
        }
        return (d70Var.a != 0 || e70Var2 == null) ? downloadAttachesWorker.s(e70Var, sfaVar, mdhVar) : downloadAttachesWorker.r(e70Var2, sfaVar, new n61(17, downloadAttachesWorker.p.getValue()), mdhVar);
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object g(int i, lq4 lq4Var) throws IllegalAccessException, InvocationTargetException {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "worker:multi-attaches-downloader", zo5.h(i, "Attaches download was stopped with reason "), null);
            }
        }
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((up8) ((xf5) it.next())).b(null);
        }
        this.H.clear();
        this.J.clear();
        umb umbVar = new umb(this.a);
        umbVar.b.cancel(null, ((Number) this.O.getValue()).intValue());
        return sbi.a;
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object j(lq4 lq4Var) {
        String string;
        Iterator it = this.J.values().iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += ((Number) it.next()).floatValue();
        }
        if (!this.H.isEmpty() && this.I == 1) {
            string = this.a.getString(this.L);
        } else if (this.H.isEmpty() || this.I <= 0) {
            string = this.a.getString(R.string.file_downloading_no_progress);
        } else {
            string = this.a.getString(this.L, new Integer(oc9.v(((int) (fFloatValue / 100.0f)) + 1, 1, this.H.size())), new Integer(this.H.size()));
        }
        String str = string;
        float f = (this.H.isEmpty() || fFloatValue <= 0.0f || this.I == 0) ? -1.0f : fFloatValue / this.I;
        gm0.U("worker:multi-attaches-downloader", "createForegroundInfo: progress=" + fFloatValue + ", fileProcessCounter=" + this.I + ", finalProgress=" + f);
        or6 or6Var = (or6) this.E.getValue();
        long j = this.z;
        long[] jArr = this.B;
        return new q77(((Number) this.O.getValue()).intValue(), or6Var.d(j, null, jArr != null ? new Long(kotlin.collections.a.Z0(jArr)) : null, this.K, str, czl.b(f), false, (PendingIntent) this.N.getValue()), jjf.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object k(nq4 nq4Var) {
        vp5 vp5Var;
        if (nq4Var instanceof vp5) {
            vp5Var = (vp5) nq4Var;
            int i = vp5Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vp5Var.f = i - Integer.MIN_VALUE;
            } else {
                vp5Var = new vp5(this, nq4Var);
            }
        } else {
            vp5Var = new vp5(this, nq4Var);
        }
        Object objK = vp5Var.d;
        int i2 = vp5Var.f;
        if (i2 == 0) {
            ch3.d0(objK);
            wp5 wp5Var = new wp5(this, null);
            vp5Var.f = 1;
            objK = cqk.k(wp5Var, vp5Var);
            hu4 hu4Var = hu4.a;
            if (objK == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK);
        }
        return objK;
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getM() {
        return this.M;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x010d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0112  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object q(e70 e70Var, sfa sfaVar, nq4 nq4Var) {
        xp5 xp5Var;
        long j;
        j60 j60Var;
        e70 e70Var2;
        Object obj;
        Class cls;
        e70 e70Var3;
        sfa sfaVar2;
        j60 j60Var2;
        Object poeVar;
        sq6 sq6Var;
        er5 er5Var;
        er5 er5Var2;
        sfa sfaVar3 = sfaVar;
        if (nq4Var instanceof xp5) {
            xp5Var = (xp5) nq4Var;
            int i = xp5Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                xp5Var.j = i - Integer.MIN_VALUE;
            } else {
                xp5Var = new xp5(this, nq4Var);
            }
        } else {
            xp5Var = new xp5(this, nq4Var);
        }
        Object objM = xp5Var.h;
        int i2 = xp5Var.j;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objM);
            j = 0;
            if (sfaVar3.b == 0) {
                gm0.Y(DownloadAttachesWorker.class.getName(), "Early return in downloadVideoFile cuz of message.serverId == 0L");
                return null;
            }
            j60Var = e70Var.j;
            if (j60Var == null) {
                gm0.Y(DownloadAttachesWorker.class.getName(), "Early return in downloadVideoFile cuz of fileAttach.file is null");
                return null;
            }
            xn3 xn3Var = (xn3) this.D.getValue();
            xp5Var.d = e70Var;
            xp5Var.e = sfaVar3;
            xp5Var.f = j60Var;
            xp5Var.j = 1;
            rt2 rt2VarH = xn3Var.h(this.z);
            if (rt2VarH != hu4Var) {
                e70Var2 = e70Var;
                obj = rt2VarH;
            }
            return hu4Var;
        }
        if (i2 == 1) {
            j60 j60Var3 = xp5Var.f;
            sfaVar3 = xp5Var.e;
            e70Var2 = xp5Var.d;
            ch3.d0(objM);
            j60Var = j60Var3;
            obj = objM;
            j = 0;
        } else {
            if (i2 == 2) {
                j60Var2 = xp5Var.f;
                sfaVar2 = xp5Var.e;
                e70Var3 = xp5Var.d;
                try {
                    ch3.d0(objM);
                    cls = DownloadAttachesWorker.class;
                    try {
                        poeVar = (sq6) objM;
                    } catch (Throwable th) {
                        th = th;
                        poeVar = new poe(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cls = DownloadAttachesWorker.class;
                    poeVar = new poe(th);
                    if (poeVar instanceof poe) {
                        poeVar = null;
                    }
                    sq6Var = (sq6) poeVar;
                    if (sq6Var == null) {
                        gm0.Y(cls.getName(), "Early return in downloadVideoFile cuz of message.serverId == 0L");
                        return null;
                    }
                    String strB = ixl.b(sq6Var.h(), (Map) ((e5d) this.y.getValue()).g().i());
                    ojh ojhVar = new ojh();
                    ojhVar.b(e70Var3.t);
                    ojhVar.f(sfaVar2.a);
                    ojhVar.g(true);
                    ojhVar.d(j60Var2.a);
                    ojhVar.e(j60Var2.c);
                    ojhVar.i(sq6Var.h());
                    ojhVar.c(strB);
                    ojhVar.h(this.C);
                    pjh pjhVarA = ojhVar.a();
                    yp5 yp5Var = new yp5(this, j60Var2, 0);
                    er5Var = new er5(pjhVarA, this.b.c, this.m, this.n, this.o, this.p, this.x, this.r, this.s, this.t, this.u, this.v, this.w, this.y);
                    xp5Var.d = null;
                    xp5Var.e = null;
                    xp5Var.f = null;
                    xp5Var.g = er5Var;
                    xp5Var.j = 3;
                    objM = er5Var.m(null, yp5Var, xp5Var);
                    if (objM != hu4Var) {
                        er5Var2 = er5Var;
                        if (((l89) objM) instanceof k89) {
                            return er5Var2.k();
                        }
                        return null;
                    }
                    return hu4Var;
                }
                if (poeVar instanceof poe) {
                    poeVar = null;
                }
                sq6Var = (sq6) poeVar;
                if (sq6Var == null) {
                    gm0.Y(cls.getName(), "Early return in downloadVideoFile cuz of message.serverId == 0L");
                    return null;
                }
                String strB2 = ixl.b(sq6Var.h(), (Map) ((e5d) this.y.getValue()).g().i());
                ojh ojhVar2 = new ojh();
                ojhVar2.b(e70Var3.t);
                ojhVar2.f(sfaVar2.a);
                ojhVar2.g(true);
                ojhVar2.d(j60Var2.a);
                ojhVar2.e(j60Var2.c);
                ojhVar2.i(sq6Var.h());
                ojhVar2.c(strB2);
                ojhVar2.h(this.C);
                pjh pjhVarA2 = ojhVar2.a();
                yp5 yp5Var2 = new yp5(this, j60Var2, 0);
                er5Var = new er5(pjhVarA2, this.b.c, this.m, this.n, this.o, this.p, this.x, this.r, this.s, this.t, this.u, this.v, this.w, this.y);
                xp5Var.d = null;
                xp5Var.e = null;
                xp5Var.f = null;
                xp5Var.g = er5Var;
                xp5Var.j = 3;
                objM = er5Var.m(null, yp5Var2, xp5Var);
                if (objM != hu4Var) {
                    er5Var2 = er5Var;
                }
                return hu4Var;
            }
            if (i2 != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            er5Var2 = xp5Var.g;
            ch3.d0(objM);
        }
        if (((l89) objM) instanceof k89) {
            return er5Var2.k();
        }
        return null;
        rt2 rt2Var = (rt2) obj;
        if (rt2Var == null) {
            gm0.Y(DownloadAttachesWorker.class.getName(), "Early return in downloadVideoFile cuz of chat is null");
            return null;
        }
        if (!rt2Var.b.g() || (rt2Var.A() == j && !rt2Var.y0())) {
            gm0.Y(DownloadAttachesWorker.class.getName(), "Early return in downloadVideoFile cuz of chat.isInvalid()");
            return null;
        }
        cls = DownloadAttachesWorker.class;
        wy2 wy2Var = new wy2(j60Var.a, rt2Var.A(), sfaVar3.b);
        try {
            pvb pvbVar = (pvb) this.q.getValue();
            xp5Var.d = e70Var2;
            xp5Var.e = sfaVar3;
            xp5Var.f = j60Var;
            xp5Var.j = 2;
            Object objD = pvbVar.D(wy2Var, xp5Var);
            if (objD != hu4Var) {
                e70Var3 = e70Var2;
                sfaVar2 = sfaVar3;
                j60Var2 = j60Var;
                objM = objD;
                poeVar = (sq6) objM;
                if (poeVar instanceof poe) {
                    poeVar = null;
                }
                sq6Var = (sq6) poeVar;
                if (sq6Var == null) {
                    gm0.Y(cls.getName(), "Early return in downloadVideoFile cuz of message.serverId == 0L");
                    return null;
                }
                String strB3 = ixl.b(sq6Var.h(), (Map) ((e5d) this.y.getValue()).g().i());
                ojh ojhVar3 = new ojh();
                ojhVar3.b(e70Var3.t);
                ojhVar3.f(sfaVar2.a);
                ojhVar3.g(true);
                ojhVar3.d(j60Var2.a);
                ojhVar3.e(j60Var2.c);
                ojhVar3.i(sq6Var.h());
                ojhVar3.c(strB3);
                ojhVar3.h(this.C);
                pjh pjhVarA3 = ojhVar3.a();
                yp5 yp5Var3 = new yp5(this, j60Var2, 0);
                er5Var = new er5(pjhVarA3, this.b.c, this.m, this.n, this.o, this.p, this.x, this.r, this.s, this.t, this.u, this.v, this.w, this.y);
                xp5Var.d = null;
                xp5Var.e = null;
                xp5Var.f = null;
                xp5Var.g = er5Var;
                xp5Var.j = 3;
                objM = er5Var.m(null, yp5Var3, xp5Var);
                if (objM != hu4Var) {
                    er5Var2 = er5Var;
                    if (((l89) objM) instanceof k89) {
                        return er5Var2.k();
                    }
                    return null;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            e70Var3 = e70Var2;
            sfaVar2 = sfaVar3;
            j60Var2 = j60Var;
            poeVar = new poe(th);
            if (poeVar instanceof poe) {
                poeVar = null;
            }
            sq6Var = (sq6) poeVar;
            if (sq6Var == null) {
                gm0.Y(cls.getName(), "Early return in downloadVideoFile cuz of message.serverId == 0L");
                return null;
            }
            String strB4 = ixl.b(sq6Var.h(), (Map) ((e5d) this.y.getValue()).g().i());
            ojh ojhVar4 = new ojh();
            ojhVar4.b(e70Var3.t);
            ojhVar4.f(sfaVar2.a);
            ojhVar4.g(true);
            ojhVar4.d(j60Var2.a);
            ojhVar4.e(j60Var2.c);
            ojhVar4.i(sq6Var.h());
            ojhVar4.c(strB4);
            ojhVar4.h(this.C);
            pjh pjhVarA4 = ojhVar4.a();
            yp5 yp5Var4 = new yp5(this, j60Var2, 0);
            er5Var = new er5(pjhVarA4, this.b.c, this.m, this.n, this.o, this.p, this.x, this.r, this.s, this.t, this.u, this.v, this.w, this.y);
            xp5Var.d = null;
            xp5Var.e = null;
            xp5Var.f = null;
            xp5Var.g = er5Var;
            xp5Var.j = 3;
            objM = er5Var.m(null, yp5Var4, xp5Var);
            if (objM != hu4Var) {
                er5Var2 = er5Var;
                if (((l89) objM) instanceof k89) {
                    return er5Var2.k();
                }
                return null;
            }
            return hu4Var;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        if (n(r0) == r5) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(defpackage.e70 r9, defpackage.sfa r10, defpackage.cf7 r11, defpackage.nq4 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.aq5
            if (r0 == 0) goto L13
            r0 = r12
            aq5 r0 = (defpackage.aq5) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            aq5 r0 = new aq5
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f
            int r1 = r0.h
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.ch3.d0(r12)
            goto La9
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r4
        L32:
            j60 r9 = r0.e
            fg7 r10 = r0.d
            r11 = r10
            cf7 r11 = (defpackage.cf7) r11
            defpackage.ch3.d0(r12)
            goto L7a
        L3d:
            defpackage.ch3.d0(r12)
            j60 r12 = r9.j
            if (r12 != 0) goto L4a
            i89 r8 = new i89
            r8.<init>()
            return r8
        L4a:
            java.lang.String r1 = r9.u
            if (r1 == 0) goto L64
            int r6 = r1.length()
            if (r6 <= 0) goto L55
            goto L56
        L55:
            r1 = r4
        L56:
            if (r1 == 0) goto L64
            java.io.File r6 = new java.io.File
            r6.<init>(r1)
            boolean r1 = r6.exists()
            if (r1 == 0) goto L64
            goto L65
        L64:
            r6 = r4
        L65:
            if (r6 != 0) goto L86
            r1 = r11
            fg7 r1 = (defpackage.fg7) r1
            r0.d = r1
            r0.e = r12
            r0.h = r3
            java.lang.Object r9 = r8.q(r9, r10, r0)
            if (r9 != r5) goto L77
            goto La8
        L77:
            r7 = r12
            r12 = r9
            r9 = r7
        L7a:
            r6 = r12
            java.io.File r6 = (java.io.File) r6
            if (r6 != 0) goto L85
            i89 r8 = new i89
            r8.<init>()
            return r8
        L85:
            r12 = r9
        L86:
            r11.invoke(r6)
            long r9 = r12.a
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            java.lang.Float r9 = new java.lang.Float
            r10 = 1120403456(0x42c80000, float:100.0)
            r9.<init>(r10)
            java.util.concurrent.ConcurrentHashMap r10 = r8.J
            r10.put(r11, r9)
            r0.d = r4
            r0.e = r4
            r0.h = r2
            java.lang.Object r8 = r8.n(r0)
            if (r8 != r5) goto La9
        La8:
            return r5
        La9:
            k89 r8 = new k89
            r8.<init>()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadAttachesWorker.r(e70, sfa, cf7, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object s(e70 e70Var, sfa sfaVar, nq4 nq4Var) {
        cq5 cq5Var;
        e70 e70Var2 = e70Var;
        sfa sfaVar2 = sfaVar;
        if (nq4Var instanceof cq5) {
            cq5Var = (cq5) nq4Var;
            int i = cq5Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                cq5Var.h = i - Integer.MIN_VALUE;
            } else {
                cq5Var = new cq5(this, nq4Var);
            }
        } else {
            cq5Var = new cq5(this, nq4Var);
        }
        Object objP = cq5Var.f;
        int i2 = cq5Var.h;
        lq4 lq4Var = null;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objP);
            d70 d70Var = e70Var2.d;
            j3 j3VarX0 = e9i.x0(new bye(new jd3(this, new lrg(d70Var.a, sfaVar2.h, sfaVar2.b, d70Var.o), lq4Var, 23)), 3L, new th2());
            ghb ghbVar = ew5.b;
            tz tzVarJ0 = e9i.J0(j3VarX0, qe7.N(3.3d, lw5.SECONDS));
            cq5Var.d = e70Var2;
            cq5Var.e = sfaVar2;
            cq5Var.h = 1;
            objP = e9i.P(tzVarJ0, cq5Var);
            if (objP != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objP);
                return objP;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sfa sfaVar3 = cq5Var.e;
        e70 e70Var3 = cq5Var.d;
        ch3.d0(objP);
        sfaVar2 = sfaVar3;
        e70Var2 = e70Var3;
        a3j a3jVar = (a3j) objP;
        if (a3jVar == null) {
            return new i89();
        }
        String strA = w3m.a(a3jVar.i());
        if (strA == null || strA.length() == 0) {
            return new i89();
        }
        yp5 yp5Var = new yp5(this, e70Var2, 1);
        ojh ojhVar = new ojh();
        ojhVar.b(e70Var2.t);
        ojhVar.f(sfaVar2.a);
        ojhVar.g(false);
        ojhVar.j(e70Var2.d.a);
        ojhVar.i(strA);
        ojhVar.h(this.C);
        ojhVar.c(a3jVar.h());
        er5 er5Var = new er5(ojhVar.a(), this.b.c, this.m, this.n, this.o, this.p, this.x, this.r, this.s, this.t, this.u, this.v, this.w, this.y);
        cq5Var.d = null;
        cq5Var.e = null;
        cq5Var.h = 2;
        Object objM = er5Var.m(null, yp5Var, cq5Var);
        return objM == hu4Var ? hu4Var : objM;
    }
}
