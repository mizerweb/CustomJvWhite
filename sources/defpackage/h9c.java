package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class h9c implements Parcelable {
    public static final Parcelable.Creator<h9c> CREATOR = new v39(29);
    public static final h9c h = new h9c(x8c.a, "", null, d9c.a, new o8c(0, 0, 0, 15), s8c.b, g9c.a);
    public final a9c a;
    public final CharSequence b;
    public final CharSequence c;
    public final f9c d;
    public final o8c e;
    public final u8c f;
    public final g9c g;

    public h9c(a9c a9cVar, CharSequence charSequence, CharSequence charSequence2, f9c f9cVar, o8c o8cVar, u8c u8cVar, g9c g9cVar) {
        this.a = a9cVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = f9cVar;
        this.e = o8cVar;
        this.f = u8cVar;
        this.g = g9cVar;
    }

    public static h9c a(h9c h9cVar, a9c a9cVar, CharSequence charSequence, CharSequence charSequence2, f9c f9cVar, o8c o8cVar, u8c u8cVar, g9c g9cVar, int i) {
        if ((i & 1) != 0) {
            a9cVar = h9cVar.a;
        }
        a9c a9cVar2 = a9cVar;
        if ((i & 2) != 0) {
            charSequence = h9cVar.b;
        }
        CharSequence charSequence3 = charSequence;
        if ((i & 4) != 0) {
            charSequence2 = h9cVar.c;
        }
        CharSequence charSequence4 = charSequence2;
        if ((i & 8) != 0) {
            f9cVar = h9cVar.d;
        }
        f9c f9cVar2 = f9cVar;
        if ((i & 16) != 0) {
            o8cVar = h9cVar.e;
        }
        o8c o8cVar2 = o8cVar;
        if ((i & 32) != 0) {
            u8cVar = h9cVar.f;
        }
        u8c u8cVar2 = u8cVar;
        if ((i & 64) != 0) {
            g9cVar = h9cVar.g;
        }
        h9cVar.getClass();
        return new h9c(a9cVar2, charSequence3, charSequence4, f9cVar2, o8cVar2, u8cVar2, g9cVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9c)) {
            return false;
        }
        h9c h9cVar = (h9c) obj;
        return cqk.d(this.a, h9cVar.a) && cqk.d(this.b, h9cVar.b) && cqk.d(this.c, h9cVar.c) && cqk.d(this.d, h9cVar.d) && cqk.d(this.e, h9cVar.e) && cqk.d(this.f, h9cVar.f) && this.g == h9cVar.g;
    }

    public final int hashCode() {
        int iF = mw7.f(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iF + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OneMeSnackbarModel(left=" + this.a + ", title=" + ((Object) this.b) + ", caption=" + ((Object) this.c) + ", right=" + this.d + ", params=" + this.e + ", duration=" + this.f + ", style=" + this.g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        TextUtils.writeToParcel(this.b, parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeParcelable(this.d, i);
        this.e.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g.name());
    }

    public /* synthetic */ h9c(a9c a9cVar, String str, String str2, o8c o8cVar) {
        this(a9cVar, str, str2, d9c.a, o8cVar, s8c.b, g9c.a);
    }
}
