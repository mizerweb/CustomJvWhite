package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class z46 implements k79 {
    public final int a;
    public final int b;
    public final CharSequence c;
    public final List d;
    public final Drawable e;
    public final long f;
    public final boolean g;
    public final long h;

    public z46(int i, int i2, CharSequence charSequence, List list, Drawable drawable, long j, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = charSequence;
        this.d = list;
        this.e = drawable;
        this.f = j;
        this.g = z;
        this.h = j != 0 ? (BuildConfig.MAX_TIME_TO_UPLOAD - Math.abs(j)) - ((long) i) : i2;
    }

    public static z46 i(z46 z46Var, int i, boolean z, int i2) {
        int i3 = (i2 & 1) != 0 ? z46Var.a : -1;
        if ((i2 & 2) != 0) {
            i = z46Var.b;
        }
        int i4 = i;
        CharSequence charSequence = z46Var.c;
        List list = z46Var.d;
        Drawable drawable = z46Var.e;
        long j = z46Var.f;
        if ((i2 & 64) != 0) {
            z = z46Var.g;
        }
        return new z46(i3, i4, charSequence, list, drawable, j, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z46)) {
            return false;
        }
        z46 z46Var = (z46) obj;
        return this.a == z46Var.a && this.b == z46Var.b && cqk.d(this.c, z46Var.c) && cqk.d(this.d, z46Var.d) && cqk.d(this.e, z46Var.e) && this.f == z46Var.f && this.g == z46Var.g;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.h;
    }

    public final int hashCode() {
        int iC = qv1.c(mw7.f(zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
        Drawable drawable = this.e;
        return Boolean.hashCode(this.g) + qt4.g((iC + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.f);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_emoji_view_type_emoji;
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("EmojiModel(groupIndex=", this.a, ", itemIndex=", this.b, ", defaultValue=");
        sbP.append((Object) this.c);
        sbP.append(", values=");
        sbP.append(this.d);
        sbP.append(", drawable=");
        sbP.append(this.e);
        sbP.append(", animojiId=");
        sbP.append(this.f);
        return nbh.z(sbP, ", isSelected=", this.g, ")");
    }

    public /* synthetic */ z46(int i, int i2, CharSequence charSequence, ArrayList arrayList, Drawable drawable, long j, boolean z, int i3) {
        this(i, i2, charSequence, (i3 & 8) != 0 ? r66.a : arrayList, drawable, (i3 & 32) != 0 ? 0L : j, (i3 & 64) != 0 ? true : z);
    }
}
