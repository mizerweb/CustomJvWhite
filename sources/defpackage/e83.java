package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e83 implements Parcelable {
    public static final Parcelable.Creator<e83> CREATOR;
    public static final e83 a;
    public static final e83 b;
    public static final e83 c;
    public static final e83 d;
    public static final e83 e;
    public static final /* synthetic */ e83[] f;

    static {
        e83 e83Var = new e83("DIALOG_MESSAGE", 0);
        a = e83Var;
        e83 e83Var2 = new e83("CHAT_MESSAGE", 1);
        b = e83Var2;
        e83 e83Var3 = new e83("CHANNEL_MESSAGE", 2);
        c = e83Var3;
        e83 e83Var4 = new e83("GROUP_CHAT", 3);
        d = e83Var4;
        e83 e83Var5 = new e83("SCHEDULED_MESSAGE", 4);
        e = e83Var5;
        f = new e83[]{e83Var, e83Var2, e83Var3, e83Var4, e83Var5};
        CREATOR = new s9(8);
    }

    public static e83 valueOf(String str) {
        return (e83) Enum.valueOf(e83.class, str);
    }

    public static e83[] values() {
        return (e83[]) f.clone();
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
