package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 s37[], still in use, count: 1, list:
  (r0v1 s37[]) from 0x0038: CONSTRUCTOR (r0v1 s37[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class s37 {
    /* JADX INFO: Fake field, exist only in values array */
    HIDE_EMPTY(0),
    NO_DELETE(1),
    NO_TITLE_EDIT(2),
    NO_FILTERS_EDIT(3),
    CHAT_SUGGEST(4);

    public static final Set b = Collections.unmodifiableSet(EnumSet.noneOf(s37.class));
    public static final /* synthetic */ ma6 h;
    public final int a;

    static {
        h = new ma6(new s37[]{r0, r1, r2, r3, r4});
    }

    public s37(int i) {
        super(str, i);
        this.a = i;
    }

    public static s37 valueOf(String str) {
        return (s37) Enum.valueOf(s37.class, str);
    }

    public static s37[] values() {
        return (s37[]) g.clone();
    }
}
