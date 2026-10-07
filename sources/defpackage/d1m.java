package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class d1m extends kkk {
    public final m38 n0(dqb dqbVar, String str, int i, dqb dqbVar2) {
        Parcel parcelL0 = l0();
        buk.b(parcelL0, dqbVar);
        parcelL0.writeString(str);
        parcelL0.writeInt(i);
        buk.b(parcelL0, dqbVar2);
        Parcel parcelV = V(2, parcelL0);
        m38 m38VarN0 = dqb.n0(parcelV.readStrongBinder());
        parcelV.recycle();
        return m38VarN0;
    }

    public final m38 o0(dqb dqbVar, String str, int i, dqb dqbVar2) {
        Parcel parcelL0 = l0();
        buk.b(parcelL0, dqbVar);
        parcelL0.writeString(str);
        parcelL0.writeInt(i);
        buk.b(parcelL0, dqbVar2);
        Parcel parcelV = V(3, parcelL0);
        m38 m38VarN0 = dqb.n0(parcelV.readStrongBinder());
        parcelV.recycle();
        return m38VarN0;
    }
}
