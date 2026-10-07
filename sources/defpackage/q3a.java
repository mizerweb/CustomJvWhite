package defpackage;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class q3a {
    public v3a a;

    public q3a(String str, int i, int i2) {
        if (str == null) {
            ore.n("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            ore.p("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new v3a(str, i, i2);
            return;
        }
        u3a u3aVar = new u3a(str, i, i2);
        b88.o(i, i2, str);
        this.a = u3aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q3a) {
            return this.a.equals(((q3a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
