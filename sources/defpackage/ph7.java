package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ph7 implements Parcelable {
    public static final Parcelable.Creator<ph7> CREATOR = new uu5(7);
    public static final ph7 r = new ph7(true, true, true, false, false, false, false, false, 3968);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ifh q;

    static {
        new ph7(true, true, false, false, true, true, false, false, 7296);
    }

    public /* synthetic */ ph7(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        this(z, z2, z3, false, r66.a, false, false, (i & np0.m) != 0 ? false : z4, (i & np0.n) != 0 ? false : z5, (i & np0.o) != 0 ? false : z6, (i & 1024) != 0 ? false : z7, (i & np0.q) != 0 ? false : z8, (i & np0.r) != 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph7)) {
            return false;
        }
        ph7 ph7Var = (ph7) obj;
        return this.a == ph7Var.a && this.b == ph7Var.b && this.c == ph7Var.c && this.d == ph7Var.d && cqk.d(this.e, ph7Var.e) && this.f == ph7Var.f && this.g == ph7Var.g && this.h == ph7Var.h && this.i == ph7Var.i && this.j == ph7Var.j && this.k == ph7Var.k && this.l == ph7Var.l && this.m == ph7Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(qv1.c(nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("GalleryMode(needCameraView=", this.a, ", useVideos=", this.b, ", multiSelectionEnabled=");
        qt4.B(", isMessageEdit=", ", selectedItems=", sbB, this.c, this.d);
        sbB.append(this.e);
        sbB.append(", profileCreation=");
        sbB.append(this.f);
        sbB.append(", useTopInset=");
        qt4.B(", fromQrScanner=", ", useStoryCamera=", sbB, this.g, this.h);
        qt4.B(", useTextStory=", ", isRectCrop=", sbB, this.i, this.j);
        qt4.B(", needOpenMediaEditor=", ", isOverscrollEnabled=", sbB, this.k, this.l);
        return qt4.r(sbB, this.m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        List list = this.e;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
    }

    public ph7(boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
        this.m = z12;
        boolean z13 = true;
        this.n = !z2;
        this.o = !z7;
        if (!z8 && !z9) {
            z13 = false;
        }
        this.p = z13;
        this.q = new ifh(new mp5(15, this));
    }
}
