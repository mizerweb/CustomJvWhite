package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class u8a implements x8a {
    public final long a;
    public final p63 b;
    public final Collection c;

    public u8a(long j, p63 p63Var, Collection collection) {
        this.a = j;
        this.b = p63Var;
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8a)) {
            return false;
        }
        u8a u8aVar = (u8a) obj;
        return this.a == u8aVar.a && this.b == u8aVar.b && cqk.d(this.c, u8aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Add(chatId=" + this.a + ", chatMemberType=" + this.b + ", ids=" + this.c + ")";
    }
}
