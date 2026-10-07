package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.ParserException;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class mdc implements qmc {
    public final wx7 a;
    public final sx7 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final gve d;
    public final u97 e;
    public static final Pattern f = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern g = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern i = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern j = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern k = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern l = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern m = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern n = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern o = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern p = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern q = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern r = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern s = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern t = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern u = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern v = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern w = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern x = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern y = a("CAN-SKIP-DATERANGES");
    public static final Pattern z = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern A = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern B = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern C = a("CAN-BLOCK-RELOAD");
    public static final Pattern D = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern E = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern F = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern G = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern H = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern I = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern J = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern K = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern X = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern Y = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern n1 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern o1 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern p1 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern q1 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern r1 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern s1 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern t1 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern u1 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern v1 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern w1 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern x1 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern y1 = a("AUTOSELECT");
    public static final Pattern z1 = a("DEFAULT");
    public static final Pattern A1 = a("FORCED");
    public static final Pattern B1 = a("INDEPENDENT");
    public static final Pattern C1 = a("GAP");
    public static final Pattern D1 = a("PRECISE");
    public static final Pattern E1 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern F1 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern G1 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern H1 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern I1 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern J1 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern K1 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern L1 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern M1 = a("END-ON-NEXT");
    public static final Pattern N1 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern O1 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern P1 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern Q1 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern R1 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern S1 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern T1 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern U1 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern V1 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern W1 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern X1 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern Y1 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern Z1 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern a2 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");
    public static final Pattern b2 = Pattern.compile("#EXT-X-VK-PLAYBACK-DURATION:(\\d+)\\b");

    public mdc(wx7 wx7Var, sx7 sx7Var, gve gveVar, u97 u97Var, Set set) {
        HashSet hashSet = new HashSet();
        this.a = wx7Var;
        this.b = sx7Var;
        this.d = gveVar;
        this.e = u97Var;
        hashSet.addAll(set);
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static wu5 b(String str, vu5[] vu5VarArr) {
        vu5[] vu5VarArr2 = new vu5[vu5VarArr.length];
        for (int i2 = 0; i2 < vu5VarArr.length; i2++) {
            vu5 vu5Var = vu5VarArr[i2];
            vu5VarArr2[i2] = new vu5(vu5Var.b, vu5Var.c, vu5Var.d, null);
        }
        return new wu5(str, true, vu5VarArr2);
    }

    public static vu5 e(String str, String str2, HashMap map) throws ParserException {
        String strK = k(str, o1, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = p1;
        if (zEquals) {
            String strL = l(str, pattern, map);
            return new vu5(f71.d, null, "video/mp4", Base64.decode(strL.substring(strL.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = f71.d;
            String str3 = vqi.a;
            return new vu5(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strK)) {
            return null;
        }
        String strL2 = l(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strL2.substring(strL2.indexOf(44)), 0);
        UUID uuid2 = f71.e;
        return new vu5(uuid2, null, "video/mp4", iml.b(uuid2, null, bArrDecode));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34621. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static defpackage.sx7 f(defpackage.wx7 r101, defpackage.sx7 r102, defpackage.euc r103, java.lang.String r104) {
        /*
            Method dump skipped, instruction units count: 3462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdc.f(wx7, sx7, euc, java.lang.String):sx7");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:149:0x0412  */
    /* JADX WARN: Code duplicated, block: B:238:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0180  */
    /* JADX WARN: Code duplicated, block: B:57:0x0183  */
    /* JADX WARN: Code duplicated, block: B:75:0x01be  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x021b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0226  */
    /* JADX WARN: Code duplicated, block: B:96:0x022c  */
    /* JADX WARN: Code duplicated, block: B:99:0x027d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /* JADX WARN: Type inference failed for: r43v9 */
    public static wx7 g(euc eucVar, String str) throws IOException {
        ?? r43;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        vx7 vx7Var;
        String strD;
        ArrayList arrayList3;
        int i3;
        String str2;
        vx7 vx7Var2;
        String strD2;
        vx7 vx7Var3;
        int i4;
        int i5;
        String str3;
        String str4;
        String strX;
        String strK;
        int i6;
        int i7;
        String strK2;
        float f2;
        Uri uriE;
        Uri uri;
        ArrayList arrayList4;
        String str5;
        String strY;
        String str6 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean zS = eucVar.s();
            Pattern pattern = p1;
            ArrayList arrayList13 = arrayList9;
            boolean z4 = z2;
            Pattern pattern2 = u1;
            boolean z5 = z3;
            if (!zS) {
                ArrayList arrayList14 = arrayList6;
                ArrayList arrayList15 = arrayList7;
                ArrayList arrayList16 = arrayList8;
                ArrayList arrayList17 = arrayList12;
                ArrayList arrayList18 = arrayList11;
                ArrayList arrayList19 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i8 = 0;
                HashMap map3 = map;
                while (i8 < arrayList5.size()) {
                    vx7 vx7Var4 = (vx7) arrayList5.get(i8);
                    Uri uri2 = vx7Var4.a;
                    b87 b87Var = vx7Var4.b;
                    if (hashSet.add(uri2)) {
                        lvb.b0(b87Var.l == null);
                        ArrayList arrayList20 = (ArrayList) map3.get(vx7Var4.a);
                        arrayList20.getClass();
                        lwa lwaVar = new lwa(new hy7(null, null, arrayList20));
                        a87 a87VarA = b87Var.a();
                        a87VarA.k = lwaVar;
                        arrayList19.add(new vx7(vx7Var4.a, new b87(a87VarA), vx7Var4.c, vx7Var4.d, vx7Var4.e, vx7Var4.f));
                    }
                    i8++;
                    hashSet = hashSet;
                    map3 = map3;
                }
                int i9 = 0;
                List arrayList21 = null;
                b87 b87Var2 = null;
                while (i9 < arrayList10.size()) {
                    String str7 = (String) arrayList10.get(i9);
                    String strL = l(str7, v1, map2);
                    String strL2 = l(str7, pattern2, map2);
                    a87 a87Var = new a87();
                    int i10 = i9;
                    a87Var.a = zo5.p(strL, ":", strL2);
                    a87Var.b = strL2;
                    a87Var.l = uya.n("application/x-mpegURL");
                    boolean zH = h(str7, z1);
                    if (h(str7, A1)) {
                        r43 = zH;
                        r43 = (zH ? 1 : 0) | 2;
                    }
                    r43 = zH;
                    a87Var.e = h(str7, y1) ? r43 | 4 : r43;
                    ArrayList arrayList22 = arrayList10;
                    String strK3 = k(str7, w1, null, map2);
                    if (TextUtils.isEmpty(strK3)) {
                        arrayList = arrayList19;
                        i2 = 0;
                    } else {
                        String str8 = vqi.a;
                        String[] strArrSplit = strK3.split(",", -1);
                        i2 = vqi.m(strArrSplit, "public.accessibility.describes-video") ? np0.o : 0;
                        arrayList = arrayList19;
                        if (vqi.m(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i2 |= np0.r;
                        }
                        if (vqi.m(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i2 |= 1024;
                        }
                        if (vqi.m(strArrSplit, "public.easy-to-read")) {
                            i2 |= 8192;
                        }
                    }
                    a87Var.f = i2;
                    a87Var.d = k(str7, t1, null, map2);
                    String strK4 = k(str7, pattern, null, map2);
                    Uri uriE2 = strK4 == null ? null : w1m.e(str6, strK4);
                    lwa lwaVar2 = new lwa(new hy7(strL, strL2, Collections.EMPTY_LIST));
                    switch (l(str7, r1, map2)) {
                        case "SUBTITLES":
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList5.size()) {
                                    vx7Var = (vx7) arrayList5.get(i11);
                                    if (!strL.equals(vx7Var.e)) {
                                        i11++;
                                    }
                                } else {
                                    vx7Var = null;
                                }
                            }
                            if (vx7Var != null) {
                                String strX2 = vqi.x(3, vx7Var.b.k);
                                a87Var.j = strX2;
                                strD = uya.d(strX2);
                            } else {
                                strD = null;
                            }
                            if (strD == null) {
                                strD = "text/vtt";
                            }
                            a87Var.m = uya.n(strD);
                            a87Var.k = lwaVar2;
                            if (uriE2 == null) {
                                arrayList2 = arrayList16;
                                lvb.G0("OVHlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                ux7 ux7Var = new ux7(uriE2, new b87(a87Var), strL2);
                                arrayList2 = arrayList16;
                                arrayList2.add(ux7Var);
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList3 = arrayList15;
                            String strL3 = l(str7, x1, map2);
                            if (strL3.startsWith("CC")) {
                                i3 = Integer.parseInt(strL3.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i3 = Integer.parseInt(strL3.substring(7));
                                str2 = "application/cea-708";
                            }
                            if (arrayList21 == null) {
                                arrayList21 = new ArrayList();
                            }
                            a87Var.m = uya.n(str2);
                            a87Var.J = i3;
                            arrayList21.add(new b87(a87Var));
                            arrayList15 = arrayList3;
                            arrayList2 = arrayList16;
                            break;
                        case "AUDIO":
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList5.size()) {
                                    vx7Var2 = (vx7) arrayList5.get(i12);
                                    int i13 = i12;
                                    if (!strL.equals(vx7Var2.d)) {
                                        i12 = i13 + 1;
                                    }
                                } else {
                                    vx7Var2 = null;
                                }
                            }
                            if (vx7Var2 != null) {
                                String strX3 = vqi.x(1, vx7Var2.b.k);
                                a87Var.j = strX3;
                                strD2 = uya.d(strX3);
                            } else {
                                strD2 = null;
                            }
                            vx7 vx7Var5 = vx7Var2;
                            String strK5 = k(str7, l, null, map2);
                            if (strK5 != null) {
                                String str9 = vqi.a;
                                a87Var.E = Integer.parseInt(strK5.split("/", 2)[0]);
                                if ("audio/eac3".equals(strD2) && strK5.endsWith("/JOC")) {
                                    a87Var.j = "ec+3";
                                    strD2 = "audio/eac3-joc";
                                }
                            }
                            a87Var.r(strD2);
                            if (uriE2 != null) {
                                a87Var.k = lwaVar2;
                                arrayList15.add(new ux7(uriE2, new b87(a87Var), strL2));
                            } else {
                                arrayList3 = arrayList15;
                                if (vx7Var5 != null) {
                                    arrayList15 = arrayList3;
                                    b87Var2 = new b87(a87Var);
                                } else {
                                    arrayList15 = arrayList3;
                                }
                            }
                            arrayList2 = arrayList16;
                            break;
                        case "VIDEO":
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList5.size()) {
                                    vx7Var3 = (vx7) arrayList5.get(i14);
                                    if (!strL.equals(vx7Var3.c)) {
                                        i14++;
                                    }
                                } else {
                                    vx7Var3 = null;
                                }
                            }
                            if (vx7Var3 != null) {
                                b87 b87Var3 = vx7Var3.b;
                                String strX4 = vqi.x(2, b87Var3.k);
                                a87Var.j = strX4;
                                a87Var.m = uya.n(uya.d(strX4));
                                a87Var.t = b87Var3.u;
                                a87Var.u = b87Var3.v;
                                a87Var.x = b87Var3.y;
                            }
                            if (uriE2 != null) {
                                a87Var.k = lwaVar2;
                                arrayList14.add(new ux7(uriE2, new b87(a87Var), strL2));
                            }
                            arrayList2 = arrayList16;
                            break;
                        default:
                            arrayList2 = arrayList16;
                            break;
                    }
                    arrayList19 = arrayList;
                    arrayList16 = arrayList2;
                    i9 = i10 + 1;
                    arrayList10 = arrayList22;
                    str6 = str;
                }
                ArrayList arrayList23 = arrayList19;
                ArrayList arrayList24 = arrayList16;
                if (z4) {
                    arrayList21 = Collections.EMPTY_LIST;
                }
                return new wx7(str, arrayList17, arrayList23, arrayList14, arrayList15, arrayList24, arrayList13, b87Var2, arrayList21, z5, map2, arrayList18);
            }
            String strU = eucVar.u();
            if (strU.startsWith("#EXT")) {
                arrayList12.add(strU);
            }
            boolean zStartsWith = strU.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList25 = arrayList12;
            if (strU.startsWith("#EXT-X-DEFINE")) {
                map2.put(l(strU, pattern2, map2), l(strU, E1, map2));
            } else {
                if (strU.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList6 = arrayList6;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    arrayList11 = arrayList11;
                    z2 = z4;
                    z3 = true;
                } else if (strU.startsWith("#EXT-X-MEDIA")) {
                    arrayList10.add(strU);
                } else if (strU.startsWith("#EXT-X-SESSION-KEY")) {
                    vu5 vu5VarE = e(strU, k(strU, n1, HTTP.IDENTITY_CODING, map2), map2);
                    if (vu5VarE != null) {
                        String strL4 = l(strU, Z, map2);
                        arrayList11.add(new wu5(("SAMPLE-AES-CENC".equals(strL4) || "SAMPLE-AES-CTR".equals(strL4)) ? "cenc" : "cbcs", true, vu5VarE));
                    }
                } else {
                    if (strU.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        boolean zContains = z4 | strU.contains("CLOSED-CAPTIONS=NONE");
                        int i15 = zStartsWith ? 16384 : 0;
                        z4 = zContains;
                        int i16 = Integer.parseInt(l(strU, k, Collections.EMPTY_MAP));
                        Matcher matcher = f.matcher(strU);
                        if (matcher.find()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            i4 = Integer.parseInt(strGroup);
                        } else {
                            i4 = -1;
                        }
                        String strK6 = k(strU, m, null, map2);
                        String strK7 = k(strU, n, null, map2);
                        String strK8 = k(strU, o, null, map2);
                        if (strK8 != null) {
                            String str10 = vqi.a;
                            String[] strArrSplit2 = strK8.split(",", 2)[0].split("/", -1);
                            str3 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str4 = strArrSplit2[1];
                                i5 = 2;
                            } else {
                                i5 = 2;
                            }
                            strX = vqi.x(i5, strK7);
                            if (uya.j(strX, str3)) {
                                if (str3 == null) {
                                    str5 = strX;
                                } else if (strK6 != null && str4 != null) {
                                    str5 = strX;
                                    if ((strK6.equals("PQ") || str4.equals("db1p")) && ((!strK6.equals("SDR") || str4.equals("db2g")) && (!strK6.equals("HLG") || str4.startsWith("db4")))) {
                                    }
                                }
                                if (str3 == null) {
                                    str3 = str5;
                                }
                                strY = vqi.y(strK7);
                                if (strY != null) {
                                    strK7 = zo5.p(str3, ",", strY);
                                } else {
                                    strK7 = str3;
                                }
                            }
                            strK = k(strU, p, null, map2);
                            if (strK != null) {
                                String[] strArrSplit3 = strK.split("x", -1);
                                i7 = Integer.parseInt(strArrSplit3[0]);
                                i6 = Integer.parseInt(strArrSplit3[1]);
                                if (i7 > 0 || i6 <= 0) {
                                    i6 = -1;
                                    i7 = -1;
                                }
                            } else {
                                i6 = -1;
                                i7 = -1;
                            }
                            strK2 = k(strU, q, null, map2);
                            if (strK2 != null) {
                                f2 = Float.parseFloat(strK2);
                            } else {
                                f2 = -1.0f;
                            }
                            String strK9 = k(strU, g, null, map2);
                            String strK10 = k(strU, h, null, map2);
                            String strK11 = k(strU, i, null, map2);
                            String strK12 = k(strU, j, null, map2);
                            if (zStartsWith) {
                                uriE = w1m.e(str6, l(strU, pattern, map2));
                            } else {
                                if (eucVar.s()) {
                                    throw ParserException.b(null, "#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriE = w1m.e(str6, m(eucVar.u(), map2));
                            }
                            uri = uriE;
                            a87 a87Var2 = new a87();
                            a87Var2.a = Integer.toString(arrayList5.size());
                            a87Var2.l = uya.n("application/x-mpegURL");
                            a87Var2.j = strK7;
                            a87Var2.h = i4;
                            a87Var2.i = i16;
                            a87Var2.t = i7;
                            a87Var2.u = i6;
                            a87Var2.x = f2;
                            a87Var2.f = i15;
                            arrayList5.add(new vx7(uri, new b87(a87Var2), strK9, strK10, strK11, strK12));
                            arrayList4 = (ArrayList) map.get(uri);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                map.put(uri, arrayList4);
                            }
                            arrayList4.add(new gy7(strK9, i4, i16, strK10, strK11, strK12));
                        } else {
                            i5 = 2;
                            str3 = null;
                        }
                        str4 = null;
                        strX = vqi.x(i5, strK7);
                        if (uya.j(strX, str3)) {
                            if (str3 == null) {
                                str5 = strX;
                            } else if (strK6 != null) {
                                str5 = strX;
                                if (strK6.equals("PQ")) {
                                }
                            }
                            if (str3 == null) {
                                str3 = str5;
                            }
                            strY = vqi.y(strK7);
                            if (strY != null) {
                                strK7 = zo5.p(str3, ",", strY);
                            } else {
                                strK7 = str3;
                            }
                        }
                        strK = k(strU, p, null, map2);
                        if (strK != null) {
                            String[] strArrSplit4 = strK.split("x", -1);
                            i7 = Integer.parseInt(strArrSplit4[0]);
                            i6 = Integer.parseInt(strArrSplit4[1]);
                            if (i7 > 0) {
                                i6 = -1;
                                i7 = -1;
                            } else {
                                i6 = -1;
                                i7 = -1;
                            }
                        } else {
                            i6 = -1;
                            i7 = -1;
                        }
                        strK2 = k(strU, q, null, map2);
                        if (strK2 != null) {
                            f2 = Float.parseFloat(strK2);
                        } else {
                            f2 = -1.0f;
                        }
                        String strK13 = k(strU, g, null, map2);
                        String strK14 = k(strU, h, null, map2);
                        String strK15 = k(strU, i, null, map2);
                        String strK16 = k(strU, j, null, map2);
                        if (zStartsWith) {
                            uriE = w1m.e(str6, l(strU, pattern, map2));
                        } else {
                            if (eucVar.s()) {
                                throw ParserException.b(null, "#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriE = w1m.e(str6, m(eucVar.u(), map2));
                        }
                        uri = uriE;
                        a87 a87Var3 = new a87();
                        a87Var3.a = Integer.toString(arrayList5.size());
                        a87Var3.l = uya.n("application/x-mpegURL");
                        a87Var3.j = strK7;
                        a87Var3.h = i4;
                        a87Var3.i = i16;
                        a87Var3.t = i7;
                        a87Var3.u = i6;
                        a87Var3.x = f2;
                        a87Var3.f = i15;
                        arrayList5.add(new vx7(uri, new b87(a87Var3), strK13, strK14, strK15, strK16));
                        arrayList4 = (ArrayList) map.get(uri);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            map.put(uri, arrayList4);
                        }
                        arrayList4.add(new gy7(strK13, i4, i16, strK14, strK15, strK16));
                    }
                    z2 = z4;
                    z3 = z5;
                }
                arrayList9 = arrayList13;
                arrayList12 = arrayList25;
                arrayList11 = arrayList11;
                arrayList8 = arrayList8;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
            }
            z2 = z4;
            z3 = z5;
            arrayList9 = arrayList13;
            arrayList12 = arrayList25;
            arrayList11 = arrayList11;
            arrayList8 = arrayList8;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
        }
    }

    public static boolean h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double i(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long j(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String k(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m(str2, map);
    }

    public static String l(String str, Pattern pattern, Map map) throws ParserException {
        String strK = k(str, pattern, null, map);
        if (strK != null) {
            return strK;
        }
        throw ParserException.b(null, "Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String m(String str, Map map) {
        Matcher matcher = Z1.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final void c(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            if (str.startsWith("#EXT-X-VK-PLAYBACK-DURATION") && d(str)) {
                return;
            }
        }
    }

    public final boolean d(String str) {
        try {
            long j2 = Integer.parseInt(l(str, b2, Collections.EMPTY_MAP));
            if (this.d == null) {
                return true;
            }
            this.c.post(new h7b(this, j2));
            return true;
        } catch (ParserException unused) {
            lvb.k0("OVHlsPlaylistParser", "Error parsing #EXT-X-VK-PLAYBACK-DURATION tag");
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x004c A[Catch: all -> 0x00c9, TryCatch #3 {all -> 0x00c9, blocks: (B:3:0x001d, B:5:0x0026, B:7:0x002e, B:10:0x0037, B:31:0x0076, B:33:0x007c, B:36:0x0087, B:38:0x008f, B:49:0x00cc, B:51:0x00d4, B:53:0x00dc, B:55:0x00e4, B:57:0x00ec, B:59:0x00f4, B:61:0x00fc, B:63:0x0104, B:66:0x010d, B:68:0x0115, B:69:0x011a, B:70:0x011f, B:90:0x0181, B:91:0x0187, B:12:0x003d, B:14:0x0043, B:18:0x004c, B:21:0x0055, B:23:0x005e, B:25:0x0064, B:27:0x006a, B:28:0x006f), top: B:107:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[Catch: all -> 0x00c9, LOOP:5: B:16:0x0049->B:21:0x0055, LOOP_END, TryCatch #3 {all -> 0x00c9, blocks: (B:3:0x001d, B:5:0x0026, B:7:0x002e, B:10:0x0037, B:31:0x0076, B:33:0x007c, B:36:0x0087, B:38:0x008f, B:49:0x00cc, B:51:0x00d4, B:53:0x00dc, B:55:0x00e4, B:57:0x00ec, B:59:0x00f4, B:61:0x00fc, B:63:0x0104, B:66:0x010d, B:68:0x0115, B:69:0x011a, B:70:0x011f, B:90:0x0181, B:91:0x0187, B:12:0x003d, B:14:0x0043, B:18:0x004c, B:21:0x0055, B:23:0x005e, B:25:0x0064, B:27:0x006a, B:28:0x006f), top: B:107:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0 A[PHI: r12
  0x00c0: PHI (r12v8 xx7) = (r12v7 xx7), (r12v11 xx7) binds: [B:45:0x00be, B:77:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.qmc
    public final Object n(Uri uri, x25 x25Var) throws ParserException {
        int i2;
        String strTrim;
        xx7 xx7VarG;
        u97 u97Var = this.e;
        gee geeVar = new gee(x25Var);
        ByteArrayOutputStream byteArrayOutputStream = geeVar.b;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(geeVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i3 = bufferedReader.read();
            boolean zQ = false;
            if (i3 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i3 = bufferedReader.read();
                    while (i3 != -1) {
                        i3 = bufferedReader.read();
                    }
                    i2 = 0;
                    while (true) {
                        if (i2 < 7) {
                            while (i3 != -1) {
                                i3 = bufferedReader.read();
                            }
                            zQ = vqi.Q(i3);
                            break;
                        }
                        if (i3 != "#EXTM3U".charAt(i2)) {
                            break;
                            break;
                        }
                        i3 = bufferedReader.read();
                        i2++;
                    }
                }
            } else {
                while (i3 != -1 && Character.isWhitespace(i3)) {
                    i3 = bufferedReader.read();
                }
                i2 = 0;
                while (true) {
                    if (i2 < 7) {
                        while (i3 != -1 && Character.isWhitespace(i3) && !vqi.Q(i3)) {
                            i3 = bufferedReader.read();
                        }
                        zQ = vqi.Q(i3);
                        break;
                    }
                    if (i3 != "#EXTM3U".charAt(i2)) {
                        break;
                    }
                    i3 = bufferedReader.read();
                    i2++;
                }
            }
            if (!zQ) {
                throw ParserException.b(null, "Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    vqi.h(bufferedReader);
                    do {
                        try {
                        } catch (IOException e) {
                            lvb.k0("OVHlsPlaylistParser", "finally recording stream read error" + e);
                        }
                    } while (geeVar.read() != -1);
                    if (u97Var != null) {
                        u97Var.a(byteArrayOutputStream.toString());
                    }
                    throw ParserException.b(null, "Failed to parse the playlist, could not identify any tags.");
                }
                strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        if (strTrim.startsWith("#EXT-X-TARGETDURATION") || strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim.startsWith("#EXTINF") || strTrim.startsWith("#EXT-X-KEY") || strTrim.startsWith("#EXT-X-BYTERANGE") || strTrim.equals("#EXT-X-DISCONTINUITY") || strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || strTrim.equals("#EXT-X-ENDLIST")) {
                            break;
                            break;
                            break;
                            break;
                            break;
                            break;
                            break;
                            break;
                        }
                        if (strTrim.startsWith("#EXT-X-VK-PLAYBACK-DURATION")) {
                            d(strTrim);
                        } else {
                            arrayDeque.add(strTrim);
                        }
                    } else {
                        arrayDeque.add(strTrim);
                        xx7VarG = g(new euc(arrayDeque, bufferedReader), uri.toString());
                        c(xx7VarG.b);
                        vqi.h(bufferedReader);
                        do {
                            try {
                            } catch (IOException e2) {
                                lvb.k0("OVHlsPlaylistParser", "finally recording stream read error" + e2);
                            }
                        } while (geeVar.read() != -1);
                        if (u97Var != null) {
                            u97Var.a(byteArrayOutputStream.toString());
                        }
                    }
                    return xx7VarG;
                }
            }
            arrayDeque.add(strTrim);
            xx7VarG = f(this.a, this.b, new euc(arrayDeque, bufferedReader), uri.toString());
            c(xx7VarG.b);
            vqi.h(bufferedReader);
            do {
                try {
                } catch (IOException e3) {
                    lvb.k0("OVHlsPlaylistParser", "finally recording stream read error" + e3);
                }
            } while (geeVar.read() != -1);
            if (u97Var != null) {
                u97Var.a(byteArrayOutputStream.toString());
            }
            return xx7VarG;
        } catch (Throwable th) {
            vqi.h(bufferedReader);
            do {
                try {
                } catch (IOException e4) {
                    lvb.k0("OVHlsPlaylistParser", "finally recording stream read error" + e4);
                }
            } while (geeVar.read() != -1);
            if (u97Var == null) {
                throw th;
            }
            u97Var.a(byteArrayOutputStream.toString());
            throw th;
        }
    }
}
