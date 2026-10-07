package defpackage;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent;
import ru.ok.android.externcalls.sdk.rate.loss.LossHintConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class mdk implements bkg {
    public final /* synthetic */ o91 a;

    public mdk(o91 o91Var) {
        this.a = o91Var;
    }

    /* JADX WARN: Code duplicated, block: B:195:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:260:0x0645  */
    /* JADX WARN: Code duplicated, block: B:261:0x064a  */
    /* JADX WARN: Code duplicated, block: B:264:0x0653  */
    /* JADX WARN: Code duplicated, block: B:265:0x0658  */
    /* JADX WARN: Code duplicated, block: B:271:0x066a  */
    /* JADX WARN: Code duplicated, block: B:276:0x0679  */
    /* JADX WARN: Code duplicated, block: B:280:0x0695  */
    /* JADX WARN: Code duplicated, block: B:299:0x0764  */
    /* JADX WARN: Code duplicated, block: B:419:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:559:0x04bb A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [zfh] */
    /* JADX WARN: Type inference failed for: r0v32, types: [ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent$Builder] */
    /* JADX WARN: Type inference failed for: r0v58, types: [fi9] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v61, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v65, types: [xde] */
    /* JADX WARN: Type inference failed for: r10v66 */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v73 */
    /* JADX WARN: Type inference failed for: r10v74 */
    /* JADX WARN: Type inference failed for: r10v75 */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v78, types: [fi9] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r2v11, types: [ru.ok.android.externcalls.analytics.events.EventItemsMap] */
    /* JADX WARN: Type inference failed for: r3v20, types: [vn7] */
    /* JADX WARN: Type inference failed for: r3v21, types: [ih] */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v85 */
    /* JADX WARN: Type inference failed for: r7v142 */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v76, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.bkg
    public final void a(a4e a4eVar) throws Throwable {
        EventItemsMap eventItemsMap;
        Object obj;
        g9 g9Var;
        Object obj2;
        g9 g9Var2;
        pk2 pk2VarC;
        Object next;
        Object next2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        Object next3;
        agg aggVar;
        dc9 dc9Var;
        Long lValueOf;
        Throwable th;
        ?? ValueOf;
        Map map;
        Object objValueOf;
        Object obj3;
        int i;
        ?? r16;
        ?? r23;
        v5k v5kVar;
        Object next4;
        double d;
        Object objValueOf2;
        Object next5;
        ?? xdeVar;
        ?? r1;
        ?? r2;
        long jLongValue;
        long jLongValue2;
        cc8 cc8VarA;
        Long l;
        Long l2;
        Map mapY = this.a.n0.y();
        o91 o91Var = this.a;
        h32 h32Var = o91Var.M0;
        p8b p8bVar = o91Var.t0;
        boolean z = p8bVar.e;
        boolean z2 = p8bVar.f;
        h32Var.getClass();
        if (h32Var.j.j) {
            d32 d32Var = h32Var.g;
            g85 g85Var = h32Var.h;
            Float f = (Float) ((bv4) g85Var.c).c;
            y50 y50Var = (y50) g85Var.b;
            synchronized (y50Var.g) {
                long j = y50Var.a;
                lValueOf = j == 0 ? null : Long.valueOf(j);
                y50Var.a = 0L;
            }
            y50 y50Var2 = (y50) g85Var.b;
            synchronized (y50Var2.g) {
                try {
                    long j2 = y50Var2.b;
                    if (j2 != 0) {
                        th = null;
                        int i2 = y50Var2.c;
                        if (i2 != 0) {
                            ValueOf = Long.valueOf(j2 / ((long) i2));
                        }
                        y50Var2.c = 0;
                        y50Var2.b = 0L;
                    } else {
                        th = null;
                    }
                    ValueOf = th;
                    y50Var2.c = 0;
                    y50Var2.b = 0L;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iIntValue = ((Number) ((ifh) ((ljf) g85Var.a).e).getValue()).intValue();
            g85 g85Var2 = h32Var.h;
            sti stiVar = (sti) g85Var2.d;
            synchronized (stiVar.e) {
                long j3 = stiVar.c;
                map = mapY;
                objValueOf = j3 == 0 ? th : Long.valueOf(j3);
                stiVar.c = 0L;
            }
            sti stiVar2 = (sti) g85Var2.d;
            synchronized (stiVar2.e) {
                try {
                    long j4 = stiVar2.d;
                    int i3 = stiVar2.g;
                    Object objValueOf3 = (j4 == 0 || i3 == 0) ? th : Long.valueOf(j4 / ((long) i3));
                    stiVar2.g = 0;
                    obj3 = objValueOf3;
                    stiVar2.d = 0L;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            d32Var.getClass();
            xva xvaVar = d32Var.h;
            Long l3 = (Long) xvaVar.b;
            ?? ValueOf2 = l3 == null ? th : Long.valueOf(SystemClock.elapsedRealtime() - l3.longValue());
            xvaVar.b = Long.valueOf(SystemClock.elapsedRealtime());
            if (ValueOf2 != 0) {
                long jLongValue3 = ValueOf2.longValue();
                si9 si9Var = f32.a;
                long j5 = si9Var.a;
                if (jLongValue3 <= si9Var.b && j5 <= jLongValue3) {
                    ?? eventItemsMap2 = new EventItemsMap();
                    d32Var.d.h(eventItemsMap2);
                    d32Var.e.q(eventItemsMap2);
                    n11 n11Var = d32Var.g;
                    if (n11Var.b && ((due) n11Var.c).w() == zvh.c) {
                        eventItemsMap2.set("is_simulcast", Boolean.TRUE);
                    }
                    eventItemsMap2.set("stat_time_delta", String.valueOf(jLongValue3));
                    pk2 pk2VarC2 = a4eVar.c();
                    if (pk2VarC2 != null) {
                        so2.A(eventItemsMap2, pk2VarC2);
                        xde xdeVarC = grl.c(grl.d(a4eVar.b, pk2VarC2));
                        jj0 jj0Var = d32Var.k;
                        ArrayList arrayList = (ArrayList) xdeVarC.e;
                        jj0Var.getClass();
                        if (z2 && !arrayList.isEmpty()) {
                            if (((ex8) jj0Var.j).T(arrayList)) {
                                jj0Var.h();
                            }
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    i = iIntValue;
                                    next4 = th;
                                    break;
                                }
                                next4 = it.next();
                                Iterator it2 = it;
                                i = iIntValue;
                                if (cqk.d(((cgg) next4).n, Boolean.FALSE)) {
                                    break;
                                }
                                it = it2;
                                iIntValue = i;
                            }
                            egg eggVar = (egg) ((cgg) next4);
                            if (eggVar == null) {
                                jj0Var.h();
                            } else {
                                eventItemsMap2.set(LossHintConfig.VIDEO_LOSS, ((uvc) jj0Var.a).d(eggVar.h, eggVar.i));
                                long j6 = eggVar.o;
                                if (j6 != -1) {
                                    eventItemsMap2.set("nack_received", ((fi9) jj0Var.b).a(Long.valueOf(j6)));
                                }
                                long j7 = eggVar.p;
                                if (j7 != -1) {
                                    eventItemsMap2.set("pli_received", ((fi9) jj0Var.c).a(Long.valueOf(j7)));
                                }
                                long j8 = eggVar.q;
                                if (j8 != -1) {
                                    eventItemsMap2.set("fir_received", ((fi9) jj0Var.d).a(Long.valueOf(j8)));
                                }
                                long j9 = eggVar.s;
                                if (j9 != -1) {
                                    eventItemsMap2.set("adaptation_changes", Long.valueOf(j9));
                                }
                                long j10 = eggVar.r;
                                if (j10 != -1) {
                                    Long lA = ((fi9) jj0Var.f).a(Long.valueOf(j10));
                                    eventItemsMap2.set("frames_encoded", lA != null ? Long.valueOf(oc9.x(lA.longValue(), 0L, 10000L)) : th);
                                }
                                BigInteger bigInteger3 = eggVar.j;
                                long jLongValue4 = bigInteger3 != null ? bigInteger3.longValue() : 0L;
                                BigInteger bigInteger4 = eggVar.l;
                                long jLongValue5 = bigInteger4 != null ? bigInteger4.longValue() : 0L;
                                eventItemsMap2.set("br_encode", Long.valueOf((long) (((uw) jj0Var.g).d(jLongValue4 - jLongValue5, SystemClock.elapsedRealtime()) / 1024.0d)));
                                eventItemsMap2.set("br_transmit", Long.valueOf((long) (((uw) jj0Var.h).d(jLongValue4, SystemClock.elapsedRealtime()) / 1024.0d)));
                                eventItemsMap2.set("br_retransmit", Long.valueOf((long) (((uw) jj0Var.i).d(jLongValue5, SystemClock.elapsedRealtime()) / 1024.0d)));
                            }
                        } else {
                            jj0Var.h();
                            i = iIntValue;
                        }
                        pc8 pc8Var = d32Var.j;
                        ArrayList<dgg> arrayList2 = (ArrayList) xdeVarC.c;
                        HashMap map2 = pc8Var.h;
                        if (arrayList2.isEmpty()) {
                            pc8Var.b();
                        } else {
                            if (pc8Var.m.T(arrayList2)) {
                                pc8Var.b();
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj4 : arrayList2) {
                                dgg dggVar = (dgg) obj4;
                                long j11 = dggVar.p;
                                if (j11 != 0 && j11 != -1) {
                                    Long l4 = (Long) map2.get(dggVar.e);
                                    if (l4 == null || j11 > l4.longValue()) {
                                        arrayList3.add(obj4);
                                    } else if (j11 != l4.longValue()) {
                                        pc8Var.b.log("IncomingVideoStatistics", "newFramesReceived < oldFramesReceived");
                                    }
                                }
                            }
                            for (dgg dggVar2 : arrayList2) {
                                long j12 = dggVar2.p;
                                String str = dggVar2.e;
                                str.getClass();
                                if (j12 == -1) {
                                    map2.remove(str);
                                } else {
                                    map2.put(str, Long.valueOf(j12));
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                Long lA2 = pc8Var.c.a(Long.valueOf(pc8.a(arrayList3, l3k.b)));
                                eventItemsMap2.set("nack_sent", lA2 != null ? Long.valueOf(oc9.x(lA2.longValue(), 0L, 10000L)) : th);
                                Long lA3 = pc8Var.d.a(Long.valueOf(pc8.a(arrayList3, e7k.b)));
                                eventItemsMap2.set("pli_sent", lA3 != null ? Long.valueOf(oc9.x(lA3.longValue(), 0L, 10000L)) : th);
                                Long lA4 = pc8Var.e.a(Long.valueOf(pc8.a(arrayList3, ckk.b)));
                                eventItemsMap2.set("fir_sent", lA4 != null ? Long.valueOf(oc9.x(lA4.longValue(), 0L, 10000L)) : th);
                                Long lA5 = pc8Var.g.a(Long.valueOf(pc8.a(arrayList3, fkk.b)));
                                eventItemsMap2.set("frames_dropped", lA5 != null ? Long.valueOf(oc9.x(lA5.longValue(), 0L, 10000L)) : th);
                                int i4 = jkk.b;
                                int i5 = 10;
                                ArrayList arrayList4 = new ArrayList(yw3.W0(arrayList3, 10));
                                int size = arrayList3.size();
                                int i6 = 0;
                                while (i6 < size) {
                                    Object obj5 = arrayList3.get(i6);
                                    i6++;
                                    arrayList4.add(Long.valueOf(Long.valueOf(((dgg) obj5).k).longValue()));
                                }
                                ArrayList arrayList5 = new ArrayList();
                                int size2 = arrayList4.size();
                                int i7 = 0;
                                while (i7 < size2) {
                                    Object obj6 = arrayList4.get(i7);
                                    i7++;
                                    if (((Number) obj6).longValue() != -1) {
                                        arrayList5.add(obj6);
                                    }
                                }
                                double dI1 = ww3.i1(arrayList5);
                                double d2 = Double.MAX_VALUE;
                                if (Math.abs(dI1) <= Double.MAX_VALUE) {
                                    eventItemsMap2.set("jitter_video", Long.valueOf((long) dI1));
                                }
                                ArrayList arrayList6 = new ArrayList();
                                int size3 = arrayList3.size();
                                int i8 = 0;
                                while (i8 < size3) {
                                    Object obj7 = arrayList3.get(i8);
                                    i8++;
                                    dgg dggVar3 = (dgg) obj7;
                                    long j13 = dggVar3.o;
                                    if (j13 == -1 || j13 == 0) {
                                        d = d2;
                                    } else {
                                        double d3 = j13;
                                        d = d2;
                                        Double d4 = dggVar3.t;
                                        if (d4 != null) {
                                            double dDoubleValue = d4.doubleValue();
                                            Double d5 = dggVar3.u;
                                            if (d5 != null) {
                                                double dDoubleValue2 = d5.doubleValue();
                                                objValueOf2 = Double.valueOf((dDoubleValue - ((dDoubleValue2 * dDoubleValue2) / d3)) / d3);
                                            }
                                        }
                                        if (objValueOf2 != null) {
                                            arrayList6.add(objValueOf2);
                                        }
                                        d2 = d;
                                    }
                                    objValueOf2 = th;
                                    if (objValueOf2 != null) {
                                        arrayList6.add(objValueOf2);
                                    }
                                    d2 = d;
                                }
                                double d6 = d2;
                                Iterator it3 = arrayList6.iterator();
                                int i9 = 0;
                                double dDoubleValue3 = 0.0d;
                                while (it3.hasNext()) {
                                    dDoubleValue3 += ((Number) it3.next()).doubleValue();
                                    i9++;
                                    if (i9 < 0) {
                                        xw3.U0();
                                        throw th;
                                    }
                                }
                                double d7 = i9 == 0 ? Double.NaN : dDoubleValue3 / ((double) i9);
                                if (Math.abs(d7) <= d6) {
                                    eventItemsMap2.set("interframe_delay_variance", Float.valueOf((float) (d7 * 1000000.0d)));
                                }
                                eventItemsMap2.set("freeze_count", pc8Var.i.a(Long.valueOf(pc8.a(arrayList3, l9k.b))));
                                Long lA6 = pc8Var.j.a(Long.valueOf(pc8.a(arrayList3, edk.b)));
                                if (lA6 == null || lA6.longValue() != 0) {
                                    eventItemsMap2.set("total_freezes_duration", lA6);
                                }
                                Long lA7 = pc8Var.k.a(Long.valueOf(pc8.a(arrayList3, new x27(9))));
                                Long lA8 = pc8Var.l.a(Long.valueOf(pc8.a(arrayList3, new x27(i5))));
                                if (lA7 != null && lA8 != null) {
                                    if (lA8.longValue() + lA7.longValue() != 0) {
                                        eventItemsMap2.set("in_video_loss", Integer.valueOf(oc9.w((int) ((lA7.longValue() * 100) / (lA8.longValue() + lA7.longValue())), new hj8(0, 100, 1))));
                                    }
                                }
                            } else if (pc8Var.a) {
                                pc8Var.b();
                            }
                        }
                        g85 g85Var3 = d32Var.l;
                        ArrayList arrayList7 = (ArrayList) xdeVarC.d;
                        g85Var3.getClass();
                        if (z && !arrayList7.isEmpty()) {
                            if (((ex8) g85Var3.b).T(arrayList7)) {
                                g85Var3.R();
                            }
                            Iterator it4 = arrayList7.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    next5 = th;
                                    break;
                                }
                                next5 = it4.next();
                            } while (!cqk.d(((cgg) next5).n, Boolean.FALSE));
                            agg aggVar2 = (agg) ((cgg) next5);
                            if (aggVar2 != null) {
                                Integer numD = ((uvc) g85Var3.a).d(aggVar2.h, aggVar2.i);
                                agg aggVar3 = (agg) ww3.t1(arrayList7);
                                Object objValueOf4 = aggVar3 != null ? Integer.valueOf(aggVar3.o) : th;
                                ?? r3 = (fi9) g85Var3.e;
                                BigInteger bigInteger5 = aggVar2.k;
                                Long lA9 = r3.a(bigInteger5 != null ? Long.valueOf(bigInteger5.longValue()) : th);
                                ?? r0 = (fi9) g85Var3.d;
                                BigInteger bigInteger6 = aggVar2.j;
                                xdeVar = new xde(numD, objValueOf4, lA9, r0.a(bigInteger6 != null ? Long.valueOf(bigInteger6.longValue()) : th), 20);
                            }
                            if (xdeVar != 0) {
                                r1 = (Integer) xdeVar.b;
                            } else {
                                r1 = th;
                            }
                            eventItemsMap2.set(LossHintConfig.AUDIO_LOSS, r1);
                            if (xdeVar != 0) {
                                r2 = (Integer) xdeVar.c;
                            } else {
                                r2 = th;
                            }
                            eventItemsMap2.set("audio_level", r2);
                            if (xdeVar != 0 || (l2 = (Long) xdeVar.d) == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = l2.longValue();
                            }
                            if (xdeVar != 0 || (l = (Long) xdeVar.e) == null) {
                                jLongValue2 = 0;
                            } else {
                                jLongValue2 = l.longValue();
                            }
                            eventItemsMap2.set("audio_bytes_sent", Long.valueOf(jLongValue + jLongValue2));
                            u3m u3mVar = d32Var.i;
                            ArrayList arrayList8 = (ArrayList) xdeVarC.b;
                            u3mVar.getClass();
                            cc8VarA = u3mVar.a(arrayList8);
                            r16 = obj3;
                            r23 = objValueOf;
                            if (cc8VarA != null) {
                                eventItemsMap2.set("inserted_audio_samples_for_deceleration", cc8VarA.a);
                                eventItemsMap2.set("removed_audio_samples_for_acceleration", cc8VarA.b);
                                eventItemsMap2.set("concealed_audio_samples", cc8VarA.c);
                                eventItemsMap2.set("jitter_audio", cc8VarA.d);
                                eventItemsMap2.set("concealed_silent_audio_samples", cc8VarA.e);
                                eventItemsMap2.set("concealment_audio_avg_size", cc8VarA.f);
                                eventItemsMap2.set("total_audio_energy", cc8VarA.g);
                                eventItemsMap2.set("in_audio_loss", cc8VarA.h);
                                r16 = obj3;
                                r23 = objValueOf;
                            }
                        } else {
                            g85Var3.R();
                        }
                        xdeVar = th;
                        if (xdeVar != 0) {
                            r1 = (Integer) xdeVar.b;
                        } else {
                            r1 = th;
                        }
                        eventItemsMap2.set(LossHintConfig.AUDIO_LOSS, r1);
                        if (xdeVar != 0) {
                            r2 = (Integer) xdeVar.c;
                        } else {
                            r2 = th;
                        }
                        eventItemsMap2.set("audio_level", r2);
                        if (xdeVar != 0) {
                            jLongValue = 0;
                        } else {
                            jLongValue = 0;
                        }
                        if (xdeVar != 0) {
                            jLongValue2 = 0;
                        } else {
                            jLongValue2 = 0;
                        }
                        eventItemsMap2.set("audio_bytes_sent", Long.valueOf(jLongValue + jLongValue2));
                        u3m u3mVar2 = d32Var.i;
                        ArrayList arrayList9 = (ArrayList) xdeVarC.b;
                        u3mVar2.getClass();
                        cc8VarA = u3mVar2.a(arrayList9);
                        r16 = obj3;
                        r23 = objValueOf;
                        if (cc8VarA != null) {
                            eventItemsMap2.set("inserted_audio_samples_for_deceleration", cc8VarA.a);
                            eventItemsMap2.set("removed_audio_samples_for_acceleration", cc8VarA.b);
                            eventItemsMap2.set("concealed_audio_samples", cc8VarA.c);
                            eventItemsMap2.set("jitter_audio", cc8VarA.d);
                            eventItemsMap2.set("concealed_silent_audio_samples", cc8VarA.e);
                            eventItemsMap2.set("concealment_audio_avg_size", cc8VarA.f);
                            eventItemsMap2.set("total_audio_energy", cc8VarA.g);
                            eventItemsMap2.set("in_audio_loss", cc8VarA.h);
                            r16 = obj3;
                            r23 = objValueOf;
                        }
                    } else {
                        i = iIntValue;
                        r16 = obj3;
                        r23 = objValueOf;
                        map = map;
                        f = f;
                    }
                    d32Var.c.b(eventItemsMap2);
                    xtj xtjVar = d32Var.m;
                    xtjVar.getClass();
                    if (map != null) {
                        HashMap map3 = (HashMap) map;
                        if (map3.isEmpty()) {
                            ((fi9) xtjVar.b).a = null;
                            ((fi9) xtjVar.c).a = null;
                            v5kVar = null;
                        } else {
                            Set setKeySet = map3.keySet();
                            if (!cqk.d((Set) xtjVar.d, setKeySet)) {
                                ?? r10 = th;
                                ((fi9) xtjVar.b).a = r10;
                                ((fi9) xtjVar.c).a = r10;
                                xtjVar.d = setKeySet;
                            }
                            Iterator it5 = map3.values().iterator();
                            int i10 = 0;
                            while (it5.hasNext()) {
                                i10 += ((e5f) it5.next()).p.a;
                            }
                            long j14 = i10;
                            Iterator it6 = map3.values().iterator();
                            long j15 = 0;
                            while (it6.hasNext()) {
                                j15 += ((e5f) it6.next()).p.b;
                            }
                            v5kVar = new v5k(((fi9) xtjVar.b).a(Long.valueOf(j14)), ((fi9) xtjVar.c).a(Long.valueOf(j15)));
                        }
                    } else {
                        ((fi9) xtjVar.b).a = null;
                        ((fi9) xtjVar.c).a = null;
                        v5kVar = null;
                    }
                    if (v5kVar != null) {
                        Long l5 = v5kVar.b;
                        eventItemsMap2.set("ss_freeze_count", v5kVar.a);
                        if (l5 == null || l5.longValue() != 0) {
                            eventItemsMap2.set("ss_total_freezes_duration", l5);
                        }
                    }
                    d32Var.n.getClass();
                    if (f != null) {
                        eventItemsMap2.set("cpu_usage_percent_total", Long.valueOf((long) (f.floatValue() * 100.0f)));
                    }
                    eventItemsMap2.set("cpu_score_max", lValueOf);
                    eventItemsMap2.set("cpu_score_avg", ValueOf);
                    eventItemsMap2.set("cpu_hardware_concurrency", Integer.valueOf(i));
                    eventItemsMap2.set("memory_usage_mb_max", r23 != 0 ? Long.valueOf(r23.longValue() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) : null);
                    eventItemsMap2.set("memory_usage_mb_avg", r16 != 0 ? Long.valueOf(r16.longValue() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) : null);
                    Long lA10 = ((gsh) d32Var.f).a();
                    if (lA10 != null) {
                        eventItemsMap2.set("timestamp", lA10);
                        Set<String> setKeySet2 = eventItemsMap2.getItems().keySet();
                        if (setKeySet2 == null || !setKeySet2.isEmpty()) {
                            Iterator it7 = setKeySet2.iterator();
                            while (it7.hasNext()) {
                                if (d32.o.contains((String) it7.next())) {
                                    ?? builder = new SdkIntervalStatEvent.Builder();
                                    builder.addAll(eventItemsMap2);
                                    SdkIntervalStatEvent sdkIntervalStatEventBuild = builder.build();
                                    d32Var.b.log("CallStatLog", "callStat: " + sdkIntervalStatEventBuild.getItems());
                                    ((CallAnalyticsSender) d32Var.a.d).send(sdkIntervalStatEventBuild);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    d32Var.i.c();
                    d32Var.j.b();
                    d32Var.l.R();
                    d32Var.k.h();
                    xtj xtjVar2 = d32Var.m;
                    ((fi9) xtjVar2.b).a = null;
                    ((fi9) xtjVar2.c).a = null;
                }
            }
        }
        h32 h32Var2 = this.a.M0;
        h32Var2.getClass();
        List<fgg> list = a4eVar.b;
        pk2 pk2VarC3 = a4eVar.c();
        if (pk2VarC3 == null) {
            eventItemsMap = null;
        } else {
            eventItemsMap = new EventItemsMap();
            h32Var2.c.getClass();
            so2.A(eventItemsMap, pk2VarC3);
            h32Var2.b.b(eventItemsMap);
            h32Var2.d.h(eventItemsMap);
            h32Var2.e.q(eventItemsMap);
            n11 n11Var2 = h32Var2.f;
            if (n11Var2.b && ((due) n11Var2.c).w() == zvh.c) {
                eventItemsMap.set("is_simulcast", Boolean.TRUE);
            }
        }
        if (eventItemsMap != null) {
            ec1 ec1Var = h32Var2.k;
            ec1Var.getClass();
            ec1Var.j = eventItemsMap;
            gi1 gi1Var = h32Var2.i;
            gi1Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(eventItemsMap.getItems());
            Iterator it8 = gi1.i.iterator();
            while (it8.hasNext()) {
                linkedHashMap.remove((String) it8.next());
            }
            EventItemsMap eventItemsMap3 = new EventItemsMap(linkedHashMap);
            gi1Var.g = eventItemsMap3;
            gi1Var.c(eventItemsMap3);
            h9 h9Var = h32Var2.m;
            h9Var.getClass();
            list.getClass();
            ArrayList arrayList10 = new ArrayList();
            for (Object obj8 : list) {
                if (obj8 instanceof egg) {
                    arrayList10.add(obj8);
                }
            }
            int size4 = arrayList10.size();
            int i11 = 0;
            do {
                if (i11 >= size4) {
                    obj = null;
                    break;
                } else {
                    obj = arrayList10.get(i11);
                    i11++;
                }
            } while (!cqk.d(((cgg) obj).n, Boolean.FALSE));
            egg eggVar2 = (egg) ((cgg) obj);
            if (eggVar2 != null) {
                dc9 dc9Var2 = eggVar2.f;
                dc9Var2.getClass();
                g9Var = new g9(dc9Var2);
            } else {
                g9Var = null;
            }
            ArrayList arrayList11 = new ArrayList();
            for (Object obj9 : list) {
                if (obj9 instanceof agg) {
                    arrayList11.add(obj9);
                }
            }
            int size5 = arrayList11.size();
            int i12 = 0;
            do {
                if (i12 >= size5) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = arrayList11.get(i12);
                    i12++;
                }
            } while (!cqk.d(((cgg) obj2).n, Boolean.FALSE));
            agg aggVar4 = (agg) ((cgg) obj2);
            if (aggVar4 != null) {
                dc9 dc9Var3 = aggVar4.f;
                dc9Var3.getClass();
                g9Var2 = new g9(dc9Var3);
            } else {
                g9Var2 = null;
            }
            m9 m9Var = h9Var.b;
            if (m9Var.b) {
                g9 g9Var3 = (g9) m9Var.e;
                if (!cqk.d(g9Var3 != null ? g9Var3.b : null, g9Var != null ? g9Var.b : null)) {
                    if (g9Var == null) {
                        m9Var.b();
                    } else {
                        ((gsh) ((esh) m9Var.c)).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        g9 g9Var4 = (g9) m9Var.e;
                        if (g9Var4 != null) {
                            ((rea) m9Var.d).invoke(g9Var4, Long.valueOf(jElapsedRealtime - m9Var.a));
                        }
                        m9Var.a = jElapsedRealtime;
                        m9Var.e = g9Var;
                        m9Var.b = true;
                    }
                }
            }
            ih ihVar = h9Var.c;
            if (g9Var2 != null) {
                g9 g9Var5 = (g9) ihVar.b;
                if (cqk.d(g9Var5 != null ? g9Var5.b : null, g9Var2.b)) {
                    String str2 = (g9Var5 == null || (dc9Var = g9Var5.a) == null) ? null : (String) dc9Var.d;
                    dc9 dc9Var4 = g9Var2.a;
                    if (!cqk.d(str2, dc9Var4 != null ? (String) dc9Var4.d : null)) {
                        ((ysj) ihVar.a).invoke(g9Var2);
                        ihVar.b = g9Var2;
                    }
                } else {
                    ((ysj) ihVar.a).invoke(g9Var2);
                    ihVar.b = g9Var2;
                }
            } else {
                ihVar.getClass();
            }
            cf4 cf4Var = h32Var2.j;
            yi9 yi9Var = cf4Var.f;
            uw uwVar = cf4Var.d;
            if (cf4Var.c.a) {
                if (cf4Var.h.T(list)) {
                    aggVar = null;
                } else {
                    ArrayList arrayList12 = new ArrayList(list.size());
                    for (fgg fggVar : list) {
                        if (fggVar.b == 2 && fggVar.a == 1) {
                            arrayList12.add((agg) fggVar);
                        }
                    }
                    Iterator it9 = arrayList12.iterator();
                    do {
                        if (!it9.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it9.next();
                    } while (!cqk.d(((cgg) next3).n, Boolean.FALSE));
                    aggVar = (agg) ((cgg) next3);
                }
                if (aggVar == null) {
                    uwVar.c();
                    yi9Var.a = 0L;
                    yi9Var.b = 0L;
                    cf4Var.g = 1.0d;
                    cf4Var.e = 0.0d;
                    cf4Var.a();
                } else {
                    BigInteger bigInteger7 = aggVar.h;
                    BigInteger bigInteger8 = aggVar.k;
                    BigInteger bigInteger9 = aggVar.j;
                    double d8 = (bigInteger9 == null && bigInteger8 == null) ? 0.0d : uwVar.d((bigInteger9 != null ? bigInteger9.longValue() : 0L) + (bigInteger8 != null ? bigInteger8.longValue() : 0L), SystemClock.elapsedRealtime());
                    Long l6 = aggVar.m;
                    cf4Var.e = Math.max(d8, l6 != null ? l6.longValue() : 0.0d);
                    BigInteger bigInteger10 = aggVar.i;
                    cf4Var.g = (bigInteger10 == null || bigInteger7 == null) ? 1.0d : yi9Var.a(bigInteger10.longValue(), bigInteger7.longValue());
                    cf4Var.a();
                }
            }
            ih ihVar2 = h32Var2.l;
            ihVar2.getClass();
            AtomicBoolean atomicBoolean = (AtomicBoolean) ihVar2.b;
            if (!atomicBoolean.get() && (pk2VarC = a4eVar.c()) != null) {
                xde xdeVarC2 = grl.c(grl.d(list, pk2VarC));
                Iterator it10 = ((ArrayList) xdeVarC2.d).iterator();
                do {
                    if (!it10.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it10.next();
                } while (!cqk.d(((cgg) next).n, Boolean.FALSE));
                agg aggVar5 = (agg) ((cgg) next);
                if (aggVar5 != null && (bigInteger2 = aggVar5.j) != null && bigInteger2.signum() == 1 && atomicBoolean.compareAndSet(false, true)) {
                    fi1.a((gi1) ihVar2.a, "first_media_sent", null, null, 6);
                }
                Iterator it11 = ((ArrayList) xdeVarC2.e).iterator();
                do {
                    if (!it11.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it11.next();
                } while (!cqk.d(((cgg) next2).n, Boolean.FALSE));
                egg eggVar3 = (egg) ((cgg) next2);
                if (eggVar3 != null && (bigInteger = eggVar3.j) != null && bigInteger.signum() == 1 && atomicBoolean.compareAndSet(false, true)) {
                    fi1.a((gi1) ihVar2.a, "first_media_sent", null, null, 6);
                }
            }
        }
        this.a.Q0.u.onRtcStats(a4eVar);
    }
}
