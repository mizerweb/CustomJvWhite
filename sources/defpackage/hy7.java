package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hy7 implements jwa {
    public final String a;
    public final String b;
    public final List c;

    public hy7(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hy7.class == obj.getClass()) {
            hy7 hy7Var = (hy7) obj;
            if (TextUtils.equals(this.a, hy7Var.a) && TextUtils.equals(this.b, hy7Var.b) && this.c.equals(hy7Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        return "HlsTrackMetadataEntry".concat(str != null ? zo5.w(qt4.v(" [", str, ", "), this.b, "]") : "");
    }
}
