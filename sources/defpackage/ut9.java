package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ut9 {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            Collections.sort(arrayList, new z70(4, new qr7(11)));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((nt9) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((nt9) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String c(b87 b87Var) {
        Pair pairB;
        String str = b87Var.n;
        String str2 = b87Var.n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairB = qu3.b(b87Var)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        try {
            st9 st9Var = new st9(str, z, z2);
            HashMap map = a;
            List list = (List) map.get(st9Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListF = f(st9Var, new qf4(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListF.isEmpty();
            }
            a(str, arrayListF);
            c98 c98VarN = c98.n(arrayListF);
            map.put(st9Var, c98VarN);
            return c98VarN;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    public static ArrayList f(st9 st9Var, qf4 qf4Var) throws MediaCodecUtil$DecoderQueryException {
        String strD;
        String str;
        int i;
        st9 st9Var2 = st9Var;
        int i2 = qf4Var.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = st9Var2.a;
            boolean z = st9Var2.b;
            if (((MediaCodecInfo[]) qf4Var.c) == null) {
                qf4Var.c = new MediaCodecList(i2).getCodecInfos();
            }
            int length = ((MediaCodecInfo[]) qf4Var.c).length;
            int i3 = 0;
            while (i3 < length) {
                if (((MediaCodecInfo[]) qf4Var.c) == null) {
                    qf4Var.c = new MediaCodecList(i2).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[]) qf4Var.c)[i3];
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 29 || !mediaCodecInfo.isAlias()) {
                    int i5 = i3;
                    String name = mediaCodecInfo.getName();
                    if (mediaCodecInfo.isEncoder() || (strD = d(mediaCodecInfo, name, str2)) == null) {
                        i = i5;
                    } else {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(strD);
                            boolean zIsFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            boolean z2 = st9Var2.c;
                            if ((z2 || !zIsFeatureRequired) && (!z2 || zIsFeatureSupported)) {
                                boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                                boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                if ((z || !zIsFeatureRequired2) && (!z || zIsFeatureSupported2)) {
                                    boolean zIsVendor = true;
                                    boolean zIsHardwareAccelerated = i4 >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !h(mediaCodecInfo, str2);
                                    i = i5;
                                    boolean zH = h(mediaCodecInfo, str2);
                                    boolean z3 = zIsHardwareAccelerated;
                                    if (i4 >= 29) {
                                        zIsVendor = mediaCodecInfo.isVendor();
                                    } else {
                                        String strB0 = n1g.b0(mediaCodecInfo.getName());
                                        if (strB0.startsWith("omx.google.") || strB0.startsWith("c2.android.") || strB0.startsWith("c2.google.")) {
                                            zIsVendor = false;
                                        }
                                    }
                                    if (z != zIsFeatureSupported2) {
                                        continue;
                                    } else {
                                        str = strD;
                                        try {
                                            arrayList.add(nt9.j(name, str2, str, capabilitiesForType, z3, zH, zIsVendor));
                                        } catch (Exception e) {
                                            e = e;
                                            lvb.k0("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i = i5;
                                }
                            } else {
                                i = i5;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = strD;
                        }
                    }
                } else {
                    i = i3;
                }
                i3 = i + 1;
                st9Var2 = st9Var;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new MediaCodecUtil$DecoderQueryException("Failed to query underlying media codecs", e3);
        }
    }

    public static ghe g(qt9 qt9Var, b87 b87Var, boolean z, boolean z2) {
        List listC = qt9Var.c(b87Var.n, z, z2);
        String strC = c(b87Var);
        List listC2 = strC == null ? ghe.e : qt9Var.c(strC, z, z2);
        z88 z88VarL = c98.l();
        z88VarL.f(listC);
        z88VarL.f(listC2);
        return z88VarL.h();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (uya.i(str)) {
            return true;
        }
        String strB0 = n1g.b0(mediaCodecInfo.getName());
        if (strB0.startsWith("arc.")) {
            return false;
        }
        if (strB0.startsWith("omx.google.") || strB0.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strB0.startsWith("omx.sec.") && strB0.contains(".sw.")) || strB0.equals("omx.qcom.video.decoder.hevcswvdec") || strB0.startsWith("c2.android.") || strB0.startsWith("c2.google.")) {
            return true;
        }
        return (strB0.startsWith("omx.") || strB0.startsWith("c2.")) ? false : true;
    }
}
