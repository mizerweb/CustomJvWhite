package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class cmk extends z3 {
    public static final Parcelable.Creator<cmk> CREATOR = new pkk(10);
    public final int a;
    public final IBinder b;
    public final le4 c;
    public final boolean d;
    public final boolean e;

    public cmk(int i, IBinder iBinder, le4 le4Var, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = le4Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        Object v6mVar;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof cmk)) {
                return false;
            }
            cmk cmkVar = (cmk) obj;
            if (!this.c.equals(cmkVar.c)) {
                return false;
            }
            Object v6mVar2 = null;
            IBinder iBinder = this.b;
            if (iBinder == null) {
                v6mVar = null;
            } else {
                int i = i5.d;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                v6mVar = iInterfaceQueryLocalInterface instanceof s28 ? (s28) iInterfaceQueryLocalInterface : new v6m(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = cmkVar.b;
            if (iBinder2 != null) {
                int i2 = i5.d;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                v6mVar2 = iInterfaceQueryLocalInterface2 instanceof s28 ? (s28) iInterfaceQueryLocalInterface2 : new v6m(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!f55.h(v6mVar, v6mVar2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        jol.j(parcel, 2, this.b);
        jol.n(parcel, 3, this.c, i);
        jol.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        jol.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        jol.u(iT, parcel);
    }
}
