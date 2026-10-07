package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.util.Size;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class ka5 implements iu3 {
    public final Context a;
    public final p51 b;
    public gwi c;
    public final ldf d;
    public boolean e;
    public final int f;

    public ka5(Context context) {
        this.a = context.getApplicationContext();
        this.b = p51.d;
        this.c = gwi.l;
        this.d = ldf.c;
        this.e = true;
        this.f = -2000;
    }

    public static ExportException a(b87 b87Var, String str) {
        return ExportException.c(new IllegalArgumentException(str), 4003, new lh6(b87Var.toString(), (String) null, uya.m(b87Var.n), false));
    }

    public static ExportException b(b87 b87Var, boolean z) {
        String str;
        ex3 ex3Var = b87Var.D;
        if (z && ex3.h(ex3Var)) {
            str = "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: " + ex3Var;
        } else {
            str = "No MIME type is supported by both encoder and muxer.";
        }
        return ExportException.c(new IllegalArgumentException(str), 4003, new lh6(b87Var.toString(), (String) null, z, false));
    }

    public static c98 d(c98 c98Var, la5 la5Var) {
        ArrayList arrayList = new ArrayList(c98Var.size());
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < c98Var.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) c98Var.get(i2);
            int iD = la5Var.d(mediaCodecInfo);
            if (iD != Integer.MAX_VALUE) {
                if (iD < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = iD;
                } else if (iD == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return c98.n(arrayList);
    }

    @Override // defpackage.iu3
    public i95 c(b87 b87Var, LogSessionId logSessionId) throws ExportException {
        kzi kziVar;
        if (b87Var.j == -1) {
            a87 a87VarA = b87Var.a();
            a87VarA.h = 131072;
            b87Var = new b87(a87VarA);
        }
        String str = b87Var.n;
        boolean z = false;
        if (str == null) {
            throw b(b87Var, false);
        }
        MediaFormat mediaFormatB = trk.b(b87Var);
        c98 c98VarE = y86.e(str);
        if (c98VarE.isEmpty()) {
            throw a(b87Var, "No audio media codec found");
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) c98VarE.get(0);
        this.d.getClass();
        if (this.e) {
            int i = b87Var.G;
            if (c98VarE.isEmpty()) {
                kziVar = null;
            } else {
                ArrayList arrayList = new ArrayList(c98VarE.size());
                int i2 = Integer.MAX_VALUE;
                for (int i3 = 0; i3 < c98VarE.size(); i3++) {
                    MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) c98VarE.get(i3);
                    int iAbs = Math.abs(y86.c(mediaCodecInfo2, str, i) - i);
                    if (iAbs != Integer.MAX_VALUE) {
                        if (iAbs < i2) {
                            arrayList.clear();
                            arrayList.add(mediaCodecInfo2);
                            i2 = iAbs;
                        } else if (iAbs == i2) {
                            arrayList.add(mediaCodecInfo2);
                        }
                    }
                }
                MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) c98.n(arrayList).get(0);
                int iC = y86.c(mediaCodecInfo3, str, i);
                a87 a87VarA2 = b87Var.a();
                a87VarA2.F = iC;
                kziVar = new kzi(mediaCodecInfo3, new b87(a87VarA2), z);
            }
            if (kziVar != null) {
                mediaCodecInfo = (MediaCodecInfo) kziVar.a;
                b87Var = (b87) kziVar.b;
                mediaFormatB = trk.b(b87Var);
            }
        }
        b87 b87Var2 = b87Var;
        MediaFormat mediaFormat = mediaFormatB;
        if (Build.VERSION.SDK_INT >= 35 && logSessionId != null) {
            gzl.b(mediaFormat, logSessionId);
        }
        return new i95(this.a, b87Var2, mediaFormat, mediaCodecInfo.getName(), false, null);
    }

    @Override // defpackage.iu3
    public boolean f() {
        return !this.c.equals(gwi.l);
    }

    @Override // defpackage.iu3
    public boolean n() {
        return !this.d.equals(ldf.c);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0276  */
    /* JADX WARN: Code duplicated, block: B:107:0x0290  */
    /* JADX WARN: Code duplicated, block: B:108:0x0293  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:153:0x0382  */
    /* JADX WARN: Code duplicated, block: B:155:0x0385  */
    /* JADX WARN: Code duplicated, block: B:157:0x038a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0395  */
    /* JADX WARN: Code duplicated, block: B:163:0x039e  */
    /* JADX WARN: Code duplicated, block: B:165:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:176:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:178:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:179:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0218  */
    /* JADX WARN: Code duplicated, block: B:85:0x021e  */
    /* JADX WARN: Code duplicated, block: B:88:0x023f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0247  */
    /* JADX WARN: Code duplicated, block: B:93:0x0253  */
    /* JADX WARN: Code duplicated, block: B:96:0x0265  */
    /* JADX WARN: Code duplicated, block: B:98:0x026e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0272  */
    @Override // defpackage.iu3
    public i95 p(b87 b87Var, LogSessionId logSessionId) throws ExportException {
        double d;
        int i;
        int i2;
        ma5 ma5Var;
        MediaCodecInfo mediaCodecInfo;
        b87 b87Var2;
        gwi gwiVar;
        String str;
        int i3;
        MediaFormat mediaFormatB;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        int i8;
        int i9;
        int i10;
        String strH;
        int i11;
        int iIntValue;
        int iB;
        String str2;
        int iB2;
        boolean z;
        int iB3;
        ghe gheVarD;
        boolean z2 = this.e;
        b87 b87Var3 = b87Var;
        if (b87Var3.y == -1.0f || (Build.VERSION.SDK_INT < 30 && Build.DEVICE.equals("joyeuse"))) {
            a87 a87VarA = b87Var3.a();
            a87VarA.x = 30.0f;
            b87Var3 = new b87(a87VarA);
        }
        int i12 = b87Var3.v;
        int i13 = b87Var3.u;
        final String str3 = b87Var3.n;
        ex3 ex3Var = b87Var3.D;
        final int i14 = 1;
        if (str3 == null) {
            throw b(b87Var3, true);
        }
        final int i15 = 0;
        lvb.R(i13 != -1);
        lvb.R(i12 != -1);
        lvb.R(b87Var3.z == 0);
        this.b.getClass();
        gwi gwiVar2 = this.c;
        c98 c98VarE = y86.e(str3);
        ddd dddVar = new ddd() { // from class: w86
            @Override // defpackage.ddd
            public final boolean apply(Object obj) {
                return y86.h((MediaCodecInfo) obj, str3);
            }
        };
        c98VarE.getClass();
        c98 c98VarM = c98.m(new tn8(c98VarE, dddVar));
        if (!c98VarM.isEmpty()) {
            c98VarE = c98VarM;
        }
        if (!c98VarE.isEmpty()) {
            if (z2) {
                d = 2.0d;
                c98 c98VarN = (Build.VERSION.SDK_INT < 33 || !ex3.h(ex3Var)) ? c98.n(c98VarE) : d(c98VarE, new hu(str3, 19, ex3Var));
                if (c98VarN.isEmpty()) {
                    z2 = z2;
                    ma5Var = null;
                } else {
                    c98 c98VarD = d(c98VarN, new f75(str3, i13, i12));
                    if (c98VarD.isEmpty()) {
                        z2 = z2;
                        ma5Var = null;
                    } else {
                        Size sizeG = y86.g((MediaCodecInfo) c98VarD.get(0), str3, i13, i12);
                        sizeG.getClass();
                        final int width = gwiVar2.a;
                        int i16 = gwiVar2.d;
                        int i17 = gwiVar2.c;
                        if (width == -1 && (width = b87Var3.h) == -1) {
                            width = (int) (((double) (sizeG.getWidth() * sizeG.getHeight() * b87Var3.y)) * 0.07d * 2.0d);
                        }
                        c98 c98VarD2 = d(c98VarD, new la5() { // from class: ja5
                            @Override // defpackage.la5
                            public final int d(MediaCodecInfo mediaCodecInfo2) {
                                int i18 = i15;
                                int i19 = width;
                                String str4 = str3;
                                switch (i18) {
                                    case 0:
                                        ew ewVar = y86.a;
                                        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo2.getCapabilitiesForType(str4).getVideoCapabilities();
                                        videoCapabilities.getClass();
                                        return Math.abs(((Integer) videoCapabilities.getBitrateRange().clamp(Integer.valueOf(i19))).intValue() - i19);
                                    default:
                                        ew ewVar2 = y86.a;
                                        MediaCodecInfo.EncoderCapabilities encoderCapabilities = mediaCodecInfo2.getCapabilitiesForType(str4).getEncoderCapabilities();
                                        encoderCapabilities.getClass();
                                        return encoderCapabilities.isBitrateModeSupported(i19) ? 0 : Integer.MAX_VALUE;
                                }
                            }
                        });
                        if (c98VarD2.isEmpty()) {
                            z2 = z2;
                            ma5Var = null;
                        } else {
                            final int i18 = gwiVar2.b;
                            c98 c98VarD3 = d(c98VarD2, new la5() { // from class: ja5
                                @Override // defpackage.la5
                                public final int d(MediaCodecInfo mediaCodecInfo2) {
                                    int i19 = i14;
                                    int i110 = i18;
                                    String str4 = str3;
                                    switch (i19) {
                                        case 0:
                                            ew ewVar = y86.a;
                                            MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo2.getCapabilitiesForType(str4).getVideoCapabilities();
                                            videoCapabilities.getClass();
                                            return Math.abs(((Integer) videoCapabilities.getBitrateRange().clamp(Integer.valueOf(i110))).intValue() - i110);
                                        default:
                                            ew ewVar2 = y86.a;
                                            MediaCodecInfo.EncoderCapabilities encoderCapabilities = mediaCodecInfo2.getCapabilitiesForType(str4).getEncoderCapabilities();
                                            encoderCapabilities.getClass();
                                            return encoderCapabilities.isBitrateModeSupported(i110) ? 0 : Integer.MAX_VALUE;
                                    }
                                }
                            });
                            if (c98VarD3.isEmpty()) {
                                z2 = z2;
                                ma5Var = null;
                            } else {
                                int i19 = gwiVar2.b;
                                float f = gwiVar2.e;
                                int i20 = gwiVar2.f;
                                int i21 = gwiVar2.g;
                                long j2 = gwiVar2.h;
                                z2 = z2;
                                int i22 = gwiVar2.i;
                                int i23 = gwiVar2.j;
                                int i24 = gwiVar2.k;
                                a87 a87VarA2 = b87Var3.a();
                                a87VarA2.m = uya.n(str3);
                                a87VarA2.t = sizeG.getWidth();
                                a87VarA2.u = sizeG.getHeight();
                                MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) c98VarD3.get(0);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo2.getCapabilitiesForType(str3).getVideoCapabilities();
                                videoCapabilities.getClass();
                                int iIntValue2 = ((Integer) videoCapabilities.getBitrateRange().clamp(Integer.valueOf(width))).intValue();
                                a87VarA2.h = iIntValue2;
                                if (i17 == -1 || i16 == -1 || i16 > y86.b(mediaCodecInfo2, str3, i17)) {
                                    i = -1;
                                    i2 = -1;
                                } else {
                                    i2 = i16;
                                    i = i17;
                                }
                                ma5Var = new ma5(mediaCodecInfo2, new b87(a87VarA2), new gwi(iIntValue2, i19, i, i2, f, i20, i21, j2, i22, i23, i24));
                            }
                        }
                    }
                }
            } else {
                ma5Var = new ma5((MediaCodecInfo) c98VarE.get(0), b87Var3, gwiVar2);
            }
            if (ma5Var != null) {
                throw a(b87Var3, "The requested video encoding format is not supported.");
            }
            mediaCodecInfo = (MediaCodecInfo) ma5Var.a;
            b87Var2 = (b87) ma5Var.b;
            gwiVar = ma5Var.f;
            str = b87Var2.n;
            str.getClass();
            if (z2) {
                i3 = gwiVar.a;
            } else {
                i3 = gwiVar.a;
                if (i3 == -1 && (i3 = b87Var2.h) == -1) {
                    i3 = (int) (((double) (b87Var2.u * b87Var2.v * b87Var2.y)) * 0.07d * d);
                }
            }
            a87 a87VarA3 = b87Var2.a();
            a87VarA3.h = i3;
            b87 b87Var4 = new b87(a87VarA3);
            mediaFormatB = trk.b(b87Var4);
            int i25 = gwiVar.b;
            int i26 = gwiVar.d;
            mediaFormatB.setInteger("bitrate-mode", i25);
            mediaFormatB.setInteger("frame-rate", Math.round(b87Var4.y));
            i4 = gwiVar.c;
            if (i4 == -1 && i26 != -1) {
                mediaFormatB.setInteger("profile", i4);
                mediaFormatB.setInteger("level", i26);
            } else if (ex3.h(ex3Var)) {
                ex3Var.getClass();
                mediaFormatB.setInteger("profile", ((Integer) y86.d(ex3Var.c, str).get(0)).intValue());
            }
            if (str.equals("video/avc")) {
                i11 = Build.VERSION.SDK_INT;
                iIntValue = 8;
                if (i11 >= 29) {
                    if (ex3Var != null) {
                        gheVarD = y86.d(ex3Var.c, "video/avc");
                        if (!gheVarD.isEmpty()) {
                            iIntValue = ((Integer) gheVarD.get(0)).intValue();
                        }
                    }
                    iB3 = y86.b(mediaCodecInfo, "video/avc", iIntValue);
                    if (iB3 != -1) {
                        mediaFormatB.setInteger("profile", iIntValue);
                        if (!mediaFormatB.containsKey("level")) {
                            mediaFormatB.setInteger("level", iB3);
                        }
                    }
                } else if (i11 == 27) {
                    str2 = Build.DEVICE;
                    if (!str2.equals("ASUS_X00T_3") || str2.equals("TC77")) {
                        iB2 = y86.b(mediaCodecInfo, "video/avc", 1);
                        if (iB2 != -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        lvb.b0(z);
                        mediaFormatB.setInteger("profile", 1);
                        if (!mediaFormatB.containsKey("level")) {
                            mediaFormatB.setInteger("level", iB2);
                        }
                    } else {
                        iB = y86.b(mediaCodecInfo, "video/avc", 8);
                        if (iB != -1) {
                            mediaFormatB.setInteger("profile", 8);
                            if (!mediaFormatB.containsKey("level")) {
                                mediaFormatB.setInteger("level", iB);
                            }
                            mediaFormatB.setInteger("latency", 1);
                        }
                    }
                } else {
                    iB = y86.b(mediaCodecInfo, "video/avc", 8);
                    if (iB != -1) {
                        mediaFormatB.setInteger("profile", 8);
                        if (!mediaFormatB.containsKey("level")) {
                            mediaFormatB.setInteger("level", iB);
                        }
                        mediaFormatB.setInteger("latency", 1);
                    }
                }
            }
            i5 = Build.VERSION.SDK_INT;
            if (i5 >= 31 || !ex3.h(ex3Var)) {
                mediaFormatB.setInteger("color-format", 2130708361);
            } else {
                if (!c98.n(k4m.a(mediaCodecInfo.getCapabilitiesForType(str).colorFormats)).contains(2130750114)) {
                    throw a(b87Var3, "Encoding HDR is not supported on this device.");
                }
                mediaFormatB.setInteger("color-format", 2130750114);
            }
            mediaFormatB.setFloat("i-frame-interval", gwiVar.e);
            i6 = gwiVar.f;
            i7 = gwiVar.g;
            if (i6 == -1 || i7 != -1) {
                if (i6 != -2) {
                    mediaFormatB.setInteger("operating-rate", i6);
                }
                if (i7 != -2) {
                    mediaFormatB.setInteger(LogFactory.PRIORITY_KEY, i7);
                }
            } else {
                mediaFormatB.setInteger(LogFactory.PRIORITY_KEY, 1);
                if (i5 == 26) {
                    mediaFormatB.setInteger("operating-rate", 30);
                } else if (i5 < 31 || i5 > 34 || !(Build.SOC_MODEL.equals("SM8550") || Build.SOC_MODEL.equals("SM7450") || Build.SOC_MODEL.equals("SM6450") || Build.SOC_MODEL.equals("SC9863A") || Build.SOC_MODEL.equals("T612") || Build.SOC_MODEL.equals("T606") || Build.SOC_MODEL.equals("T603"))) {
                    mediaFormatB.setInteger("operating-rate", Integer.MAX_VALUE);
                } else {
                    mediaFormatB.setInteger("operating-rate", 1000);
                }
            }
            j = gwiVar.h;
            if (j != -1) {
                mediaFormatB.setLong("repeat-previous-frame-after", j);
            }
            if (i5 >= 35) {
                mediaFormatB.setInteger("importance", Math.max(0, -this.f));
                if (logSessionId != null) {
                    gzl.b(mediaFormatB, logSessionId);
                }
            }
            i8 = gwiVar.i;
            if (i5 >= 29 && i8 != -1) {
                mediaFormatB.setInteger("max-bframes", i8);
            }
            i9 = gwiVar.j;
            i10 = gwiVar.k;
            if (i5 >= 29 && i9 >= 0) {
                if (i9 == 0) {
                    strH = "none";
                } else if (i10 > 0) {
                    Locale locale = Locale.ROOT;
                    strH = qt4.l("android.generic.", i9, i10, "+");
                } else {
                    Locale locale2 = Locale.ROOT;
                    strH = zo5.h(i9, "android.generic.");
                }
                mediaFormatB.setString("ts-schema", strH);
            }
            return new i95(this.a, b87Var4, mediaFormatB, mediaCodecInfo.getName(), false, null);
        }
        ma5Var = null;
        d = 2.0d;
        if (ma5Var != null) {
            throw a(b87Var3, "The requested video encoding format is not supported.");
        }
        mediaCodecInfo = (MediaCodecInfo) ma5Var.a;
        b87Var2 = (b87) ma5Var.b;
        gwiVar = ma5Var.f;
        str = b87Var2.n;
        str.getClass();
        if (z2) {
            i3 = gwiVar.a;
        } else {
            i3 = gwiVar.a;
            if (i3 == -1) {
                i3 = (int) (((double) (b87Var2.u * b87Var2.v * b87Var2.y)) * 0.07d * d);
            }
        }
        a87 a87VarA4 = b87Var2.a();
        a87VarA4.h = i3;
        b87 b87Var5 = new b87(a87VarA4);
        mediaFormatB = trk.b(b87Var5);
        int i27 = gwiVar.b;
        int i28 = gwiVar.d;
        mediaFormatB.setInteger("bitrate-mode", i27);
        mediaFormatB.setInteger("frame-rate", Math.round(b87Var5.y));
        i4 = gwiVar.c;
        if (i4 == -1) {
            if (ex3.h(ex3Var)) {
                ex3Var.getClass();
                mediaFormatB.setInteger("profile", ((Integer) y86.d(ex3Var.c, str).get(0)).intValue());
            }
        } else if (ex3.h(ex3Var)) {
            ex3Var.getClass();
            mediaFormatB.setInteger("profile", ((Integer) y86.d(ex3Var.c, str).get(0)).intValue());
        }
        if (str.equals("video/avc")) {
            i11 = Build.VERSION.SDK_INT;
            iIntValue = 8;
            if (i11 >= 29) {
                if (ex3Var != null) {
                    gheVarD = y86.d(ex3Var.c, "video/avc");
                    if (!gheVarD.isEmpty()) {
                        iIntValue = ((Integer) gheVarD.get(0)).intValue();
                    }
                }
                iB3 = y86.b(mediaCodecInfo, "video/avc", iIntValue);
                if (iB3 != -1) {
                    mediaFormatB.setInteger("profile", iIntValue);
                    if (!mediaFormatB.containsKey("level")) {
                        mediaFormatB.setInteger("level", iB3);
                    }
                }
            } else if (i11 == 27) {
                str2 = Build.DEVICE;
                if (str2.equals("ASUS_X00T_3")) {
                }
                iB2 = y86.b(mediaCodecInfo, "video/avc", 1);
                if (iB2 != -1) {
                    z = true;
                } else {
                    z = false;
                }
                lvb.b0(z);
                mediaFormatB.setInteger("profile", 1);
                if (!mediaFormatB.containsKey("level")) {
                    mediaFormatB.setInteger("level", iB2);
                }
            } else {
                iB = y86.b(mediaCodecInfo, "video/avc", 8);
                if (iB != -1) {
                    mediaFormatB.setInteger("profile", 8);
                    if (!mediaFormatB.containsKey("level")) {
                        mediaFormatB.setInteger("level", iB);
                    }
                    mediaFormatB.setInteger("latency", 1);
                }
            }
        }
        i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            mediaFormatB.setInteger("color-format", 2130708361);
        } else {
            mediaFormatB.setInteger("color-format", 2130708361);
        }
        mediaFormatB.setFloat("i-frame-interval", gwiVar.e);
        i6 = gwiVar.f;
        i7 = gwiVar.g;
        if (i6 == -1) {
            if (i6 != -2) {
                mediaFormatB.setInteger("operating-rate", i6);
            }
            if (i7 != -2) {
                mediaFormatB.setInteger(LogFactory.PRIORITY_KEY, i7);
            }
        } else {
            if (i6 != -2) {
                mediaFormatB.setInteger("operating-rate", i6);
            }
            if (i7 != -2) {
                mediaFormatB.setInteger(LogFactory.PRIORITY_KEY, i7);
            }
        }
        j = gwiVar.h;
        if (j != -1) {
            mediaFormatB.setLong("repeat-previous-frame-after", j);
        }
        if (i5 >= 35) {
            mediaFormatB.setInteger("importance", Math.max(0, -this.f));
            if (logSessionId != null) {
                gzl.b(mediaFormatB, logSessionId);
            }
        }
        i8 = gwiVar.i;
        if (i5 >= 29) {
            mediaFormatB.setInteger("max-bframes", i8);
        }
        i9 = gwiVar.j;
        i10 = gwiVar.k;
        if (i5 >= 29) {
            if (i9 == 0) {
                strH = "none";
            } else if (i10 > 0) {
                Locale locale3 = Locale.ROOT;
                strH = qt4.l("android.generic.", i9, i10, "+");
            } else {
                Locale locale4 = Locale.ROOT;
                strH = zo5.h(i9, "android.generic.");
            }
            mediaFormatB.setString("ts-schema", strH);
        }
        return new i95(this.a, b87Var5, mediaFormatB, mediaCodecInfo.getName(), false, null);
    }

    public ka5(ka5 ka5Var) {
        this.a = ka5Var.a;
        this.b = ka5Var.b;
        this.c = ka5Var.c;
        this.d = ka5Var.d;
        this.e = ka5Var.e;
        this.f = ka5Var.f;
    }
}
