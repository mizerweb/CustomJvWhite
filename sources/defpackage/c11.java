package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c11 {
    public final long a;
    public final List b;
    public final Map c;

    public c11(long j, List list, Map map) {
        this.a = j;
        this.b = list;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c11)) {
            return false;
        }
        c11 c11Var = (c11) obj;
        return this.a == c11Var.a && cqk.d(this.b, c11Var.b) && this.c.equals(c11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv1.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "NewCommands(chatId=" + this.a + ", botCommands=" + this.b + ", botsInfoMap=" + this.c + ")";
    }
}
