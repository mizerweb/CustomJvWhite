package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class we2 {
    public final yc2 a;
    public final zx3 b;
    public final qd2 c;
    public final ch2 d;
    public final a2k e;
    public final plh f;
    public final bg2 g;
    public final ui2 h;
    public final uvc i;
    public final ks9 j = new ks9(9);
    public final DynamicRangeProfiles k;

    public we2(yc2 yc2Var, zx3 zx3Var, qd2 qd2Var, ch2 ch2Var, a2k a2kVar, plh plhVar, bg2 bg2Var, ui2 ui2Var, uvc uvcVar) {
        this.a = yc2Var;
        this.b = zx3Var;
        this.c = qd2Var;
        this.d = ch2Var;
        this.e = a2kVar;
        this.f = plhVar;
        this.g = bg2Var;
        this.h = ui2Var;
        this.i = uvcVar;
        int i = Build.VERSION.SDK_INT;
        DynamicRangeProfiles dynamicRangeProfilesA = null;
        if (i >= 33 && bg2Var != null) {
            b1k b1kVarA = hvl.a(bg2Var);
            if (i < 33) {
                ore.c(c0a.k(i, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API ", " (requires API 33)"));
                throw null;
            }
            dynamicRangeProfilesA = ((kx5) b1kVarA.b).a();
        }
        this.k = dynamicRangeProfilesA;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0346  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0139  */
    /* JADX WARN: Code duplicated, block: B:55:0x0141  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:58:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0153  */
    /* JADX WARN: Code duplicated, block: B:63:0x0163  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0198  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x020b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0219  */
    /* JADX WARN: Code duplicated, block: B:95:0x022b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0231  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0198, please report this as an issue */
    public final ve2 a(int i, lmf lmfVar, boolean z, iq7 iq7Var, Integer num, Map map, Map map2) {
        ArrayList arrayList;
        boolean z2;
        LinkedHashMap linkedHashMap;
        int i2;
        ai2 ai2Var;
        ArrayList arrayList2;
        ai2 ai2Var2;
        String str;
        zjc zjcVar;
        zjc zjcVar2;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList3;
        yjc yjcVar;
        String str2;
        zjc zjcVar3;
        zjc zjcVar4;
        l6m l6mVar;
        akc akcVar;
        bkc bkcVar;
        xjc xjcVarD;
        ai2 ai2Var3;
        LinkedHashMap linkedHashMap3;
        List list;
        Long l;
        bkc bkcVar2;
        Long l2;
        akc akcVar2;
        long[] jArr;
        Class cls;
        l6m l6mVar2;
        l6m l6mVar3 = l6m.k;
        Integer num2 = 0;
        boolean z3 = i == 2;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList();
        boolean z4 = z3;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        if (lmfVar != null) {
            hl2 hl2Var = lmfVar.g;
            uvc uvcVar = this.i;
            if (uvcVar != null) {
                ((uf2) uvcVar.b).a.a = ww3.T1(lmfVar.c);
                ((i40) ((xp9) uvcVar.c).c).a = ww3.T1(lmfVar.d);
            }
            int i3 = hl2Var.c;
            if (i3 == -1) {
                i3 = 1;
            }
            linkedHashMap5.putAll(this.f.b(new pme(i3)));
            linkedHashMap5.putAll(shl.c(hl2Var.b));
            if (i == 2) {
                linkedHashMap5.put(mg2.a, num);
            }
            String str3 = (String) lmfVar.g.b.b(jc2.i, null);
            Iterator it = lmfVar.a.iterator();
            ai2 ai2Var4 = null;
            while (it.hasNext()) {
                ui0 ui0Var = (ui0) it.next();
                l6m l6mVar4 = l6mVar3;
                wf5 wf5Var = ui0Var.a;
                int i4 = i3;
                int i5 = ui0Var.d;
                String str4 = str3;
                String str5 = str3 == null ? null : str4;
                fx5 fx5Var = ui0Var.e;
                int i6 = ui0Var.c;
                boolean z5 = z4;
                int i7 = Build.VERSION.SDK_INT;
                Iterator it2 = it;
                if (i7 >= 33) {
                    linkedHashMap2 = linkedHashMap4;
                    arrayList3 = arrayList4;
                    yjc yjcVar2 = new yjc(1L);
                    DynamicRangeProfiles dynamicRangeProfiles = this.k;
                    if (dynamicRangeProfiles == null) {
                        yjcVar = yjcVar2;
                    } else {
                        Long lA = gx5.a(fx5Var, dynamicRangeProfiles);
                        if (lA != null) {
                            yjcVar = new yjc(lA.longValue());
                        } else {
                            if (tvj.f(6, "CXCP")) {
                                Log.e("CXCP", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n " + fx5Var);
                            }
                            yjcVar = yjcVar2;
                        }
                    }
                } else {
                    linkedHashMap2 = linkedHashMap4;
                    arrayList3 = arrayList4;
                    yjcVar = null;
                }
                Size size = wf5Var.h;
                int i8 = wf5Var.i;
                if (str5 == null) {
                    str2 = null;
                } else {
                    ef2.a(str5);
                    str2 = str5;
                }
                if (i6 != 0) {
                    if (i6 != 1) {
                        zjcVar4 = null;
                    } else {
                        zjcVar3 = new zjc(2);
                    }
                    if (z) {
                        cls = ui0Var.a.j;
                        if (cqk.d(cls, MediaCodec.class)) {
                            l6mVar2 = l6m.o;
                        } else if (cqk.d(cls, SurfaceHolder.class)) {
                            l6mVar2 = l6m.l;
                        } else if (cqk.d(cls, SurfaceTexture.class)) {
                            l6mVar2 = l6m.m;
                        } else {
                            l6mVar = l6mVar4;
                        }
                        l6mVar = l6mVar2;
                    } else {
                        l6mVar = l6mVar4;
                    }
                    if (z5) {
                        akcVar = null;
                    } else {
                        bg2 bg2Var = this.g;
                        l2 = (Long) map.get(wf5Var);
                        if (l2 != null) {
                            akcVar2 = new akc(l2.longValue());
                        } else {
                            akcVar2 = null;
                        }
                        if (i7 >= 33 || akcVar2 == null || bg2Var == null || (jArr = (long[]) ((qb2) bg2Var).c(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || !a.M0(akcVar2.a, jArr)) {
                            if (tvj.f(5, "CXCP")) {
                                Log.w("CXCP", "Expected stream use case for " + wf5Var + ", " + akcVar2 + " cannot be set!");
                            }
                            akcVar2 = null;
                        }
                        akcVar = akcVar2;
                    }
                    if (z5) {
                        bkcVar = null;
                    } else {
                        l = (Long) map2.get(wf5Var);
                        if (l != null) {
                            bkcVar2 = new bkc(l.longValue());
                        } else {
                            bkcVar2 = null;
                        }
                        bkcVar = bkcVar2;
                    }
                    xjcVarD = nv8.d(i8, 544, yjcVar, zjcVar4, akcVar, bkcVar, size, str2, l6mVar);
                    for (wf5 wf5Var2 : ww3.H1(wf5Var, ui0Var.b)) {
                        ai2Var3 = new ai2(Collections.singletonList(xjcVarD));
                        linkedHashMap6.put(ai2Var3, wf5Var2);
                        if (i5 != -1) {
                            linkedHashMap3 = linkedHashMap2;
                            list = (List) linkedHashMap3.get(Integer.valueOf(i5));
                            if (list == null) {
                                linkedHashMap3.put(Integer.valueOf(i5), xw3.R0(ai2Var3));
                            } else {
                                list.add(ai2Var3);
                            }
                        } else {
                            linkedHashMap3 = linkedHashMap2;
                        }
                        if (!cqk.d(wf5Var2, wf5Var) && this.e.g(wf5Var2, lmfVar)) {
                            ai2Var4 = ai2Var3;
                        }
                        linkedHashMap2 = linkedHashMap3;
                        i5 = i5;
                    }
                    str3 = str4;
                    l6mVar3 = l6mVar4;
                    i3 = i4;
                    z4 = z5;
                    it = it2;
                    linkedHashMap4 = linkedHashMap2;
                    arrayList4 = arrayList3;
                } else {
                    zjcVar3 = new zjc(1);
                }
                zjcVar4 = zjcVar3;
                if (z) {
                    cls = ui0Var.a.j;
                    if (cqk.d(cls, MediaCodec.class)) {
                        l6mVar2 = l6m.o;
                    } else if (cqk.d(cls, SurfaceHolder.class)) {
                        l6mVar2 = l6m.l;
                    } else if (cqk.d(cls, SurfaceTexture.class)) {
                        l6mVar2 = l6m.m;
                    } else {
                        l6mVar = l6mVar4;
                    }
                    l6mVar = l6mVar2;
                } else {
                    l6mVar = l6mVar4;
                }
                if (z5) {
                    bg2 bg2Var2 = this.g;
                    l2 = (Long) map.get(wf5Var);
                    if (l2 != null) {
                        akcVar2 = new akc(l2.longValue());
                    } else {
                        akcVar2 = null;
                    }
                    if (i7 >= 33) {
                        if (tvj.f(5, "CXCP")) {
                            Log.w("CXCP", "Expected stream use case for " + wf5Var + ", " + akcVar2 + " cannot be set!");
                        }
                        akcVar2 = null;
                    } else {
                        if (tvj.f(5, "CXCP")) {
                            Log.w("CXCP", "Expected stream use case for " + wf5Var + ", " + akcVar2 + " cannot be set!");
                        }
                        akcVar2 = null;
                    }
                    akcVar = akcVar2;
                } else {
                    akcVar = null;
                }
                if (z5) {
                    l = (Long) map2.get(wf5Var);
                    if (l != null) {
                        bkcVar2 = new bkc(l.longValue());
                    } else {
                        bkcVar2 = null;
                    }
                    bkcVar = bkcVar2;
                } else {
                    bkcVar = null;
                }
                xjcVarD = nv8.d(i8, 544, yjcVar, zjcVar4, akcVar, bkcVar, size, str2, l6mVar);
                while (r6.hasNext()) {
                    ai2Var3 = new ai2(Collections.singletonList(xjcVarD));
                    linkedHashMap6.put(ai2Var3, wf5Var2);
                    if (i5 != -1) {
                        linkedHashMap3 = linkedHashMap2;
                        list = (List) linkedHashMap3.get(Integer.valueOf(i5));
                        if (list == null) {
                            linkedHashMap3.put(Integer.valueOf(i5), xw3.R0(ai2Var3));
                        } else {
                            list.add(ai2Var3);
                        }
                    } else {
                        linkedHashMap3 = linkedHashMap2;
                    }
                    if (!cqk.d(wf5Var2, wf5Var)) {
                    }
                    linkedHashMap2 = linkedHashMap3;
                    i5 = i5;
                }
                str3 = str4;
                l6mVar3 = l6mVar4;
                i3 = i4;
                z4 = z5;
                it = it2;
                linkedHashMap4 = linkedHashMap2;
                arrayList4 = arrayList3;
            }
            int i9 = i3;
            ArrayList arrayList5 = arrayList4;
            z2 = z4;
            linkedHashMap = linkedHashMap4;
            if (lmfVar.i == null || ai2Var4 == null) {
                arrayList = arrayList5;
            } else {
                arrayList = arrayList5;
                arrayList.add(new fi8(ai2Var4, ((xjc) ww3.K1(ai2Var4.a)).b));
            }
            i2 = i9;
        } else {
            arrayList = arrayList4;
            z2 = z4;
            linkedHashMap = linkedHashMap4;
            i2 = 1;
        }
        ch2 ch2Var = this.d;
        if (ch2Var.a().a(CaptureSessionStuckQuirk.class) && tvj.f(3, "CXCP")) {
            Log.d("CXCP", "CameraPipe should be enabling CaptureSessionStuckQuirk by default");
        }
        boolean zK0 = z5h.K0(Build.MODEL.toLowerCase(Locale.getDefault()), "cph", false);
        ue2 ue2Var = new ue2((!z2 || uk5.a(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class) == null) && uk5.a(DisableAbortCapturesOnStopQuirk.class) == null && Build.VERSION.SDK_INT >= 30, new ww6(ch2Var.a().a(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class) ? 1 : 0, 1), zK0 ? 1 : 0, ((CloseCameraDeviceOnCameraGraphCloseQuirk) this.j.b) != null ? (CloseCameraDeviceOnCameraGraphCloseQuirk.c || !(!CloseCameraDeviceOnCameraGraphCloseQuirk.e || CloseCameraDeviceOnCameraGraphCloseQuirk.a || CloseCameraDeviceOnCameraGraphCloseQuirk.b)) ? z2 : true : false, 9);
        if (lmfVar != null) {
            hl2 hl2Var2 = lmfVar.g;
            Integer num3 = (Integer) hl2Var2.b.b(cmi.h1, num2);
            Objects.requireNonNull(num3);
            int iIntValue = num3.intValue();
            Integer num4 = (Integer) hl2Var2.b.b(cmi.i1, num2);
            Objects.requireNonNull(num4);
            int iIntValue2 = num4.intValue();
            if (iIntValue != 1 && iIntValue2 != 1) {
                if (iIntValue == 2) {
                    num2 = 2;
                } else if (iIntValue2 == 2) {
                    num2 = 1;
                } else {
                    num2 = null;
                }
            }
        } else {
            num2 = null;
        }
        Range rangeA = lmfVar != null ? lmfVar.g.a() : null;
        if (cqk.d(rangeA, yi0.h)) {
            rangeA = null;
        }
        ul9 ul9Var = new ul9();
        if (z2) {
            ul9Var.put(mg2.c, Boolean.TRUE);
        }
        if (num2 != null) {
            ul9Var.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(num2.intValue()));
        }
        ul9Var.put(mg2.b, "android.hardware.camera2.CaptureRequest.setTag.CX");
        if (rangeA != null) {
            ul9Var.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeA);
        }
        ul9 ul9VarB = ul9Var.b();
        if (rangeA != null) {
            linkedHashMap5.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeA);
        }
        if (num2 != null) {
            linkedHashMap5.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num2);
        }
        if (lmfVar != null) {
            String str6 = (String) lmfVar.g.b.b(jc2.i, null);
            ui0 ui0Var2 = lmfVar.b;
            if (ui0Var2 != null) {
                wf5 wf5Var3 = ui0Var2.a;
                if (str6 == null) {
                    str6 = null;
                }
                int i10 = ui0Var2.c;
                Size size2 = wf5Var3.h;
                int i11 = wf5Var3.i;
                if (str6 == null) {
                    str = null;
                } else {
                    ef2.a(str6);
                    str = str6;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        zjcVar2 = null;
                    } else {
                        zjcVar = new zjc(2);
                    }
                    ai2Var2 = new ai2(Collections.singletonList(nv8.d(i11, 1000, null, zjcVar2, null, null, size2, str, null)));
                    linkedHashMap6.put(ai2Var2, wf5Var3);
                } else {
                    zjcVar = new zjc(1);
                }
                zjcVar2 = zjcVar;
                ai2Var2 = new ai2(Collections.singletonList(nv8.d(i11, 1000, null, zjcVar2, null, null, size2, str, null)));
                linkedHashMap6.put(ai2Var2, wf5Var3);
            } else {
                ai2Var2 = null;
            }
            ai2Var = ai2Var2;
        } else {
            ai2Var = null;
        }
        ui2 ui2Var = this.h;
        if (ui2Var != null) {
            arrayList2 = null;
            if (ui2Var.a.b(ub2.a, null) != null) {
                ore.m();
                return null;
            }
        } else {
            arrayList2 = null;
        }
        return new ve2(new se2(this.c.a, ww3.T1(linkedHashMap6.keySet()), ww3.T1(linkedHashMap.values()), arrayList.isEmpty() ? arrayList2 : arrayList, ai2Var, i2, linkedHashMap5, i, ul9VarB, xw3.P0(this.a, this.b), xw3.Q0(iq7Var), ue2Var), wm9.X0(linkedHashMap6));
    }

    public final String toString() {
        return "CameraGraphConfigProvider<" + ((Object) ef2.b(this.c.a)) + '>';
    }
}
