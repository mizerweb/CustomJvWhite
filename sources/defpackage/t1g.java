package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t1g extends ji3 {
    public final long a;
    public final List b;

    public t1g(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1g)) {
            return false;
        }
        t1g t1gVar = (t1g) obj;
        return this.a == t1gVar.a && this.b.equals(t1gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ShowChatContextMenu(chatId=" + this.a + ", actions=" + this.b + ")";
    }
}
