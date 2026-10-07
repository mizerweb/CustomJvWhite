package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gi4 {
    public final String a;

    public gi4(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gi4) {
            return Objects.equals(this.a, ((gi4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return zo5.w(new StringBuilder("MenuButton{text='"), this.a, "'}");
    }
}
