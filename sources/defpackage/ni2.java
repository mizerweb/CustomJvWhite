package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.ArrayMap;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ni2 implements fmi {
    public final fo5 b;

    public ni2(Context context) {
        this.b = fo5.g.z(context);
        if ((context instanceof Application) && tvj.f(4, "CXCP")) {
            Log.i("CXCP", "The provided context (" + context + ") is application scoped and will be used to infer the default display for computing the default preview size, orientation, and default aspect ratio for UseCase outputs.");
        }
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Created UseCaseConfigurationMap");
        }
    }

    @Override // defpackage.fmi
    public final t94 a(emi emiVar, int i) {
        int i2;
        int i3;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Creating config for " + emiVar);
        }
        w8b w8bVarE = w8b.e();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        w8b w8bVarE2 = w8b.e();
        ArrayList arrayList = new ArrayList();
        ArrayMap arrayMap = g9b.a().a;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = emiVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            i2 = 1;
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4 && iOrdinal != 5) {
                ore.o();
                return null;
            }
            i2 = 1;
        } else {
            i2 = uk5.a(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
        }
        bh0 bh0Var = cmi.V0;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        dhc dhcVarA = dhc.a(w8bVarE2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        ghh ghhVar = ghh.b;
        ArrayMap arrayMap2 = new ArrayMap();
        for (String str : arrayMap.keySet()) {
            arrayMap2.put(str, arrayMap.get(str));
        }
        w8bVarE.m(bh0Var, new lmf(arrayList5, arrayList6, arrayList7, arrayList8, new hl2(arrayList9, dhcVarA, i2, arrayList10, new ghh(arrayMap2)), null, null, 0, null));
        HashSet hashSet2 = new HashSet();
        w8b w8bVarE3 = w8b.e();
        ArrayList arrayList11 = new ArrayList();
        ArrayMap arrayMap3 = g9b.a().a;
        int iOrdinal2 = emiVar.ordinal();
        if (iOrdinal2 == 0) {
            i3 = i == 2 ? 5 : 2;
        } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
            i3 = 1;
        } else if (iOrdinal2 != 3) {
            if (iOrdinal2 != 4 && iOrdinal2 != 5) {
                ore.o();
                return null;
            }
            i3 = 1;
        } else {
            i3 = uk5.a(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
        }
        bh0 bh0Var2 = cmi.W0;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        dhc dhcVarA2 = dhc.a(w8bVarE3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        ghh ghhVar2 = ghh.b;
        ArrayMap arrayMap4 = new ArrayMap();
        for (String str2 : arrayMap3.keySet()) {
            arrayMap4.put(str2, arrayMap3.get(str2));
        }
        w8bVarE.m(bh0Var2, new hl2(arrayList12, dhcVarA2, i3, arrayList13, new ghh(arrayMap4)));
        w8bVarE.m(cmi.Y0, emiVar == emi.a ? li2.b : ji2.a);
        w8bVarE.m(cmi.X0, ki2.a);
        emi emiVar2 = emi.b;
        fo5 fo5Var = this.b;
        if (emiVar == emiVar2) {
            w8bVarE.m(v68.B0, fo5Var.c());
        }
        bh0 bh0Var3 = v68.w0;
        dul dulVar = fo5.g;
        w8bVarE.m(bh0Var3, Integer.valueOf(fo5Var.b(true).getRotation()));
        return dhc.a(w8bVarE);
    }
}
