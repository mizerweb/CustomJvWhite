package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ru7 extends z4e {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = vqi.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public ru7() {
        this.b = false;
        this.c = false;
    }

    @Override // defpackage.z4e
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.z4e
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(z4e.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ru7)) {
            return false;
        }
        ru7 ru7Var = (ru7) obj;
        return this.c == ru7Var.c && this.b == ru7Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public ru7(boolean z) {
        this.b = true;
        this.c = z;
    }
}
