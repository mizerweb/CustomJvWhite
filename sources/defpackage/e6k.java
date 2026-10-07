package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e6k extends k6k {
    public final List a;

    public e6k(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6k) && cqk.d(this.a, ((e6k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "NoHostsFromApiReceived(installedHosts=" + this.a + ')';
    }
}
