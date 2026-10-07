package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return e0.b;
                }
                ore.k("superState must be null");
                return null;
            case 1:
                return new nq(parcel, null);
            case 2:
                return new dt4(parcel, null);
            case 3:
                return new yn9(parcel, null);
            case 4:
                return new efe(parcel, null);
            default:
                x8j x8jVar = new x8j(parcel, null);
                x8jVar.a = parcel.readInt();
                x8jVar.b = parcel.readInt();
                x8jVar.c = parcel.readParcelable(null);
                return x8jVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new e0[i];
            case 1:
                return new nq[i];
            case 2:
                return new dt4[i];
            case 3:
                return new yn9[i];
            case 4:
                return new efe[i];
            default:
                return new x8j[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return e0.b;
                }
                ore.k("superState must be null");
                return null;
            case 1:
                return new nq(parcel, classLoader);
            case 2:
                return new dt4(parcel, classLoader);
            case 3:
                return new yn9(parcel, classLoader);
            case 4:
                return new efe(parcel, classLoader);
            default:
                x8j x8jVar = new x8j(parcel, classLoader);
                x8jVar.a = parcel.readInt();
                x8jVar.b = parcel.readInt();
                x8jVar.c = parcel.readParcelable(classLoader);
                return x8jVar;
        }
    }
}
