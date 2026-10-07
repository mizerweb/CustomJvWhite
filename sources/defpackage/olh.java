package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class olh implements eo {
    public static final olh b = new olh(null);
    public final String a;

    public /* synthetic */ olh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof olh) {
            return f55.h(this.a, ((olh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
