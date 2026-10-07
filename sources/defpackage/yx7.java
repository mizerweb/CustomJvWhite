package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.ParserException;
import java.io.BufferedReader;
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
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class yx7 implements qmc {
    public final wx7 a;
    public final sx7 b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern p = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern v = a("CAN-SKIP-DATERANGES");
    public static final Pattern w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern z = a("CAN-BLOCK-RELOAD");
    public static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern X = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern Y = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern Z = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern n1 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern o1 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern p1 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern q1 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern r1 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern s1 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern t1 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern u1 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern v1 = a("AUTOSELECT");
    public static final Pattern w1 = a("DEFAULT");
    public static final Pattern x1 = a("FORCED");
    public static final Pattern y1 = a("INDEPENDENT");
    public static final Pattern z1 = a("GAP");
    public static final Pattern A1 = a("PRECISE");
    public static final Pattern B1 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern C1 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern D1 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern E1 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern F1 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern G1 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern H1 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern I1 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern J1 = a("END-ON-NEXT");
    public static final Pattern K1 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern L1 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern M1 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern N1 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern O1 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern P1 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern Q1 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern R1 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern S1 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern T1 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern U1 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern V1 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern W1 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern X1 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public yx7(wx7 wx7Var, sx7 sx7Var) {
        this.a = wx7Var;
        this.b = sx7Var;
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

    public static vu5 c(String str, String str2, HashMap map) throws ParserException {
        String strI = i(str, Y, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = Z;
        if (zEquals) {
            String strJ = j(str, pattern, map);
            return new vu5(f71.d, null, "video/mp4", Base64.decode(strJ.substring(strJ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = f71.d;
            String str3 = vqi.a;
            return new vu5(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strI)) {
            return null;
        }
        String strJ2 = j(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strJ2.substring(strJ2.indexOf(44)), 0);
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
    public static defpackage.sx7 d(defpackage.wx7 r101, defpackage.sx7 r102, defpackage.r6a r103, java.lang.String r104) {
        /*
            Method dump skipped, instruction units count: 3462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx7.d(wx7, sx7, r6a, java.lang.String):sx7");
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
    public static wx7 e(r6a r6aVar, String str) throws IOException {
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
        String strI;
        int i6;
        int i7;
        String strI2;
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
            boolean zD = r6aVar.D();
            Pattern pattern = Z;
            ArrayList arrayList13 = arrayList9;
            boolean z4 = z2;
            Pattern pattern2 = r1;
            boolean z5 = z3;
            if (!zD) {
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
                    String strJ = j(str7, s1, map2);
                    String strJ2 = j(str7, pattern2, map2);
                    a87 a87Var = new a87();
                    int i10 = i9;
                    a87Var.a = zo5.p(strJ, ":", strJ2);
                    a87Var.b = strJ2;
                    a87Var.l = uya.n("application/x-mpegURL");
                    boolean zF = f(str7, w1);
                    if (f(str7, x1)) {
                        r43 = zF;
                        r43 = (zF ? 1 : 0) | 2;
                    }
                    r43 = zF;
                    a87Var.e = f(str7, v1) ? r43 | 4 : r43;
                    ArrayList arrayList22 = arrayList10;
                    String strI3 = i(str7, t1, null, map2);
                    if (TextUtils.isEmpty(strI3)) {
                        arrayList = arrayList19;
                        i2 = 0;
                    } else {
                        String str8 = vqi.a;
                        String[] strArrSplit = strI3.split(",", -1);
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
                    a87Var.d = i(str7, q1, null, map2);
                    String strI4 = i(str7, pattern, null, map2);
                    Uri uriE2 = strI4 == null ? null : w1m.e(str6, strI4);
                    lwa lwaVar2 = new lwa(new hy7(strJ, strJ2, Collections.EMPTY_LIST));
                    switch (j(str7, o1, map2)) {
                        case "SUBTITLES":
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList5.size()) {
                                    vx7Var = (vx7) arrayList5.get(i11);
                                    if (!strJ.equals(vx7Var.e)) {
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
                                lvb.G0("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                ux7 ux7Var = new ux7(uriE2, new b87(a87Var), strJ2);
                                arrayList2 = arrayList16;
                                arrayList2.add(ux7Var);
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList3 = arrayList15;
                            String strJ3 = j(str7, u1, map2);
                            if (strJ3.startsWith("CC")) {
                                i3 = Integer.parseInt(strJ3.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i3 = Integer.parseInt(strJ3.substring(7));
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
                                    if (!strJ.equals(vx7Var2.d)) {
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
                            String strI5 = i(str7, i, null, map2);
                            if (strI5 != null) {
                                String str9 = vqi.a;
                                a87Var.E = Integer.parseInt(strI5.split("/", 2)[0]);
                                if ("audio/eac3".equals(strD2) && strI5.endsWith("/JOC")) {
                                    a87Var.j = "ec+3";
                                    strD2 = "audio/eac3-joc";
                                }
                            }
                            a87Var.r(strD2);
                            if (uriE2 != null) {
                                a87Var.k = lwaVar2;
                                arrayList15.add(new ux7(uriE2, new b87(a87Var), strJ2));
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
                                    if (!strJ.equals(vx7Var3.c)) {
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
                                arrayList14.add(new ux7(uriE2, new b87(a87Var), strJ2));
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
            String strF = r6aVar.F();
            if (strF.startsWith("#EXT")) {
                arrayList12.add(strF);
            }
            boolean zStartsWith = strF.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList25 = arrayList12;
            if (strF.startsWith("#EXT-X-DEFINE")) {
                map2.put(j(strF, pattern2, map2), j(strF, B1, map2));
            } else {
                if (strF.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList6 = arrayList6;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    arrayList11 = arrayList11;
                    z2 = z4;
                    z3 = true;
                } else if (strF.startsWith("#EXT-X-MEDIA")) {
                    arrayList10.add(strF);
                } else if (strF.startsWith("#EXT-X-SESSION-KEY")) {
                    vu5 vu5VarC = c(strF, i(strF, X, HTTP.IDENTITY_CODING, map2), map2);
                    if (vu5VarC != null) {
                        String strJ4 = j(strF, K, map2);
                        arrayList11.add(new wu5(("SAMPLE-AES-CENC".equals(strJ4) || "SAMPLE-AES-CTR".equals(strJ4)) ? "cenc" : "cbcs", true, vu5VarC));
                    }
                } else {
                    if (strF.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        boolean zContains = z4 | strF.contains("CLOSED-CAPTIONS=NONE");
                        int i15 = zStartsWith ? 16384 : 0;
                        z4 = zContains;
                        int i16 = Integer.parseInt(j(strF, h, Collections.EMPTY_MAP));
                        Matcher matcher = c.matcher(strF);
                        if (matcher.find()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            i4 = Integer.parseInt(strGroup);
                        } else {
                            i4 = -1;
                        }
                        String strI6 = i(strF, j, null, map2);
                        String strI7 = i(strF, k, null, map2);
                        String strI8 = i(strF, l, null, map2);
                        if (strI8 != null) {
                            String str10 = vqi.a;
                            String[] strArrSplit2 = strI8.split(",", 2)[0].split("/", -1);
                            str3 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str4 = strArrSplit2[1];
                                i5 = 2;
                            } else {
                                i5 = 2;
                            }
                            strX = vqi.x(i5, strI7);
                            if (uya.j(strX, str3)) {
                                if (str3 == null) {
                                    str5 = strX;
                                } else if (strI6 != null && str4 != null) {
                                    str5 = strX;
                                    if ((strI6.equals("PQ") || str4.equals("db1p")) && ((!strI6.equals("SDR") || str4.equals("db2g")) && (!strI6.equals("HLG") || str4.startsWith("db4")))) {
                                    }
                                }
                                if (str3 == null) {
                                    str3 = str5;
                                }
                                strY = vqi.y(strI7);
                                if (strY != null) {
                                    strI7 = zo5.p(str3, ",", strY);
                                } else {
                                    strI7 = str3;
                                }
                            }
                            strI = i(strF, m, null, map2);
                            if (strI != null) {
                                String[] strArrSplit3 = strI.split("x", -1);
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
                            strI2 = i(strF, n, null, map2);
                            if (strI2 != null) {
                                f2 = Float.parseFloat(strI2);
                            } else {
                                f2 = -1.0f;
                            }
                            String strI9 = i(strF, d, null, map2);
                            String strI10 = i(strF, e, null, map2);
                            String strI11 = i(strF, f, null, map2);
                            String strI12 = i(strF, g, null, map2);
                            if (zStartsWith) {
                                uriE = w1m.e(str6, j(strF, pattern, map2));
                            } else {
                                if (r6aVar.D()) {
                                    throw ParserException.b(null, "#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriE = w1m.e(str6, k(r6aVar.F(), map2));
                            }
                            uri = uriE;
                            a87 a87Var2 = new a87();
                            a87Var2.a = Integer.toString(arrayList5.size());
                            a87Var2.l = uya.n("application/x-mpegURL");
                            a87Var2.j = strI7;
                            a87Var2.h = i4;
                            a87Var2.i = i16;
                            a87Var2.t = i7;
                            a87Var2.u = i6;
                            a87Var2.x = f2;
                            a87Var2.f = i15;
                            arrayList5.add(new vx7(uri, new b87(a87Var2), strI9, strI10, strI11, strI12));
                            arrayList4 = (ArrayList) map.get(uri);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                map.put(uri, arrayList4);
                            }
                            arrayList4.add(new gy7(strI9, i4, i16, strI10, strI11, strI12));
                        } else {
                            i5 = 2;
                            str3 = null;
                        }
                        str4 = null;
                        strX = vqi.x(i5, strI7);
                        if (uya.j(strX, str3)) {
                            if (str3 == null) {
                                str5 = strX;
                            } else if (strI6 != null) {
                                str5 = strX;
                                if (strI6.equals("PQ")) {
                                }
                            }
                            if (str3 == null) {
                                str3 = str5;
                            }
                            strY = vqi.y(strI7);
                            if (strY != null) {
                                strI7 = zo5.p(str3, ",", strY);
                            } else {
                                strI7 = str3;
                            }
                        }
                        strI = i(strF, m, null, map2);
                        if (strI != null) {
                            String[] strArrSplit4 = strI.split("x", -1);
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
                        strI2 = i(strF, n, null, map2);
                        if (strI2 != null) {
                            f2 = Float.parseFloat(strI2);
                        } else {
                            f2 = -1.0f;
                        }
                        String strI13 = i(strF, d, null, map2);
                        String strI14 = i(strF, e, null, map2);
                        String strI15 = i(strF, f, null, map2);
                        String strI16 = i(strF, g, null, map2);
                        if (zStartsWith) {
                            uriE = w1m.e(str6, j(strF, pattern, map2));
                        } else {
                            if (r6aVar.D()) {
                                throw ParserException.b(null, "#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriE = w1m.e(str6, k(r6aVar.F(), map2));
                        }
                        uri = uriE;
                        a87 a87Var3 = new a87();
                        a87Var3.a = Integer.toString(arrayList5.size());
                        a87Var3.l = uya.n("application/x-mpegURL");
                        a87Var3.j = strI7;
                        a87Var3.h = i4;
                        a87Var3.i = i16;
                        a87Var3.t = i7;
                        a87Var3.u = i6;
                        a87Var3.x = f2;
                        a87Var3.f = i15;
                        arrayList5.add(new vx7(uri, new b87(a87Var3), strI13, strI14, strI15, strI16));
                        arrayList4 = (ArrayList) map.get(uri);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            map.put(uri, arrayList4);
                        }
                        arrayList4.add(new gy7(strI13, i4, i16, strI14, strI15, strI16));
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

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d2;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) throws ParserException {
        String strI = i(str, pattern, null, map);
        if (strI != null) {
            return strI;
        }
        throw ParserException.b(null, "Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String k(String str, Map map) {
        Matcher matcher = W1.matcher(str);
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

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00d9, B:62:0x00dd, B:67:0x00ff, B:68:0x0105, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0096, LOOP:2: B:17:0x003c->B:22:0x0048, LOOP_END, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00d9, B:62:0x00dd, B:67:0x00ff, B:68:0x0105, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:90:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0047 A[SYNTHETIC] */
    @Override // defpackage.qmc
    public final Object n(Uri uri, x25 x25Var) throws ParserException {
        int i2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(x25Var));
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
                    throw ParserException.b(null, "Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        wx7 wx7VarE = e(new r6a(arrayDeque, bufferedReader), uri.toString());
                        vqi.h(bufferedReader);
                        return wx7VarE;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    sx7 sx7VarD = d(this.a, this.b, new r6a(arrayDeque, bufferedReader), uri.toString());
                    vqi.h(bufferedReader);
                    return sx7VarD;
                }
            }
        } catch (Throwable th) {
            vqi.h(bufferedReader);
            throw th;
        }
    }

    public yx7() {
        this(wx7.l, null);
    }
}
