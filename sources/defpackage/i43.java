package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i43 implements Parcelable {
    public static final Parcelable.Creator<i43> CREATOR;
    public static final i43 a;
    public static final i43 b;
    public static final /* synthetic */ i43[] c;
    public static final /* synthetic */ ma6 d;

    static {
        i43 i43Var = new i43("MEDIA", 0);
        a = i43Var;
        i43 i43Var2 = new i43("FILE", 1);
        i43 i43Var3 = new i43("LINK", 2);
        i43 i43Var4 = new i43("AUDIO", 3);
        b = i43Var4;
        i43[] i43VarArr = {i43Var, i43Var2, i43Var3, i43Var4};
        c = i43VarArr;
        d = new ma6(i43VarArr);
        CREATOR = new s9(7);
    }

    public static i43 valueOf(String str) {
        return (i43) Enum.valueOf(i43.class, str);
    }

    public static i43[] values() {
        return (i43[]) c.clone();
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
