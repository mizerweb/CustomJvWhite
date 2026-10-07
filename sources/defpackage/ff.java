package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;
import ru.ok.android.externcalls.sdk.dev.CallsSDKException;
import ru.ok.android.onelog.OneLogDirect;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ff implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ ff(gj0 gj0Var, int i) {
        this.a = 14;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                ConcurrentHashMap concurrentHashMap = zj.d;
                float andSet = zj.a.getAndSet(0);
                float andSet2 = zj.b.getAndSet(0);
                float andSet3 = zj.c.getAndSet(0);
                float f = andSet + andSet2 + andSet3;
                if (f > 0.0f) {
                    float f2 = andSet / f;
                    float f3 = andSet3 / f;
                    if (andSet2 / f > 0.25f || f3 > 0.1f) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            zj.a((rc7) entry.getKey(), -((Number) entry.getValue()).intValue());
                        }
                    } else if (f2 > 0.98f) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            zj.a((rc7) entry2.getKey(), ((Number) entry2.getValue()).intValue());
                        }
                    }
                    concurrentHashMap.clear();
                }
                ((Handler) zj.e.getValue()).postDelayed(zj.f, 2000L);
                return;
            case 2:
                long jCurrentTimeMillis = System.currentTimeMillis() - 10000;
                ConcurrentHashMap concurrentHashMap2 = qc7.d;
                Date date = new Date(jCurrentTimeMillis);
                ConcurrentHashMap concurrentHashMap3 = qc7.d;
                synchronized (concurrentHashMap3) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry3 : concurrentHashMap3.entrySet()) {
                            if (((bei) entry3.getValue()).b.compareTo(date) < 0) {
                                linkedHashMap.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                            s31 s31Var = ((bei) entry4.getValue()).a;
                            ConcurrentHashMap concurrentHashMap4 = s31Var.f;
                            Iterator it = concurrentHashMap4.values().iterator();
                            while (it.hasNext()) {
                                ((r31) it.next()).a.close();
                            }
                            concurrentHashMap4.clear();
                            s31Var.j = -1;
                            qc7.d.remove(entry4.getKey());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                ((Handler) zj.e.getValue()).postDelayed(zj.g, 10000L);
                return;
            case 3:
                ed7 ed7Var = uy0.C;
                if (ed7Var != null) {
                    Bitmap[] bitmapArr = (Bitmap[]) ed7Var.d;
                    ArrayList arrayList = null;
                    for (int i2 = 0; i2 < uy0.z; i2++) {
                        if (bitmapArr[i2] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(bitmapArr[i2]);
                        }
                        bitmapArr[i2] = null;
                        ((p88[]) ed7Var.c)[i2] = null;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ((ScheduledExecutorService) cqk.e.j.a.getValue()).execute(new ci(2, arrayList));
                    }
                    uy0.C = null;
                    return;
                }
                return;
            case 4:
                throw new CallsSDKException("It's test application crash... Please don't worry!", null, 2, null);
            case 5:
            case 6:
                return;
            case 7:
                EglBase10Impl.EglConnection.lambda$new$1();
                return;
            case 8:
                EglBase14Impl.EglConnection.lambda$new$1();
                return;
            case 9:
                OneLogDirect.flush$lambda$2();
                return;
            case 10:
                alc.c.set(alc.b);
                return;
            case 11:
                tvj.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                return;
            case 12:
            case 13:
            case 14:
            default:
                return;
        }
    }

    public /* synthetic */ ff(int i) {
        this.a = i;
    }

    public /* synthetic */ ff(vek vekVar) {
        this.a = 15;
    }

    public /* synthetic */ ff(Object obj, int i, Object obj2) {
        this.a = i;
    }

    public /* synthetic */ ff(Object obj, long j, int i) {
        this.a = i;
    }
}
