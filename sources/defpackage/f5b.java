package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class f5b extends Binder implements i38 {
    public final /* synthetic */ i5b c;

    public f5b(i5b i5bVar) {
        this.c = i5bVar;
        attachInterface(this, i38.a);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.i38
    public final void g(String[] strArr) {
        i5b i5bVar = this.c;
        yab.i0((gu4) i5bVar.f, null, 0, new wz6(strArr, i5bVar, (lq4) null, 20), 3);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = i38.a;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        g(parcel.createStringArray());
        return true;
    }
}
