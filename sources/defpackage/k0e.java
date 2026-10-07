package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 k0e[], still in use, count: 1, list:
  (r0v1 k0e[]) from 0x001d: CONSTRUCTOR (r0v1 k0e[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class k0e implements Parcelable {
    WEBAPP(1),
    LOGIN(2);

    public static final Parcelable.Creator<k0e> CREATOR = new p8c(29);
    public static final /* synthetic */ ma6 e;
    public final int a;

    static {
        e = new ma6(new k0e[]{r0, r1});
    }

    public k0e(int i) {
        super(str, i);
        this.a = i;
    }

    public static k0e valueOf(String str) {
        return (k0e) Enum.valueOf(k0e.class, str);
    }

    public static k0e[] values() {
        return (k0e[]) d.clone();
    }

    public final int a() {
        return this.a;
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
