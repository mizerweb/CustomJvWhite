package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class sp3 {
    public final HashMap a = new HashMap();
    public final HashSet b = new HashSet();
    public vn7 c;
    public boolean d;
    public boolean e;

    public final boolean a(cq3 cq3Var) {
        int id = cq3Var.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        cq3 cq3Var2 = (cq3) this.a.get(Integer.valueOf(c()));
        if (cq3Var2 != null) {
            e(cq3Var2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!cq3Var.isChecked()) {
            cq3Var.setChecked(true);
        }
        return zAdd;
    }

    public final ArrayList b(iq3 iq3Var) {
        HashSet hashSet = new HashSet(this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iq3Var.getChildCount(); i++) {
            View childAt = iq3Var.getChildAt(i);
            if ((childAt instanceof cq3) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (!this.d) {
            return -1;
        }
        HashSet hashSet = this.b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final void d() {
        vn7 vn7Var = this.c;
        if (vn7Var != null) {
            new HashSet(this.b);
            vzb vzbVar = (vzb) vn7Var.b;
            gq3 gq3Var = vzbVar.g;
            if (gq3Var != null) {
                vzbVar.h.b(vzbVar);
                iq3 iq3Var = (iq3) ((zo7) gq3Var).b;
                if (iq3Var.h.d) {
                    iq3Var.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean e(cq3 cq3Var, boolean z) {
        int id = cq3Var.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            cq3Var.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (cq3Var.isChecked()) {
            cq3Var.setChecked(false);
        }
        return zRemove;
    }
}
