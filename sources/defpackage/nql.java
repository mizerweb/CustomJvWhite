package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nql {
    /* JADX WARN: Code duplicated, block: B:94:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String c(BaseVideoPlayer baseVideoPlayer, String str, String str2) {
        String str3;
        String str4;
        ww6 ww6Var;
        int i;
        ww6 ww6Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        String str5;
        StringBuilder sb = new StringBuilder();
        sb.append(baseVideoPlayer.getClass().getSimpleName());
        sb.append(" ");
        ldc ldcVar = (ldc) baseVideoPlayer;
        bg6 bg6Var = ldcVar.V;
        m4j m4jVarZ = ldcVar.z();
        if (m4jVarZ != null) {
            sb.append(m4jVarZ.a + " " + (m4jVarZ.c ? "live" : "") + "\n");
        }
        t4j t4jVarF = baseVideoPlayer.f();
        kwi kwiVar = t4jVarF != null ? (kwi) t4jVarF.b : null;
        if (kwiVar != null) {
            String str6 = kwiVar.c;
            String str7 = kwiVar.b;
            String strD = d(str7, str);
            StringBuilder sbQ = qv1.q("-- VIDEO ", str7, " (", str, ") - ");
            sbQ.append(strD);
            sbQ.append("\n");
            sb.append(sbQ.toString());
            int i6 = kwiVar.e;
            int i7 = kwiVar.f;
            float f = kwiVar.g;
            int i8 = kwiVar.d / 1000;
            StringBuilder sbP = qv1.p("Format: ", i6, "x", i7, "@");
            sbP.append(f);
            sbP.append(" ");
            sbP.append(i8);
            sbP.append(" Kbps\n");
            sb.append(sbP.toString());
            List listM1 = r5h.m1(str6 == null ? "" : str6, new String[]{"."}, 6);
            String str8 = (String) ww3.u1(0, listM1);
            if (str8 == null) {
                str3 = " Kbps\n";
            } else {
                str3 = " Kbps\n";
                if (str8.equals("vp09")) {
                    try {
                        String str9 = (String) listM1.get(1);
                        switch (str9.hashCode()) {
                            case 1536:
                                if (!str9.equals("00")) {
                                    i2 = 3;
                                    i3 = 5;
                                } else {
                                    i2 = 3;
                                    i3 = 1;
                                }
                                break;
                            case 1537:
                                if (!str9.equals("01")) {
                                    i2 = 3;
                                    i3 = 5;
                                } else {
                                    i3 = 2;
                                    i2 = 3;
                                }
                                break;
                            case 1538:
                                if (!str9.equals("02")) {
                                    i2 = 3;
                                    i3 = 5;
                                } else {
                                    i2 = 3;
                                    i3 = 3;
                                }
                                break;
                            default:
                                i2 = 3;
                                i3 = 5;
                                break;
                        }
                        int iB = t0m.b((String) listM1.get(i2));
                        int i9 = cqk.d((String) listM1.get(5), "09") ? 1 : 2;
                        String str10 = (String) listM1.get(6);
                        if (cqk.d(str10, "16")) {
                            i4 = 7;
                            i5 = 1;
                        } else if (cqk.d(str10, "18")) {
                            i5 = 2;
                            i4 = 7;
                        } else {
                            i4 = 7;
                            i5 = 3;
                        }
                        ww6Var2 = new ww6(i3, iB, cqk.d((String) listM1.get(i4), "09") ? 1 : 2, i9, i5);
                    } catch (Exception e) {
                        Log.d("HdrUtils", "failed to get vp9 params", e);
                        ww6Var2 = null;
                    }
                    i = ww6Var2 != null ? ww6Var2.b : 0;
                } else {
                    if (str8.equals("av01")) {
                        try {
                            int iB2 = t0m.b((String) listM1.get(3));
                            int i10 = cqk.d((String) listM1.get(6), "09") ? 1 : 2;
                            str4 = "Format: ";
                            try {
                                String str11 = (String) listM1.get(7);
                                ww6Var = new ww6(iB2, cqk.d((String) listM1.get(8), "09") ? 1 : 2, i10, cqk.d(str11, "16") ? 1 : cqk.d(str11, "18") ? 2 : 3);
                            } catch (Exception e2) {
                                e = e2;
                                Log.d("HdrUtils", "failed to get av1 params", e);
                                ww6Var = null;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str4 = "Format: ";
                        }
                        if (ww6Var != null) {
                            i = ww6Var.b;
                        }
                        if (i != 0) {
                            str5 = "(HDR)";
                        } else {
                            str5 = "";
                        }
                        sb.append("Codecs: " + str6 + str5 + "\n");
                    }
                    i = 0;
                    if (i != 0) {
                        str5 = "(HDR)";
                    } else {
                        str5 = "";
                    }
                    sb.append("Codecs: " + str6 + str5 + "\n");
                }
                str4 = "Format: ";
                i = 0;
                if (i != 0) {
                    str5 = "(HDR)";
                } else {
                    str5 = "";
                }
                sb.append("Codecs: " + str6 + str5 + "\n");
            }
            str4 = "Format: ";
            if (i != 0) {
                str5 = "(HDR)";
            } else {
                str5 = "";
            }
            sb.append("Codecs: " + str6 + str5 + "\n");
        } else {
            str3 = " Kbps\n";
            str4 = "Format: ";
        }
        ec0 ec0VarE = baseVideoPlayer.e();
        y80 y80Var = ec0VarE != null ? (y80) ec0VarE.b : null;
        if (y80Var != null) {
            String str12 = y80Var.b;
            String strD2 = d(str12, str2);
            String str13 = y80Var.h;
            if (str13 == null) {
                str13 = "?";
            }
            sb.append(nbh.y(qv1.q("-- AUDIO ", str12, " ", str13, " ("), str2, ") - ", strD2, "\n"));
            int i11 = y80Var.f;
            int i12 = y80Var.e;
            int i13 = y80Var.d / 1000;
            StringBuilder sbP2 = qv1.p(str4, i11, "*", i12, " ");
            sbP2.append(i13);
            sbP2.append(str3);
            sb.append(sbP2.toString());
            sb.append("Codecs: " + y80Var.c + "\n");
        }
        ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.getBufferedPosition");
        long jR = bg6Var.R();
        long jY = ldcVar.y();
        ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentPositionReal");
        long jE = bg6Var.e();
        sb.append("Buffer: " + (jR - jY));
        if (jY != jE) {
            sb.append(" (" + (jR - jE) + ")");
        }
        sb.append(" ms\n");
        return sb.toString();
    }

    public static String d(String str, String str2) {
        Object next;
        if (str == null) {
            return "unknown";
        }
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                for (String str3 : mediaCodecInfo.getSupportedTypes()) {
                    if (z5h.G0(str3, str, true)) {
                        arrayList.add(mediaCodecInfo);
                        break;
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((MediaCodecInfo) next).getName(), str2));
        MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) next;
        if (mediaCodecInfo2 == null) {
            return "unknown";
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 ? mediaCodecInfo2.isHardwareAccelerated() : false) {
            return "HW";
        }
        return i >= 29 ? mediaCodecInfo2.isSoftwareOnly() : false ? "SW" : "unknown";
    }

    public lwa a(rwa rwaVar) {
        ByteBuffer byteBuffer = rwaVar.d;
        byteBuffer.getClass();
        lvb.R(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(rwaVar, byteBuffer);
    }

    public abstract lwa b(rwa rwaVar, ByteBuffer byteBuffer);
}
