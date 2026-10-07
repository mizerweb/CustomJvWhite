package defpackage;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y86 {
    public static final ew a = new ew();

    public static int a(int i, int i2) {
        if (i % 10 != 1) {
            return Math.round(i / i2) * i2;
        }
        return (int) (Math.floor(i / i2) * ((double) i2));
    }

    public static int b(MediaCodecInfo mediaCodecInfo, String str, int i) {
        int iMax = -1;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i) {
                iMax = Math.max(iMax, codecProfileLevel.level);
            }
        }
        return iMax;
    }

    public static int c(MediaCodecInfo mediaCodecInfo, String str, int i) {
        MediaCodecInfo.AudioCapabilities audioCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getAudioCapabilities();
        audioCapabilities.getClass();
        int[] supportedSampleRates = audioCapabilities.getSupportedSampleRates();
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        if (supportedSampleRates != null) {
            int length = supportedSampleRates.length;
            while (i2 < length) {
                int i4 = supportedSampleRates[i2];
                if (Math.abs(i4 - i) < Math.abs(i3 - i)) {
                    i3 = i4;
                }
                i2++;
            }
            return i3;
        }
        Range<Integer>[] supportedSampleRateRanges = audioCapabilities.getSupportedSampleRateRanges();
        int length2 = supportedSampleRateRanges.length;
        while (i2 < length2) {
            int iIntValue = ((Integer) supportedSampleRateRanges[i2].clamp(Integer.valueOf(i))).intValue();
            if (Math.abs(iIntValue - i) < Math.abs(i3 - i)) {
                i3 = iIntValue;
            }
            i2++;
        }
        return i3;
    }

    public static ghe d(int i, String str) {
        byte b = 2;
        Integer numValueOf = Integer.valueOf(np0.r);
        str.getClass();
        switch (str.hashCode()) {
            case -1851077871:
                b = !str.equals("video/dolby-vision") ? (byte) -1 : (byte) 0;
                break;
            case -1662735862:
                b = !str.equals("video/av01") ? (byte) -1 : (byte) 1;
                break;
            case -1662541442:
                if (!str.equals("video/hevc")) {
                    b = -1;
                }
                break;
            case 1331836730:
                b = !str.equals("video/avc") ? (byte) -1 : (byte) 3;
                break;
            case 1599127257:
                b = !str.equals("video/x-vnd.on2.vp9") ? (byte) -1 : (byte) 4;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                if (i == 7) {
                    return c98.r(Integer.valueOf(np0.n));
                }
                break;
            case 1:
                if (i == 7) {
                    return c98.r(2);
                }
                if (i == 6) {
                    return c98.r(numValueOf);
                }
                break;
            case 2:
                if (i == 7) {
                    return c98.r(2);
                }
                if (i == 6) {
                    return c98.r(numValueOf);
                }
                break;
            case 3:
                if (i == 7) {
                    return c98.r(16);
                }
                break;
            case 4:
                if (i == 7 || i == 6) {
                    return c98.s(numValueOf, 8192);
                }
                break;
        }
        a98 a98Var = c98.b;
        return ghe.e;
    }

    public static synchronized c98 e(String str) {
        k();
        return c98.n(a.get(n1g.b0(str)));
    }

    public static ghe f(String str, ex3 ex3Var) {
        if (Build.VERSION.SDK_INT < 33 || ex3Var == null) {
            a98 a98Var = c98.b;
            return ghe.e;
        }
        c98 c98VarE = e(str);
        oc9.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        for (int i2 = 0; i2 < c98VarE.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) c98VarE.get(i2);
            if (!mediaCodecInfo.isAlias() && i(mediaCodecInfo, str, ex3Var)) {
                int i3 = i + 1;
                int iB = r88.b(objArrCopyOf.length, i3);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i] = mediaCodecInfo;
                i = i3;
            }
        }
        return c98.j(objArrCopyOf, i);
    }

    public static Size g(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        videoCapabilities.getClass();
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int iA = a(i, widthAlignment);
        int iA2 = a(i2, heightAlignment);
        if (j(mediaCodecInfo, str, iA, iA2)) {
            return new Size(iA, iA2);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i3 = 0; i3 < 13; i3++) {
            float f = fArr[i3];
            int iA3 = a(Math.round(i * f), widthAlignment);
            int iA4 = a(Math.round(i2 * f), heightAlignment);
            if (j(mediaCodecInfo, str, iA3, iA4)) {
                return new Size(iA3, iA4);
            }
        }
        int iIntValue = ((Integer) videoCapabilities.getSupportedHeightsFor(((Integer) videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i))).intValue()).clamp(Integer.valueOf(i2))).intValue();
        if (iIntValue != i2) {
            i = a((int) Math.round((((double) i) * ((double) iIntValue)) / ((double) i2)), widthAlignment);
            i2 = a(iIntValue, heightAlignment);
        }
        if (j(mediaCodecInfo, str, i, i2)) {
            return new Size(i, i2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean zIsSoftwareOnly;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        if (i >= 29) {
            zIsSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        } else if (uya.i(str)) {
            zIsSoftwareOnly = true;
        } else {
            String strB0 = n1g.b0(mediaCodecInfo.getName());
            if (!strB0.startsWith("arc.") && (strB0.startsWith("omx.google.") || strB0.startsWith("omx.ffmpeg.") || ((strB0.startsWith("omx.sec.") && strB0.contains(".sw.")) || strB0.equals("omx.qcom.video.decoder.hevcswvdec") || strB0.startsWith("c2.android.") || strB0.startsWith("c2.google.") || !(strB0.startsWith("omx.") || strB0.startsWith("c2."))))) {
                zIsSoftwareOnly = true;
            } else {
                zIsSoftwareOnly = false;
            }
        }
        return !zIsSoftwareOnly;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str, ex3 ex3Var) {
        if (str.equals("video/dolby-vision") || mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("hdr-editing") || (ex3Var.c == 7 && Build.VERSION.SDK_INT >= 35 && mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("hlg-editing"))) {
            ghe gheVarD = d(ex3Var.c, str);
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                if (gheVarD.contains(Integer.valueOf(codecProfileLevel.profile))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        videoCapabilities.getClass();
        if (videoCapabilities.isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920 && i2 == 1080) {
            return CamcorderProfile.hasProfile(6);
        }
        if (i == 3840 && i2 == 2160) {
            return CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    public static synchronized void k() {
        if (a.size() == 0) {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                if (mediaCodecInfo.isEncoder()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        a.j(n1g.b0(str), mediaCodecInfo);
                    }
                }
            }
        }
    }
}
