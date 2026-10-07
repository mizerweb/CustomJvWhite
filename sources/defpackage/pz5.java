package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pz5 implements c06 {
    public final String a;
    public final long b;
    public final String c;
    public final CharSequence d;
    public final sx3 e;
    public final String f;
    public final sx3 g;
    public final String h;
    public final ynh i;
    public final String j;
    public final kni k;
    public final boolean l;
    public final Long m;

    public pz5(String str, long j, String str2, CharSequence charSequence, sx3 sx3Var, String str3, sx3 sx3Var2, String str4, ynh ynhVar, String str5, kni kniVar, boolean z, Long l) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = charSequence;
        this.e = sx3Var;
        this.f = str3;
        this.g = sx3Var2;
        this.h = str4;
        this.i = ynhVar;
        this.j = str5;
        this.k = kniVar;
        this.l = z;
        this.m = l;
    }

    public static pz5 c(pz5 pz5Var, String str, sx3 sx3Var, String str2, sx3 sx3Var2, String str3, ynh ynhVar, kni kniVar, boolean z, Long l, int i) {
        return new pz5(pz5Var.a, pz5Var.b, (i & 4) != 0 ? pz5Var.c : str, pz5Var.d, (i & 16) != 0 ? pz5Var.e : sx3Var, (i & 32) != 0 ? pz5Var.f : str2, (i & 64) != 0 ? pz5Var.g : sx3Var2, (i & np0.m) != 0 ? pz5Var.h : str3, (i & np0.n) != 0 ? pz5Var.i : ynhVar, pz5Var.j, (i & 1024) != 0 ? pz5Var.k : kniVar, (i & np0.q) != 0 ? pz5Var.l : z, (i & np0.r) != 0 ? pz5Var.m : l);
    }

    @Override // defpackage.c06
    public final boolean a(c06 c06Var) {
        if (c06Var == null || !(c06Var instanceof pz5)) {
            return false;
        }
        pz5 pz5Var = (pz5) c06Var;
        return (pz5Var.k == this.k && cqk.d(pz5Var.e, this.e) && cqk.d(pz5Var.g, this.g) && this.i.equals(pz5Var.i)) ? false : true;
    }

    @Override // defpackage.c06
    public final boolean b(c06 c06Var) {
        if (c06Var == null || !(c06Var instanceof pz5)) {
            return false;
        }
        pz5 pz5Var = (pz5) c06Var;
        return (cqk.d(pz5Var.h, this.h) && pz5Var.k == this.k && cqk.d(pz5Var.c, this.c) && cqk.d(pz5Var.f, this.f)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz5)) {
            return false;
        }
        pz5 pz5Var = (pz5) obj;
        return cqk.d(this.a, pz5Var.a) && this.b == pz5Var.b && cqk.d(this.c, pz5Var.c) && cqk.d(this.d, pz5Var.d) && cqk.d(this.e, pz5Var.e) && cqk.d(this.f, pz5Var.f) && cqk.d(this.g, pz5Var.g) && cqk.d(this.h, pz5Var.h) && this.i.equals(pz5Var.i) && cqk.d(this.j, pz5Var.j) && this.k == pz5Var.k && this.l == pz5Var.l && cqk.d(this.m, pz5Var.m);
    }

    public final int hashCode() {
        String str = this.a;
        int iG = qt4.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.d;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        sx3 sx3Var = this.e;
        int iHashCode3 = (iHashCode2 + (sx3Var == null ? 0 : sx3Var.a.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        sx3 sx3Var2 = this.g;
        int iHashCode5 = (iHashCode4 + (sx3Var2 == null ? 0 : sx3Var2.a.hashCode())) * 31;
        String str4 = this.h;
        int iH = bc1.h((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i);
        String str5 = this.j;
        int iHashCode6 = (iH + (str5 == null ? 0 : str5.hashCode())) * 31;
        kni kniVar = this.k;
        int iN = nbh.n((iHashCode6 + (kniVar == null ? 0 : kniVar.hashCode())) * 31, 31, this.l);
        Long l = this.m;
        return iN + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "EditContactProfileUiModel(avatarUrl=", this.a, ", contactId=");
        sbB.append(", firstName=");
        sbB.append(this.c);
        sbB.append(", abbreviation=");
        sbB.append((Object) this.d);
        sbB.append(", firstNameError=");
        sbB.append(this.e);
        sbB.append(", lastName=");
        sbB.append(this.f);
        sbB.append(", lastNameError=");
        sbB.append(this.g);
        sbB.append(", description=");
        sbB.append(this.h);
        sbB.append(", shortLink=");
        sbB.append(this.i);
        sbB.append(", phoneNumber=");
        sbB.append(this.j);
        sbB.append(", inactiveTtl=");
        sbB.append(this.k);
        sbB.append(", isInDeleteState=");
        sbB.append(this.l);
        sbB.append(", removeProfileTimestamp=");
        sbB.append(this.m);
        sbB.append(")");
        return sbB.toString();
    }
}
