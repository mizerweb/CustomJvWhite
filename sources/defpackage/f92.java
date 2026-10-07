package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.ViewGroup;
import com.my.tracker.campaign.CampaignService;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.internal.upload.DbUploader;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f92 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f92(n3 n3Var, cv4 cv4Var, CountDownLatch countDownLatch) {
        this.a = 19;
        this.b = cv4Var;
        this.c = countDownLatch;
    }

    private final void a() throws IllegalAccessException, InvocationTargetException {
        ri2 ri2Var = (ri2) this.b;
        r72 r72Var = (r72) this.c;
        jj0 jj0Var = ri2Var.g;
        if (!((AtomicBoolean) jj0Var.j).getAndSet(true)) {
            je2 je2Var = (je2) jj0Var.e;
            je2Var.getClass();
            je2Var.f = false;
            synchronized (je2Var.b) {
                je2Var.c = null;
                je2Var.e = 0;
                je2Var.d.clear();
            }
            x70 x70Var = (x70) jj0Var.f;
            x70Var.getClass();
            Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
            if (((AtomicBoolean) x70Var.h).compareAndSet(true, false)) {
                sgg sggVar = (sgg) x70Var.i;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                x70Var.i = null;
            }
            if (((ifh) jj0Var.a).d()) {
                lg2 lg2Var = (lg2) ((ifh) jj0Var.a).getValue();
                synchronized (lg2Var.c) {
                    if (lg2Var.d) {
                        throw new IllegalStateException("Check failed.");
                    }
                    ((qg2) lg2Var.a.e.get()).b();
                    lg2Var.d = true;
                }
            }
        }
        if (ri2Var.f != null) {
            Executor executor = ri2Var.d;
            if (executor instanceof pe2) {
                pe2 pe2Var = (pe2) executor;
                synchronized (pe2Var.a) {
                    try {
                        if (!pe2Var.b.isShutdown()) {
                            pe2Var.b.shutdown();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ri2Var.f.quit();
        }
        r72Var.b(null);
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        List list;
        vg4 vg4VarW;
        switch (this.a) {
            case 0:
                i92 i92Var = (i92) this.b;
                t3b t3bVar = (t3b) this.c;
                if (i92Var.i == t3bVar.a) {
                    long j = t3bVar.b;
                    hm4 hm4Var = t3bVar.d;
                    long[] jArr = t3bVar.e;
                    i92Var.i = 0L;
                    rt2 rt2VarK = i92Var.n.K(j);
                    if (rt2VarK != null) {
                        gm0.n("i92", "onMsgGet: insert " + hm4Var.size() + " messages");
                        long c = i92Var.c.a.a;
                        long c2 = i92Var.c.a.b;
                        for (fda fdaVar : i92Var.s.b(i92Var.m.g(rt2VarK.a, jArr))) {
                            int iBinarySearch = Collections.binarySearch(i92Var.d, fdaVar, new ps0(2));
                            if (iBinarySearch < 0) {
                                iBinarySearch = Math.abs(iBinarySearch) - 1;
                            }
                            if (fdaVar.getC() < c) {
                                c = fdaVar.getC();
                            }
                            if (fdaVar.getC() > c2) {
                                c2 = fdaVar.getC();
                            }
                            i92Var.d.add(iBinarySearch, fdaVar);
                            i92Var.e.add(Long.valueOf(fdaVar.a.a));
                        }
                        i92Var.c.a = new ex2(c, c2);
                        for (long j2 : jArr) {
                            Long lValueOf = Long.valueOf(j2);
                            List list2 = (List) ((LinkedHashMap) i92Var.c.f.a).get(Long.valueOf(j));
                            if (list2 != null) {
                                list2.remove(lValueOf);
                            }
                            if (((List) ((LinkedHashMap) i92Var.c.f.a).get(Long.valueOf(j))) != null) {
                                if (((List) ((LinkedHashMap) i92Var.c.f.a).get(Long.valueOf(j))).isEmpty()) {
                                    ((LinkedHashMap) i92Var.c.f.a).remove(Long.valueOf(j));
                                }
                            }
                        }
                        i92Var.f();
                    } else {
                        ((LinkedHashMap) i92Var.c.f.a).remove(Long.valueOf(j));
                    }
                    i92Var.h();
                    i92Var.b();
                    return;
                }
                return;
            case 1:
                i92 i92Var2 = (i92) this.b;
                so4 so4Var = (so4) this.c;
                CopyOnWriteArrayList copyOnWriteArrayList = i92Var2.d;
                if (!i92Var2.a || copyOnWriteArrayList.isEmpty() || so4Var.b.isEmpty() || (list = so4Var.b) == null || list.isEmpty() || copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    rt2 rt2VarN = i92Var2.n.N(((fda) it.next()).a.h);
                    if (rt2VarN != null && rt2VarN.h0() && (vg4VarW = rt2VarN.w()) != null && list.contains(Long.valueOf(vg4VarW.v()))) {
                        i92Var2.f();
                        return;
                    }
                }
                return;
            case 2:
                i92 i92Var3 = (i92) this.b;
                j3b j3bVar = (j3b) this.c;
                long j3 = j3bVar.b;
                List list3 = j3bVar.e;
                long j4 = j3bVar.c;
                long j5 = j3bVar.d;
                CopyOnWriteArrayList<fda> copyOnWriteArrayList2 = i92Var3.d;
                if (i92Var3.a) {
                    ArrayList arrayList = new ArrayList();
                    if (list3 != null && list3.size() > 0) {
                        for (fda fdaVar2 : copyOnWriteArrayList2) {
                            if (list3.contains(Long.valueOf(fdaVar2.a.a))) {
                                arrayList.add(fdaVar2);
                            }
                        }
                    }
                    if (j4 > 0 || j5 > 0) {
                        for (fda fdaVar3 : copyOnWriteArrayList2) {
                            sfa sfaVar = fdaVar3.a;
                            if (sfaVar.h == j3) {
                                long j6 = sfaVar.c;
                                if (j6 >= j4 && j6 <= j5) {
                                    arrayList.add(fdaVar3);
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        gm0.n("i92", "MsgDeleteEvent: remove " + arrayList.size() + " messages");
                        copyOnWriteArrayList2.removeAll(arrayList);
                        i92Var3.f();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((hi2) this.b).a.onCaptureSequenceAborted((CameraCaptureSession) this.c, -1);
                return;
            case 4:
                ((he2) this.b).a = (fh2) this.c;
                return;
            case 5:
                wg2 wg2Var = (wg2) this.b;
                Set<ff2> set = (Set) this.c;
                tw5 tw5Var = wg2Var.a;
                wxl.a();
                synchronized (tw5Var.a) {
                    try {
                        for (ff2 ff2Var : set) {
                            Set setKeySet = ((HashMap) tw5Var.f).keySet();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : setKeySet) {
                                if (((ff2) obj).a.equals(ff2Var.a)) {
                                    arrayList2.add(obj);
                                }
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ((HashMap) tw5Var.f).remove((ff2) it2.next());
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 6:
                ((pf2) this.b).j().b().j((srb) this.c);
                return;
            case 7:
                ((nf2) this.b).b().f((vg2) this.c);
                return;
            case 8:
                dh2 dh2Var = (dh2) this.b;
                pf2 pf2Var = (pf2) this.c;
                synchronized (dh2Var.a) {
                    try {
                        dh2Var.c.remove(pf2Var);
                        if (dh2Var.c.isEmpty()) {
                            dh2Var.e.getClass();
                            dh2Var.e.b(null);
                            dh2Var.e = null;
                            dh2Var.d = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 9:
                ((ug4) this.b).accept((wg0) this.c);
                return;
            case 10:
                a();
                return;
            case 11:
                ((CampaignService) this.b).a((String) this.c);
                return;
            case 12:
                sb8.h((oyj) this.b, ((UUID) this.c).toString());
                return;
            case 13:
                ((rs2) this.b).n((wgh) this.c);
                return;
            case 14:
                Context context = (Context) this.b;
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newUri(context.getContentResolver(), "image/jpeg", (Uri) this.c));
                return;
            case 15:
                ((cle) this.b).o0((fle) this.c);
                return;
            case 16:
                kf4 kf4Var = (kf4) this.b;
                eqb eqbVar = (eqb) this.c;
                try {
                    eqbVar.a(kf4Var.a.b);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    eqbVar.onError(e);
                    return;
                }
            case 17:
                List list4 = (List) this.b;
                fg4 fg4Var = (fg4) this.c;
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    ((jq0) it3.next()).a(fg4Var.e);
                }
                return;
            case 18:
                qq4 qq4Var = (qq4) this.b;
                ((Runnable) this.c).run();
                qq4Var.c.countDown();
                return;
            case 19:
                cv4 cv4Var = (cv4) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                j85.z(Collections.singletonList(cv4Var));
                countDownLatch.countDown();
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                mx4.l((mx4) this.b, (tfe) this.c);
                return;
            case 21:
                mx4.k((l68) this.b, (mx4) this.c);
                return;
            case 22:
                sz4 sz4Var = (sz4) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(sz4Var.c);
                StrictMode.ThreadPolicy threadPolicy = sz4Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 23:
                DbUploader._init_$lambda$0((Provider) this.b, (DbUploader) this.c);
                return;
            case 24:
                da5 da5Var = (da5) this.b;
                b87 b87Var = (b87) this.c;
                ea5 ea5Var = da5Var.d;
                if (ea5Var.p == 0 || da5Var.c) {
                    return;
                }
                Looper looper = ea5Var.t;
                looper.getClass();
                da5Var.b = ea5Var.e(looper, da5Var.a, b87Var, false);
                ea5Var.n.add(da5Var);
                return;
            case 25:
                cb5 cb5Var = (cb5) this.b;
                Uri uri = (Uri) this.c;
                cb5Var.i = false;
                cb5Var.e(uri);
                return;
            case 26:
                ((ViewGroup) this.b).endViewTransition(null);
                throw null;
            case 27:
                ((fe5) this.b).k.add((dh0) this.c);
                return;
            case 28:
                fe5 fe5Var = (fe5) this.b;
                cch cchVar = (cch) this.c;
                Surface surfaceG = cchVar.g(fe5Var.c, new ro7(fe5Var, 2, cchVar));
                fe5Var.a.p(surfaceG);
                fe5Var.h.put(cchVar, surfaceG);
                return;
            default:
                final fe5 fe5Var2 = (fe5) this.b;
                final ich ichVar = (ich) this.c;
                fe5Var2.i++;
                pp5 pp5Var = fe5Var2.a;
                xg7.d((AtomicBoolean) pp5Var.b, true);
                xg7.c((Thread) pp5Var.d);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(pp5Var.a);
                Size size = ichVar.b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                us7 us7Var = fe5Var2.c;
                ichVar.c(us7Var, new hu(fe5Var2, 20, ichVar));
                ichVar.b(surface, us7Var, new ug4() { // from class: ee5
                    @Override // defpackage.ug4
                    public final void accept(Object obj2) {
                        ichVar.a();
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface.release();
                        fe5 fe5Var3 = fe5Var2;
                        fe5Var3.i--;
                        fe5Var3.a();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(fe5Var2, fe5Var2.d);
                return;
        }
    }

    public /* synthetic */ f92(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
