package defpackage;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public interface l49 extends Parcelable {
    default String i() {
        j49 j49Var = this instanceof j49 ? (j49) this : null;
        if (j49Var != null) {
            return j49Var.i();
        }
        return null;
    }
}
