package defpackage;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pi0 {
    public static final pi0 e;
    public static final pi0 f;
    public static final pi0 g;
    public static final pi0 h;
    public static final pi0 i;
    public static final pi0 j;
    public static final pi0 k;
    public static final HashSet l;
    public static final List m;
    public final int a;
    public final int b;
    public final String c;
    public final List d;

    static {
        pi0 pi0Var = new pi0(4, 2002, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        e = pi0Var;
        pi0 pi0Var2 = new pi0(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        f = pi0Var2;
        pi0 pi0Var3 = new pi0(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        g = pi0Var3;
        pi0 pi0Var4 = new pi0(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        h = pi0Var4;
        List list = Collections.EMPTY_LIST;
        pi0 pi0Var5 = new pi0(0, 2000, "LOWEST", list);
        i = pi0Var5;
        pi0 pi0Var6 = new pi0(1, 2001, "HIGHEST", list);
        j = pi0Var6;
        k = new pi0(-1, -1, "NONE", list);
        l = new HashSet(Arrays.asList(pi0Var5, pi0Var6, pi0Var, pi0Var2, pi0Var3, pi0Var4));
        m = Arrays.asList(pi0Var4, pi0Var3, pi0Var2, pi0Var);
    }

    public pi0(int i2, int i3, String str, List list) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        if (list != null) {
            this.d = list;
        } else {
            ore.n("Null typicalSizes");
            throw null;
        }
    }

    public final int a(int i2) {
        if (i2 == 1) {
            return this.a;
        }
        if (i2 == 2) {
            return this.b;
        }
        c.e(zo5.h(i2, "Unknown quality source: "));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pi0)) {
            return false;
        }
        pi0 pi0Var = (pi0) obj;
        return this.a == pi0Var.a && this.b == pi0Var.b && this.c.equals(pi0Var.c) && this.d.equals(pi0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.a);
        sb.append(", highSpeedValue=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", typicalSizes=");
        return qv1.n("}", sb, this.d);
    }
}
