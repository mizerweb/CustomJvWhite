package defpackage;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class ll9 {
    public final ok0 a;
    public final CharSequence b;
    public final fu1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final npi i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final CharSequence m;
    public final String n;
    public final int o;
    public final boolean p;

    public ll9(ok0 ok0Var, CharSequence charSequence, fu1 fu1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, npi npiVar, boolean z6, boolean z7, int i, SpannableStringBuilder spannableStringBuilder, String str, int i2, boolean z8) {
        this.a = ok0Var;
        this.b = charSequence;
        this.c = fu1Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = npiVar;
        this.j = z6;
        this.k = z7;
        this.l = i;
        this.m = spannableStringBuilder;
        this.n = str;
        this.o = i2;
        this.p = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll9)) {
            return false;
        }
        ll9 ll9Var = (ll9) obj;
        return cqk.d(this.a, ll9Var.a) && cqk.d(this.b, ll9Var.b) && cqk.d(this.c, ll9Var.c) && this.d == ll9Var.d && this.e == ll9Var.e && this.f == ll9Var.f && this.g == ll9Var.g && this.h == ll9Var.h && cqk.d(this.i, ll9Var.i) && this.j == ll9Var.j && this.k == ll9Var.k && this.l == ll9Var.l && cqk.d(this.m, ll9Var.m) && cqk.d(this.n, ll9Var.n) && this.o == ll9Var.o && this.p == ll9Var.p;
    }

    public final int hashCode() {
        ok0 ok0Var = this.a;
        int iHashCode = (ok0Var == null ? 0 : ok0Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        fu1 fu1Var = this.c;
        int iN = nbh.n(nbh.n(nbh.n(nbh.n(nbh.n((iHashCode2 + (fu1Var == null ? 0 : fu1Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        npi npiVar = this.i;
        int iF = c0a.f(this.l, nbh.n(nbh.n((iN + (npiVar == null ? 0 : npiVar.hashCode())) * 31, 31, this.j), 31, this.k), 31);
        CharSequence charSequence2 = this.m;
        int iHashCode3 = (iF + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.n;
        return Boolean.hashCode(this.p) + c0a.f(this.o, (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MainSpeakerState(avatar=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", isOfficial=");
        sb.append(this.d);
        sb.append(", isTalking=");
        qt4.B(", isConnectedOnce=", ", isUserConnectionOnce=", sb, this.e, this.f);
        qt4.B(", isConnecting=", ", videoState=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", isMe=");
        sb.append(this.j);
        sb.append(", isRaiseHand=");
        sb.append(this.k);
        sb.append(", talkingState=");
        sb.append(pye.i(this.l));
        sb.append(", label=");
        sb.append((Object) this.m);
        sb.append(", userNameAccessibility=");
        sb.append(this.n);
        sb.append(", backgroundState=");
        int i = this.o;
        if (i == 1) {
            str = "CALLING";
        } else if (i == 2) {
            str = "ACTIVE";
        } else if (i == 3) {
            str = "NO_CONNECTION";
        } else if (i != 4) {
            str = i != 5 ? "null" : "NONE";
        } else {
            str = "HOLD";
        }
        sb.append(str);
        sb.append(", isOnHold=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
