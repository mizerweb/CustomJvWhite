package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w1g extends ck4 {
    public final long a;
    public final ynh b;
    public final ynh c;
    public final List d;

    public w1g(long j, ynh ynhVar, tnh tnhVar, List list) {
        this.a = j;
        this.b = ynhVar;
        this.c = tnhVar;
        this.d = list;
    }

    public final List a() {
        return this.d;
    }

    public final long b() {
        return this.a;
    }

    public final ynh c() {
        return this.c;
    }

    public final ynh d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1g)) {
            return false;
        }
        w1g w1gVar = (w1g) obj;
        return this.a == w1gVar.a && this.b.equals(w1gVar.b) && cqk.d(this.c, w1gVar.c) && this.d.equals(w1gVar.d);
    }

    public final int hashCode() {
        int iH = bc1.h(Long.hashCode(this.a) * 31, 31, this.b);
        ynh ynhVar = this.c;
        return this.d.hashCode() + ((iH + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(contactServerId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
