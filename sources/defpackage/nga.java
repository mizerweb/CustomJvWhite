package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nga implements sga {
    public final long a;
    public final m8b b;

    public nga(long j, m8b m8bVar) {
        this.a = j;
        this.b = m8bVar;
    }

    public final long a() {
        return this.a;
    }

    public final m8b b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nga)) {
            return false;
        }
        nga ngaVar = (nga) obj;
        return this.a == ngaVar.a && this.b.equals(ngaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Delete(chatId=" + this.a + ", messageIds=" + this.b + ")";
    }
}
