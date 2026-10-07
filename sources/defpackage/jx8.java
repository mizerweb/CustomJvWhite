package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jx8 {
    public final Integer a = 5;
    public final Set b;
    public final q38 c;

    public jx8(Set set, q38 q38Var) {
        this.b = set;
        this.c = q38Var;
    }

    public final boolean equals(Object obj) {
        return obj instanceof jx8;
    }

    public final int hashCode() {
        return Long.hashCode(398591036L);
    }

    public final String toString() {
        Integer num = this.a;
        if (num == null) {
            return "398591036 without alias";
        }
        return "398591036 with alias " + num.intValue();
    }
}
