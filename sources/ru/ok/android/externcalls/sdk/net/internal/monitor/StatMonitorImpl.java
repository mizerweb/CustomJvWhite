package ru.ok.android.externcalls.sdk.net.internal.monitor;

import defpackage.a4e;
import defpackage.agg;
import defpackage.cgg;
import defpackage.cqk;
import defpackage.egg;
import defpackage.fgg;
import defpackage.fqb;
import defpackage.gm0;
import defpackage.grl;
import defpackage.oc9;
import defpackage.pk2;
import defpackage.sv0;
import defpackage.y3e;
import defpackage.yi9;
import defpackage.zqb;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00070\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u00060\u0016R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00060\u0016R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitorImpl;", "Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;", "Ly3e;", "logger", "<init>", "(Ly3e;)V", "La4e;", "Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;", "mapToMonitoringStat", "(La4e;)Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;", "Lfqb;", "observeStat", "()Lfqb;", "rtcStat", "Lsbi;", "onRtcStats", "(La4e;)V", "Ly3e;", "Lsv0;", "kotlin.jvm.PlatformType", "statSubject", "Lsv0;", "Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitorImpl$LossCalculator;", "audioLossCalculator", "Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitorImpl$LossCalculator;", "videoLossCalculator", "Companion", "LossCalculator", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StatMonitorImpl implements StatMonitor {
    private static final String LOG_TAG = "StatMonitorImpl";
    private final y3e logger;
    private final sv0 statSubject = new sv0();
    private final LossCalculator audioLossCalculator = new LossCalculator();
    private final LossCalculator videoLossCalculator = new LossCalculator();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0013\u001a\u0004\u0018\u00010\u000e\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitorImpl$LossCalculator;", "", "<init>", "(Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitorImpl;)V", "Lcgg;", "T", "", "Lfgg;", "ssrcs", "findSender", "(Ljava/util/List;)Lcgg;", "Ljava/math/BigInteger;", "packetLost", "packetSent", "", "calculateLoss", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/lang/Float;", "round", "(F)F", "getLoss", "(Ljava/util/List;)Ljava/lang/Float;", "Lyi9;", "lossCalc", "Lyi9;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class LossCalculator {
        private final yi9 lossCalc = new yi9();

        public LossCalculator() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Float calculateLoss(BigInteger packetLost, BigInteger packetSent) {
            if (packetSent == null || packetLost == null) {
                return null;
            }
            return Float.valueOf(round(oc9.u((float) this.lossCalc.a(packetLost.longValue(), packetSent.longValue()), 0.0f, 1.0f)));
        }

        private final /* synthetic */ <T extends cgg> T findSender(List<? extends fgg> ssrcs) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = ssrcs.iterator();
            Object obj = null;
            if (it.hasNext()) {
                it.next();
                cqk.F();
                throw null;
            }
            y3e unused = StatMonitorImpl.this.logger;
            for (Object obj2 : arrayList) {
                if (cqk.d(((cgg) obj2).n, Boolean.FALSE)) {
                    obj = obj2;
                    break;
                }
            }
            return (T) obj;
        }

        private final float round(float f) {
            return gm0.K(f * 100.0f) / 100.0f;
        }

        public final /* synthetic */ <T extends cgg> Float getLoss(List<? extends fgg> ssrcs) {
            Object next;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = ssrcs.iterator();
            if (it.hasNext()) {
                it.next();
                cqk.F();
                throw null;
            }
            y3e unused = StatMonitorImpl.this.logger;
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!cqk.d(((cgg) next).n, Boolean.FALSE));
            cgg cggVar = (cgg) next;
            if (cggVar != null) {
                return calculateLoss(cggVar.i, cggVar.h);
            }
            return null;
        }
    }

    public StatMonitorImpl(y3e y3eVar) {
        this.logger = y3eVar;
    }

    private final NetworkStat mapToMonitoringStat(a4e a4eVar) {
        Object next;
        Object next2;
        pk2 pk2VarC = a4eVar.c();
        if (pk2VarC == null) {
            return new NetworkStat(null, null, null, null, 15, null);
        }
        Double d = pk2VarC.h;
        Integer numValueOf = d != null ? Integer.valueOf(gm0.J(d.doubleValue())) : null;
        ArrayList arrayListD = grl.d(a4eVar.b, pk2VarC);
        LossCalculator lossCalculator = this.audioLossCalculator;
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListD) {
            if (obj instanceof agg) {
                arrayList.add(obj);
            }
        }
        y3e unused = StatMonitorImpl.this.logger;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((cgg) next).n, Boolean.FALSE));
        cgg cggVar = (cgg) next;
        Float fCalculateLoss = cggVar == null ? null : lossCalculator.calculateLoss(cggVar.i, cggVar.h);
        LossCalculator lossCalculator2 = this.videoLossCalculator;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayListD) {
            if (obj2 instanceof egg) {
                arrayList2.add(obj2);
            }
        }
        y3e unused2 = StatMonitorImpl.this.logger;
        Iterator it2 = arrayList2.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!cqk.d(((cgg) next2).n, Boolean.FALSE));
        cgg cggVar2 = (cgg) next2;
        NetworkStat networkStat = new NetworkStat(numValueOf, fCalculateLoss, cggVar2 != null ? lossCalculator2.calculateLoss(cggVar2.i, cggVar2.h) : null, pk2VarC.b);
        this.logger.log(LOG_TAG, "measured stat: " + networkStat);
        return networkStat;
    }

    @Override // ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor
    public fqb observeStat() {
        sv0 sv0Var = this.statSubject;
        sv0Var.getClass();
        return new zqb(sv0Var);
    }

    @Override // ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor, defpackage.tw1
    public void onRtcStats(a4e rtcStat) {
        NetworkStat networkStatMapToMonitoringStat = mapToMonitoringStat(rtcStat);
        if (networkStatMapToMonitoringStat != null) {
            this.statSubject.d(networkStatMapToMonitoringStat);
        }
    }
}
