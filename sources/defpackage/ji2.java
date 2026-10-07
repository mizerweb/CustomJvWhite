package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ji2 {
    public static final ji2 a = new ji2();

    public void a(cmi cmiVar, j28 j28Var) {
        hl2 hl2Var = (hl2) cmiVar.b(cmi.W0, null);
        dhc dhcVar = dhc.c;
        bh0 bh0Var = hl2.f;
        HashSet hashSet = new HashSet();
        w8b w8bVarE = w8b.e();
        ArrayList arrayList = new ArrayList();
        g9b g9bVarA = g9b.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        dhc dhcVarA = dhc.a(w8bVarE);
        ArrayList arrayList3 = new ArrayList(arrayList);
        ghh ghhVar = ghh.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = g9bVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i = -1;
        new hl2(arrayList2, dhcVarA, -1, arrayList3, new ghh(arrayMap));
        if (hl2Var != null) {
            i = hl2Var.c;
            j28Var.m(hl2Var.d);
            dhcVar = hl2Var.b;
            ((g9b) j28Var.f).a.putAll((Map) hl2Var.e.a);
            Iterator it = Collections.unmodifiableList(hl2Var.a).iterator();
            while (it.hasNext()) {
                ((HashSet) j28Var.c).add((wf5) it.next());
            }
        }
        j28Var.d = w8b.h(dhcVar);
        j28Var.b = ((Number) cmiVar.b(jc2.c, Integer.valueOf(i))).intValue();
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) cmiVar.b(jc2.f, null);
        if (captureCallback != null) {
            j28Var.n(new hi2(captureCallback));
        }
        uik uikVar = new uik(6);
        cmiVar.j(new hu(uikVar, 6, cmiVar));
        j28Var.o(new i1m(dhc.a((w8b) uikVar.b)));
    }
}
