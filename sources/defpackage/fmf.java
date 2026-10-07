package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fmf {
    public static final fmf b = new fmf(new HashSet());
    public static final String c;
    public final u98 a;

    static {
        String str = vqi.a;
        c = Integer.toString(0, 36);
    }

    public fmf(HashSet hashSet) {
        this.a = u98.m(hashSet);
    }

    public static fmf a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        if (parcelableArrayList == null) {
            lvb.G0("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(emf.a((Bundle) parcelableArrayList.get(i)));
        }
        return new fmf(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fmf) {
            return this.a.equals(((fmf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
