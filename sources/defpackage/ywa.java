package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class ywa {
    public final SparseArray a;
    public l9i b;

    public ywa(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(l9i l9iVar, int i, int i2) {
        int iA = l9iVar.a(i);
        SparseArray sparseArray = this.a;
        ywa ywaVar = sparseArray == null ? null : (ywa) sparseArray.get(iA);
        if (ywaVar == null) {
            ywaVar = new ywa(1);
            sparseArray.put(l9iVar.a(i), ywaVar);
        }
        if (i2 > i) {
            ywaVar.a(l9iVar, i + 1, i2);
        } else {
            ywaVar.b = l9iVar;
        }
    }
}
