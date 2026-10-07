package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class osg implements k79 {
    public final boolean a;
    public final tj0 b;
    public final String c;
    public final ynh d;
    public final int e;
    public final int f;
    public final msg g;
    public final Float h;
    public final long i;
    public final boolean j;

    public osg(boolean z, tj0 tj0Var, String str, ynh ynhVar, int i, int i2, msg msgVar, Float f) {
        this.a = z;
        this.b = tj0Var;
        this.c = str;
        this.d = ynhVar;
        this.e = i;
        this.f = i2;
        this.g = msgVar;
        this.h = f;
        this.i = tj0Var.a;
        boolean z2 = false;
        boolean z3 = f != null && f.floatValue() >= 0.0f;
        if (msgVar == msg.a && i <= 0 && !z3) {
            z2 = true;
        }
        this.j = z2;
    }

    public static osg i(osg osgVar, int i, msg msgVar, Float f, int i2) {
        boolean z = osgVar.a;
        tj0 tj0Var = osgVar.b;
        String str = osgVar.c;
        ynh ynhVar = osgVar.d;
        int i3 = (i2 & 16) != 0 ? osgVar.e : 1;
        if ((i2 & 32) != 0) {
            i = osgVar.f;
        }
        int i4 = i;
        if ((i2 & np0.m) != 0) {
            f = osgVar.h;
        }
        return new osg(z, tj0Var, str, ynhVar, i3, i4, msgVar, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osg)) {
            return false;
        }
        osg osgVar = (osg) obj;
        return this.a == osgVar.a && this.b.equals(osgVar.b) && cqk.d(this.c, osgVar.c) && this.d.equals(osgVar.d) && this.e == osgVar.e && this.f == osgVar.f && this.g == osgVar.g && cqk.d(this.h, osgVar.h);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.i;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (this.g.hashCode() + zo5.c(this.f, zo5.c(this.e, bc1.h((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31), 31)) * 31;
        Float f = this.h;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_stories_item_view_type;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        osg osgVar = k79Var instanceof osg ? (osg) k79Var : null;
        if (osgVar == null) {
            return null;
        }
        nsg nsgVar = new nsg();
        Float f = osgVar.h;
        Float f2 = this.h;
        nsgVar.s(!(f2 != null ? !(f == null || f2.floatValue() != f.floatValue()) : f == null));
        nsgVar.t((this.e == osgVar.e && this.f == osgVar.f) ? false : true);
        nsgVar.r(this.g != osgVar.g);
        return nsgVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesModel(isSelfUser=");
        sb.append(this.a);
        sb.append(", avatarAbbreviationModel=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        sb.append(this.c);
        sb.append(", contactName=");
        sb.append(this.d);
        sb.append(", totalStoriesCount=");
        qt4.x(this.e, this.f, ", seenStoriesCount=", ", iconState=", sb);
        sb.append(this.g);
        sb.append(", publishProgress=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
