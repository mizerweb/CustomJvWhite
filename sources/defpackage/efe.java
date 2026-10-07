package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class efe extends e0 {
    public static final Parcelable.Creator<efe> CREATOR = new d0(4);
    public Parcelable c;

    public efe(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? vee.class.getClassLoader() : classLoader);
    }

    public final void b(efe efeVar) {
        this.c = efeVar.c;
    }

    @Override // defpackage.e0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, 0);
    }

    public efe(Parcelable parcelable) {
        super(parcelable);
    }
}
