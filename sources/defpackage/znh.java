package defpackage;

import java.util.Collections;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 znh[], still in use, count: 1, list:
  (r0v1 znh[]) from 0x01d9: CONSTRUCTOR (r0v1 znh[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class znh {
    /* JADX INFO: Fake field, exist only in values array */
    MAX(new tri(null, new qri(new int[]{-10968065, -7339777}, 225.0f), null, xw3.P0(new rri(0.0f, 80.05f, 70.38f, 140.37f, 123.0f, new float[]{0.0f, 0.5f, 1.0f}, new int[]{-13135873, 0, 0}), new rri(94.4f, 14.38f, 60.61f, 57.57f, 12.0f, new float[]{0.0f, 0.5f, 1.0f}, new int[]{-6749953, -2137456385, 0})), null, null), new int[]{-13335573, -9429505}),
    /* JADX INFO: Fake field, exist only in values array */
    FRESH(new tri(null, new qri(new int[]{-6291465, -2556184}, 225.0f), null, Collections.singletonList(new rri(0.0f, 80.05f, 70.38f, 140.37f, 123.0f, new float[]{0.0f, 0.5f, 1.0f}, new int[]{-7274506, 0, 0})), null, null), new int[]{-2162969, -10682396}),
    /* JADX INFO: Fake field, exist only in values array */
    ORANGE(new tri(null, new qri(new int[]{-41635, -3489}, 225.0f), null, xw3.P0(new rri(0.0f, 80.05f, 70.38f, 140.37f, 123.0f, new float[]{0.0f, 0.5f, 1.0f}, new int[]{-1593863290, 0, 0}), new rri(94.4f, 14.38f, 60.61f, 57.57f, 12.0f, new float[]{0.0f, 0.5f, 1.0f}, new int[]{-16539, -2130722971, 0})), null, null), new int[]{-26265, -47325}),
    /* JADX INFO: Fake field, exist only in values array */
    PINK(new tri(null, new qri(new int[]{-36678, -1799681}, 225.0f), null, xw3.P0(new rri(0.0f, 80.05f, 70.38f, 140.37f, 123.0f, new float[]{0.0f, 0.5f, 1.0f}, new int[]{-19998, 0, 0}), new rri(94.4f, 14.38f, 60.61f, 57.57f, 12.0f, new float[]{0.0f, 0.5f, 1.0f}, new int[]{-39488, -2130745920, 0})), null, null), new int[]{-25160, -41026}),
    /* JADX INFO: Fake field, exist only in values array */
    SIMPLE(new tri(null, new qri(new int[]{-13619412, -11382708}, 225.0f), null, null, null, null), new int[]{-13487826, -9737625});

    public static final /* synthetic */ ma6 d;
    public final tri a;
    public final int[] b;

    static {
        d = new ma6(znhVarArr);
    }

    public znh(tri triVar, int[] iArr) {
        super(str, i);
        this.a = triVar;
        this.b = iArr;
    }

    public static znh valueOf(String str) {
        return (znh) Enum.valueOf(znh.class, str);
    }

    public static znh[] values() {
        return (znh[]) c.clone();
    }
}
