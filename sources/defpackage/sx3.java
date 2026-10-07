package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class sx3 {
    public final ArrayList a;

    public sx3(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final String a(Context context) {
        return ww3.z1(this.a, "\n", null, null, new pk0(context, 2), 30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sx3) && this.a.equals(((sx3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CombinedError(errors=" + this.a + ")";
    }
}
