package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 nnd[], still in use, count: 1, list:
  (r0v1 nnd[]) from 0x002a: CONSTRUCTOR (r0v1 nnd[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class nnd implements Parcelable {
    LOCAL_CHAT("local_chat"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVER_CHAT("server_chat"),
    CONTACT("contact");

    public static final Parcelable.Creator<nnd> CREATOR = new p8c(27);
    public static final /* synthetic */ ma6 e;
    public final String a;

    static {
        e = new ma6(new nnd[]{r0, r1, r2});
    }

    public nnd(String str) {
        super(str, i);
        this.a = str;
    }

    public static nnd valueOf(String str) {
        return (nnd) Enum.valueOf(nnd.class, str);
    }

    public static nnd[] values() {
        return (nnd[]) d.clone();
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
