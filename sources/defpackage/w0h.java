package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 w0h[], still in use, count: 1, list:
  (r0v1 w0h[]) from 0x0063: CONSTRUCTOR (r0v1 w0h[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class w0h {
    PENDING(0),
    PREPARED(1),
    UPLOADING(2),
    UPLOADED(3),
    PUBLISHING(4),
    PUBLISHED(5),
    UPLOAD_FAILED(6),
    PUBLISHING_FAILED(7),
    CANCELED(8);

    public static final /* synthetic */ ma6 l;
    public final int a;

    static {
        l = new ma6(w0hVarArr);
    }

    public w0h(int i) {
        super(str, i);
        this.a = i;
    }

    public static w0h valueOf(String str) {
        return (w0h) Enum.valueOf(w0h.class, str);
    }

    public static w0h[] values() {
        return (w0h[]) k.clone();
    }

    public final int a() {
        return this.a;
    }
}
