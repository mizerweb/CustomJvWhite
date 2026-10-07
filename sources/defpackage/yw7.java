package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yw7 implements k79 {
    public final long a;
    public final long b;
    public final CharSequence c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    public final CharSequence i;
    public final int j;
    public final qw7 k;
    public final Long l;
    public final List m;
    public final long n;

    public yw7(long j, long j2, CharSequence charSequence, String str, boolean z, String str2, String str3, boolean z2, CharSequence charSequence2, int i, qw7 qw7Var, Long l, List list) {
        this.a = j;
        this.b = j2;
        this.c = charSequence;
        this.d = str;
        this.e = z;
        this.f = str2;
        this.g = str3;
        this.h = z2;
        this.i = charSequence2;
        this.j = i;
        this.k = qw7Var;
        this.l = l;
        this.m = list;
        this.n = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw7)) {
            return false;
        }
        yw7 yw7Var = (yw7) obj;
        return this.a == yw7Var.a && this.b == yw7Var.b && this.c.equals(yw7Var.c) && cqk.d(this.d, yw7Var.d) && this.e == yw7Var.e && cqk.d(this.f, yw7Var.f) && this.g.equals(yw7Var.g) && this.h == yw7Var.h && this.i.equals(yw7Var.i) && this.j == yw7Var.j && this.k.equals(yw7Var.k) && cqk.d(this.l, yw7Var.l) && cqk.d(this.m, yw7Var.m);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.n;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return this.n == k79Var.getItemId();
    }

    public final int hashCode() {
        int iF = mw7.f(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (this.k.hashCode() + c0a.f(this.j, mw7.f(nbh.n(zo5.d(zo5.d(nbh.n((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31)) * 31;
        Long l = this.l;
        return this.m.hashCode() + ((iHashCode + (l != null ? l.hashCode() : 0)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 1;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        yw7 yw7Var = (yw7) k79Var;
        CharSequence charSequence = yw7Var.c;
        CharSequence charSequence2 = yw7Var.i;
        String str = yw7Var.g;
        c79 c79VarW = yab.w();
        String str2 = yw7Var.f;
        if (!cqk.d(this.f, str2)) {
            c79VarW.add(new vw7(str2));
        }
        if (!cqk.d(this.d, yw7Var.d) || this.b != yw7Var.b || !this.c.equals(charSequence) || this.e != yw7Var.e) {
            c79VarW.add(new rw7(yw7Var.b, charSequence, yw7Var.d, yw7Var.e));
        }
        if (!this.g.equals(str)) {
            c79VarW.add(new ww7(str));
        }
        boolean z = yw7Var.h;
        if (this.h != z) {
            c79VarW.add(new uw7(z));
        }
        if (!this.i.equals(charSequence2)) {
            c79VarW.add(new tw7(charSequence2));
        }
        int i = yw7Var.j;
        if (this.j != i) {
            c79VarW.add(new sw7(i));
        }
        return yab.j(c79VarW);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "HistoryItemState(id=", ", avatarColorId=");
        sbS.append(this.b);
        sbS.append(", abbreviation=");
        sbS.append((Object) this.c);
        sbS.append(", avatar=");
        sbS.append(this.d);
        sbS.append(", isCallLink=");
        sbS.append(this.e);
        nbh.G(sbS, ", callName=", this.f, ", time=", this.g);
        sbS.append(", isMissing=");
        sbS.append(this.h);
        sbS.append(", description=");
        sbS.append((Object) this.i);
        sbS.append(", callMediaType=");
        sbS.append(x05.q(this.j));
        sbS.append(", callType=");
        sbS.append(this.k);
        sbS.append(", historyId=");
        sbS.append(this.l);
        sbS.append(", mergedHistoryIds=");
        sbS.append(this.m);
        sbS.append(")");
        return sbS.toString();
    }
}
