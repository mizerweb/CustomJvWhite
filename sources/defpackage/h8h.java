package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class h8h extends f8h implements Parcelable {
    public static final g8h CREATOR = new g8h();
    public final yy4 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public h8h(Parcel parcel) {
        Bundle bundle = parcel.readBundle(yy4.class.getClassLoader());
        this(yy4.b(bundle == null ? Bundle.EMPTY : bundle));
    }

    @Override // defpackage.f8h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.f8h, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yy4 yy4Var = this.b;
        Bundle bundleC = yy4Var.c();
        Bitmap bitmap = yy4Var.d;
        if (bitmap != null) {
            bundleC.putParcelable(yy4.w, bitmap);
        }
        parcel.writeBundle(bundleC);
    }

    public h8h(yy4 yy4Var) {
        super(String.valueOf(yy4Var.a));
        this.b = yy4Var;
    }
}
