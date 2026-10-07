package defpackage;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ep4 implements Serializable {
    public static final ep4 c = new ep4();
    public static final ep4 d = new ep4();
    public final transient Object a;
    public final boolean b;

    public ep4(boolean z, Object obj, sa6 sa6Var) {
        this.b = z;
        this.a = obj;
        sa6Var.getClass();
    }

    public static void a(int i, int[] iArr) {
        int i2 = iArr[0];
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= i) {
            i2 = i;
        }
        iArr[0] = i2;
        int i3 = iArr[1];
        int i4 = i - i2;
        if (i3 < 0 || i3 > i4) {
            iArr[1] = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ep4)) {
            return false;
        }
        Object obj2 = ((ep4) obj).a;
        Object obj3 = this.a;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        if ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) {
            return obj3.equals(obj2);
        }
        return obj3 == obj2;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public ep4() {
        this(false, null, sa6.a);
    }
}
