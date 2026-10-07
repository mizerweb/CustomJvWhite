package defpackage;

import java.io.IOException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 syd[], still in use, count: 1, list:
  (r0v1 syd[]) from 0x0027: CONSTRUCTOR (r0v1 syd[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class syd implements a4b {
    HUAWEI(1, "HUAWEI"),
    GCM(2, "GCM"),
    RUSTORE(3, "RUSTORE");

    public static final /* synthetic */ ma6 g;
    public final String a;
    public final int b;

    static {
        g = new ma6(sydVarArr);
    }

    public syd(int i, String str) {
        super(str, i);
        this.a = str;
        this.b = i;
    }

    public static syd valueOf(String str) {
        return (syd) Enum.valueOf(syd.class, str);
    }

    public static syd[] values() {
        return (syd[]) f.clone();
    }

    @Override // defpackage.a4b
    public final void a(yia yiaVar) throws IOException {
        yiaVar.P(this.a);
    }
}
