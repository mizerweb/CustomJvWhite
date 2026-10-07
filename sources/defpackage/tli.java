package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class tli extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ LinkedHashSet f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ uli h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tli(LinkedHashSet linkedHashSet, boolean z, uli uliVar, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = linkedHashSet;
        this.g = z;
        this.h = uliVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new tli(this.f, this.g, this.h, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((tli) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        uli uliVar = this.h;
        LinkedHashMap linkedHashMap = uliVar.k;
        int i = this.e;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: Building SessionConfig...");
        }
        nmf nmfVar = new nmf(this.f, this.g);
        lmf lmfVar = ((kmf) nmfVar.e.getValue()).c() ? (lmf) nmfVar.f.getValue() : null;
        if (lmfVar == null) {
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "Using default SessionConfig");
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashSet hashSet = new HashSet();
            w8b w8bVarE = w8b.e();
            ArrayList arrayList = new ArrayList();
            ArrayMap arrayMap = g9b.a().a;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList(linkedHashSet);
            ArrayList arrayList6 = new ArrayList(arrayList2);
            ArrayList arrayList7 = new ArrayList(arrayList3);
            ArrayList arrayList8 = new ArrayList(arrayList4);
            ArrayList arrayList9 = new ArrayList(hashSet);
            dhc dhcVarA = dhc.a(w8bVarE);
            ArrayList arrayList10 = new ArrayList(arrayList);
            ghh ghhVar = ghh.b;
            ArrayMap arrayMap2 = new ArrayMap();
            for (String str : arrayMap.keySet()) {
                arrayMap2.put(str, arrayMap.get(str));
            }
            i2 = 1;
            lmfVar = new lmf(arrayList5, arrayList6, arrayList7, arrayList8, new hl2(arrayList9, dhcVarA, 1, arrayList10, new ghh(arrayMap2)), null, null, 0, null);
        }
        hl2 hl2Var = lmfVar.g;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: SessionConfig built. Updating state...");
        }
        i64 i64Var = uli.l;
        gc0 gc0Var = uliVar.e.e;
        ft0 ft0Var = new ft0();
        if (!hl2Var.a().equals(yi0.h)) {
            ((w8b) ft0Var.a).m(shl.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), hl2Var.a());
        }
        ft0Var.u(hl2Var.b);
        ghh ghhVar2 = hl2Var.e;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayMap arrayMap3 = ghhVar2.a;
        for (String str2 : arrayMap3.keySet()) {
            linkedHashMap2.put(str2, arrayMap3.get(str2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        List list = hl2Var.d;
        yc2 yc2Var = new yc2();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yc2Var.a((zc2) it.next(), gc0Var);
        }
        cle[] cleVarArr = {yc2Var};
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(wm9.P0(1));
        a.l1(cleVarArr, linkedHashSet2);
        linkedHashMap.put(jli.a, new mli(ft0Var, linkedHashMap3, linkedHashSet2, new pme(hl2Var.c)));
        LinkedHashSet linkedHashSetB = uliVar.c.b(Collections.unmodifiableList(hl2Var.a));
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: State update processing.");
        }
        mli mliVarO = uli.o(linkedHashMap);
        this.e = i2;
        Object objQ = uliVar.q(mliVarO, linkedHashSetB, this);
        hu4 hu4Var = hu4.a;
        return objQ == hu4Var ? hu4Var : objQ;
    }
}
