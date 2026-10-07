package defpackage;

import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bo2 implements do2 {
    public final int a;
    public final List b;
    public final boolean c;
    public final d46 d;
    public final String e;
    public final String f;
    public final ynh g;
    public final int h;
    public final long i;

    public bo2(int i, List list, boolean z, d46 d46Var, String str, String str2, xnh xnhVar, long j, int i2) {
        this(i, list, z, d46Var, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? d46Var.b : xnhVar, d46Var.c, j);
    }

    public static bo2 i(bo2 bo2Var, boolean z) {
        return new bo2(bo2Var.a, bo2Var.b, z, bo2Var.d, bo2Var.e, bo2Var.f, bo2Var.g, bo2Var.h, bo2Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!bo2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        bo2 bo2Var = (bo2) obj;
        return this.a == bo2Var.a && this.c == bo2Var.c && this.d == bo2Var.d && cqk.d(this.e, bo2Var.e) && cqk.d(this.f, bo2Var.f) && cqk.d(this.g, bo2Var.g) && this.h == bo2Var.h && this.i == bo2Var.i;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.i;
    }

    @Override // defpackage.do2
    public final ynh getName() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + nbh.n(this.a * 31, 31, this.c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        return ((Long.hashCode(this.i) + ((bc1.h((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g) + this.h) * 31)) * 31) + R.id.oneme_media_keyboard_view_type_category_emoji;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_media_keyboard_view_type_category_emoji;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        boolean z;
        if ((k79Var instanceof bo2) && this.c != (z = ((bo2) k79Var).c)) {
            return new ao2(z);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiGroup(groupIndex=");
        sb.append(this.a);
        sb.append(", emojis=");
        sb.append(this.b);
        sb.append(", selected=");
        sb.append(this.c);
        sb.append(", category=");
        sb.append(this.d);
        sb.append(", iconUrl=");
        nbh.G(sb, this.e, ", iconLottieUrl=", this.f, ", name=");
        sb.append(this.g);
        sb.append(", iconRes=");
        sb.append(this.h);
        sb.append(", clearCategoryAvailable=false, itemId=");
        return c0a.m(this.i, ")", sb);
    }

    @Override // defpackage.do2
    public final boolean y() {
        return false;
    }

    public bo2(int i, List list, boolean z, d46 d46Var, String str, String str2, ynh ynhVar, int i2, long j) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = d46Var;
        this.e = str;
        this.f = str2;
        this.g = ynhVar;
        this.h = i2;
        this.i = j;
    }
}
