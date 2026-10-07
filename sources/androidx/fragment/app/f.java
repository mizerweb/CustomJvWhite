package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public FragmentManagerViewModel d;

    public final void a(a aVar) {
        if (this.a.contains(aVar)) {
            defpackage.c.q(aVar, "Fragment already added: ");
            return;
        }
        synchronized (this.a) {
            this.a.add(aVar);
        }
        aVar.k = true;
    }

    public final a b(String str) {
        e eVar = (e) this.b.get(str);
        if (eVar != null) {
            return eVar.c;
        }
        return null;
    }

    public final a c(String str) {
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                a aVarC = eVar.c;
                if (!str.equals(aVarC.e)) {
                    aVarC = aVarC.v.c.c(str);
                }
                if (aVarC != null) {
                    return aVarC;
                }
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                arrayList.add(eVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(e eVar) {
        a aVar = eVar.c;
        String str = aVar.e;
        HashMap map = this.b;
        if (map.get(str) != null) {
            return;
        }
        map.put(aVar.e, eVar);
        if (aVar.D) {
            boolean z = aVar.C;
            FragmentManagerViewModel fragmentManagerViewModel = this.d;
            if (z) {
                fragmentManagerViewModel.c(aVar);
            } else {
                fragmentManagerViewModel.g(aVar);
            }
            aVar.D = false;
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + aVar);
        }
    }

    public final void h(e eVar) {
        a aVar = eVar.c;
        if (aVar.C) {
            this.d.g(aVar);
        }
        String str = aVar.e;
        HashMap map = this.b;
        if (map.get(str) == eVar && ((e) map.put(aVar.e, null)) != null && c.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + aVar);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap map = this.c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
