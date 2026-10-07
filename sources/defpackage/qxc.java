package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class qxc implements k79 {
    public final long a;
    public final Long b;
    public final ynh c;
    public final ynh d;
    public final Uri e;
    public final boolean f;
    public final boolean g;
    public final xyc h;
    public final CharSequence i;
    public final Integer j;
    public final int[] k;
    public final boolean l;
    public final long m;

    public /* synthetic */ qxc(long j, Long l, ynh ynhVar, ynh ynhVar2, Uri uri, boolean z, boolean z2, xyc xycVar, CharSequence charSequence, Integer num, boolean z3, int i) {
        this(j, l, ynhVar, ynhVar2, uri, z, z2, xycVar, charSequence, (i & np0.o) != 0 ? null : num, (int[]) null, (i & np0.q) != 0 ? true : z3);
    }

    public static qxc i(qxc qxcVar, boolean z) {
        long j = qxcVar.a;
        Long l = qxcVar.b;
        ynh ynhVar = qxcVar.c;
        ynh ynhVar2 = qxcVar.d;
        Uri uri = qxcVar.e;
        boolean z2 = qxcVar.f;
        boolean z3 = qxcVar.g;
        xyc xycVar = qxcVar.h;
        CharSequence charSequence = qxcVar.i;
        Integer num = qxcVar.j;
        int[] iArr = qxcVar.k;
        qxcVar.getClass();
        return new qxc(j, l, ynhVar, ynhVar2, uri, z2, z3, xycVar, charSequence, num, iArr, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!qxc.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        qxc qxcVar = (qxc) obj;
        if (this.a != qxcVar.a || !cqk.d(this.b, qxcVar.b) || this.f != qxcVar.f || this.g != qxcVar.g || !cqk.d(this.j, qxcVar.j) || this.l != qxcVar.l) {
            return false;
        }
        qxcVar.getClass();
        return this.m == qxcVar.m && cqk.d(this.c, qxcVar.c) && cqk.d(this.d, qxcVar.d) && cqk.d(this.e, qxcVar.e) && cqk.d(this.h, qxcVar.h) && cqk.d(this.i, qxcVar.i) && Arrays.equals(this.k, qxcVar.k);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.m;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return this.m == k79Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int iN = nbh.n(nbh.n((iHashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 31, 31, this.f), 31, this.g);
        Integer num = this.j;
        int iH = bc1.h(qt4.g(nbh.n((iN + (num != null ? num.intValue() : 0)) * 31, 961, this.l), 31, this.m), 31, this.c);
        ynh ynhVar = this.d;
        int iHashCode2 = (iH + (ynhVar != null ? ynhVar.hashCode() : 0)) * 31;
        Uri uri = this.e;
        int iF = mw7.f((this.h.hashCode() + ((iHashCode2 + (uri != null ? uri.hashCode() : 0)) * 31)) * 31, 31, this.i);
        int[] iArr = this.k;
        return iF + (iArr != null ? Arrays.hashCode(iArr) : 0);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 0;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        boolean z;
        qxc qxcVar = k79Var instanceof qxc ? (qxc) k79Var : null;
        if (qxcVar == null || this.f == (z = qxcVar.f)) {
            return null;
        }
        return new pxc(z);
    }

    public final String toString() {
        return "PickerChatListItem(id=" + this.a + ", avatarSourceId=" + this.b + ", name=" + this.c + ", subtitle=" + this.d + ", avatar=" + this.e + ", isOnline=" + this.f + ", isVerified=" + this.g + ", entity=" + this.h + ", abbreviation=" + ((Object) this.i) + ", avatarIcon=" + this.j + ", iconGradientColors=" + Arrays.toString(this.k) + ", isEnabled=" + this.l + ")";
    }

    public qxc(long j, Long l, ynh ynhVar, ynh ynhVar2, Uri uri, boolean z, boolean z2, xyc xycVar, CharSequence charSequence, Integer num, int[] iArr, boolean z3) {
        this.a = j;
        this.b = l;
        this.c = ynhVar;
        this.d = ynhVar2;
        this.e = uri;
        this.f = z;
        this.g = z2;
        this.h = xycVar;
        this.i = charSequence;
        this.j = num;
        this.k = iArr;
        this.l = z3;
        this.m = xycVar.a;
    }
}
