package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class pbh {
    public final xr8 A;
    public final ch B;
    public final qv7 C;
    public final bg2 a;
    public final p86 b;
    public final io6 c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final ArrayList m;
    public final ArrayList n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public ej0 v;
    public final ArrayList w;
    public final a4h x;
    public final fo5 y;
    public final uik z;

    public pbh(Context context, bg2 bg2Var, p86 p86Var, io6 io6Var) {
        boolean zL0;
        long[] jArr;
        this.a = bg2Var;
        this.b = p86Var;
        this.c = io6Var;
        qb2 qb2Var = (qb2) bg2Var;
        String str = qb2Var.a;
        this.d = str;
        Integer num = (Integer) qb2Var.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        int iIntValue = num != null ? num.intValue() : 2;
        this.e = iIntValue;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.g = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.h = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.i = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.j = arrayList5;
        this.k = new ArrayList();
        this.l = new LinkedHashMap();
        ArrayList arrayList6 = new ArrayList();
        this.m = arrayList6;
        this.n = new ArrayList();
        bg2.U.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            bg2.U.getClass();
            int[] iArr = (int[]) ((qb2) bg2Var).c(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            zL0 = a.L0(2, iArr == null ? ag2.b : iArr);
        } else {
            zL0 = false;
        }
        this.t = zL0;
        this.w = new ArrayList();
        this.x = j();
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = (ExtraSupportedSurfaceCombinationsQuirk) uk5.a(ExtraSupportedSurfaceCombinationsQuirk.class);
        this.y = fo5.g.z(context);
        this.z = new uik(22);
        this.A = new xr8();
        ch chVar = new ch(bg2Var);
        this.B = chVar;
        this.C = new qv7(bg2Var);
        int[] iArr2 = (int[]) qb2Var.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = zL0;
        if (iArr2 != null) {
            this.o = a.L0(3, iArr2);
            this.p = a.L0(6, iArr2);
            this.s = a.L0(16, iArr2);
            this.u = a.L0(1, iArr2);
        }
        boolean z2 = this.o;
        boolean z3 = this.p;
        ifh ifhVar = lr7.a;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        qbh qbhVar = new qbh();
        t4h t4hVar = tbh.e;
        rbh rbhVar = rbh.MAXIMUM;
        sbh sbhVar = sbh.a;
        qbh qbhVarD = x05.d(sbhVar, rbhVar, qbhVar, arrayList8, qbhVar);
        sbh sbhVar2 = sbh.c;
        qbh qbhVarD2 = x05.d(sbhVar2, rbhVar, qbhVarD, arrayList8, qbhVarD);
        sbh sbhVar3 = sbh.b;
        qbh qbhVarD3 = x05.d(sbhVar3, rbhVar, qbhVarD2, arrayList8, qbhVarD2);
        rbh rbhVar2 = rbh.PREVIEW;
        x05.k(sbhVar, rbhVar2, qbhVarD3, sbhVar2, rbhVar);
        qbh qbhVarE = x05.e(arrayList8, qbhVarD3);
        x05.k(sbhVar3, rbhVar2, qbhVarE, sbhVar2, rbhVar);
        qbh qbhVarE2 = x05.e(arrayList8, qbhVarE);
        x05.k(sbhVar, rbhVar2, qbhVarE2, sbhVar, rbhVar2);
        qbh qbhVarE3 = x05.e(arrayList8, qbhVarE2);
        x05.k(sbhVar, rbhVar2, qbhVarE3, sbhVar3, rbhVar2);
        qbh qbhVarE4 = x05.e(arrayList8, qbhVarE3);
        x05.k(sbhVar, rbhVar2, qbhVarE4, sbhVar3, rbhVar2);
        qbhVarE4.a(yr8.m(sbhVar2, rbhVar));
        arrayList8.add(qbhVarE4);
        arrayList7.addAll(arrayList8);
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 3 || iIntValue == 4) {
            ArrayList arrayList9 = new ArrayList();
            qbh qbhVar2 = new qbh();
            qbhVar2.a(yr8.m(sbhVar, rbhVar2));
            rbh rbhVar3 = rbh.RECORD;
            qbh qbhVarD4 = x05.d(sbhVar, rbhVar3, qbhVar2, arrayList9, qbhVar2);
            x05.k(sbhVar, rbhVar2, qbhVarD4, sbhVar3, rbhVar3);
            qbh qbhVarE5 = x05.e(arrayList9, qbhVarD4);
            x05.k(sbhVar3, rbhVar2, qbhVarE5, sbhVar3, rbhVar3);
            qbh qbhVarE6 = x05.e(arrayList9, qbhVarE5);
            x05.k(sbhVar, rbhVar2, qbhVarE6, sbhVar, rbhVar3);
            qbh qbhVarD5 = x05.d(sbhVar2, rbhVar3, qbhVarE6, arrayList9, qbhVarE6);
            x05.k(sbhVar, rbhVar2, qbhVarD5, sbhVar3, rbhVar3);
            qbh qbhVarD6 = x05.d(sbhVar2, rbhVar3, qbhVarD5, arrayList9, qbhVarD5);
            x05.k(sbhVar3, rbhVar2, qbhVarD6, sbhVar3, rbhVar2);
            qbhVarD6.a(yr8.m(sbhVar2, rbhVar));
            arrayList9.add(qbhVarD6);
            arrayList7.addAll(arrayList9);
        }
        if (iIntValue == 1 || iIntValue == 3) {
            ArrayList arrayList10 = new ArrayList();
            qbh qbhVar3 = new qbh();
            x05.k(sbhVar, rbhVar2, qbhVar3, sbhVar, rbhVar);
            qbh qbhVarE7 = x05.e(arrayList10, qbhVar3);
            x05.k(sbhVar, rbhVar2, qbhVarE7, sbhVar3, rbhVar);
            qbh qbhVarE8 = x05.e(arrayList10, qbhVarE7);
            x05.k(sbhVar3, rbhVar2, qbhVarE8, sbhVar3, rbhVar);
            qbh qbhVarE9 = x05.e(arrayList10, qbhVarE8);
            x05.k(sbhVar, rbhVar2, qbhVarE9, sbhVar, rbhVar2);
            qbh qbhVarD7 = x05.d(sbhVar2, rbhVar, qbhVarE9, arrayList10, qbhVarE9);
            rbh rbhVar4 = rbh.VGA;
            x05.k(sbhVar3, rbhVar4, qbhVarD7, sbhVar, rbhVar2);
            qbh qbhVarD8 = x05.d(sbhVar3, rbhVar, qbhVarD7, arrayList10, qbhVarD7);
            x05.k(sbhVar3, rbhVar4, qbhVarD8, sbhVar3, rbhVar2);
            qbhVarD8.a(yr8.m(sbhVar3, rbhVar));
            arrayList10.add(qbhVarD8);
            arrayList7.addAll(arrayList10);
        }
        sbh sbhVar4 = sbh.e;
        if (z2) {
            ArrayList arrayList11 = new ArrayList();
            qbh qbhVar4 = new qbh();
            qbh qbhVarD9 = x05.d(sbhVar4, rbhVar, qbhVar4, arrayList11, qbhVar4);
            x05.k(sbhVar, rbhVar2, qbhVarD9, sbhVar4, rbhVar);
            qbh qbhVarE10 = x05.e(arrayList11, qbhVarD9);
            x05.k(sbhVar3, rbhVar2, qbhVarE10, sbhVar4, rbhVar);
            qbh qbhVarE11 = x05.e(arrayList11, qbhVarE10);
            x05.k(sbhVar, rbhVar2, qbhVarE11, sbhVar, rbhVar2);
            qbh qbhVarD10 = x05.d(sbhVar4, rbhVar, qbhVarE11, arrayList11, qbhVarE11);
            x05.k(sbhVar, rbhVar2, qbhVarD10, sbhVar3, rbhVar2);
            qbh qbhVarD11 = x05.d(sbhVar4, rbhVar, qbhVarD10, arrayList11, qbhVarD10);
            x05.k(sbhVar3, rbhVar2, qbhVarD11, sbhVar3, rbhVar2);
            qbh qbhVarD12 = x05.d(sbhVar4, rbhVar, qbhVarD11, arrayList11, qbhVarD11);
            x05.k(sbhVar, rbhVar2, qbhVarD12, sbhVar2, rbhVar);
            qbh qbhVarD13 = x05.d(sbhVar4, rbhVar, qbhVarD12, arrayList11, qbhVarD12);
            x05.k(sbhVar3, rbhVar2, qbhVarD13, sbhVar2, rbhVar);
            qbhVarD13.a(yr8.m(sbhVar4, rbhVar));
            arrayList11.add(qbhVarD13);
            arrayList7.addAll(arrayList11);
        }
        if (z3 && iIntValue == 0) {
            ArrayList arrayList12 = new ArrayList();
            qbh qbhVar5 = new qbh();
            x05.k(sbhVar, rbhVar2, qbhVar5, sbhVar, rbhVar);
            qbh qbhVarE12 = x05.e(arrayList12, qbhVar5);
            x05.k(sbhVar, rbhVar2, qbhVarE12, sbhVar3, rbhVar);
            qbh qbhVarE13 = x05.e(arrayList12, qbhVarE12);
            x05.k(sbhVar3, rbhVar2, qbhVarE13, sbhVar3, rbhVar);
            arrayList12.add(qbhVarE13);
            arrayList7.addAll(arrayList12);
        }
        if (iIntValue == 3) {
            ArrayList arrayList13 = new ArrayList();
            qbh qbhVar6 = new qbh();
            qbhVar6.a(yr8.m(sbhVar, rbhVar2));
            rbh rbhVar5 = rbh.VGA;
            x05.k(sbhVar, rbhVar5, qbhVar6, sbhVar3, rbhVar);
            qbh qbhVarD14 = x05.d(sbhVar4, rbhVar, qbhVar6, arrayList13, qbhVar6);
            x05.k(sbhVar, rbhVar2, qbhVarD14, sbhVar, rbhVar5);
            x05.k(sbhVar2, rbhVar, qbhVarD14, sbhVar4, rbhVar);
            arrayList13.add(qbhVarD14);
            arrayList7.addAll(arrayList13);
        }
        arrayList2.addAll(arrayList7);
        r66 r66Var = r66.a;
        List listSingletonList = r66Var;
        if (extraSupportedSurfaceCombinationsQuirk != null) {
            qbh qbhVar7 = ExtraSupportedSurfaceCombinationsQuirk.a;
            String str2 = Build.DEVICE;
            if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
                ArrayList arrayList14 = new ArrayList();
                listSingletonList = arrayList14;
                if (str.equals("1")) {
                    arrayList14.add(ExtraSupportedSurfaceCombinationsQuirk.a);
                    listSingletonList = arrayList14;
                }
            } else if (exl.b() || exl.c()) {
                listSingletonList = r66Var;
                listSingletonList = Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.b);
            }
        }
        listSingletonList = r66Var;
        arrayList2.addAll(listSingletonList);
        if (this.s) {
            ArrayList arrayList15 = new ArrayList();
            qbh qbhVar8 = new qbh();
            rbh rbhVar6 = rbh.ULTRA_MAXIMUM;
            x05.k(sbhVar3, rbhVar6, qbhVar8, sbhVar, rbhVar2);
            rbh rbhVar7 = rbh.RECORD;
            qbh qbhVarD15 = x05.d(sbhVar, rbhVar7, qbhVar8, arrayList15, qbhVar8);
            x05.k(sbhVar2, rbhVar6, qbhVarD15, sbhVar, rbhVar2);
            qbh qbhVarD16 = x05.d(sbhVar, rbhVar7, qbhVarD15, arrayList15, qbhVarD15);
            x05.k(sbhVar4, rbhVar6, qbhVarD16, sbhVar, rbhVar2);
            qbh qbhVarD17 = x05.d(sbhVar, rbhVar7, qbhVarD16, arrayList15, qbhVarD16);
            x05.k(sbhVar3, rbhVar6, qbhVarD17, sbhVar, rbhVar2);
            qbh qbhVarD18 = x05.d(sbhVar2, rbhVar, qbhVarD17, arrayList15, qbhVarD17);
            x05.k(sbhVar2, rbhVar6, qbhVarD18, sbhVar, rbhVar2);
            qbh qbhVarD19 = x05.d(sbhVar2, rbhVar, qbhVarD18, arrayList15, qbhVarD18);
            x05.k(sbhVar4, rbhVar6, qbhVarD19, sbhVar, rbhVar2);
            qbh qbhVarD20 = x05.d(sbhVar2, rbhVar, qbhVarD19, arrayList15, qbhVarD19);
            x05.k(sbhVar3, rbhVar6, qbhVarD20, sbhVar, rbhVar2);
            qbh qbhVarD21 = x05.d(sbhVar3, rbhVar, qbhVarD20, arrayList15, qbhVarD20);
            x05.k(sbhVar2, rbhVar6, qbhVarD21, sbhVar, rbhVar2);
            qbh qbhVarD22 = x05.d(sbhVar3, rbhVar, qbhVarD21, arrayList15, qbhVarD21);
            x05.k(sbhVar4, rbhVar6, qbhVarD22, sbhVar, rbhVar2);
            qbh qbhVarD23 = x05.d(sbhVar3, rbhVar, qbhVarD22, arrayList15, qbhVarD22);
            x05.k(sbhVar3, rbhVar6, qbhVarD23, sbhVar, rbhVar2);
            qbh qbhVarD24 = x05.d(sbhVar4, rbhVar, qbhVarD23, arrayList15, qbhVarD23);
            x05.k(sbhVar2, rbhVar6, qbhVarD24, sbhVar, rbhVar2);
            qbh qbhVarD25 = x05.d(sbhVar4, rbhVar, qbhVarD24, arrayList15, qbhVarD24);
            x05.k(sbhVar4, rbhVar6, qbhVarD25, sbhVar, rbhVar2);
            qbhVarD25.a(yr8.m(sbhVar4, rbhVar));
            arrayList15.add(qbhVarD25);
            arrayList4.addAll(arrayList15);
        }
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        this.q = zHasSystemFeature;
        if (zHasSystemFeature) {
            ArrayList arrayList16 = new ArrayList();
            qbh qbhVar9 = new qbh();
            rbh rbhVar8 = rbh.S1440P_4_3;
            qbh qbhVarD26 = x05.d(sbhVar3, rbhVar8, qbhVar9, arrayList16, qbhVar9);
            qbh qbhVarD27 = x05.d(sbhVar, rbhVar8, qbhVarD26, arrayList16, qbhVarD26);
            qbh qbhVarD28 = x05.d(sbhVar2, rbhVar8, qbhVarD27, arrayList16, qbhVarD27);
            rbh rbhVar9 = rbh.S720P_16_9;
            x05.k(sbhVar3, rbhVar9, qbhVarD28, sbhVar2, rbhVar8);
            qbh qbhVarE14 = x05.e(arrayList16, qbhVarD28);
            x05.k(sbhVar, rbhVar9, qbhVarE14, sbhVar2, rbhVar8);
            qbh qbhVarE15 = x05.e(arrayList16, qbhVarE14);
            x05.k(sbhVar3, rbhVar9, qbhVarE15, sbhVar3, rbhVar8);
            qbh qbhVarE16 = x05.e(arrayList16, qbhVarE15);
            x05.k(sbhVar3, rbhVar9, qbhVarE16, sbhVar, rbhVar8);
            qbh qbhVarE17 = x05.e(arrayList16, qbhVarE16);
            x05.k(sbhVar, rbhVar9, qbhVarE17, sbhVar3, rbhVar8);
            qbh qbhVarE18 = x05.e(arrayList16, qbhVarE17);
            x05.k(sbhVar, rbhVar9, qbhVarE18, sbhVar, rbhVar8);
            arrayList16.add(qbhVarE18);
            arrayList.addAll(arrayList16);
        }
        if (chVar.b) {
            qbh qbhVar10 = new qbh();
            qbhVar10.a(yr8.m(sbhVar, rbhVar));
            qbh qbhVar11 = new qbh();
            qbhVar11.a(yr8.m(sbhVar3, rbhVar));
            qbh qbhVar12 = new qbh();
            qbhVar12.a(yr8.m(sbhVar, rbhVar2));
            qbhVar12.a(yr8.m(sbhVar2, rbhVar));
            qbh qbhVar13 = new qbh();
            qbhVar13.a(yr8.m(sbhVar, rbhVar2));
            qbhVar13.a(yr8.m(sbhVar3, rbhVar));
            qbh qbhVar14 = new qbh();
            qbhVar14.a(yr8.m(sbhVar3, rbhVar2));
            qbhVar14.a(yr8.m(sbhVar3, rbhVar));
            qbh qbhVar15 = new qbh();
            qbhVar15.a(yr8.m(sbhVar, rbhVar2));
            rbh rbhVar10 = rbh.RECORD;
            qbhVar15.a(yr8.m(sbhVar, rbhVar10));
            qbh qbhVar16 = new qbh();
            x05.k(sbhVar, rbhVar2, qbhVar16, sbhVar, rbhVar10);
            qbhVar16.a(yr8.m(sbhVar3, rbhVar10));
            qbh qbhVar17 = new qbh();
            x05.k(sbhVar, rbhVar2, qbhVar17, sbhVar, rbhVar10);
            qbhVar17.a(yr8.m(sbhVar2, rbhVar10));
            arrayList6.addAll(xw3.P0(qbhVar10, qbhVar11, qbhVar12, qbhVar13, qbhVar14, qbhVar15, qbhVar16, qbhVar17));
        }
        if (z) {
            ArrayList arrayList17 = new ArrayList();
            qbh qbhVar18 = new qbh();
            rbh rbhVar11 = rbh.S1440P_4_3;
            qbh qbhVarD29 = x05.d(sbhVar, rbhVar11, qbhVar18, arrayList17, qbhVar18);
            qbh qbhVarD30 = x05.d(sbhVar3, rbhVar11, qbhVarD29, arrayList17, qbhVarD29);
            x05.k(sbhVar, rbhVar11, qbhVarD30, sbhVar2, rbhVar);
            qbh qbhVarE19 = x05.e(arrayList17, qbhVarD30);
            x05.k(sbhVar3, rbhVar11, qbhVarE19, sbhVar2, rbhVar);
            qbh qbhVarE20 = x05.e(arrayList17, qbhVarE19);
            x05.k(sbhVar, rbhVar11, qbhVarE20, sbhVar3, rbhVar);
            qbh qbhVarE21 = x05.e(arrayList17, qbhVarE20);
            x05.k(sbhVar3, rbhVar11, qbhVarE21, sbhVar3, rbhVar);
            qbh qbhVarE22 = x05.e(arrayList17, qbhVarE21);
            x05.k(sbhVar, rbhVar2, qbhVarE22, sbhVar, rbhVar11);
            qbh qbhVarE23 = x05.e(arrayList17, qbhVarE22);
            x05.k(sbhVar3, rbhVar2, qbhVarE23, sbhVar, rbhVar11);
            qbh qbhVarE24 = x05.e(arrayList17, qbhVarE23);
            x05.k(sbhVar, rbhVar2, qbhVarE24, sbhVar3, rbhVar11);
            qbh qbhVarE25 = x05.e(arrayList17, qbhVarE24);
            x05.k(sbhVar3, rbhVar2, qbhVarE25, sbhVar3, rbhVar11);
            arrayList17.add(qbhVarE25);
            arrayList5.addAll(arrayList17);
        }
        bh0 bh0Var = v4h.a;
        int i = Build.VERSION.SDK_INT;
        boolean z4 = (i < 33 || (jArr = (long[]) qb2Var.c(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
        this.r = z4;
        if (z4 && i >= 33) {
            qbh qbhVar19 = new qbh();
            rbh rbhVar12 = rbh.S1440P_4_3;
            t4h t4hVar2 = t4h.PREVIEW_VIDEO_STILL;
            qbhVar19.a(new tbh(sbhVar, rbhVar12, t4hVar2));
            qbh qbhVar20 = new qbh();
            qbhVar20.a(new tbh(sbhVar3, rbhVar12, t4hVar2));
            qbh qbhVar21 = new qbh();
            rbh rbhVar13 = rbh.RECORD;
            t4h t4hVar3 = t4h.VIDEO_RECORD;
            qbhVar21.a(new tbh(sbhVar, rbhVar13, t4hVar3));
            qbh qbhVar22 = new qbh();
            qbhVar22.a(new tbh(sbhVar3, rbhVar13, t4hVar3));
            qbh qbhVar23 = new qbh();
            t4h t4hVar4 = t4h.STILL_CAPTURE;
            qbhVar23.a(new tbh(sbhVar2, rbhVar, t4hVar4));
            qbh qbhVar24 = new qbh();
            qbhVar24.a(new tbh(sbhVar3, rbhVar, t4hVar4));
            qbh qbhVar25 = new qbh();
            t4h t4hVar5 = t4h.PREVIEW;
            qbhVar25.a(new tbh(sbhVar, rbhVar2, t4hVar5));
            qbhVar25.a(new tbh(sbhVar2, rbhVar, t4hVar4));
            qbh qbhVar26 = new qbh();
            qbhVar26.a(new tbh(sbhVar, rbhVar2, t4hVar5));
            qbhVar26.a(new tbh(sbhVar3, rbhVar, t4hVar4));
            qbh qbhVar27 = new qbh();
            qbhVar27.a(new tbh(sbhVar, rbhVar2, t4hVar5));
            qbhVar27.a(new tbh(sbhVar, rbhVar13, t4hVar3));
            qbh qbhVar28 = new qbh();
            qbhVar28.a(new tbh(sbhVar, rbhVar2, t4hVar5));
            qbhVar28.a(new tbh(sbhVar3, rbhVar13, t4hVar3));
            qbh qbhVar29 = new qbh();
            qbhVar29.a(new tbh(sbhVar, rbhVar2, t4hVar5));
            qbhVar29.a(new tbh(sbhVar3, rbhVar2, t4hVar5));
            qbh qbhVar30 = new qbh();
            qbhVar30.a(new tbh(sbhVar, rbhVar2, t4hVar5));
            qbhVar30.a(new tbh(sbhVar, rbhVar13, t4hVar3));
            qbhVar30.a(new tbh(sbhVar2, rbhVar13, t4hVar4));
            qbh qbhVar31 = new qbh();
            qbhVar31.a(new tbh(sbhVar, rbhVar2, t4hVar5));
            qbhVar31.a(new tbh(sbhVar3, rbhVar13, t4hVar3));
            qbhVar31.a(new tbh(sbhVar2, rbhVar13, t4hVar4));
            qbh qbhVar32 = new qbh();
            qbhVar32.a(new tbh(sbhVar, rbhVar2, t4hVar5));
            qbhVar32.a(new tbh(sbhVar3, rbhVar2, t4hVar5));
            qbhVar32.a(new tbh(sbhVar2, rbhVar, t4hVar4));
            arrayList3.addAll(xw3.P0(qbhVar19, qbhVar20, qbhVar21, qbhVar22, qbhVar23, qbhVar24, qbhVar25, qbhVar26, qbhVar27, qbhVar28, qbhVar29, qbhVar30, qbhVar31, qbhVar32));
        }
        b();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    public static Range c(Range range, int i, Range[] rangeArr) {
        Range range2 = yi0.h;
        if (cqk.d(range, range2) || rangeArr == null) {
            return range2;
        }
        Range range3 = new Range(Integer.valueOf(Math.min(((Number) range.getLower()).intValue(), i)), Integer.valueOf(Math.min(((Number) range.getUpper()).intValue(), i)));
        int iH = 0;
        for (Range range4 : rangeArr) {
            if (i >= ((Number) range4.getLower()).intValue()) {
                if (cqk.d(range2, yi0.h)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    return range4;
                }
                try {
                    int iH2 = h(range4.intersect(range3));
                    if (iH == 0) {
                        range2 = range4;
                        iH = iH2;
                    } else if (iH2 >= iH) {
                        double dH = h(range2.intersect(range3));
                        double dH2 = h(range4.intersect(range3));
                        double dH3 = dH2 / ((double) h(range4));
                        double dH4 = dH / ((double) h(range2));
                        if (dH2 > dH) {
                            if (dH3 >= 0.5d || dH3 >= dH4) {
                                range2 = range4;
                            }
                        } else if (dH2 == dH) {
                            if (dH3 > dH4 || (dH3 == dH4 && ((Number) range4.getLower()).intValue() > ((Number) range2.getLower()).intValue())) {
                                range2 = range4;
                            }
                        } else if (dH4 < 0.5d && dH3 > dH4) {
                            range2 = range4;
                        }
                        iH = h(range3.intersect(range2));
                    }
                } catch (IllegalArgumentException unused) {
                    if (iH == 0 && (g(range4, range3) < g(range2, range3) || (g(range4, range3) == g(range2, range3) && (((Number) range4.getLower()).intValue() > ((Number) range2.getUpper()).intValue() || h(range4) < h(range2))))) {
                        range2 = range4;
                    }
                }
            }
        }
        return range2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public static Size e(StreamConfigurationMap streamConfigurationMap, int i, boolean z, Rational rational) {
        Object poeVar;
        Object outputSizes;
        try {
            if (i == 34) {
                if (streamConfigurationMap != null) {
                    outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                } else {
                    outputSizes = null;
                }
            } else if (streamConfigurationMap != null) {
                outputSizes = streamConfigurationMap.getOutputSizes(i);
            } else {
                outputSizes = null;
            }
            poeVar = outputSizes;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        Size[] sizeArr = (Size[]) poeVar;
        if (sizeArr == null) {
            sizeArr = null;
        } else if (rational != null) {
            ArrayList arrayList = new ArrayList();
            for (Size size : sizeArr) {
                Rational rational2 = ix.a;
                if (ix.a(size, rational, mag.c)) {
                    arrayList.add(size);
                }
            }
            sizeArr = (Size[]) arrayList.toArray(new Size[0]);
        }
        if (sizeArr == null || sizeArr.length == 0) {
            return null;
        }
        x44 x44Var = new x44(false);
        Size size2 = (Size) Collections.max(Arrays.asList(sizeArr), x44Var);
        Size size3 = mag.a;
        if (z) {
            Size[] highResolutionOutputSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighResolutionOutputSizes(i) : null;
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length != 0) {
                size3 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), x44Var);
            }
        }
        return (Size) Collections.max(xw3.P0(size2, size3), x44Var);
    }

    public static int g(Range range, Range range2) {
        if (!range.contains(range2.getUpper()) && !range.contains(range2.getLower())) {
            return ((Number) range.getLower()).intValue() > ((Number) range2.getUpper()).intValue() ? ((Number) range.getLower()).intValue() - ((Number) range2.getUpper()).intValue() : ((Number) range2.getLower()).intValue() - ((Number) range.getUpper()).intValue();
        }
        ore.p("Ranges must not intersect");
        return 0;
    }

    public static int h(Range range) {
        return (((Number) range.getUpper()).intValue() - ((Number) range.getLower()).intValue()) + 1;
    }

    public static Range m(Range range, Range range2, boolean z) {
        Range range3 = yi0.h;
        if (cqk.d(range2, range3) && cqk.d(range, range3)) {
            return range3;
        }
        if (cqk.d(range2, range3)) {
            return range;
        }
        if (cqk.d(range, range3)) {
            return range2;
        }
        if (z) {
            qyj.l("All targetFrameRate should be the same if strict fps is required", cqk.d(range, range2));
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    public final boolean a(obh obhVar, ArrayList arrayList, Map map, List list, List list2) {
        boolean z;
        ArrayList arrayList2;
        List list3;
        boolean z2;
        Size size;
        qmi qmiVar;
        int i = obhVar.d;
        boolean z3 = obhVar.h;
        LinkedHashMap linkedHashMap = this.l;
        String str = "Required value was null.";
        if (linkedHashMap.containsKey(obhVar)) {
            list3 = (List) linkedHashMap.get(obhVar);
            z3 = z3;
            str = "Required value was null.";
            z = false;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i2 = obhVar.a;
            if (z3) {
                ifh ifhVar = lr7.a;
                ArrayList arrayList4 = new ArrayList();
                z = false;
                if (Build.VERSION.SDK_INT >= 35) {
                    Object objC = ((qb2) this.a).c(CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION);
                    if (objC == null) {
                        ore.p("Required value was null.");
                        return false;
                    }
                    int iIntValue = ((Number) objC).intValue();
                    if (iIntValue >= 35 && i != 3) {
                        arrayList4.addAll((List) lr7.a.getValue());
                    }
                    if (iIntValue >= 36 && i != 4) {
                        arrayList4.addAll((List) lr7.b.getValue());
                    }
                }
                arrayList3.addAll(arrayList4);
                z3 = z3;
                str = "Required value was null.";
            } else {
                z = false;
                if (obhVar.e) {
                    ArrayList arrayList5 = this.n;
                    if (arrayList5.isEmpty()) {
                        ifh ifhVar2 = lr7.a;
                        ArrayList arrayList6 = new ArrayList();
                        qbh qbhVar = new qbh();
                        t4h t4hVar = tbh.e;
                        rbh rbhVar = rbh.MAXIMUM;
                        sbh sbhVar = sbh.d;
                        qbh qbhVarD = x05.d(sbhVar, rbhVar, qbhVar, arrayList6, qbhVar);
                        x05.k(sbh.a, rbh.PREVIEW, qbhVarD, sbhVar, rbhVar);
                        arrayList6.add(qbhVarD);
                        arrayList5.addAll(arrayList6);
                    }
                    if (i2 == 0) {
                        arrayList3.addAll(arrayList5);
                    }
                } else {
                    z3 = z3;
                    str = "Required value was null.";
                    if (obhVar.f) {
                        ArrayList arrayList7 = this.k;
                        if (arrayList7.isEmpty()) {
                            qv7 qv7Var = this.C;
                            if (((Boolean) qv7Var.b.getValue()).booleanValue()) {
                                arrayList7.clear();
                                Size size2 = (Size) qv7Var.c.getValue();
                                if (size2 != null) {
                                    ej0 ej0VarL = l(34);
                                    ifh ifhVar3 = lr7.a;
                                    ArrayList arrayList8 = new ArrayList();
                                    t4h t4hVar2 = tbh.e;
                                    tbh tbhVarQ = yr8.q(34, size2, ej0VarL, 0, 2, tbh.e);
                                    qbh qbhVar2 = new qbh();
                                    qbhVar2.a(tbhVarQ);
                                    arrayList8.add(qbhVar2);
                                    qbh qbhVar3 = new qbh();
                                    qbhVar3.a(tbhVarQ);
                                    qbhVar3.a(tbhVarQ);
                                    arrayList8.add(qbhVar3);
                                    arrayList7.addAll(arrayList8);
                                }
                            }
                        }
                        arrayList3.addAll(arrayList7);
                    } else {
                        int i3 = obhVar.b;
                        if (i3 == 8) {
                            if (i2 != 1) {
                                ArrayList arrayList9 = this.g;
                                if (i2 != 2) {
                                    if (i == 4) {
                                        arrayList9 = this.j;
                                    }
                                    arrayList3.addAll(arrayList9);
                                } else {
                                    arrayList3.addAll(this.i);
                                    arrayList3.addAll(arrayList9);
                                }
                            } else {
                                arrayList2 = this.f;
                            }
                            linkedHashMap.put(obhVar, arrayList2);
                            list3 = arrayList2;
                        } else if (i3 == 10 && i2 == 0) {
                            arrayList3.addAll(this.m);
                        }
                    }
                }
            }
            arrayList2 = arrayList3;
            linkedHashMap.put(obhVar, arrayList2);
            list3 = arrayList2;
        }
        List list4 = list3;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it = list4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = z;
                    break;
                }
                if (((qbh) it.next()).c(arrayList) != null) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = z;
            break;
        }
        if (!z2 || !z3) {
            return z2;
        }
        kmf kmfVar = new kmf();
        Iterator it2 = arrayList.iterator();
        ?? r8 = z;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i4 = r8 + 1;
            if (r8 < 0) {
                xw3.V0();
                throw null;
            }
            tbh tbhVar = (tbh) next;
            ej0 ej0VarL2 = l(tbhVar.d);
            int i5 = tbhVar.d;
            LinkedHashMap linkedHashMap2 = ej0VarL2.f;
            rbh rbhVar2 = tbhVar.b;
            int iOrdinal = rbhVar2.ordinal();
            Iterator it3 = it2;
            if (iOrdinal != 3) {
                switch (iOrdinal) {
                    case 9:
                        size = ej0VarL2.e;
                        break;
                    case 10:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i5));
                        break;
                    case 11:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i5));
                        break;
                    case 12:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i5));
                        break;
                    case 13:
                        size = (Size) ej0VarL2.i.get(Integer.valueOf(i5));
                        break;
                    case 14:
                        ore.k("Not supported config size");
                        return z;
                    default:
                        size = rbhVar2.b;
                        break;
                }
            } else {
                size = ej0VarL2.c;
            }
            cmi cmiVar = (cmi) list.get(((Number) list2.get(r8)).intValue());
            Object obj = map.get(tbhVar);
            if (obj == null) {
                ore.p(str);
                return z;
            }
            fx5 fx5Var = (fx5) obj;
            ho6 ho6Var = new ho6(cmiVar.getInputFormat(), size);
            int iOrdinal2 = cmiVar.L().ordinal();
            if (iOrdinal2 == 0) {
                qmiVar = qmi.c;
            } else if (iOrdinal2 == 1) {
                qmiVar = qmi.b;
            } else if (iOrdinal2 == 2) {
                qmiVar = qmi.d;
            } else if (iOrdinal2 != 3) {
                qmiVar = iOrdinal2 != 4 ? qmi.g : qmi.f;
            } else {
                qmiVar = qmi.e;
            }
            Class cls = qmiVar.a;
            if (cls != null) {
                ho6Var.j = cls;
            }
            hmf hmfVarD = hmf.d(cmiVar, size);
            j28 j28Var = hmfVarD.b;
            hmfVarD.b(ho6Var, fx5Var, -1);
            Range range = obhVar.i;
            if (cqk.d(range, yi0.h)) {
                range = null;
            }
            if (range == null) {
                range = qa7.a;
            }
            j28Var.getClass();
            ((w8b) j28Var.d).m(hl2.h, range);
            if (i == 4) {
                j28Var.getClass();
                ((w8b) j28Var.d).m(cmi.h1, 2);
            } else if (i == 3) {
                j28Var.getClass();
                ((w8b) j28Var.d).m(cmi.i1, 2);
            }
            kmfVar.a(hmfVarD.c());
            boolean zC = kmfVar.c();
            StringBuilder sb = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb.append(cmiVar);
            sb.append(" with ");
            sb.append(tbhVar);
            sb.append(" due to [");
            sb.append(!kmfVar.m ? "Template is not set" : kmfVar.l.toString());
            sb.append("]; surfaceConfigList = ");
            sb.append(arrayList);
            sb.append(", featureSettings = ");
            sb.append(obhVar);
            sb.append(", newUseCaseConfigs = ");
            sb.append(list);
            qyj.l(sb.toString(), zC);
            it2 = it3;
            r8 = i4;
        }
        lmf lmfVarB = kmfVar.b();
        boolean zP = this.c.p(lmfVarB);
        Iterator it4 = lmfVarB.b().iterator();
        while (it4.hasNext()) {
            ((wf5) it4.next()).a();
        }
        return zP;
    }

    public final void b() {
        Object poeVar;
        Object outputSizes;
        Size sizeI;
        Size sizeC = this.y.c();
        try {
            Integer.parseInt(this.d);
            sizeI = i();
            if (sizeI == null) {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.x.c.b;
                if (streamConfigurationMap != null) {
                    try {
                        outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                } else {
                    outputSizes = null;
                }
                poeVar = outputSizes;
                if (poeVar instanceof poe) {
                    poeVar = null;
                }
                Size[] sizeArr = (Size[]) poeVar;
                if (sizeArr != null) {
                    Arrays.sort(sizeArr, new x44(true));
                    int length = sizeArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            sizeI = null;
                            break;
                        }
                        Size size = sizeArr[i];
                        int width = size.getWidth();
                        Size size2 = mag.f;
                        if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                            sizeI = size;
                            break;
                        }
                        i++;
                    }
                } else {
                    sizeI = null;
                    break;
                }
                if (sizeI == null) {
                    sizeI = mag.d;
                }
            }
        } catch (NumberFormatException unused) {
        }
        this.v = new ej0(mag.c, new LinkedHashMap(), sizeC, new LinkedHashMap(), sizeI, new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
    }

    public final int d(int i, Size size, boolean z, int i2) {
        long jB;
        int iIntValue = 0;
        if (!z) {
            try {
                jB = j().c.b(i, size);
            } catch (RuntimeException e) {
                if (tvj.f(5, "CXCP")) {
                    Log.w("CXCP", "Unable to get min frame duration for format = " + i + " and size = " + size, e);
                }
                jB = 0;
            }
            if (jB > 0) {
                iIntValue = (int) (1.0E9d / jB);
            } else if (!this.u) {
                iIntValue = Integer.MAX_VALUE;
            } else if (tvj.f(5, "CXCP")) {
                StringBuilder sbQ = c0a.q(i, jB, "minFrameDuration: ", " is invalid for imageFormat = ");
                sbQ.append(", size = ");
                sbQ.append(size);
                Log.w("CXCP", sbQ.toString());
            }
        } else {
            if (i != 34) {
                ore.k("Check failed.");
                return 0;
            }
            List listC = this.C.c(size);
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC == null) {
                tvj.g("HighSpeedResolver", "No supported high speed  fps for " + size);
            } else {
                Iterator it = listC.iterator();
                if (!it.hasNext()) {
                    qr7.d();
                    return 0;
                }
                Integer num = (Integer) ((Range) it.next()).getUpper();
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((Range) it.next()).getUpper();
                    if (num.compareTo(num2) < 0) {
                        num = num2;
                    }
                }
                iIntValue = num.intValue();
            }
        }
        return Math.min(i2, iIntValue);
    }

    public final List f(obh obhVar, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        bh0 bh0Var = v4h.a;
        if (obhVar.a == 0 && obhVar.b == 8 && !obhVar.f) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                List listC = ((qbh) it.next()).c(arrayList);
                if (listC != null) {
                    bh0 bh0Var2 = v4h.a;
                    int size = listC.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        }
                        long j = ((tbh) listC.get(i)).c.a;
                        boolean zContainsKey = linkedHashMap.containsKey(Integer.valueOf(i));
                        emi emiVar = emi.e;
                        if (zContainsKey) {
                            List list = ((pg0) linkedHashMap.get(Integer.valueOf(i))).e;
                            if (list.size() == 1) {
                                emiVar = (emi) list.get(0);
                            }
                            if (!v4h.b(emiVar, j, list)) {
                                break;
                            }
                            i++;
                        } else {
                            if (!linkedHashMap2.containsKey(Integer.valueOf(i))) {
                                c.e("SurfaceConfig does not map to any use case");
                                return null;
                            }
                            cmi cmiVar = (cmi) linkedHashMap2.get(Integer.valueOf(i));
                            if (!v4h.b(cmiVar.L(), j, cmiVar.L() == emiVar ? (List) ((r4h) cmiVar).i(r4h.b) : r66.a)) {
                                break;
                            }
                            i++;
                        }
                    }
                    ifh ifhVar = new ifh(new xre(this, 21, listC));
                    if (z && ((Boolean) ifhVar.getValue()).booleanValue()) {
                        return listC;
                    }
                }
            }
        }
        return null;
    }

    public final Size i() {
        r86 r86VarB;
        Iterator it = xw3.P0(1, 13, 10, 8, 12, 6, 5, 4).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            p86 p86Var = this.b;
            if (p86Var.a(iIntValue) && (r86VarB = p86Var.b(iIntValue)) != null && !r86VarB.b().isEmpty()) {
                return ((ih0) r86VarB.b().get(0)).a();
            }
        }
        return null;
    }

    public final a4h j() {
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        bg2 bg2Var = this.a;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qb2) bg2Var).c(key);
        if (streamConfigurationMap != null) {
            return new a4h(streamConfigurationMap, new sjc(bg2Var));
        }
        ore.p("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
        return null;
    }

    public final ArrayList k(int i, ArrayList arrayList, List list, List list2, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z) {
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pg0 pg0Var = (pg0) it.next();
            arrayList3.add(pg0Var.a);
            linkedHashMap.put(Integer.valueOf(arrayList3.size() - 1), pg0Var);
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            Size size = (Size) it2.next();
            cmi cmiVar = (cmi) list2.get(((Number) arrayList2.get(i2)).intValue());
            int inputFormat = cmiVar.getInputFormat();
            t4h t4hVarK = cmiVar.K();
            t4h t4hVar = tbh.e;
            arrayList3.add(yr8.q(inputFormat, size, l(inputFormat), i, z ? 1 : 2, t4hVarK));
            linkedHashMap2.put(Integer.valueOf(arrayList3.size() - 1), cmiVar);
            i2 = i3;
        }
        return arrayList3;
    }

    public final ej0 l(int i) {
        Size sizeE;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.w;
        if (!arrayList.contains(numValueOf)) {
            ej0 ej0Var = this.v;
            if (ej0Var == null) {
                ej0Var = null;
            }
            p(ej0Var.b, mag.e, i);
            ej0 ej0Var2 = this.v;
            if (ej0Var2 == null) {
                ej0Var2 = null;
            }
            p(ej0Var2.d, mag.g, i);
            ej0 ej0Var3 = this.v;
            if (ej0Var3 == null) {
                ej0Var3 = null;
            }
            o(ej0Var3.f, i, null);
            ej0 ej0Var4 = this.v;
            if (ej0Var4 == null) {
                ej0Var4 = null;
            }
            o(ej0Var4.g, i, ix.a);
            ej0 ej0Var5 = this.v;
            if (ej0Var5 == null) {
                ej0Var5 = null;
            }
            o(ej0Var5.h, i, ix.c);
            ej0 ej0Var6 = this.v;
            if (ej0Var6 == null) {
                ej0Var6 = null;
            }
            LinkedHashMap linkedHashMap = ej0Var6.i;
            if (Build.VERSION.SDK_INT >= 31 && this.s) {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qb2) this.a).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION);
                if (streamConfigurationMap != null && (sizeE = e(streamConfigurationMap, i, true, null)) != null) {
                    linkedHashMap.put(Integer.valueOf(i), sizeE);
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        ej0 ej0Var7 = this.v;
        if (ej0Var7 != null) {
            return ej0Var7;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:209:0x0614 A[PHI: r9 r20 r25
  0x0614: PHI (r9v24 int) = (r9v23 int), (r9v23 int), (r9v27 int), (r9v29 int) binds: [B:197:0x05e9, B:199:0x05f5, B:205:0x0602, B:208:0x060f] A[DONT_GENERATE, DONT_INLINE]
  0x0614: PHI (r20v7 boolean) = (r20v6 boolean), (r20v6 boolean), (r20v6 boolean), (r20v8 boolean) binds: [B:197:0x05e9, B:199:0x05f5, B:205:0x0602, B:208:0x060f] A[DONT_GENERATE, DONT_INLINE]
  0x0614: PHI (r25v5 java.util.List) = (r25v4 java.util.List), (r25v4 java.util.List), (r25v7 java.util.List), (r25v8 java.util.List) binds: [B:197:0x05e9, B:199:0x05f5, B:205:0x0602, B:208:0x060f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:210:0x0616 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:226:0x065d  */
    /* JADX WARN: Code duplicated, block: B:305:0x0846  */
    /* JADX WARN: Code duplicated, block: B:308:0x0859  */
    /* JADX WARN: Code duplicated, block: B:316:0x0872  */
    /* JADX WARN: Code duplicated, block: B:318:0x087e  */
    /* JADX WARN: Code duplicated, block: B:347:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:353:0x0916  */
    /* JADX WARN: Code duplicated, block: B:360:0x092d  */
    /* JADX WARN: Code duplicated, block: B:364:0x093d  */
    /* JADX WARN: Code duplicated, block: B:367:0x0947  */
    /* JADX WARN: Code duplicated, block: B:373:0x0967  */
    /* JADX WARN: Code duplicated, block: B:377:0x098f  */
    /* JADX WARN: Code duplicated, block: B:379:0x0995  */
    /* JADX WARN: Code duplicated, block: B:387:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:390:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:392:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:394:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:396:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:398:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:400:0x0a2d  */
    /* JADX WARN: Code duplicated, block: B:406:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:408:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:410:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:468:0x0864 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:? A[LOOP:15: B:306:0x0853->B:469:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x0889 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x0885 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:? A[LOOP:16: B:314:0x086c->B:473:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x092b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x0927 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x0912 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x0924 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x0937 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x090d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x095d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x097d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x09a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x09a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x0961 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x09cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x09ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x0a3f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0a3b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x0a80 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0a78 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [int] */
    /* JADX WARN: Type inference failed for: r36v8 */
    /* JADX WARN: Type inference failed for: r36v9 */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    public final jch n(obh obhVar, ArrayList arrayList, Map map, List list, ArrayList arrayList2, LinkedHashMap linkedHashMap) {
        String str;
        String str2;
        bg2 bg2Var;
        LinkedHashMap linkedHashMap2;
        ?? r27;
        boolean z;
        obh obhVar2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        List listF;
        ArrayList arrayList3;
        bg2 bg2Var2;
        ?? r36;
        List<cmi> list2;
        LinkedHashMap linkedHashMap5;
        int i;
        List list3;
        List list4;
        int size;
        int i2;
        long j;
        LinkedHashMap linkedHashMap6;
        LinkedHashMap linkedHashMap7;
        cmi cmiVar;
        yi0 yi0Var;
        jc2 jc2VarA;
        pg0 pg0Var;
        jc2 jc2VarA2;
        tw5 tw5VarA;
        Range range;
        fx5 fx5Var;
        Iterator it;
        Iterator it2;
        long[] jArr;
        boolean z2;
        boolean z3;
        Iterator it3;
        Iterator it4;
        yi0 yi0Var2;
        jc2 jc2VarA3;
        pg0 pg0Var2;
        jc2 jc2VarA4;
        tw5 tw5VarA2;
        Range range2;
        fx5 fx5Var2;
        bh0 bh0Var;
        long jLongValue;
        Object obj;
        fx5 fx5Var3;
        ?? arrayList4;
        Size size2;
        LinkedHashMap linkedHashMap8;
        ArrayList<Size> arrayList5;
        Size sizeE;
        pbh pbhVar = this;
        obh obhVar3 = obhVar;
        Map map2 = map;
        boolean z4 = obhVar3.f;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "resolveSpecsBySettings: featureSettings = " + obhVar3);
        }
        boolean z5 = obhVar3.g;
        Range range3 = obhVar3.i;
        r66 r66Var = r66.a;
        String str3 = ". New configs: ";
        String str4 = pbhVar.d;
        String str5 = "No supported surface combination is found for camera device - Id : ";
        if (z5) {
            str = str4;
            str2 = "No supported surface combination is found for camera device - Id : ";
        } else {
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                arrayList6.add(((pg0) it5.next()).a);
            }
            x44 x44Var = new x44(false);
            for (cmi cmiVar2 : map2.keySet()) {
                String str6 = str5;
                List list5 = (List) map2.get(cmiVar2);
                if (list5 == null || list5.isEmpty()) {
                    qr7.f(46, cmiVar2, "No available output size is found for ");
                    return null;
                }
                Size size3 = (Size) Collections.min(list5, x44Var);
                int inputFormat = cmiVar2.getInputFormat();
                t4h t4hVarK = cmiVar2.K();
                t4h t4hVar = tbh.e;
                arrayList6.add(yr8.q(inputFormat, size3, pbhVar.l(inputFormat), obhVar3.a, 2, t4hVarK));
                str5 = str6;
            }
            str = str4;
            str2 = str5;
            if (!pbhVar.a(obhVar3, arrayList6, s66.a, r66Var, r66Var)) {
                throw new IllegalArgumentException((str2 + str + ". May be attempting to bind too many use cases. Existing surfaces: " + arrayList + ". New configs: " + list + ". GroupableFeature settings: " + obhVar3 + '.').toString());
            }
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        Iterator it6 = map2.keySet().iterator();
        Map map3 = map2;
        while (it6.hasNext()) {
            cmi cmiVar3 = (cmi) it6.next();
            ArrayList arrayList7 = new ArrayList();
            Iterator it7 = it6;
            LinkedHashMap linkedHashMap10 = new LinkedHashMap();
            for (Size size4 : (List) map3.get(cmiVar3)) {
                r66 r66Var2 = r66Var;
                int inputFormat2 = cmiVar3.getInputFormat();
                int iN = cmiVar3.N(size4);
                t4h t4hVarK2 = cmiVar3.K();
                t4h t4hVar2 = tbh.e;
                String str7 = str3;
                rbh rbhVar = yr8.q(inputFormat2, size4, pbhVar.l(inputFormat2), obhVar3.a, obhVar3.h ? 1 : 2, t4hVarK2).b;
                String str8 = str;
                Range range4 = yi0.h;
                int iD = cqk.d(range3, range4) ? Integer.MAX_VALUE : pbhVar.d(inputFormat2, size4, z4, iN);
                if (!z5 || (rbhVar != rbh.NOT_SUPPORT && (cqk.d(range3, range4) || iD >= ((Number) range3.getUpper()).intValue()))) {
                    Set linkedHashSet = (Set) linkedHashMap10.get(rbhVar);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap10.put(rbhVar, linkedHashSet);
                    }
                    if (!linkedHashSet.contains(Integer.valueOf(iD))) {
                        arrayList7.add(size4);
                        linkedHashSet.add(Integer.valueOf(iD));
                    }
                }
                str3 = str7;
                r66Var = r66Var2;
                str = str8;
            }
            linkedHashMap9.put(cmiVar3, arrayList7);
            map3 = map;
            it6 = it7;
        }
        r66 r66Var3 = r66Var;
        String str9 = str;
        String str10 = str3;
        ArrayList arrayList8 = new ArrayList();
        Iterator it8 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            bg2Var = pbhVar.a;
            if (!zHasNext) {
                break;
            }
            int iIntValue = ((Number) it8.next()).intValue();
            List<Size> list6 = (List) linkedHashMap9.get(list.get(iIntValue));
            int inputFormat3 = ((cmi) list.get(iIntValue)).getInputFormat();
            pbhVar.A.getClass();
            Rational rational = ((((Nexus4AndroidLTargetAspectRatioQuirk) uk5.a(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) new ch2(bg2Var, pbhVar.x).a().b(AspectRatioLegacyApi21Quirk.class)) == null) || (size2 = (Size) pbhVar.l(np0.n).f.get(Integer.valueOf(np0.n))) == null) ? null : new Rational(size2.getWidth(), size2.getHeight());
            if (rational == null) {
                arrayList5 = new ArrayList(list6);
                linkedHashMap8 = linkedHashMap9;
            } else {
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                for (Size size5 : list6) {
                    Rational rational2 = ix.a;
                    LinkedHashMap linkedHashMap11 = linkedHashMap9;
                    if (ix.a(size5, rational, mag.c)) {
                        arrayList9.add(size5);
                    } else {
                        arrayList10.add(size5);
                    }
                    linkedHashMap9 = linkedHashMap11;
                }
                linkedHashMap8 = linkedHashMap9;
                arrayList10.addAll(0, arrayList9);
                arrayList5 = arrayList10;
            }
            t4h t4hVar3 = tbh.e;
            sbh sbhVar = (sbh) tbh.h.get(Integer.valueOf(inputFormat3));
            if (sbhVar == null) {
                sbhVar = sbh.a;
            }
            if (((ExtraCroppingQuirk) pbhVar.z.b) != null && (sizeE = ExtraCroppingQuirk.e(sbhVar)) != null) {
                ArrayList arrayList11 = new ArrayList();
                arrayList11.add(sizeE);
                for (Size size6 : arrayList5) {
                    if (!cqk.d(size6, sizeE)) {
                        arrayList11.add(size6);
                    }
                }
                arrayList5 = arrayList11;
            }
            arrayList8.add(arrayList5);
            linkedHashMap9 = linkedHashMap8;
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        qv7 qv7Var = pbhVar.C;
        if (z4) {
            qv7Var.getClass();
            if (arrayList8.isEmpty()) {
                arrayList4 = r66Var3;
            } else {
                List listA = qv7.a(arrayList8);
                arrayList4 = new ArrayList(yw3.W0(listA, 10));
                Iterator it9 = listA.iterator();
                while (it9.hasNext()) {
                    Size size7 = (Size) it9.next();
                    int size8 = arrayList8.size();
                    Iterator it10 = it9;
                    ArrayList arrayList12 = new ArrayList(size8);
                    LinkedHashMap linkedHashMap14 = linkedHashMap12;
                    for (int i3 = 0; i3 < size8; i3++) {
                        arrayList12.add(size7);
                    }
                    arrayList4.add(arrayList12);
                    it9 = it10;
                    linkedHashMap12 = linkedHashMap14;
                }
            }
            linkedHashMap2 = linkedHashMap12;
            r27 = arrayList4;
        } else {
            linkedHashMap2 = linkedHashMap12;
            Iterator it11 = arrayList8.iterator();
            int size9 = 1;
            while (it11.hasNext()) {
                size9 *= ((List) it11.next()).size();
            }
            if (size9 == 0) {
                ore.p("Failed to find supported resolutions.");
                return null;
            }
            ArrayList arrayList13 = new ArrayList();
            for (int i4 = 0; i4 < size9; i4++) {
                arrayList13.add(new ArrayList());
            }
            int size10 = size9 / ((List) arrayList8.get(0)).size();
            int size11 = arrayList8.size();
            int i5 = size9;
            int size12 = size10;
            int i6 = 0;
            while (i6 < size11) {
                int i7 = size11;
                List list7 = (List) arrayList8.get(i6);
                LinkedHashMap linkedHashMap15 = linkedHashMap13;
                int i8 = 0;
                while (i8 < size9) {
                    ((List) arrayList13.get(i8)).add(list7.get((i8 % i5) / size12));
                    i8++;
                    arrayList13 = arrayList13;
                    size9 = size9;
                }
                ArrayList arrayList14 = arrayList13;
                int i9 = size9;
                if (i6 < arrayList8.size() - 1) {
                    i5 = size12;
                    size12 /= ((List) arrayList8.get(i6 + 1)).size();
                }
                i6++;
                size11 = i7;
                linkedHashMap13 = linkedHashMap15;
                arrayList13 = arrayList14;
                size9 = i9;
            }
            r27 = arrayList13;
        }
        LinkedHashMap linkedHashMap16 = linkedHashMap13;
        bh0 bh0Var2 = v4h.a;
        Iterator it12 = arrayList.iterator();
        while (true) {
            if (!it12.hasNext()) {
                Iterator it13 = list.iterator();
                while (true) {
                    if (!it13.hasNext()) {
                        z = false;
                        break;
                    }
                    cmi cmiVar4 = (cmi) it13.next();
                    if (v4h.c(cmiVar4, cmiVar4.L())) {
                    }
                }
            } else {
                pg0 pg0Var3 = (pg0) it12.next();
                if (v4h.c(pg0Var3.f, (emi) pg0Var3.e.get(0))) {
                }
            }
            z = true;
            break;
        }
        if (!pbhVar.r || z) {
            obhVar2 = obhVar3;
            linkedHashMap3 = linkedHashMap2;
            linkedHashMap4 = linkedHashMap16;
            listF = null;
        } else {
            Iterator it14 = r27.iterator();
            listF = null;
            while (true) {
                if (!it14.hasNext()) {
                    obhVar2 = obhVar3;
                    linkedHashMap3 = linkedHashMap2;
                    linkedHashMap4 = linkedHashMap16;
                    break;
                }
                obh obhVar4 = obhVar3;
                obhVar2 = obhVar4;
                LinkedHashMap linkedHashMap17 = linkedHashMap2;
                LinkedHashMap linkedHashMap18 = linkedHashMap16;
                linkedHashMap3 = linkedHashMap17;
                linkedHashMap4 = linkedHashMap18;
                listF = pbhVar.f(obhVar2, pbhVar.k(obhVar4.a, arrayList, (List) it14.next(), list, arrayList2, linkedHashMap17, linkedHashMap18, false), linkedHashMap3, linkedHashMap4);
                if (listF != null) {
                    break;
                }
                linkedHashMap3.clear();
                linkedHashMap4.clear();
                linkedHashMap2 = linkedHashMap3;
                linkedHashMap16 = linkedHashMap4;
                obhVar3 = obhVar2;
            }
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "orderedSurfaceConfigListForStreamUseCase = " + listF);
            }
        }
        Iterator it15 = arrayList.iterator();
        int iMin = Integer.MAX_VALUE;
        while (it15.hasNext()) {
            pg0 pg0Var4 = (pg0) it15.next();
            iMin = Math.min(iMin, pbhVar.d(pg0Var4.b, pg0Var4.c, z4, pg0Var4.j));
        }
        Iterator it16 = r27.iterator();
        List list8 = null;
        List list9 = null;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        boolean z6 = false;
        boolean z7 = false;
        while (true) {
            if (!it16.hasNext()) {
                arrayList3 = arrayList2;
                linkedHashMap3 = linkedHashMap3;
                linkedHashMap4 = linkedHashMap4;
                bg2Var2 = bg2Var;
                r36 = z4;
                qv7Var = qv7Var;
                str2 = str2;
                list2 = list;
                linkedHashMap5 = linkedHashMap;
                i10 = i10;
                listF = listF;
                obhVar2 = obhVar2;
                i = i11;
                list3 = list8;
                list4 = list9;
                break;
            }
            List list10 = (List) it16.next();
            int i12 = i11;
            LinkedHashMap linkedHashMap19 = new LinkedHashMap();
            LinkedHashMap linkedHashMap20 = new LinkedHashMap();
            int i13 = i10;
            int i14 = obhVar2.a;
            boolean z8 = obhVar2.h;
            linkedHashMap4 = linkedHashMap4;
            int i15 = iMin;
            bg2Var2 = bg2Var;
            linkedHashMap3 = linkedHashMap3;
            i10 = i13;
            List list11 = list;
            qv7Var = qv7Var;
            str2 = str2;
            listF = listF;
            ArrayList arrayListK = pbhVar.k(i14, arrayList, list10, list11, arrayList2, linkedHashMap19, linkedHashMap20, z8);
            Iterator it17 = list10.iterator();
            int iMin2 = i15;
            int i16 = 0;
            while (it17.hasNext()) {
                int i17 = i16 + 1;
                Iterator it18 = it17;
                Size size13 = (Size) it17.next();
                cmi cmiVar5 = (cmi) list11.get(((Number) arrayList2.get(i16)).intValue());
                iMin2 = Math.min(iMin2, pbhVar.d(cmiVar5.getInputFormat(), size13, z4, cmiVar5.N(size13)));
                list11 = list;
                i16 = i17;
                it17 = it18;
            }
            boolean z9 = cqk.d(range3, yi0.h) || iMin2 >= i15 || iMin2 >= ((Number) range3.getUpper()).intValue();
            LinkedHashMap linkedHashMap21 = new LinkedHashMap();
            Iterator it19 = arrayListK.iterator();
            int i18 = 0;
            while (it19.hasNext()) {
                Object next = it19.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    xw3.V0();
                    throw null;
                }
                tbh tbhVar = (tbh) next;
                Iterator it20 = it19;
                pg0 pg0Var5 = (pg0) linkedHashMap19.get(Integer.valueOf(i18));
                if (pg0Var5 == null || (fx5Var3 = pg0Var5.d) == null) {
                    Object obj2 = linkedHashMap.get(linkedHashMap20.get(Integer.valueOf(i18)));
                    if (obj2 == null) {
                        ore.p("Required value was null.");
                        return null;
                    }
                    fx5Var3 = (fx5) obj2;
                }
                linkedHashMap21.put(tbhVar, fx5Var3);
                it19 = it20;
                i18 = i19;
            }
            boolean z10 = z4;
            linkedHashMap5 = linkedHashMap;
            iMin = i15;
            lbh lbhVar = new lbh(this, obhVar, arrayListK, linkedHashMap21, list, arrayList2);
            pbhVar = this;
            obhVar2 = obhVar;
            list2 = list;
            arrayList3 = arrayList2;
            ny8 ny8VarP = rx8.P(3, lbhVar);
            if (z6 || !((Boolean) ny8VarP.getValue()).booleanValue()) {
                if (listF != null || z7 || pbhVar.f(obhVar2, arrayListK, linkedHashMap19, linkedHashMap20) == null) {
                    i11 = i12;
                } else {
                    if (i12 != Integer.MAX_VALUE && i12 >= iMin2) {
                        i11 = i12;
                    } else {
                        i11 = iMin2;
                        list9 = list10;
                    }
                    if (z9) {
                        if (z6) {
                            i = iMin2;
                            list3 = list8;
                            list4 = list10;
                            r36 = z10;
                            break;
                        }
                        obhVar2 = obhVar2;
                        i11 = iMin2;
                        i10 = i10;
                        listF = listF;
                        z7 = true;
                        list9 = list10;
                    }
                    z4 = z10 ? 1 : 0;
                    bg2Var = bg2Var2;
                }
                z4 = z10 ? 1 : 0;
                bg2Var = bg2Var2;
            } else {
                if (i10 == Integer.MAX_VALUE || i10 < iMin2) {
                    i10 = iMin2;
                    list8 = list10;
                }
                if (!z9) {
                    if (listF != null) {
                        i11 = i12;
                    } else {
                        i11 = i12;
                    }
                    z4 = z10 ? 1 : 0;
                    bg2Var = bg2Var2;
                } else {
                    if (z7) {
                        i10 = iMin2;
                        i = i12;
                        list4 = list9;
                        list3 = list10;
                        r36 = z10;
                        break;
                    }
                    i10 = iMin2;
                    z6 = true;
                    list8 = list10;
                    if (listF != null) {
                        i11 = i12;
                    } else {
                        i11 = i12;
                    }
                    z4 = z10 ? 1 : 0;
                    bg2Var = bg2Var2;
                }
            }
        }
        mbh mbhVar = (list3 != null && (z5 == 0 || cqk.d(range3, yi0.h) || (i10 != Integer.MAX_VALUE && i10 >= ((Number) range3.getUpper()).intValue()))) ? new mbh(list3, list4, i10, i, Integer.MAX_VALUE) : null;
        if (mbhVar == null) {
            StringBuilder sbV = qt4.v(str2, str9, " and Hardware level: ");
            sbV.append(pbhVar.e);
            sbV.append(". May be the specified resolution is too large and not supported. Existing surfaces: ");
            sbV.append(arrayList);
            sbV.append(str10);
            sbV.append(list2);
            sbV.append('.');
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        int i20 = mbhVar.c;
        List list12 = mbhVar.a;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "resolveSpecsBySettings: bestSizesAndFps = " + mbhVar);
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        Range rangeC = yi0.h;
        if (cqk.d(range3, rangeC)) {
            qv7 qv7Var2 = qv7Var;
            if (r36 != 0) {
                rangeC = c(qv7.f, i20, qv7Var2.b(list12));
            }
        } else {
            Range[] rangeArrB = r36 != 0 ? qv7Var.b(list12) : (Range[]) ((qb2) bg2Var2).c(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range rangeC2 = c(range3, i20, rangeArrB);
            if ((z5 != 0 || obhVar2.j) && !cqk.d(rangeC2, range3)) {
                StringBuilder sb = new StringBuilder("Target FPS range ");
                sb.append(range3);
                sb.append(" is not supported. Max FPS supported by the calculated best combination: ");
                sb.append(i20);
                sb.append(". Calculated best FPS range for device: ");
                sb.append(rangeC2);
                String string = Arrays.toString(rangeArrB);
                sb.append(". Device supported FPS ranges: ");
                sb.append(string);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            rangeC = rangeC2;
        }
        int i21 = 0;
        for (cmi cmiVar6 : list2) {
            int i22 = i21 + 1;
            tw5 tw5VarA3 = yi0.a((Size) list12.get(arrayList3.indexOf(Integer.valueOf(i21))));
            tw5VarA3.d = Integer.valueOf((int) r36);
            Object obj3 = linkedHashMap5.get(cmiVar6);
            if (obj3 == null) {
                ore.k("Required value was null.");
                return null;
            }
            tw5VarA3.c = (fx5) obj3;
            bh0 bh0Var3 = v4h.a;
            w8b w8bVarE = w8b.e();
            bh0 bh0Var4 = jc2.g;
            if (cmiVar6.f(bh0Var4)) {
                w8bVarE.m(bh0Var4, cmiVar6.i(bh0Var4));
            }
            bh0 bh0Var5 = cmi.e1;
            if (cmiVar6.f(bh0Var5)) {
                w8bVarE.m(bh0Var5, cmiVar6.i(bh0Var5));
            }
            bh0 bh0Var6 = a68.b;
            if (cmiVar6.f(bh0Var6)) {
                w8bVarE.m(bh0Var6, cmiVar6.i(bh0Var6));
            }
            bh0 bh0Var7 = n68.s0;
            if (cmiVar6.f(bh0Var7)) {
                w8bVarE.m(bh0Var7, cmiVar6.i(bh0Var7));
            }
            tw5VarA3.f = new jc2(w8bVarE);
            tw5VarA3.g = Boolean.valueOf(obhVar2.c);
            if (!cqk.d(rangeC, yi0.h)) {
                if (rangeC == null) {
                    ore.n("Null expectedFrameRateRange");
                    return null;
                }
                tw5VarA3.e = rangeC;
            }
            linkedHashMap22.put(cmiVar6, tw5VarA3.j());
            i21 = i22;
            list12 = list12;
        }
        List list13 = list12;
        LinkedHashMap linkedHashMap23 = new LinkedHashMap();
        if (listF != null) {
            List list14 = mbhVar.b;
            if (i20 == mbhVar.d && list13.size() == list14.size()) {
                ArrayList<ylc> arrayListZ1 = ww3.Z1(list13, list14);
                if (arrayListZ1.isEmpty()) {
                    bh0 bh0Var8 = v4h.a;
                    if (Build.VERSION.SDK_INT < 33) {
                        bh0 bh0Var9 = v4h.a;
                        size = listF.size();
                        i2 = 0;
                        while (i2 < size) {
                            j = ((tbh) listF.get(i2)).c.a;
                            linkedHashMap6 = linkedHashMap3;
                            if (linkedHashMap6.containsKey(Integer.valueOf(i2))) {
                                pg0Var = (pg0) linkedHashMap6.get(Integer.valueOf(i2));
                                jc2VarA2 = v4h.a(pg0Var.f, Long.valueOf(j));
                                if (jc2VarA2 != null) {
                                    tw5VarA = yi0.a(pg0Var.c);
                                    tw5VarA.d = Integer.valueOf(pg0Var.g);
                                    range = pg0Var.h;
                                    if (range == null) {
                                        ore.n("Null expectedFrameRateRange");
                                        return null;
                                    }
                                    tw5VarA.e = range;
                                    fx5Var = pg0Var.d;
                                    if (fx5Var == null) {
                                        ore.n("Null dynamicRange");
                                        return null;
                                    }
                                    tw5VarA.c = fx5Var;
                                    tw5VarA.f = jc2VarA2;
                                    linkedHashMap23.put(pg0Var, tw5VarA.j());
                                }
                                linkedHashMap7 = linkedHashMap4;
                            } else {
                                linkedHashMap7 = linkedHashMap4;
                                if (!linkedHashMap7.containsKey(Integer.valueOf(i2))) {
                                    c.e("SurfaceConfig does not map to any use case");
                                    return null;
                                }
                                cmiVar = (cmi) linkedHashMap7.get(Integer.valueOf(i2));
                                yi0Var = (yi0) linkedHashMap22.get(cmiVar);
                                jc2VarA = v4h.a(yi0Var.f, Long.valueOf(j));
                                if (jc2VarA != null) {
                                    tw5 tw5VarB = yi0Var.b();
                                    tw5VarB.f = jc2VarA;
                                    linkedHashMap22.put(cmiVar, tw5VarB.j());
                                }
                            }
                            i2++;
                            linkedHashMap3 = linkedHashMap6;
                            linkedHashMap4 = linkedHashMap7;
                        }
                    } else {
                        ArrayList<cmi> arrayList15 = new ArrayList(linkedHashMap22.keySet());
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((pg0) it.next()).f != null) {
                                ore.k("Required value was null.");
                                return null;
                            }
                        }
                        it2 = arrayList15.iterator();
                        while (it2.hasNext()) {
                            obj = linkedHashMap22.get((cmi) it2.next());
                            if (obj != null) {
                                ore.k("Required value was null.");
                                return null;
                            }
                            if (((yi0) obj).f != null) {
                                ore.k("Required value was null.");
                                return null;
                            }
                        }
                        jArr = (long[]) ((qb2) bg2Var2).c(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
                        if (jArr != null || jArr.length == 0) {
                            bh0 bh0Var10 = v4h.a;
                            size = listF.size();
                            i2 = 0;
                            while (i2 < size) {
                                j = ((tbh) listF.get(i2)).c.a;
                                linkedHashMap6 = linkedHashMap3;
                                if (linkedHashMap6.containsKey(Integer.valueOf(i2))) {
                                    pg0Var = (pg0) linkedHashMap6.get(Integer.valueOf(i2));
                                    jc2VarA2 = v4h.a(pg0Var.f, Long.valueOf(j));
                                    if (jc2VarA2 != null) {
                                        tw5VarA = yi0.a(pg0Var.c);
                                        tw5VarA.d = Integer.valueOf(pg0Var.g);
                                        range = pg0Var.h;
                                        if (range == null) {
                                            ore.n("Null expectedFrameRateRange");
                                            return null;
                                        }
                                        tw5VarA.e = range;
                                        fx5Var = pg0Var.d;
                                        if (fx5Var == null) {
                                            ore.n("Null dynamicRange");
                                            return null;
                                        }
                                        tw5VarA.c = fx5Var;
                                        tw5VarA.f = jc2VarA2;
                                        linkedHashMap23.put(pg0Var, tw5VarA.j());
                                    }
                                    linkedHashMap7 = linkedHashMap4;
                                } else {
                                    linkedHashMap7 = linkedHashMap4;
                                    if (!linkedHashMap7.containsKey(Integer.valueOf(i2))) {
                                        c.e("SurfaceConfig does not map to any use case");
                                        return null;
                                    }
                                    cmiVar = (cmi) linkedHashMap7.get(Integer.valueOf(i2));
                                    yi0Var = (yi0) linkedHashMap22.get(cmiVar);
                                    jc2VarA = v4h.a(yi0Var.f, Long.valueOf(j));
                                    if (jc2VarA != null) {
                                        tw5 tw5VarB2 = yi0Var.b();
                                        tw5VarB2.f = jc2VarA;
                                        linkedHashMap22.put(cmiVar, tw5VarB2.j());
                                    }
                                }
                                i2++;
                                linkedHashMap3 = linkedHashMap6;
                                linkedHashMap4 = linkedHashMap7;
                            }
                        } else {
                            HashSet hashSet = new HashSet();
                            for (long j2 : jArr) {
                                hashSet.add(Long.valueOf(j2));
                            }
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            Iterator it21 = arrayList.iterator();
                            if (it21.hasNext()) {
                                pg0 pg0Var6 = (pg0) it21.next();
                                t94 t94Var = pg0Var6.f;
                                bh0 bh0Var11 = jc2.g;
                                if (t94Var.f(bh0Var11) && ((Number) pg0Var6.f.i(bh0Var11)).longValue() != 0) {
                                    z2 = true;
                                } else {
                                    z3 = true;
                                    z2 = false;
                                }
                                for (cmi cmiVar7 : arrayList15) {
                                    bh0Var = jc2.g;
                                    if (!cmiVar7.f(bh0Var)) {
                                        jLongValue = ((Number) cmiVar7.i(bh0Var)).longValue();
                                        if (jLongValue == 0) {
                                            if (!z3) {
                                                ore.p("Either all use cases must have non-default stream use case assigned or none should have it");
                                                return null;
                                            }
                                            linkedHashSet2.add(Long.valueOf(jLongValue));
                                            z2 = true;
                                        } else if (z2) {
                                            ore.p("Either all use cases must have non-default stream use case assigned or none should have it");
                                            return null;
                                        }
                                    } else if (z2) {
                                        ore.p("Either all use cases must have non-default stream use case assigned or none should have it");
                                        return null;
                                    }
                                    z3 = true;
                                }
                                if (z3) {
                                    bh0 bh0Var12 = v4h.a;
                                    size = listF.size();
                                    i2 = 0;
                                    while (i2 < size) {
                                        j = ((tbh) listF.get(i2)).c.a;
                                        linkedHashMap6 = linkedHashMap3;
                                        if (linkedHashMap6.containsKey(Integer.valueOf(i2))) {
                                            pg0Var = (pg0) linkedHashMap6.get(Integer.valueOf(i2));
                                            jc2VarA2 = v4h.a(pg0Var.f, Long.valueOf(j));
                                            if (jc2VarA2 != null) {
                                                tw5VarA = yi0.a(pg0Var.c);
                                                tw5VarA.d = Integer.valueOf(pg0Var.g);
                                                range = pg0Var.h;
                                                if (range == null) {
                                                    ore.n("Null expectedFrameRateRange");
                                                    return null;
                                                }
                                                tw5VarA.e = range;
                                                fx5Var = pg0Var.d;
                                                if (fx5Var == null) {
                                                    ore.n("Null dynamicRange");
                                                    return null;
                                                }
                                                tw5VarA.c = fx5Var;
                                                tw5VarA.f = jc2VarA2;
                                                linkedHashMap23.put(pg0Var, tw5VarA.j());
                                            }
                                            linkedHashMap7 = linkedHashMap4;
                                        } else {
                                            linkedHashMap7 = linkedHashMap4;
                                            if (!linkedHashMap7.containsKey(Integer.valueOf(i2))) {
                                                c.e("SurfaceConfig does not map to any use case");
                                                return null;
                                            }
                                            cmiVar = (cmi) linkedHashMap7.get(Integer.valueOf(i2));
                                            yi0Var = (yi0) linkedHashMap22.get(cmiVar);
                                            jc2VarA = v4h.a(yi0Var.f, Long.valueOf(j));
                                            if (jc2VarA != null) {
                                                tw5 tw5VarB3 = yi0Var.b();
                                                tw5VarB3.f = jc2VarA;
                                                linkedHashMap22.put(cmiVar, tw5VarB3.j());
                                            }
                                        }
                                        i2++;
                                        linkedHashMap3 = linkedHashMap6;
                                        linkedHashMap4 = linkedHashMap7;
                                    }
                                } else {
                                    it3 = linkedHashSet2.iterator();
                                    do {
                                        if (it3.hasNext()) {
                                            it4 = arrayList.iterator();
                                            while (it4.hasNext()) {
                                                pg0Var2 = (pg0) it4.next();
                                                t94 t94Var2 = pg0Var2.f;
                                                jc2VarA4 = v4h.a(t94Var2, (Long) t94Var2.i(jc2.g));
                                                if (jc2VarA4 != null) {
                                                    tw5VarA2 = yi0.a(pg0Var2.c);
                                                    tw5VarA2.d = Integer.valueOf(pg0Var2.g);
                                                    range2 = pg0Var2.h;
                                                    if (range2 != null) {
                                                        ore.n("Null expectedFrameRateRange");
                                                        return null;
                                                    }
                                                    tw5VarA2.e = range2;
                                                    fx5Var2 = pg0Var2.d;
                                                    if (fx5Var2 != null) {
                                                        ore.n("Null dynamicRange");
                                                        return null;
                                                    }
                                                    tw5VarA2.c = fx5Var2;
                                                    tw5VarA2.f = jc2VarA4;
                                                    linkedHashMap23.put(pg0Var2, tw5VarA2.j());
                                                }
                                            }
                                            for (cmi cmiVar8 : arrayList15) {
                                                yi0Var2 = (yi0) linkedHashMap22.get(cmiVar8);
                                                t94 t94Var3 = yi0Var2.f;
                                                jc2VarA3 = v4h.a(t94Var3, (Long) t94Var3.i(jc2.g));
                                                if (jc2VarA3 != null) {
                                                    tw5 tw5VarB4 = yi0Var2.b();
                                                    tw5VarB4.f = jc2VarA3;
                                                    linkedHashMap22.put(cmiVar8, tw5VarB4.j());
                                                }
                                            }
                                        }
                                    } while (hashSet.contains(Long.valueOf(((Number) it3.next()).longValue())));
                                    bh0 bh0Var13 = v4h.a;
                                    size = listF.size();
                                    i2 = 0;
                                    while (i2 < size) {
                                        j = ((tbh) listF.get(i2)).c.a;
                                        linkedHashMap6 = linkedHashMap3;
                                        if (linkedHashMap6.containsKey(Integer.valueOf(i2))) {
                                            pg0Var = (pg0) linkedHashMap6.get(Integer.valueOf(i2));
                                            jc2VarA2 = v4h.a(pg0Var.f, Long.valueOf(j));
                                            if (jc2VarA2 != null) {
                                                tw5VarA = yi0.a(pg0Var.c);
                                                tw5VarA.d = Integer.valueOf(pg0Var.g);
                                                range = pg0Var.h;
                                                if (range == null) {
                                                    ore.n("Null expectedFrameRateRange");
                                                    return null;
                                                }
                                                tw5VarA.e = range;
                                                fx5Var = pg0Var.d;
                                                if (fx5Var == null) {
                                                    ore.n("Null dynamicRange");
                                                    return null;
                                                }
                                                tw5VarA.c = fx5Var;
                                                tw5VarA.f = jc2VarA2;
                                                linkedHashMap23.put(pg0Var, tw5VarA.j());
                                            }
                                            linkedHashMap7 = linkedHashMap4;
                                        } else {
                                            linkedHashMap7 = linkedHashMap4;
                                            if (!linkedHashMap7.containsKey(Integer.valueOf(i2))) {
                                                c.e("SurfaceConfig does not map to any use case");
                                                return null;
                                            }
                                            cmiVar = (cmi) linkedHashMap7.get(Integer.valueOf(i2));
                                            yi0Var = (yi0) linkedHashMap22.get(cmiVar);
                                            jc2VarA = v4h.a(yi0Var.f, Long.valueOf(j));
                                            if (jc2VarA != null) {
                                                tw5 tw5VarB5 = yi0Var.b();
                                                tw5VarB5.f = jc2VarA;
                                                linkedHashMap22.put(cmiVar, tw5VarB5.j());
                                            }
                                        }
                                        i2++;
                                        linkedHashMap3 = linkedHashMap6;
                                        linkedHashMap4 = linkedHashMap7;
                                    }
                                }
                            } else {
                                z2 = false;
                            }
                            z3 = false;
                            while (r13.hasNext()) {
                                bh0Var = jc2.g;
                                if (!cmiVar7.f(bh0Var)) {
                                    jLongValue = ((Number) cmiVar7.i(bh0Var)).longValue();
                                    if (jLongValue == 0) {
                                        if (!z3) {
                                            ore.p("Either all use cases must have non-default stream use case assigned or none should have it");
                                            return null;
                                        }
                                        linkedHashSet2.add(Long.valueOf(jLongValue));
                                        z2 = true;
                                    } else if (z2) {
                                        ore.p("Either all use cases must have non-default stream use case assigned or none should have it");
                                        return null;
                                    }
                                } else if (z2) {
                                    ore.p("Either all use cases must have non-default stream use case assigned or none should have it");
                                    return null;
                                }
                                z3 = true;
                            }
                            if (z3) {
                                it3 = linkedHashSet2.iterator();
                                do {
                                    if (it3.hasNext()) {
                                        it4 = arrayList.iterator();
                                        while (it4.hasNext()) {
                                            pg0Var2 = (pg0) it4.next();
                                            t94 t94Var4 = pg0Var2.f;
                                            jc2VarA4 = v4h.a(t94Var4, (Long) t94Var4.i(jc2.g));
                                            if (jc2VarA4 != null) {
                                                tw5VarA2 = yi0.a(pg0Var2.c);
                                                tw5VarA2.d = Integer.valueOf(pg0Var2.g);
                                                range2 = pg0Var2.h;
                                                if (range2 != null) {
                                                    ore.n("Null expectedFrameRateRange");
                                                    return null;
                                                }
                                                tw5VarA2.e = range2;
                                                fx5Var2 = pg0Var2.d;
                                                if (fx5Var2 != null) {
                                                    ore.n("Null dynamicRange");
                                                    return null;
                                                }
                                                tw5VarA2.c = fx5Var2;
                                                tw5VarA2.f = jc2VarA4;
                                                linkedHashMap23.put(pg0Var2, tw5VarA2.j());
                                            }
                                        }
                                        while (r0.hasNext()) {
                                            yi0Var2 = (yi0) linkedHashMap22.get(cmiVar8);
                                            t94 t94Var5 = yi0Var2.f;
                                            jc2VarA3 = v4h.a(t94Var5, (Long) t94Var5.i(jc2.g));
                                            if (jc2VarA3 != null) {
                                                tw5 tw5VarB6 = yi0Var2.b();
                                                tw5VarB6.f = jc2VarA3;
                                                linkedHashMap22.put(cmiVar8, tw5VarB6.j());
                                            }
                                        }
                                    }
                                } while (hashSet.contains(Long.valueOf(((Number) it3.next()).longValue())));
                                bh0 bh0Var14 = v4h.a;
                                size = listF.size();
                                i2 = 0;
                                while (i2 < size) {
                                    j = ((tbh) listF.get(i2)).c.a;
                                    linkedHashMap6 = linkedHashMap3;
                                    if (linkedHashMap6.containsKey(Integer.valueOf(i2))) {
                                        pg0Var = (pg0) linkedHashMap6.get(Integer.valueOf(i2));
                                        jc2VarA2 = v4h.a(pg0Var.f, Long.valueOf(j));
                                        if (jc2VarA2 != null) {
                                            tw5VarA = yi0.a(pg0Var.c);
                                            tw5VarA.d = Integer.valueOf(pg0Var.g);
                                            range = pg0Var.h;
                                            if (range == null) {
                                                ore.n("Null expectedFrameRateRange");
                                                return null;
                                            }
                                            tw5VarA.e = range;
                                            fx5Var = pg0Var.d;
                                            if (fx5Var == null) {
                                                ore.n("Null dynamicRange");
                                                return null;
                                            }
                                            tw5VarA.c = fx5Var;
                                            tw5VarA.f = jc2VarA2;
                                            linkedHashMap23.put(pg0Var, tw5VarA.j());
                                        }
                                        linkedHashMap7 = linkedHashMap4;
                                    } else {
                                        linkedHashMap7 = linkedHashMap4;
                                        if (!linkedHashMap7.containsKey(Integer.valueOf(i2))) {
                                            c.e("SurfaceConfig does not map to any use case");
                                            return null;
                                        }
                                        cmiVar = (cmi) linkedHashMap7.get(Integer.valueOf(i2));
                                        yi0Var = (yi0) linkedHashMap22.get(cmiVar);
                                        jc2VarA = v4h.a(yi0Var.f, Long.valueOf(j));
                                        if (jc2VarA != null) {
                                            tw5 tw5VarB7 = yi0Var.b();
                                            tw5VarB7.f = jc2VarA;
                                            linkedHashMap22.put(cmiVar, tw5VarB7.j());
                                        }
                                    }
                                    i2++;
                                    linkedHashMap3 = linkedHashMap6;
                                    linkedHashMap4 = linkedHashMap7;
                                }
                            } else {
                                bh0 bh0Var15 = v4h.a;
                                size = listF.size();
                                i2 = 0;
                                while (i2 < size) {
                                    j = ((tbh) listF.get(i2)).c.a;
                                    linkedHashMap6 = linkedHashMap3;
                                    if (linkedHashMap6.containsKey(Integer.valueOf(i2))) {
                                        pg0Var = (pg0) linkedHashMap6.get(Integer.valueOf(i2));
                                        jc2VarA2 = v4h.a(pg0Var.f, Long.valueOf(j));
                                        if (jc2VarA2 != null) {
                                            tw5VarA = yi0.a(pg0Var.c);
                                            tw5VarA.d = Integer.valueOf(pg0Var.g);
                                            range = pg0Var.h;
                                            if (range == null) {
                                                ore.n("Null expectedFrameRateRange");
                                                return null;
                                            }
                                            tw5VarA.e = range;
                                            fx5Var = pg0Var.d;
                                            if (fx5Var == null) {
                                                ore.n("Null dynamicRange");
                                                return null;
                                            }
                                            tw5VarA.c = fx5Var;
                                            tw5VarA.f = jc2VarA2;
                                            linkedHashMap23.put(pg0Var, tw5VarA.j());
                                        }
                                        linkedHashMap7 = linkedHashMap4;
                                    } else {
                                        linkedHashMap7 = linkedHashMap4;
                                        if (!linkedHashMap7.containsKey(Integer.valueOf(i2))) {
                                            c.e("SurfaceConfig does not map to any use case");
                                            return null;
                                        }
                                        cmiVar = (cmi) linkedHashMap7.get(Integer.valueOf(i2));
                                        yi0Var = (yi0) linkedHashMap22.get(cmiVar);
                                        jc2VarA = v4h.a(yi0Var.f, Long.valueOf(j));
                                        if (jc2VarA != null) {
                                            tw5 tw5VarB8 = yi0Var.b();
                                            tw5VarB8.f = jc2VarA;
                                            linkedHashMap22.put(cmiVar, tw5VarB8.j());
                                        }
                                    }
                                    i2++;
                                    linkedHashMap3 = linkedHashMap6;
                                    linkedHashMap4 = linkedHashMap7;
                                }
                            }
                        }
                    }
                } else {
                    for (ylc ylcVar : arrayListZ1) {
                        if (!cqk.d(ylcVar.a, ylcVar.b)) {
                        }
                    }
                    bh0 bh0Var16 = v4h.a;
                    if (Build.VERSION.SDK_INT < 33) {
                        bh0 bh0Var17 = v4h.a;
                        size = listF.size();
                        i2 = 0;
                        while (i2 < size) {
                            j = ((tbh) listF.get(i2)).c.a;
                            linkedHashMap6 = linkedHashMap3;
                            if (linkedHashMap6.containsKey(Integer.valueOf(i2))) {
                                pg0Var = (pg0) linkedHashMap6.get(Integer.valueOf(i2));
                                jc2VarA2 = v4h.a(pg0Var.f, Long.valueOf(j));
                                if (jc2VarA2 != null) {
                                    tw5VarA = yi0.a(pg0Var.c);
                                    tw5VarA.d = Integer.valueOf(pg0Var.g);
                                    range = pg0Var.h;
                                    if (range == null) {
                                        ore.n("Null expectedFrameRateRange");
                                        return null;
                                    }
                                    tw5VarA.e = range;
                                    fx5Var = pg0Var.d;
                                    if (fx5Var == null) {
                                        ore.n("Null dynamicRange");
                                        return null;
                                    }
                                    tw5VarA.c = fx5Var;
                                    tw5VarA.f = jc2VarA2;
                                    linkedHashMap23.put(pg0Var, tw5VarA.j());
                                }
                                linkedHashMap7 = linkedHashMap4;
                            } else {
                                linkedHashMap7 = linkedHashMap4;
                                if (!linkedHashMap7.containsKey(Integer.valueOf(i2))) {
                                    c.e("SurfaceConfig does not map to any use case");
                                    return null;
                                }
                                cmiVar = (cmi) linkedHashMap7.get(Integer.valueOf(i2));
                                yi0Var = (yi0) linkedHashMap22.get(cmiVar);
                                jc2VarA = v4h.a(yi0Var.f, Long.valueOf(j));
                                if (jc2VarA != null) {
                                    tw5 tw5VarB9 = yi0Var.b();
                                    tw5VarB9.f = jc2VarA;
                                    linkedHashMap22.put(cmiVar, tw5VarB9.j());
                                }
                            }
                            i2++;
                            linkedHashMap3 = linkedHashMap6;
                            linkedHashMap4 = linkedHashMap7;
                        }
                    } else {
                        ArrayList<cmi> arrayList16 = new ArrayList(linkedHashMap22.keySet());
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((pg0) it.next()).f != null) {
                                ore.k("Required value was null.");
                                return null;
                            }
                        }
                        it2 = arrayList16.iterator();
                        while (it2.hasNext()) {
                            obj = linkedHashMap22.get((cmi) it2.next());
                            if (obj != null) {
                                ore.k("Required value was null.");
                                return null;
                            }
                            if (((yi0) obj).f != null) {
                                ore.k("Required value was null.");
                                return null;
                            }
                        }
                        jArr = (long[]) ((qb2) bg2Var2).c(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
                        if (jArr != null) {
                            bh0 bh0Var18 = v4h.a;
                            size = listF.size();
                            i2 = 0;
                            while (i2 < size) {
                                j = ((tbh) listF.get(i2)).c.a;
                                linkedHashMap6 = linkedHashMap3;
                                if (linkedHashMap6.containsKey(Integer.valueOf(i2))) {
                                    pg0Var = (pg0) linkedHashMap6.get(Integer.valueOf(i2));
                                    jc2VarA2 = v4h.a(pg0Var.f, Long.valueOf(j));
                                    if (jc2VarA2 != null) {
                                        tw5VarA = yi0.a(pg0Var.c);
                                        tw5VarA.d = Integer.valueOf(pg0Var.g);
                                        range = pg0Var.h;
                                        if (range == null) {
                                            ore.n("Null expectedFrameRateRange");
                                            return null;
                                        }
                                        tw5VarA.e = range;
                                        fx5Var = pg0Var.d;
                                        if (fx5Var == null) {
                                            ore.n("Null dynamicRange");
                                            return null;
                                        }
                                        tw5VarA.c = fx5Var;
                                        tw5VarA.f = jc2VarA2;
                                        linkedHashMap23.put(pg0Var, tw5VarA.j());
                                    }
                                    linkedHashMap7 = linkedHashMap4;
                                } else {
                                    linkedHashMap7 = linkedHashMap4;
                                    if (!linkedHashMap7.containsKey(Integer.valueOf(i2))) {
                                        c.e("SurfaceConfig does not map to any use case");
                                        return null;
                                    }
                                    cmiVar = (cmi) linkedHashMap7.get(Integer.valueOf(i2));
                                    yi0Var = (yi0) linkedHashMap22.get(cmiVar);
                                    jc2VarA = v4h.a(yi0Var.f, Long.valueOf(j));
                                    if (jc2VarA != null) {
                                        tw5 tw5VarB10 = yi0Var.b();
                                        tw5VarB10.f = jc2VarA;
                                        linkedHashMap22.put(cmiVar, tw5VarB10.j());
                                    }
                                }
                                i2++;
                                linkedHashMap3 = linkedHashMap6;
                                linkedHashMap4 = linkedHashMap7;
                            }
                        } else {
                            bh0 bh0Var19 = v4h.a;
                            size = listF.size();
                            i2 = 0;
                            while (i2 < size) {
                                j = ((tbh) listF.get(i2)).c.a;
                                linkedHashMap6 = linkedHashMap3;
                                if (linkedHashMap6.containsKey(Integer.valueOf(i2))) {
                                    pg0Var = (pg0) linkedHashMap6.get(Integer.valueOf(i2));
                                    jc2VarA2 = v4h.a(pg0Var.f, Long.valueOf(j));
                                    if (jc2VarA2 != null) {
                                        tw5VarA = yi0.a(pg0Var.c);
                                        tw5VarA.d = Integer.valueOf(pg0Var.g);
                                        range = pg0Var.h;
                                        if (range == null) {
                                            ore.n("Null expectedFrameRateRange");
                                            return null;
                                        }
                                        tw5VarA.e = range;
                                        fx5Var = pg0Var.d;
                                        if (fx5Var == null) {
                                            ore.n("Null dynamicRange");
                                            return null;
                                        }
                                        tw5VarA.c = fx5Var;
                                        tw5VarA.f = jc2VarA2;
                                        linkedHashMap23.put(pg0Var, tw5VarA.j());
                                    }
                                    linkedHashMap7 = linkedHashMap4;
                                } else {
                                    linkedHashMap7 = linkedHashMap4;
                                    if (!linkedHashMap7.containsKey(Integer.valueOf(i2))) {
                                        c.e("SurfaceConfig does not map to any use case");
                                        return null;
                                    }
                                    cmiVar = (cmi) linkedHashMap7.get(Integer.valueOf(i2));
                                    yi0Var = (yi0) linkedHashMap22.get(cmiVar);
                                    jc2VarA = v4h.a(yi0Var.f, Long.valueOf(j));
                                    if (jc2VarA != null) {
                                        tw5 tw5VarB11 = yi0Var.b();
                                        tw5VarB11.f = jc2VarA;
                                        linkedHashMap22.put(cmiVar, tw5VarB11.j());
                                    }
                                }
                                i2++;
                                linkedHashMap3 = linkedHashMap6;
                                linkedHashMap4 = linkedHashMap7;
                            }
                        }
                    }
                }
            }
        }
        return new jch(linkedHashMap22, linkedHashMap23, mbhVar.e);
    }

    public final void o(LinkedHashMap linkedHashMap, int i, Rational rational) {
        Size sizeE = e((StreamConfigurationMap) this.x.c.b, i, true, rational);
        if (sizeE != null) {
            linkedHashMap.put(Integer.valueOf(i), sizeE);
        }
    }

    public final void p(LinkedHashMap linkedHashMap, Size size, int i) {
        if (this.q) {
            Size sizeE = e((StreamConfigurationMap) this.x.c.b, i, false, null);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeE != null) {
                size = (Size) Collections.min(xw3.P0(size, sizeE), new x44(false));
            }
            linkedHashMap.put(numValueOf, size);
        }
    }

    public final void q(obh obhVar) {
        int i = obhVar.a;
        boolean z = obhVar.g;
        String str = "CONCURRENT_CAMERA";
        String str2 = this.d;
        if (i != 0 && obhVar.e) {
            StringBuilder sbV = qt4.v("Camera device Id is ", str2, ". Ultra HDR is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            c.o(zo5.w(sbV, str, " camera mode."));
            return;
        }
        if (i != 0 && obhVar.b == 10) {
            StringBuilder sbV2 = qt4.v("Camera device Id is ", str2, ". 10 bit dynamic range is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            c.o(zo5.w(sbV2, str, " camera mode."));
            return;
        }
        if (i != 0 && z) {
            StringBuilder sbV3 = qt4.v("Camera device Id is ", str2, ". feature combination is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            c.o(zo5.w(sbV3, str, " camera mode."));
            return;
        }
        boolean z2 = obhVar.f;
        if (z2 && z) {
            ore.p("High-speed session is not supported with feature combination");
        } else {
            if (!z2 || ((Boolean) this.C.b.getValue()).booleanValue()) {
                return;
            }
            ore.p("High-speed session is not supported on this device.");
        }
    }
}
