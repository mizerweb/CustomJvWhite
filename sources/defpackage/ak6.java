package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ak6 extends ck6 {
    public final u8b a;

    public ak6(u8b u8bVar) {
        this.a = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak6) && cqk.d(this.a, ((ak6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(chats=" + this.a + ")";
    }
}
