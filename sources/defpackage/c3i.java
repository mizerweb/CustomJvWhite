package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c3i {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public c3i(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c3i)) {
            return false;
        }
        c3i c3iVar = (c3i) obj;
        return this.b == c3iVar.b && this.a.equals(c3iVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbZ = zo5.z("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbZ.append(this.b);
        sbZ.append("\n");
        String strConcat = sbZ.toString().concat("    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
