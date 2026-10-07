package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v22 sne[], still in use, count: 1, list:
  (r0v22 sne[]) from 0x00e8: CONSTRUCTOR (r0v22 sne[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sne {
    /* JADX INFO: Fake field, exist only in values array */
    BODY_0(0),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_1(1),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_2(2),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_3(3),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_4(4),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_5(5),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_6(6),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_7(7),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_8(8),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_9(9),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_10(10),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_11(11),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_12(12),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_13(13),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_14(14),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_15(15),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_16(16),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_17(17),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_18(18),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_19(19),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_20(20),
    /* JADX INFO: Fake field, exist only in values array */
    BODY_21(21);

    public static final /* synthetic */ ma6 c;
    public final int a;

    static {
        c = new ma6(sneVarArr);
    }

    public sne(int i) {
        super(str, i);
        this.a = i;
    }

    public static sne valueOf(String str) {
        return (sne) Enum.valueOf(sne.class, str);
    }

    public static sne[] values() {
        return (sne[]) b.clone();
    }
}
