package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class hyd implements k79 {
    public final long a;
    public final ynh b;
    public final boolean c;
    public final ynh d;
    public final boolean e;

    public hyd(long j, ynh ynhVar, boolean z, ynh ynhVar2, boolean z2) {
        this.a = j;
        this.b = ynhVar;
        this.c = z;
        this.d = ynhVar2;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyd)) {
            return false;
        }
        hyd hydVar = (hyd) obj;
        return this.a == hydVar.a && cqk.d(this.b, hydVar.b) && this.c == hydVar.c && cqk.d(this.d, hydVar.d) && this.e == hydVar.e;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iN = nbh.n(bc1.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        ynh ynhVar = this.d;
        return Boolean.hashCode(this.e) + ((iN + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_stories_preset_whitelist_item;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitelistPresetItem(itemId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isChecked=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        return nbh.z(sb, ", hasEndArrow=", this.e, ")");
    }

    public /* synthetic */ hyd(long j, tnh tnhVar, boolean z) {
        this(j, tnhVar, z, null, false);
    }
}
