package defpackage;

import android.util.Log;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.webrtc.MediaStreamTrack;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class a4e {
    public final long a;
    public final List b;
    public final List c;
    public final HashMap d = new HashMap();

    public a4e(long j, List list, ArrayList arrayList, ArrayList arrayList2) {
        this.a = j;
        Collections.unmodifiableList(list);
        this.b = Collections.unmodifiableList(arrayList);
        this.c = Collections.unmodifiableList(arrayList2);
    }

    public static BigInteger a(String str, y3e y3eVar) {
        if (str == null) {
            return null;
        }
        try {
            return new BigInteger(str);
        } catch (NumberFormatException e) {
            y3eVar.logException("RTCStat", "stat.parse", e);
            return null;
        }
    }

    public static long b(String str, y3e y3eVar) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            y3eVar.logException("RTCStat", "stat.parse", e);
            return -1L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:160:0x0545  */
    /* JADX WARN: Code duplicated, block: B:169:0x0548 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca A[PHI: r30
  0x00ca: PHI (r30v15 org.webrtc.StatsReport$Value[]) = 
  (r30v6 org.webrtc.StatsReport$Value[])
  (r30v7 org.webrtc.StatsReport$Value[])
  (r30v8 org.webrtc.StatsReport$Value[])
  (r30v9 org.webrtc.StatsReport$Value[])
  (r30v10 org.webrtc.StatsReport$Value[])
  (r30v11 org.webrtc.StatsReport$Value[])
  (r30v12 org.webrtc.StatsReport$Value[])
  (r30v13 org.webrtc.StatsReport$Value[])
  (r30v16 org.webrtc.StatsReport$Value[])
 binds: [B:65:0x0134, B:61:0x0126, B:57:0x0119, B:53:0x010c, B:49:0x00fe, B:45:0x00f1, B:41:0x00e4, B:37:0x00d5, B:34:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public static a4e d(StatsReport[] statsReportArr, CidLogger cidLogger) {
        char c;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        long j;
        int i2;
        HashMap map;
        ArrayList arrayList3;
        fgg dggVar;
        fgg fggVar;
        Double dValueOf;
        StatsReport.Value[] valueArr;
        byte b;
        StatsReport[] statsReportArr2 = statsReportArr;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        HashMap map2 = new HashMap();
        int length = statsReportArr2.length;
        long j2 = 0;
        int i3 = 0;
        while (i3 < length) {
            StatsReport statsReport = statsReportArr2[i3];
            double d = statsReport.timestamp;
            if (d > j2) {
                j2 = (long) d;
            }
            String str = statsReport.type;
            str.getClass();
            switch (str) {
                case "ssrc":
                    String str2 = statsReport.id;
                    String strSubstring = str2.substring(str2.length() - 4);
                    if (!strSubstring.equals("recv")) {
                        if (strSubstring.equals("send")) {
                            c = 2;
                        } else {
                            cidLogger.logException("CallsSsrc", "stat.parse", new IllegalArgumentException(zo5.w(new StringBuilder("ssrc type '"), statsReport.id, "' is not send/recv")));
                            arrayList = arrayList5;
                            arrayList3 = arrayList4;
                            arrayList2 = arrayList6;
                            map = map2;
                            i = length;
                            j = j2;
                            i2 = i3;
                        }
                        fggVar = null;
                        arrayList4 = arrayList3;
                        if (fggVar != null) {
                            arrayList4.add(fggVar);
                            continue;
                        }
                        i3 = i2 + 1;
                        statsReportArr2 = statsReportArr;
                        arrayList6 = arrayList2;
                        arrayList5 = arrayList;
                        length = i;
                        j2 = j;
                        map2 = map;
                        break;
                    } else {
                        c = 1;
                    }
                    HashMap map3 = new HashMap(statsReport.values.length);
                    StatsReport.Value[] valueArr2 = statsReport.values;
                    int length2 = valueArr2.length;
                    int i4 = 0;
                    while (i4 < length2) {
                        int i5 = i4;
                        StatsReport.Value value = valueArr2[i5];
                        map3.put(value.name, value.value);
                        i4 = i5 + 1;
                        arrayList5 = arrayList5;
                    }
                    arrayList = arrayList5;
                    String str3 = (String) map3.get("mediaType");
                    String str4 = (String) map3.remove("googCodecName");
                    if (str4 == null) {
                        str4 = "";
                    }
                    arrayList2 = arrayList6;
                    String str5 = (String) map3.remove("codecImplementationName");
                    if (str5 == null) {
                        str5 = "";
                    }
                    i = length;
                    j = j2;
                    dc9 dc9Var = new dc9(17, str4, str5, (Object) null);
                    i2 = i3;
                    map = map2;
                    if (c == 2) {
                        arrayList3 = arrayList4;
                        if (MediaStreamTrack.AUDIO_TRACK_KIND.equalsIgnoreCase(str3)) {
                            long jB = b((String) map3.remove("ssrc"), cidLogger);
                            String str6 = (String) map3.remove("transportId");
                            String str7 = str6 == null ? "" : str6;
                            BigInteger bigIntegerA = a((String) map3.remove("packetsSent"), cidLogger);
                            BigInteger bigIntegerA2 = a((String) map3.remove("packetsLost"), cidLogger);
                            BigInteger bigIntegerA3 = a((String) map3.remove("bytesSent"), cidLogger);
                            BigInteger bigIntegerA4 = a((String) map3.remove("headerBytesSent"), cidLogger);
                            BigInteger bigIntegerA5 = a((String) map3.remove("retransmittedBytesSent"), cidLogger);
                            Long lValueOf = Long.valueOf(b((String) map3.remove("targetBitrate"), cidLogger));
                            String str8 = (String) map3.remove("googTrackId");
                            dggVar = new agg(0, jB, dc9Var, null, lValueOf, str7, str8 == null ? "" : str8, bigIntegerA, bigIntegerA2, bigIntegerA3, bigIntegerA4, bigIntegerA5);
                        } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equalsIgnoreCase(str3)) {
                            long jB2 = b((String) map3.remove("ssrc"), cidLogger);
                            String str9 = (String) map3.remove("transportId");
                            String str10 = str9 == null ? "" : str9;
                            BigInteger bigIntegerA6 = a((String) map3.remove("packetsSent"), cidLogger);
                            BigInteger bigIntegerA7 = a((String) map3.remove("packetsLost"), cidLogger);
                            BigInteger bigIntegerA8 = a((String) map3.remove("bytesSent"), cidLogger);
                            BigInteger bigIntegerA9 = a((String) map3.remove("headerBytesSent"), cidLogger);
                            BigInteger bigIntegerA10 = a((String) map3.remove("retransmittedBytesSent"), cidLogger);
                            long jB3 = b((String) map3.remove("googNacksReceived"), cidLogger);
                            long jB4 = b((String) map3.remove("googPlisReceived"), cidLogger);
                            long jB5 = b((String) map3.remove("googFirsReceived"), cidLogger);
                            long jB6 = b((String) map3.remove("framesEncoded"), cidLogger);
                            long jB7 = b((String) map3.remove("googAdaptationChanges"), cidLogger);
                            long jB8 = b((String) map3.remove("googAvgEncodeMs"), cidLogger);
                            long jB9 = b((String) map3.remove("googFrameWidthSent"), cidLogger);
                            long jB10 = b((String) map3.remove("googFrameHeightSent"), cidLogger);
                            Long lValueOf2 = Long.valueOf(b((String) map3.remove("targetBitrate"), cidLogger));
                            String str11 = (String) map3.remove("googTrackId");
                            dggVar = new egg(jB2, str10, bigIntegerA6, bigIntegerA7, bigIntegerA8, bigIntegerA9, bigIntegerA10, jB3, jB4, jB5, jB6, jB7, jB8, jB9, jB10, lValueOf2, str11 == null ? "" : str11, dc9Var, null);
                        } else {
                            cidLogger.logException("CallsSsrc", "stat.parse", new IllegalArgumentException(c0a.o("media type '", str3, "' is not video/audio")));
                            fggVar = null;
                        }
                        fggVar = dggVar;
                        fggVar.g.putAll(map3);
                    } else {
                        arrayList3 = arrayList4;
                        if (MediaStreamTrack.AUDIO_TRACK_KIND.equalsIgnoreCase(str3)) {
                            long jB11 = b((String) map3.remove("ssrc"), cidLogger);
                            String str12 = (String) map3.remove("transportId");
                            String str13 = str12 == null ? "" : str12;
                            BigInteger bigIntegerA11 = a((String) map3.remove("packetsReceived"), cidLogger);
                            BigInteger bigIntegerA12 = a((String) map3.remove("packetsLost"), cidLogger);
                            a((String) map3.remove("packetsDiscarded"), cidLogger);
                            BigInteger bigIntegerA13 = a((String) map3.remove("bytesReceived"), cidLogger);
                            long jB12 = b((String) map3.remove("googJitterBufferMs"), cidLogger);
                            String str14 = (String) map3.remove("googTrackId");
                            dggVar = new zfg(jB11, str13, bigIntegerA11, bigIntegerA12, bigIntegerA13, 0, -1.0d, jB12, str14 == null ? "" : str14, -1L, -1L, -1L, -1L, -1L, -1L, dc9Var);
                        } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equalsIgnoreCase(str3)) {
                            long jB13 = b((String) map3.remove("ssrc"), cidLogger);
                            String str15 = (String) map3.remove("transportId");
                            String str16 = str15 == null ? "" : str15;
                            BigInteger bigIntegerA14 = a((String) map3.remove("packetsReceived"), cidLogger);
                            BigInteger bigIntegerA15 = a((String) map3.remove("packetsLost"), cidLogger);
                            a((String) map3.remove("packetsDiscarded"), cidLogger);
                            BigInteger bigIntegerA16 = a((String) map3.remove("bytesReceived"), cidLogger);
                            long jB14 = b((String) map3.remove("googJitterBufferMs"), cidLogger);
                            long jB15 = b((String) map3.remove("googNacksSent"), cidLogger);
                            long jB16 = b((String) map3.remove("googPlisSent"), cidLogger);
                            long jB17 = b((String) map3.remove("googFirsSent"), cidLogger);
                            long jB18 = b((String) map3.remove("framesDecoded"), cidLogger);
                            long jB19 = b((String) map3.remove("framesReceived"), cidLogger);
                            long jB20 = b((String) map3.remove("googFrameHeightReceived"), cidLogger);
                            long jB21 = b((String) map3.remove("googFrameWidthReceived"), cidLogger);
                            String str17 = (String) map3.remove("googTrackId");
                            dggVar = new dgg(jB13, str16, bigIntegerA14, bigIntegerA15, bigIntegerA16, jB14, jB15, jB16, jB17, jB18, jB19, jB20, jB21, str17 == null ? "" : str17, 0L, null, null, dc9Var, 0L, 0L);
                        } else {
                            cidLogger.logException("CallsSsrc", "stat.parse", new IllegalArgumentException(c0a.o("media type '", str3, "' is not video/audio")));
                            fggVar = null;
                        }
                        fggVar = dggVar;
                        fggVar.g.putAll(map3);
                    }
                    arrayList4 = arrayList3;
                    if (fggVar != null) {
                        arrayList4.add(fggVar);
                        continue;
                    }
                    i3 = i2 + 1;
                    statsReportArr2 = statsReportArr;
                    arrayList6 = arrayList2;
                    arrayList5 = arrayList;
                    length = i;
                    j2 = j;
                    map2 = map;
                    break;
                case "googCandidatePair":
                    String str18 = statsReport.id;
                    HashMap map4 = new HashMap();
                    StatsReport.Value[] valueArr3 = statsReport.values;
                    int length3 = valueArr3.length;
                    int i6 = 0;
                    boolean zEqualsIgnoreCase = false;
                    String str19 = null;
                    String str20 = null;
                    String str21 = null;
                    String str22 = null;
                    String str23 = null;
                    String str24 = null;
                    String str25 = null;
                    String str26 = null;
                    String str27 = null;
                    while (i6 < length3) {
                        StatsReport.Value value2 = valueArr3[i6];
                        String str28 = value2.name;
                        str28.getClass();
                        switch (str28.hashCode()) {
                            case -1553358190:
                                valueArr = valueArr3;
                                if (str28.equals("googLocalCandidateType")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -747991196:
                                valueArr = valueArr3;
                                if (str28.equals("googActiveConnection")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -244374237:
                                valueArr = valueArr3;
                                if (str28.equals("googTransportType")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -200882018:
                                valueArr = valueArr3;
                                if (str28.equals("googChannelId")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 207096210:
                                valueArr = valueArr3;
                                if (str28.equals("googRtt")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 230681321:
                                valueArr = valueArr3;
                                if (str28.equals("googLocalAddress")) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 585525230:
                                valueArr = valueArr3;
                                if (str28.equals("googRemoteAddress")) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 930973655:
                                valueArr = valueArr3;
                                if (str28.equals("googRemoteCandidateType")) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                valueArr = valueArr3;
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                                str20 = value2.value;
                                break;
                            case 1:
                                zEqualsIgnoreCase = "true".equalsIgnoreCase(value2.value);
                                break;
                            case 2:
                                str26 = value2.value;
                                break;
                            case 3:
                                str27 = value2.value;
                                break;
                            case 4:
                                str19 = value2.value;
                                break;
                            case 5:
                                String str29 = value2.value;
                                if (str29 != null) {
                                    str22 = str29.split(":")[0];
                                }
                                str21 = str29;
                                break;
                            case 6:
                                String str30 = value2.value;
                                if (str30 != null) {
                                    str25 = str30.split(":")[0];
                                }
                                str24 = str30;
                                break;
                            case 7:
                                str23 = value2.value;
                                break;
                            default:
                                map4.put(value2.name, value2.value);
                                break;
                        }
                        i6++;
                        valueArr3 = valueArr;
                    }
                    try {
                        dValueOf = Double.valueOf(Double.parseDouble(str19));
                        break;
                    } catch (Throwable th) {
                        Log.e("CandidatePair", "Can't parse rtt", th);
                        dValueOf = null;
                    }
                    pk2 pk2Var = new pk2(str18, str20, str21, str22, str23, str24, str25, dValueOf, str26, str27, zEqualsIgnoreCase);
                    pk2Var.l.putAll(map4);
                    arrayList6.add(pk2Var);
                    break;
                case "googTrack":
                    arrayList5.add(statsReport.values[0].value);
                    break;
                default:
                    HashMap map5 = new HashMap();
                    for (StatsReport.Value value3 : statsReport.values) {
                        map5.put(value3.name, value3.value);
                    }
                    map2.put(statsReport.id, map5);
                    break;
            }
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            map = map2;
            i = length;
            j = j2;
            i2 = i3;
            i3 = i2 + 1;
            statsReportArr2 = statsReportArr;
            arrayList6 = arrayList2;
            arrayList5 = arrayList;
            length = i;
            j2 = j;
            map2 = map;
        }
        a4e a4eVar = new a4e(j2, arrayList5, arrayList4, arrayList6);
        a4eVar.d.putAll(map2);
        return a4eVar;
    }

    public final pk2 c() {
        for (pk2 pk2Var : this.c) {
            if (pk2Var.k) {
                return pk2Var;
            }
        }
        return null;
    }
}
