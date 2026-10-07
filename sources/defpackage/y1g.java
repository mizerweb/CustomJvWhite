package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y1g extends ji3 {
    public final long a;
    public final ynh b;
    public final ynh c;
    public final List d;

    public y1g(long j, ynh ynhVar, ynh ynhVar2, List list) {
        this.a = j;
        this.b = ynhVar;
        this.c = ynhVar2;
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
        if (!(obj instanceof y1g)) {
            return false;
        }
        y1g y1gVar = (y1g) obj;
        return this.a == y1gVar.a && cqk.d(this.b, y1gVar.b) && cqk.d(this.c, y1gVar.c) && cqk.d(this.d, y1gVar.d);
    }

    public final int hashCode() {
        int iH = bc1.h(Long.hashCode(this.a) * 31, 31, this.b);
        ynh ynhVar = this.c;
        return this.d.hashCode() + ((iH + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(chatId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }

    public /* synthetic */ y1g(tnh tnhVar, List list) {
        this(0L, tnhVar, null, list);
    }
}
