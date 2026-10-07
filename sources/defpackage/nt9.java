package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nt9 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public int m;
    public int n;
    public float o;

    public nt9(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.k = z7;
        this.l = uya.m(str2);
        this.o = -3.4028235E38f;
        this.m = -1;
        this.n = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(vqi.g(i, widthAlignment) * widthAlignment, vqi.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    public static nt9 j(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean zIsFeatureSupported = codecCapabilities.isFeatureSupported("adaptive-playback");
        boolean zIsFeatureSupported2 = codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean zIsFeatureSupported3 = codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT < 35 || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z4 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        return new nt9(str, str2, str3, codecCapabilities, z, z2, z3, zIsFeatureSupported, zIsFeatureSupported2, zIsFeatureSupported3, z4);
    }

    public final w55 b(b87 b87Var, b87 b87Var2) {
        b87 b87Var3;
        b87 b87Var4;
        int i;
        String str = b87Var.n;
        ex3 ex3Var = b87Var.D;
        String str2 = b87Var2.n;
        ex3 ex3Var2 = b87Var2.D;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.l) {
            if (b87Var.z != b87Var2.z) {
                i2 |= 1024;
            }
            boolean z = (b87Var.u == b87Var2.u && b87Var.v == b87Var2.v) ? false : true;
            if (!this.e && z) {
                i2 |= np0.o;
            }
            if ((!ex3.g(ex3Var) || !ex3.g(ex3Var2)) && !Objects.equals(ex3Var, ex3Var2)) {
                i2 |= np0.q;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !b87Var.c(b87Var2)) {
                i2 |= 2;
            }
            int i3 = b87Var.w;
            if (i3 != -1 && (i = b87Var.x) != -1 && i3 == b87Var2.w && i == b87Var2.x && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(b87Var2.n, "video/dolby-vision")) {
                Pair pairB = qu3.b(b87Var);
                Pair pairB2 = qu3.b(b87Var2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new w55(this.a, b87Var, b87Var2, b87Var.c(b87Var2) ? 3 : 2, 0);
            }
            b87Var3 = b87Var;
            b87Var4 = b87Var2;
        } else {
            b87Var3 = b87Var;
            b87Var4 = b87Var2;
            if (b87Var3.F != b87Var4.F) {
                i2 |= np0.r;
            }
            if (b87Var3.G != b87Var4.G) {
                i2 |= 8192;
            }
            if (b87Var3.H != b87Var4.H) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairB3 = qu3.b(b87Var3);
                Pair pairB4 = qu3.b(b87Var4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new w55(this.a, b87Var3, b87Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new w55(this.a, b87Var3, b87Var4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new w55(this.a, b87Var3, b87Var4, 3, 0);
            }
            if (!b87Var3.c(b87Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new w55(this.a, b87Var3, b87Var4, 1, 0);
            }
        }
        return new w55(this.a, b87Var3, b87Var4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    /* JADX WARN: Code duplicated, block: B:69:0x0116  */
    /* JADX WARN: Code duplicated, block: B:88:0x0138 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x004e, please report this as an issue */
    public final boolean c(Context context, b87 b87Var, boolean z) {
        int iIntValue;
        int iIntValue2;
        boolean zEquals;
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int length;
        int i;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int maxInputChannelCount;
        int i2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2;
        Pair pairB = qu3.b(b87Var);
        String str2 = b87Var.n;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strN = uya.n(str3);
            if (!strN.equals("video/mv-hevc")) {
                if (strN.equals("video/hevc")) {
                    HashMap map = ut9.a;
                    String strC = xsg.c(b87Var.q);
                    if (strC == null) {
                        pairB = null;
                    } else {
                        String strTrim = strC.trim();
                        String str4 = vqi.a;
                        pairB = qu3.c(strC, strTrim.split("\\.", -1), b87Var.D);
                    }
                }
                if (pairB != null) {
                    iIntValue = ((Integer) pairB.first).intValue();
                    iIntValue2 = ((Integer) pairB.second).intValue();
                    zEquals = "video/dolby-vision".equals(str2);
                    str = this.b;
                    if (zEquals) {
                        str.getClass();
                        switch (str) {
                            case "video/av01":
                            case "video/hevc":
                                iIntValue = 2;
                                break;
                            case "video/avc":
                                iIntValue = 8;
                                break;
                        }
                        iIntValue2 = 0;
                    }
                    if (this.l) {
                        codecCapabilities = this.d;
                        codecProfileLevelArr = codecCapabilities.profileLevels;
                        if (codecProfileLevelArr == null) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        }
                        if (str.equals("audio/ac4")) {
                            audioCapabilities = codecCapabilities.getAudioCapabilities();
                            if (audioCapabilities != null) {
                                maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                            } else {
                                maxInputChannelCount = 2;
                            }
                            if (maxInputChannelCount > 18) {
                            }
                            if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{ut9.b(1026, i2)};
                            } else {
                                codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{ut9.b(257, i2), ut9.b(513, i2), ut9.b(514, i2), ut9.b(1026, i2), ut9.b(1028, i2)};
                            }
                            codecProfileLevelArr = codecProfileLevelArr2;
                        }
                        length = codecProfileLevelArr.length;
                        for (i = 0; i < length; i++) {
                            codecProfileLevel = codecProfileLevelArr[i];
                            if (codecProfileLevel.profile != iIntValue) {
                            }
                        }
                        i("codec.profileLevel, " + b87Var.k + ", " + str3);
                        return false;
                    }
                    codecCapabilities = this.d;
                    codecProfileLevelArr = codecCapabilities.profileLevels;
                    if (codecProfileLevelArr == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str.equals("audio/ac4")) {
                        audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities != null) {
                            maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                        } else {
                            maxInputChannelCount = 2;
                        }
                        if (maxInputChannelCount > 18) {
                        }
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{ut9.b(1026, i2)};
                        } else {
                            codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{ut9.b(257, i2), ut9.b(513, i2), ut9.b(514, i2), ut9.b(1026, i2), ut9.b(1028, i2)};
                        }
                        codecProfileLevelArr = codecProfileLevelArr2;
                    }
                    length = codecProfileLevelArr.length;
                    while (i < length) {
                        codecProfileLevel = codecProfileLevelArr[i];
                        if (codecProfileLevel.profile != iIntValue) {
                        }
                    }
                    i("codec.profileLevel, " + b87Var.k + ", " + str3);
                    return false;
                }
            }
        } else if (pairB != null) {
            iIntValue = ((Integer) pairB.first).intValue();
            iIntValue2 = ((Integer) pairB.second).intValue();
            zEquals = "video/dolby-vision".equals(str2);
            str = this.b;
            if (zEquals) {
                str.getClass();
                switch (str) {
                    case -1662735862:
                        if (str.equals("video/av01")) {
                        }
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                        }
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:311)
                    */
                /*
                    Method dump skipped, instruction units count: 368
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.nt9.c(android.content.Context, b87, boolean):boolean");
            }

            public final boolean d(b87 b87Var) {
                return (Objects.equals(b87Var.n, "audio/flac") && b87Var.H == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
            }

            public final boolean e(Context context, b87 b87Var) {
                int i;
                int i2;
                String str = b87Var.n;
                String str2 = this.b;
                if ((!str2.equals(str) && !str2.equals(ut9.c(b87Var))) || !c(context, b87Var, true) || !d(b87Var)) {
                    return false;
                }
                if (this.l) {
                    int i3 = b87Var.u;
                    if (i3 > 0 && (i2 = b87Var.v) > 0) {
                        return h(i3, i2, b87Var.y);
                    }
                } else {
                    int i4 = b87Var.G;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                    if (i4 != -1) {
                        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            i("sampleRate.aCaps");
                            return false;
                        }
                        if (!audioCapabilities.isSampleRateSupported(i4)) {
                            i("sampleRate.support, " + i4);
                            return false;
                        }
                    }
                    int i5 = b87Var.F;
                    if (i5 != -1) {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            i("channelCount.aCaps");
                            return false;
                        }
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                            if ("audio/ac3".equals(str2)) {
                                i = 6;
                            } else {
                                i = "audio/eac3".equals(str2) ? 16 : 30;
                            }
                            StringBuilder sbR = c0a.r(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.a, ", [", " to ");
                            sbR.append(i);
                            sbR.append("]");
                            lvb.G0("MediaCodecInfo", sbR.toString());
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i5) {
                            i("channelCount.support, " + i5);
                            return false;
                        }
                    }
                }
                return true;
            }

            public final boolean f() {
                if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = this.d.profileLevels;
                    if (codecProfileLevelArr == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        if (codecProfileLevel.profile == 16384) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public final boolean g(b87 b87Var) {
                if (this.l) {
                    return this.e;
                }
                Pair pairB = qu3.b(b87Var);
                return pairB != null && ((Integer) pairB.first).intValue() == 42;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x003c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:17:0x003e  */
            public final boolean h(int i, int i2, double d) {
                String str;
                MediaCodecInfo.VideoCapabilities videoCapabilities = this.d.getVideoCapabilities();
                if (videoCapabilities == null) {
                    i("sizeAndRate.vCaps");
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    int iA = grk.a(videoCapabilities, i, i2, d);
                    if (iA != 2) {
                        if (iA == 1) {
                            StringBuilder sbP = qv1.p("sizeAndRate.cover, ", i, "x", i2, "@");
                            sbP.append(d);
                            i(sbP.toString());
                            return false;
                        }
                        if (!a(videoCapabilities, i, i2, d)) {
                            if (i < i2) {
                                str = this.a;
                                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                                    StringBuilder sbP2 = qv1.p("sizeAndRate.rotated, ", i, "x", i2, "@");
                                    sbP2.append(d);
                                    StringBuilder sbQ = qv1.q("AssumedSupport [", sbP2.toString(), "] [", str, ", ");
                                    sbQ.append(this.b);
                                    sbQ.append("] [");
                                    sbQ.append(vqi.a);
                                    sbQ.append("]");
                                    lvb.g0("MediaCodecInfo", sbQ.toString());
                                    return true;
                                }
                                StringBuilder sbP3 = qv1.p("sizeAndRate.rotated, ", i, "x", i2, "@");
                                sbP3.append(d);
                                StringBuilder sbQ2 = qv1.q("AssumedSupport [", sbP3.toString(), "] [", str, ", ");
                                sbQ2.append(this.b);
                                sbQ2.append("] [");
                                sbQ2.append(vqi.a);
                                sbQ2.append("]");
                                lvb.g0("MediaCodecInfo", sbQ2.toString());
                                return true;
                            }
                            StringBuilder sbP4 = qv1.p("sizeAndRate.support, ", i, "x", i2, "@");
                            sbP4.append(d);
                            i(sbP4.toString());
                            return false;
                        }
                    }
                } else if (!a(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.a;
                        if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                            StringBuilder sbP5 = qv1.p("sizeAndRate.rotated, ", i, "x", i2, "@");
                            sbP5.append(d);
                            StringBuilder sbQ3 = qv1.q("AssumedSupport [", sbP5.toString(), "] [", str, ", ");
                            sbQ3.append(this.b);
                            sbQ3.append("] [");
                            sbQ3.append(vqi.a);
                            sbQ3.append("]");
                            lvb.g0("MediaCodecInfo", sbQ3.toString());
                            return true;
                        }
                    }
                    StringBuilder sbP6 = qv1.p("sizeAndRate.support, ", i, "x", i2, "@");
                    sbP6.append(d);
                    i(sbP6.toString());
                    return false;
                }
                return true;
            }

            public final void i(String str) {
                StringBuilder sbV = qt4.v("NoSupport [", str, "] [");
                sbV.append(this.a);
                sbV.append(", ");
                sbV.append(this.b);
                sbV.append("] [");
                sbV.append(vqi.a);
                sbV.append("]");
                lvb.g0("MediaCodecInfo", sbV.toString());
            }

            public final String toString() {
                return this.a;
            }
        }
