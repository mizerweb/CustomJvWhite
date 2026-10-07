package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ly9 {
    public static final ly9 d = new ly9(new u50());
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        String str = vqi.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
    }

    public ly9(u50 u50Var) {
        this.a = (Uri) u50Var.a;
        this.b = (String) u50Var.c;
        this.c = (Bundle) u50Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly9)) {
            return false;
        }
        ly9 ly9Var = (ly9) obj;
        if (Objects.equals(this.a, ly9Var.a) && Objects.equals(this.b, ly9Var.b)) {
            if ((this.c == null) == (ly9Var.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
    }
}
