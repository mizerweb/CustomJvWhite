package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class vyl extends kkk {
    public final m38 n0(dqb dqbVar, String str, int i) {
        Parcel parcelL0 = l0();
        buk.b(parcelL0, dqbVar);
        parcelL0.writeString(str);
        parcelL0.writeInt(i);
        Parcel parcelV = V(2, parcelL0);
        m38 m38VarN0 = dqb.n0(parcelV.readStrongBinder());
        parcelV.recycle();
        return m38VarN0;
    }

    public final m38 o0(dqb dqbVar, String str, int i) {
        Parcel parcelL0 = l0();
        buk.b(parcelL0, dqbVar);
        parcelL0.writeString(str);
        parcelL0.writeInt(i);
        Parcel parcelV = V(4, parcelL0);
        m38 m38VarN0 = dqb.n0(parcelV.readStrongBinder());
        parcelV.recycle();
        return m38VarN0;
    }

    public final m38 p0(dqb dqbVar, String str, boolean z, long j) {
        Parcel parcelL0 = l0();
        buk.b(parcelL0, dqbVar);
        parcelL0.writeString(str);
        parcelL0.writeInt(z ? 1 : 0);
        parcelL0.writeLong(j);
        Parcel parcelV = V(7, parcelL0);
        m38 m38VarN0 = dqb.n0(parcelV.readStrongBinder());
        parcelV.recycle();
        return m38VarN0;
    }

    public final m38 q0(dqb dqbVar, String str, int i, dqb dqbVar2) {
        Parcel parcelL0 = l0();
        buk.b(parcelL0, dqbVar);
        parcelL0.writeString(str);
        parcelL0.writeInt(i);
        buk.b(parcelL0, dqbVar2);
        Parcel parcelV = V(8, parcelL0);
        m38 m38VarN0 = dqb.n0(parcelV.readStrongBinder());
        parcelV.recycle();
        return m38VarN0;
    }
}
