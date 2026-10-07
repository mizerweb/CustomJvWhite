package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class cx6 {
    public final SparseBooleanArray a;

    public cx6(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        lvb.U(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cx6) {
            return this.a.equals(((cx6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
