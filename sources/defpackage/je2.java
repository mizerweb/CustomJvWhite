package defpackage;

import android.util.Log;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class je2 implements xj8 {
    public final me2 a;
    public dh2 c;
    public int e;
    public boolean f;
    public final Object b = new Object();
    public final ArrayList d = new ArrayList();

    public je2(lg2 lg2Var, me2 me2Var) {
        this.a = me2Var;
    }

    @Override // defpackage.xj8
    public final void a(List list) throws CameraUpdateException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<Set> setB = me2.b(this.a);
            if (setB == null) {
                setB = c76.a;
            }
            for (Set set : setB) {
                ArrayList arrayList = new ArrayList(yw3.W0(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ef2) it.next()).a);
                }
                Set setX1 = ww3.X1(arrayList);
                if (list.containsAll(setX1)) {
                    List listT1 = ww3.T1(set);
                    if (listT1.size() >= 2) {
                        String str = ((ef2) listT1.get(0)).a;
                        String str2 = ((ef2) listT1.get(1)).a;
                        try {
                            if (iil.b(str, this.a) && iil.b(str2, this.a)) {
                                linkedHashSet.add(set);
                                if (!linkedHashMap.containsKey(str)) {
                                    linkedHashMap.put(str, new ArrayList());
                                }
                                ((List) linkedHashMap.get(str)).add(str2);
                                if (!linkedHashMap.containsKey(str2)) {
                                    linkedHashMap.put(str2, new ArrayList());
                                }
                                ((List) linkedHashMap.get(str2)).add(str);
                            }
                        } catch (InitializationException e) {
                            if (tvj.f(5, "CXCP")) {
                                Log.w("CXCP", "Skipping incompatible concurrent pair: " + set + " due to " + e.getMessage());
                            }
                        }
                    }
                } else if (tvj.f(5, "CXCP")) {
                    Log.w("CXCP", "Failed to retrieve concurrent camera: " + setX1 + " from " + list);
                }
            }
            synchronized (this.b) {
            }
        } catch (Exception e2) {
            throw new CameraUpdateException("Failed to retrieve concurrent camera id info for camera-pipe.", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [r66] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [je2] */
    public final void b(dh2 dh2Var) throws CameraUpdateException {
        ?? arrayList;
        synchronized (this.b) {
            this.c = dh2Var;
        }
        ArrayList arrayListA = me2.a(this.a);
        if (arrayListA != null) {
            arrayList = new ArrayList(yw3.W0(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(((ef2) it.next()).a);
            }
        } else {
            arrayList = r66.a;
        }
        a(arrayList);
    }
}
