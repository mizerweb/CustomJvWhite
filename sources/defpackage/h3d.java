package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h3d {
    public static final h3d b;
    public static final String c;
    public final cx6 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        lvb.b0(!false);
        b = new h3d(new cx6(sparseBooleanArray));
        String str = vqi.a;
        c = Integer.toString(0, 36);
    }

    public h3d(cx6 cx6Var) {
        this.a = cx6Var;
    }

    public static h3d b(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
        if (integerArrayList == null) {
            return b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            int iIntValue = integerArrayList.get(i).intValue();
            lvb.b0(!false);
            sparseBooleanArray.append(iIntValue, true);
        }
        lvb.b0(!false);
        return new h3d(new cx6(sparseBooleanArray));
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            cx6 cx6Var = this.a;
            if (i >= cx6Var.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(cx6Var.b(i)));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h3d) {
            return this.a.equals(((h3d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
