package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class owb {
    public static final ifh h = new ifh(new j68(26));
    public final String a;
    public final CharSequence b;
    public final int c;
    public final sb8 d;
    public final Drawable e;
    public final Drawable f;
    public final ynh g;

    public /* synthetic */ owb(String str, String str2, int i, sb8 sb8Var, Drawable drawable, int i2) {
        this(str, str2, i, (i2 & 8) != 0 ? nwb.l : sb8Var, (i2 & 16) != 0 ? null : drawable, null, null);
    }

    public static owb a(owb owbVar, CharSequence charSequence, int i, sb8 sb8Var, Drawable drawable, ynh ynhVar, int i2) {
        String str = owbVar.a;
        if ((i2 & 2) != 0) {
            charSequence = owbVar.b;
        }
        CharSequence charSequence2 = charSequence;
        if ((i2 & 8) != 0) {
            sb8Var = owbVar.d;
        }
        sb8 sb8Var2 = sb8Var;
        Drawable drawable2 = owbVar.e;
        if ((i2 & 32) != 0) {
            drawable = owbVar.f;
        }
        Drawable drawable3 = drawable;
        if ((i2 & 64) != 0) {
            ynhVar = owbVar.g;
        }
        owbVar.getClass();
        return new owb(str, charSequence2, i, sb8Var2, drawable2, drawable3, ynhVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owb)) {
            return false;
        }
        owb owbVar = (owb) obj;
        return cqk.d(this.a, owbVar.a) && cqk.d(this.b, owbVar.b) && this.c == owbVar.c && cqk.d(this.d, owbVar.d) && cqk.d(this.e, owbVar.e) && cqk.d(this.f, owbVar.f) && cqk.d(this.g, owbVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + c0a.f(this.c, mw7.f(this.a.hashCode() * 31, 31, this.b), 31)) * 31;
        Drawable drawable = this.e;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f;
        int iHashCode3 = (iHashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        ynh ynhVar = this.g;
        return iHashCode3 + (ynhVar != null ? ynhVar.hashCode() : 0);
    }

    public final String toString() {
        boolean zC = gm0.c();
        Drawable drawable = this.f;
        Drawable drawable2 = this.e;
        sb8 sb8Var = this.d;
        int i = this.c;
        String str = this.a;
        if (!zC) {
            StringBuilder sbV = qt4.v("OneMeBaseTabItemModel(id='", str, "', title=*****, state=");
            sbV.append(c0a.y(i));
            sbV.append(", indicator=");
            sbV.append(sb8Var);
            sbV.append(", startIcon=");
            sbV.append(drawable2);
            sbV.append(", endIcon=");
            sbV.append(drawable);
            sbV.append(")");
            return sbV.toString();
        }
        return "OneMeBaseTabItemModel(id='" + str + "', title=" + ((Object) this.b) + ", state=" + c0a.y(i) + ", indicator=" + sb8Var + ", startIcon=" + drawable2 + ", endIcon=" + drawable + ")";
    }

    public owb(String str, CharSequence charSequence, int i, sb8 sb8Var, Drawable drawable, Drawable drawable2, ynh ynhVar) {
        this.a = str;
        this.b = charSequence;
        this.c = i;
        this.d = sb8Var;
        this.e = drawable;
        this.f = drawable2;
        this.g = ynhVar;
    }
}
