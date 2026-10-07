package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kvl {
    public final evl a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof kvl) && f55.h(this.a, ((kvl) obj).a) && f55.h(null, null) && f55.h(null, null) && f55.h(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, null, null});
    }
}
