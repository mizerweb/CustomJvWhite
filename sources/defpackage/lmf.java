package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lmf {
    public static final List j = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final ui0 b;
    public final List c;
    public final List d;
    public final List e;
    public final jmf f;
    public final hl2 g;
    public final int h;
    public final InputConfiguration i;

    public lmf(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, hl2 hl2Var, jmf jmfVar, InputConfiguration inputConfiguration, int i, ui0 ui0Var) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = jmfVar;
        this.g = hl2Var;
        this.i = inputConfiguration;
        this.h = i;
        this.b = ui0Var;
    }

    public static lmf a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        w8b w8bVarE = w8b.e();
        ArrayList arrayList5 = new ArrayList();
        g9b g9bVarA = g9b.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        dhc dhcVarA = dhc.a(w8bVarE);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        ghh ghhVar = ghh.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = g9bVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new lmf(arrayList, arrayList2, arrayList3, arrayList4, new hl2(arrayList6, dhcVarA, -1, arrayList7, new ghh(arrayMap)), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (ui0 ui0Var : this.a) {
            arrayList.add(ui0Var.a);
            Iterator it = ui0Var.b.iterator();
            while (it.hasNext()) {
                arrayList.add((wf5) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
