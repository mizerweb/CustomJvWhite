package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class jef implements Parcelable, k79 {
    public static final Parcelable.Creator<jef> CREATOR = new c5e(6);
    public final kb9 a;
    public final boolean b;
    public final Uri c;
    public final Uri d;
    public final String e;
    public final RectF f;
    public final Rect g;
    public final Uri h;
    public final int i;
    public final long j;

    public jef(kb9 kb9Var, boolean z, Uri uri, Uri uri2, String str, RectF rectF, Rect rect, Uri uri3) {
        this.a = kb9Var;
        this.b = z;
        this.c = uri;
        this.d = uri2;
        this.e = str;
        this.f = rectF;
        this.g = rect;
        this.h = uri3;
        this.i = kb9Var.l.ordinal();
        this.j = kb9Var.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jef)) {
            return false;
        }
        jef jefVar = (jef) obj;
        return cqk.d(this.a, jefVar.a) && this.b == jefVar.b && cqk.d(this.c, jefVar.c) && cqk.d(this.d, jefVar.d) && cqk.d(this.e, jefVar.e) && cqk.d(this.f, jefVar.f) && cqk.d(this.g, jefVar.g) && cqk.d(this.h, jefVar.h);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + nbh.n(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        RectF rectF = this.f;
        int iHashCode3 = (iHashCode2 + (rectF == null ? 0 : rectF.hashCode())) * 31;
        Rect rect = this.g;
        int iHashCode4 = (iHashCode3 + (rect == null ? 0 : rect.hashCode())) * 31;
        Uri uri = this.h;
        return iHashCode4 + (uri != null ? uri.hashCode() : 0);
    }

    @Override // defpackage.k79
    public final int j() {
        return this.i;
    }

    public final String toString() {
        return "SelectedLocalMediaItem(localMediaItem=" + this.a + ", isFile=" + this.b + ", photoEditorUri=" + this.c + ", thumbnail=" + this.d + ", photoEditorFilePath=" + this.e + ", relativeCrop=" + this.f + ", absoluteCrop=" + this.g + ", overlay=" + this.h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
    }
}
