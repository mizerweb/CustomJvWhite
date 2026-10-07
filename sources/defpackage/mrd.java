package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mrd {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public mrd(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static mrd a(mrd mrdVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = mrdVar.a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = mrdVar.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = mrdVar.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = mrdVar.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = mrdVar.e;
        }
        mrdVar.getClass();
        return new mrd(z6, z7, z8, z9, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrd)) {
            return false;
        }
        mrd mrdVar = (mrd) obj;
        return this.a == mrdVar.a && this.b == mrdVar.b && this.c == mrdVar.c && this.d == mrdVar.d && this.e == mrdVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("ProfileMemberPermissionsModel(changePhoto=", this.a, ", canAddMembers=", this.b, ", canPinMessage=");
        qt4.B(", canCallInChat=", ", canSeePrivateChatLink=", sbB, this.c, this.d);
        return qt4.r(sbB, this.e, ")");
    }
}
