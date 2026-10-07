package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bpj {
    public final String a;
    public final List b;

    public bpj(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpj)) {
            return false;
        }
        bpj bpjVar = (bpj) obj;
        return this.a.equals(bpjVar.a) && cqk.d(this.b, bpjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppSettingsState(title=" + this.a + ", sections=" + this.b + ")";
    }
}
