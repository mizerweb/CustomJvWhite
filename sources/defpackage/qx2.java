package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class qx2 extends Enum implements Parcelable, n51 {
    public static final Parcelable.Creator<qx2> CREATOR = new s9(6);

    /* JADX INFO: renamed from: b */
    public static final qx2 LOCAL_ID;
    public static final /* synthetic */ qx2[] c;
    public static final /* synthetic */ ma6 d;
    public final String a;

    /* JADX INFO: renamed from: EF19 */
    qx2 SERVER_ID;

    static {
        qx2 qx2Var = new qx2("local");
        LOCAL_ID = qx2Var;
        qx2[] qx2VarArr = {qx2Var, new qx2("server")};
        c = qx2VarArr;
        d = new ma6(qx2VarArr);
        CREATOR = new s9(6);
    }

    public qx2(String str) {
        super(str, i);
        this.a = str;
    }

    public static qx2 valueOf(String str) {
        return (qx2) Enum.valueOf(qx2.class, str);
    }

    public static qx2[] values() {
        return (qx2[]) c.clone();
    }

    @Override // defpackage.n51
    public final Object a(String str) {
        return mll.b(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
