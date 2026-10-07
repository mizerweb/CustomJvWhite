package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jhg[], still in use, count: 1, list:
  (r0v1 jhg[]) from 0x0020: CONSTRUCTOR (r0v1 jhg[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class jhg implements Parcelable, n51 {
    CHAT("chat"),
    CHANNEL("channel");

    public static final Parcelable.Creator<jhg> CREATOR = new c5e(18);
    public static final /* synthetic */ ma6 e;
    public final String a;

    static {
        e = new ma6(new jhg[]{r0, r1});
    }

    public jhg(String str) {
        super(str, i);
        this.a = str;
    }

    public static jhg valueOf(String str) {
        return (jhg) Enum.valueOf(jhg.class, str);
    }

    public static jhg[] values() {
        return (jhg[]) d.clone();
    }

    @Override // defpackage.n51
    public final Object a(String str) {
        for (jhg jhgVar : e) {
            if (jhgVar.a.equals(str)) {
                return jhgVar;
            }
        }
        ore.f("Collection contains no element matching the predicate.");
        return null;
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
