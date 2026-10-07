package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class w8a implements x8a {
    public final long a;
    public final p63 b;
    public final Collection c;

    public w8a(long j, p63 p63Var, Collection collection) {
        this.a = j;
        this.b = p63Var;
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8a)) {
            return false;
        }
        w8a w8aVar = (w8a) obj;
        return this.a == w8aVar.a && this.b == w8aVar.b && cqk.d(this.c, w8aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Remove(chatId=" + this.a + ", chatMemberType=" + this.b + ", ids=" + this.c + ")";
    }
}
