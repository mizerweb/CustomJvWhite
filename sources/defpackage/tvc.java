package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class tvc implements Parcelable {
    public static final Parcelable.Creator<tvc> CREATOR = new p8c(20);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public tvc(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvc)) {
            return false;
        }
        tvc tvcVar = (tvc) obj;
        return this.a == tvcVar.a && this.b == tvcVar.b && this.c == tvcVar.c && this.d == tvcVar.d && this.e == tvcVar.e && this.f == tvcVar.f && this.g == tvcVar.g && this.h == tvcVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("PhotoEditorViewState(redoVisible=", this.a, ", undoEnabled=", this.b, ", clearEnabled=");
        qt4.B(", drawStickerVisible=", ", drawStickerEnabled=", sbB, this.c, this.d);
        qt4.B(", doneEnabled=", ", isRegularSending=", sbB, this.e, this.f);
        return bc1.m(", controlsVisible=", ")", sbB, this.g, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
