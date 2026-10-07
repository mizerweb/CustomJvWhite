package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a4d {
    public static final a4d c = new a4d(false, false);
    public static final String d;
    public static final String e;
    public final boolean a;
    public final boolean b;

    static {
        String str = vqi.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
    }

    public a4d(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static a4d a(Bundle bundle) {
        return new a4d(bundle.getBoolean(d, false), bundle.getBoolean(e, false));
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(d, this.a);
        bundle.putBoolean(e, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4d)) {
            return false;
        }
        a4d a4dVar = (a4d) obj;
        return this.a == a4dVar.a && this.b == a4dVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
