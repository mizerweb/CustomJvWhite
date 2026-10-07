package androidx.fragment.app;

import android.util.Log;
import defpackage.b8j;
import defpackage.h8j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class FragmentManagerViewModel extends b8j {
    public static final d h = new d();
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public FragmentManagerViewModel(boolean z) {
        this.e = z;
    }

    @Override // defpackage.b8j
    public final void b() {
        if (c.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void c(a aVar) {
        if (this.g) {
            if (c.K(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = aVar.e;
        HashMap map = this.b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(aVar.e, aVar);
        if (c.K(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + aVar);
        }
    }

    public final void d(a aVar, boolean z) {
        if (c.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + aVar);
        }
        f(aVar.e, z);
    }

    public final void e(String str, boolean z) {
        if (c.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        f(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FragmentManagerViewModel.class == obj.getClass()) {
            FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
            if (this.b.equals(fragmentManagerViewModel.b) && this.c.equals(fragmentManagerViewModel.c) && this.d.equals(fragmentManagerViewModel.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str, boolean z) {
        HashMap map = this.c;
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) map.get(str);
        if (fragmentManagerViewModel != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(fragmentManagerViewModel.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fragmentManagerViewModel.e((String) it.next(), true);
                }
            }
            fragmentManagerViewModel.b();
            map.remove(str);
        }
        HashMap map2 = this.d;
        h8j h8jVar = (h8j) map2.get(str);
        if (h8jVar != null) {
            h8jVar.a();
            map2.remove(str);
        }
    }

    public final void g(a aVar) {
        if (this.g) {
            if (c.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(aVar.e) == null || !c.K(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + aVar);
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
