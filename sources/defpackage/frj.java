package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 frj[], still in use, count: 1, list:
  (r0v1 frj[]) from 0x007a: CONSTRUCTOR (r0v1 frj[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class frj implements pkj {
    SECURE_SAVE_KEY("WebAppSecureStorageSaveKey", "secure_storage_save_key", 1),
    SECURE_GET_KEY("WebAppSecureStorageGetKey", "secure_storage_get_key", 2),
    SECURE_CLEAR_KEYS("WebAppSecureStorageClear", "secure_storage_clear", 4),
    SAVE_KEY("WebAppDeviceStorageSaveKey", "device_storage_save_key", 5),
    GET_KEY("WebAppDeviceStorageGetKey", "device_storage_get_key", 6),
    CLEAR_KEYS("WebAppDeviceStorageClear", "device_storage_clear", 7);

    public static final /* synthetic */ ma6 k;
    public final String a;
    public final String b;
    public final Integer c;

    static {
        k = new ma6(frjVarArr);
    }

    public frj(String str, String str2, Integer num) {
        super(str, i);
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public static frj valueOf(String str) {
        return (frj) Enum.valueOf(frj.class, str);
    }

    public static frj[] values() {
        return (frj[]) j.clone();
    }

    @Override // defpackage.pkj
    public final Integer a() {
        return this.c;
    }

    @Override // defpackage.pkj
    public final String h() {
        return this.a;
    }

    @Override // defpackage.pkj
    public final String i() {
        return this.b;
    }
}
