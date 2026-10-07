package defpackage;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import org.webrtc.MediaStreamTrack;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class ukg implements skg {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Serializable g;
    public Object h;
    public Object i;

    public static void i(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            du1 du1Var = (du1) entry.getKey();
            map.put(du1Var, Boolean.valueOf(((Boolean) entry.getValue()).booleanValue() && du1Var.g.a.booleanValue()));
        }
    }

    @Override // defpackage.skg
    public void a(du1 du1Var) {
        if (du1Var != null) {
        }
    }

    @Override // defpackage.skg
    public void b(ru1 ru1Var, boolean z, int i, List list, boolean z2) {
        HashMap map;
        boolean z3;
        CidLogger cidLogger = (CidLogger) this.e;
        xt1 xt1Var = (xt1) this.d;
        ru1Var.getClass();
        if (i == 0) {
            throw null;
        }
        int i2 = tkg.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 == 1) {
            Iterator it = ((Hashtable) this.g).entrySet().iterator();
            HashMap map2 = new HashMap();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                du1 du1Var = (du1) entry.getKey();
                p5a p5aVar = (p5a) entry.getValue();
                if (ru1Var.m(du1Var) || cqk.d(du1Var, (du1) this.f)) {
                    long jA = p5aVar.a();
                    long j = xt1Var.b.a;
                    if (j <= 1000) {
                        j = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
                    }
                    map2.put(du1Var, Boolean.valueOf(jA < j));
                    if (!this.a && z) {
                        SystemClock.elapsedRealtime();
                        this.a = true;
                    }
                } else {
                    it.remove();
                }
            }
            map = map2;
        } else if (i2 == 2) {
            map = new HashMap();
            p5a p5aVar2 = (p5a) this.i;
            long jA2 = p5aVar2.a();
            long j2 = xt1Var.b.a;
            if (j2 <= 1000) {
                j2 = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
            }
            boolean z4 = jA2 < j2;
            if (this.b != z4) {
                cidLogger.log("StatsReportHandler", "audio-mix track isConnected " + z4 + " timeout ms " + p5aVar2.a());
            }
            this.b = z4;
            if (z4) {
                for (du1 du1Var2 : ru1Var.j()) {
                    map.put(du1Var2, Boolean.valueOf(du1Var2.c()));
                }
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        du1 du1VarL = ru1Var.l((yt1) it2.next());
                        if (du1VarL != null) {
                            map.put(du1VarL, Boolean.FALSE);
                        }
                    }
                }
                if (z2) {
                    i(map);
                }
            } else {
                Iterator it3 = ru1Var.j().iterator();
                while (it3.hasNext()) {
                    map.put((du1) it3.next(), Boolean.FALSE);
                }
            }
        } else {
            if (i2 != 3) {
                ore.o();
                return;
            }
            map = new HashMap();
            Collection collectionValues = ((Hashtable) this.h).values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it4 = collectionValues.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z3 = false;
                        break;
                    }
                    long jA3 = ((p5a) it4.next()).a();
                    long j3 = xt1Var.b.a;
                    if (j3 <= 1000) {
                        j3 = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
                    }
                    if (jA3 < j3) {
                        z3 = true;
                        break;
                    }
                }
            } else {
                z3 = false;
                break;
            }
            if (this.c != z3) {
                cidLogger.log("StatsReportHandler", "transparent audio tracks isConnected " + z3);
            }
            this.c = z3;
            if (z3) {
                for (du1 du1Var3 : ru1Var.j()) {
                    map.put(du1Var3, Boolean.valueOf(du1Var3.c()));
                }
                if (list != null) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        du1 du1VarL2 = ru1Var.l((yt1) it5.next());
                        if (du1VarL2 != null) {
                            map.put(du1VarL2, Boolean.FALSE);
                        }
                    }
                }
                if (z2) {
                    i(map);
                }
            } else {
                Iterator it6 = ru1Var.j().iterator();
                while (it6.hasNext()) {
                    map.put((du1) it6.next(), Boolean.FALSE);
                }
            }
        }
        ru1Var.q(map);
        for (du1 du1Var4 : ru1Var.j()) {
            if (du1Var4.h) {
                cidLogger.log("StatsReportHandler", "CONNECTED: " + du1Var4);
            } else {
                cidLogger.log("StatsReportHandler", "DISCONNECTED: " + du1Var4 + " isCallAccepted " + du1Var4.c());
            }
        }
    }

    @Override // defpackage.skg
    public p5a c(du1 du1Var) {
        if (du1Var != null) {
            return (p5a) ((Hashtable) this.g).get(du1Var);
        }
        return null;
    }

    @Override // defpackage.skg
    public Long d(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = tkg.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 != 1) {
            if (i2 == 2) {
                return ((p5a) this.i).c();
            }
            if (i2 != 3) {
                ore.o();
                return null;
            }
            Collection collectionValues = ((Hashtable) this.h).values();
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                Long lC = ((p5a) it.next()).c();
                if (lC != null) {
                    arrayList.add(lC);
                }
            }
            return (Long) ww3.E1(arrayList);
        }
        Hashtable hashtable = (Hashtable) this.g;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : hashtable.entrySet()) {
            if (!cqk.d((du1) entry.getKey(), (du1) this.f)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection collectionValues2 = linkedHashMap.values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = collectionValues2.iterator();
        while (it2.hasNext()) {
            Long lC2 = ((p5a) it2.next()).c();
            if (lC2 != null) {
                arrayList2.add(lC2);
            }
        }
        return (Long) ww3.E1(arrayList2);
    }

    @Override // defpackage.skg
    public void e(StatsReport[] statsReportArr, rkg[] rkgVarArr) {
        CidLogger cidLogger = (CidLogger) this.e;
        statsReportArr.getClass();
        Iterator it = a.q1(statsReportArr, rkgVarArr).iterator();
        while (it.hasNext()) {
            ylc ylcVar = (ylc) it.next();
            StatsReport statsReport = (StatsReport) ylcVar.a;
            rkg rkgVar = (rkg) ylcVar.b;
            du1 du1Var = rkgVar.a;
            boolean z = rkgVar.b;
            if (du1Var != null || z) {
                StatsReport.Value[] valueArr = statsReport.values;
                valueArr.getClass();
                int length = valueArr.length;
                String str = null;
                int i = 0;
                long j = Long.MIN_VALUE;
                long j2 = Long.MIN_VALUE;
                long j3 = Long.MIN_VALUE;
                long j4 = Long.MIN_VALUE;
                long j5 = Long.MIN_VALUE;
                long j6 = Long.MIN_VALUE;
                while (i < length) {
                    Iterator it2 = it;
                    StatsReport.Value value = valueArr[i];
                    StatsReport.Value[] valueArr2 = valueArr;
                    int i2 = length;
                    if ("bytesSent".equals(value.name)) {
                        try {
                            String str2 = value.value;
                            str2.getClass();
                            j = Long.parseLong(str2);
                        } catch (Exception unused) {
                        }
                    } else if ("bytesReceived".equals(value.name)) {
                        String str3 = value.value;
                        str3.getClass();
                        j3 = Long.parseLong(str3);
                    } else if ("audioOutputLevel".equals(value.name)) {
                        String str4 = value.value;
                        str4.getClass();
                        j2 = Long.parseLong(str4);
                    } else if ("mediaType".equals(value.name)) {
                        str = value.value;
                    } else if (!"ssrc".equalsIgnoreCase(value.name) && !"googCodecName".equals(value.name) && !"codecImplementationName".equals(value.name)) {
                        if ("packetsLost".equals(value.name)) {
                            String str5 = value.value;
                            str5.getClass();
                            j4 = Long.parseLong(str5);
                        } else if ("googRtt".equals(value.name)) {
                            String str6 = value.value;
                            str6.getClass();
                            j6 = Long.parseLong(str6);
                        } else if ("packetsSent".equals(value.name)) {
                            String str7 = value.value;
                            str7.getClass();
                            j5 = Long.parseLong(str7);
                        }
                    }
                    i++;
                    it = it2;
                    valueArr = valueArr2;
                    length = i2;
                }
                Iterator it3 = it;
                p5a p5aVarH = z ? (p5a) this.i : h(rkgVar.a);
                if (p5aVarH != null) {
                    c9h c9hVar = p5aVarH.b;
                    c9h c9hVar2 = p5aVarH.c;
                    boolean z2 = ((xt1) this.d).u.d.b;
                    if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(str)) {
                        if (j2 != Long.MIN_VALUE) {
                            p5aVarH.b(j2);
                        }
                        if (j3 != Long.MIN_VALUE) {
                            ao0.a(z2, cidLogger, "StatsReportHandler", zo5.j(j3, "setAudioBytesReceived: "));
                            ((q36) c9hVar2.b).a(j3);
                        }
                        if (j != Long.MIN_VALUE) {
                            ao0.a(z2, cidLogger, "StatsReportHandler", zo5.j(j, "setAudioBytesSent: "));
                            ((q36) c9hVar.b).a(j);
                        }
                        long j7 = j4;
                        if (j7 != Long.MIN_VALUE) {
                            ao0.a(z2, cidLogger, "StatsReportHandler", zo5.j(j7, "setAudioPacketsLost: "));
                            p5aVarH.e = j7;
                        }
                        long j8 = j5;
                        if (j8 != Long.MIN_VALUE) {
                            ao0.a(z2, cidLogger, "StatsReportHandler", zo5.j(j8, "setAudioPacketsSent: "));
                            p5aVarH.g = j8;
                        }
                        p5aVarH.i = j6;
                    } else {
                        long j9 = j4;
                        long j10 = j5;
                        long j11 = j6;
                        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(str)) {
                            if (j3 != Long.MIN_VALUE) {
                                ao0.a(z2, cidLogger, "StatsReportHandler", zo5.j(j3, "setVideoBytesReceived: "));
                                ((q36) c9hVar2.c).a(j3);
                            }
                            if (j != Long.MIN_VALUE) {
                                ao0.a(z2, cidLogger, "StatsReportHandler", zo5.j(j, "setVideoBytesSent: "));
                                ((q36) c9hVar.c).a(j);
                            }
                            if (j9 != Long.MIN_VALUE) {
                                ao0.a(z2, cidLogger, "StatsReportHandler", zo5.j(j9, "setVideoPacketsLost: "));
                                p5aVarH.d = j9;
                            }
                            if (j10 != Long.MIN_VALUE) {
                                ao0.a(z2, cidLogger, "StatsReportHandler", zo5.j(j10, "setVideoPacketsSent: "));
                                p5aVarH.f = j10;
                            }
                            p5aVarH.h = j11;
                        }
                    }
                }
                it = it3;
            } else {
                cidLogger.log("StatsReportHandler", "incorrect mapping skipped " + statsReport.id);
            }
        }
    }

    @Override // defpackage.skg
    public void f(a4e a4eVar, fgg[] fggVarArr, sh6[] sh6VarArr) {
        p5a p5aVarH;
        Double d;
        Hashtable hashtable = (Hashtable) this.h;
        for (ylc ylcVar : a.q1(fggVarArr, sh6VarArr)) {
            fgg fggVar = (fgg) ylcVar.a;
            sh6 sh6Var = (sh6) ylcVar.b;
            du1 du1Var = sh6Var.a;
            vh6 vh6Var = sh6Var.c;
            boolean z = sh6Var.b;
            if (du1Var != null || z || (vh6Var instanceof uh6)) {
                if (z) {
                    p5aVarH = (p5a) this.i;
                } else if (vh6Var instanceof uh6) {
                    String str = ((uh6) vh6Var).a;
                    p5a p5aVar = (p5a) hashtable.get(str);
                    if (p5aVar == null) {
                        p5aVar = new p5a();
                        hashtable.put(str, p5aVar);
                    }
                    p5aVarH = p5aVar;
                } else {
                    p5aVarH = h(du1Var);
                }
                if (p5aVarH == null) {
                    continue;
                } else {
                    c9h c9hVar = p5aVarH.c;
                    c9h c9hVar2 = p5aVarH.b;
                    fggVar.f.getClass();
                    int i = fggVar.a;
                    if (i == 0) {
                        throw null;
                    }
                    pk2 pk2VarC = a4eVar.c();
                    long jLongValue = Long.MIN_VALUE;
                    if (pk2VarC != null && (d = pk2VarC.h) != null) {
                        jLongValue = d.longValue();
                    }
                    long j = fggVar.c;
                    if (i == 1) {
                        String.valueOf(j);
                        p5aVarH.h = jLongValue;
                    } else {
                        String.valueOf(j);
                        p5aVarH.i = jLongValue;
                    }
                    if (fggVar instanceof agg) {
                        agg aggVar = (agg) fggVar;
                        ((q36) c9hVar2.b).a(lu8.b(aggVar.j, aggVar.k));
                        p5aVarH.b(lu8.b(Integer.valueOf(aggVar.o)));
                        p5aVarH.e = lu8.b(aggVar.i);
                        p5aVarH.g = lu8.b(aggVar.h);
                    } else if (fggVar instanceof zfg) {
                        zfg zfgVar = (zfg) fggVar;
                        p5aVarH.b(lu8.b(Double.valueOf(zfgVar.l)));
                        ((q36) c9hVar.b).a(lu8.b(zfgVar.j));
                        p5aVarH.e = lu8.b(zfgVar.i);
                    } else if (fggVar instanceof egg) {
                        egg eggVar = (egg) fggVar;
                        ((q36) c9hVar2.c).a(lu8.b(eggVar.j, eggVar.k));
                        p5aVarH.f = lu8.b(eggVar.h);
                        p5aVarH.d = lu8.b(eggVar.i);
                    } else if (fggVar instanceof dgg) {
                        dgg dggVar = (dgg) fggVar;
                        ((q36) c9hVar.c).a(lu8.b(dggVar.j));
                        p5aVarH.d = lu8.b(dggVar.i);
                    }
                }
            } else {
                CidLogger cidLogger = (CidLogger) this.e;
                String str2 = fggVar.e;
                String str3 = fggVar.d;
                int i2 = fggVar.a;
                int i3 = fggVar.b;
                StringBuilder sbQ = qv1.q("incorrect mapping skipped ", str2, ":", str3, ":");
                sbQ.append(pye.k(i2));
                sbQ.append(":");
                sbQ.append(pye.j(i3));
                cidLogger.log("StatsReportHandler", sbQ.toString());
            }
        }
    }

    @Override // defpackage.skg
    public void g(ru1 ru1Var, Map map) {
        ru1Var.getClass();
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            yt1 yt1Var = (yt1) entry.getKey();
            du1 du1VarL = ru1Var.l(yt1Var);
            if (du1VarL != null) {
                h(du1VarL);
            }
        }
    }

    public p5a h(du1 du1Var) {
        Hashtable hashtable = (Hashtable) this.g;
        if (du1Var == null) {
            return null;
        }
        p5a p5aVar = (p5a) hashtable.get(du1Var);
        if (p5aVar != null) {
            return p5aVar;
        }
        p5a p5aVar2 = new p5a();
        hashtable.put(du1Var, p5aVar2);
        return p5aVar2;
    }
}
