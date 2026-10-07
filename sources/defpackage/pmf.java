package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class pmf {
    public static final String d;
    public static final String e;
    public static final String f;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        String str = vqi.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public pmf(String str, int i, Bundle bundle) {
        boolean z = true;
        if (i >= 0 && i != 1) {
            z = false;
        }
        lvb.R(z);
        this.a = i;
        this.b = str;
        this.c = bundle;
    }

    public static pmf a(Bundle bundle) {
        int i = bundle.getInt(d, 1000);
        String string = bundle.getString(e, "");
        Bundle bundleN = vqi.n(bundle.getBundle(f));
        if (bundleN == null) {
            bundleN = Bundle.EMPTY;
        }
        return new pmf(string, i, bundleN);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.a);
        bundle.putString(e, this.b);
        Bundle bundle2 = this.c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmf)) {
            return false;
        }
        pmf pmfVar = (pmf) obj;
        return this.a == pmfVar.a && Objects.equals(this.b, pmfVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public pmf(int i) {
        this("no error message provided", i, Bundle.EMPTY);
    }
}
