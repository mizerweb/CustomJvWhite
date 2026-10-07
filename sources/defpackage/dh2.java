package defpackage;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dh2 implements xj8 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashSet c = new HashSet();
    public u72 d;
    public r72 e;
    public jj0 f;

    @Override // defpackage.xj8
    public final void a(List list) {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f.e(str));
            }
            synchronized (this.a) {
                try {
                    HashSet hashSet2 = new HashSet(this.b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<pf2> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((pf2) this.b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : (ArrayList) list) {
                        if (this.b.containsKey(str2)) {
                            linkedHashMap.put(str2, (pf2) this.b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (pf2) map.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(linkedHashMap);
                    for (pf2 pf2Var : arrayList) {
                        if (pf2Var != null) {
                            pf2Var.o();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (CameraUnavailableException e) {
            throw new CameraUpdateException("Failed to create CameraInternal", e);
        }
    }

    public final pf2 b(String str) {
        pf2 pf2Var;
        synchronized (this.a) {
            try {
                pf2Var = (pf2) this.b.get(str);
                if (pf2Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pf2Var;
    }

    public final LinkedHashSet c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet(this.b.values());
        }
        return linkedHashSet;
    }

    public final void d(jj0 jj0Var) {
        this.f = jj0Var;
        synchronized (this.a) {
            try {
                for (String str : jj0Var.d()) {
                    tvj.a("CameraRepository", "Added camera: " + str);
                    pf2 pf2Var = (pf2) this.b.put(str, jj0Var.e(str));
                    if (pf2Var != null) {
                        pf2Var.release();
                    }
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }
}
