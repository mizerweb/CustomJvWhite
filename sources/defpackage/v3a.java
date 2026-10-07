package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class v3a {
    public final String a;
    public final int b;
    public final int c;

    public v3a(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3a)) {
            return false;
        }
        v3a v3aVar = (v3a) obj;
        int i = v3aVar.c;
        String str = v3aVar.a;
        int i2 = v3aVar.b;
        int i3 = this.c;
        String str2 = this.a;
        int i4 = this.b;
        if (i4 < 0 || i2 < 0) {
            return TextUtils.equals(str2, str) && i3 == i;
        }
        return TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
