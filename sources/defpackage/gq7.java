package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gq7 {
    public final i40 a = gvk.c(new djg(null, null, null, null, null, null, null, null, null, null));

    /* JADX WARN: Code duplicated, block: B:64:0x0088  */
    /* JADX WARN: Code duplicated, block: B:73:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00b6  */
    public static void b(gq7 gq7Var, oe oeVar, pe peVar, ql0 ql0Var, jx6 jx6Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        List list4;
        List list5;
        List list6;
        oe oeVar2 = (i & 1) != 0 ? null : oeVar;
        pe peVar2 = (i & 2) != 0 ? null : peVar;
        ql0 ql0Var2 = (i & 4) != 0 ? null : ql0Var;
        jx6 jx6Var2 = (i & 8) != 0 ? null : jx6Var;
        List list7 = (i & 16) != 0 ? null : list;
        List list8 = (i & 32) != 0 ? null : list2;
        List list9 = (i & 64) != 0 ? null : list3;
        Boolean bool4 = (i & np0.m) != 0 ? null : bool;
        Boolean bool5 = (i & np0.n) != 0 ? null : bool2;
        Boolean bool6 = (i & np0.o) != 0 ? null : bool3;
        i40 i40Var = gq7Var.a;
        while (true) {
            Object obj = i40Var.a;
            djg djgVar = (djg) obj;
            oe oeVar3 = oeVar2 == null ? djgVar.a : oeVar2;
            pe peVar3 = peVar2 == null ? djgVar.b : peVar2;
            ql0 ql0Var3 = ql0Var2 == null ? djgVar.c : ql0Var2;
            Boolean bool7 = bool6;
            jx6 jx6Var3 = jx6Var2 == null ? djgVar.d : jx6Var2;
            if (list7 != null) {
                List list10 = list7;
                if (list10.isEmpty()) {
                    list10 = null;
                }
                list4 = list10;
                if (list4 == null) {
                    list4 = djgVar.e;
                }
            } else {
                list4 = djgVar.e;
            }
            if (list8 != null) {
                List list11 = list8;
                if (list11.isEmpty()) {
                    list11 = null;
                }
                list5 = list11;
                if (list5 == null) {
                    list5 = djgVar.f;
                }
            } else {
                list5 = djgVar.f;
            }
            if (list9 != null) {
                List list12 = list9;
                if (list12.isEmpty()) {
                    list12 = null;
                }
                list6 = list12;
                if (list6 == null) {
                    list6 = djgVar.g;
                }
            } else {
                list6 = djgVar.g;
            }
            Boolean bool8 = bool4 == null ? djgVar.h : bool4;
            Boolean bool9 = bool5 == null ? djgVar.i : bool5;
            Boolean bool10 = bool7 == null ? djgVar.j : bool7;
            djgVar.getClass();
            if (i40Var.a(obj, new djg(oeVar3, peVar3, ql0Var3, jx6Var3, list4, list5, list6, bool8, bool9, bool10))) {
                return;
            } else {
                bool6 = bool7;
            }
        }
    }

    public final LinkedHashMap a() {
        djg djgVar = (djg) this.a.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        oe oeVar = djgVar.a;
        if (oeVar != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(oeVar.a));
        }
        pe peVar = djgVar.b;
        if (peVar != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(peVar.a));
        }
        ql0 ql0Var = djgVar.c;
        if (ql0Var != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(ql0Var.a));
        }
        jx6 jx6Var = djgVar.d;
        if (jx6Var != null) {
            linkedHashMap.put(CaptureRequest.FLASH_MODE, Integer.valueOf(jx6Var.a));
        }
        List list = djgVar.e;
        if (list != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_REGIONS, list.toArray(new MeteringRectangle[0]));
        }
        List list2 = djgVar.f;
        if (list2 != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AF_REGIONS, list2.toArray(new MeteringRectangle[0]));
        }
        List list3 = djgVar.g;
        if (list3 != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_REGIONS, list3.toArray(new MeteringRectangle[0]));
        }
        Boolean bool = djgVar.h;
        if (bool != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_LOCK, bool);
        }
        Boolean bool2 = djgVar.j;
        if (bool2 != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_LOCK, bool2);
        }
        return linkedHashMap;
    }
}
