package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashSet;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 i37[], still in use, count: 1, list:
  (r1v2 i37[]) from 0x009a: CONSTRUCTOR (r1v2 i37[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class i37 {
    UNREAD(0),
    /* JADX INFO: Fake field, exist only in values array */
    READ(1),
    CHANNEL(2),
    CHAT(3),
    DIALOG(4),
    OWNER(5),
    ADMIN(6),
    MUTED(7),
    CONTACT(8),
    NOT_CONTACT(9),
    BOT(10),
    NOT_MUTED(11),
    MARKED_UNREAD(12),
    ORG(13);

    public static final LinkedHashSet b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;
    public static final LinkedHashSet e;
    public static final EnumMap f;
    public static final /* synthetic */ ma6 u;
    public final int a;

    static {
        i37 i37Var = UNREAD;
        i37 i37Var2 = CHANNEL;
        i37 i37Var3 = CHAT;
        i37 i37Var4 = OWNER;
        i37 i37Var5 = ADMIN;
        i37 i37Var6 = MUTED;
        i37 i37Var7 = CONTACT;
        i37 i37Var8 = NOT_CONTACT;
        i37 i37Var9 = BOT;
        i37 i37Var10 = NOT_MUTED;
        i37 i37Var11 = MARKED_UNREAD;
        i37 i37Var12 = ORG;
        u = new ma6(i37VarArr);
        b = lof.W(i37Var, i37Var6, i37Var10, i37Var11);
        c = lof.W(i37Var5, i37Var4);
        d = lof.W(i37Var7, i37Var8, i37Var3, i37Var2, i37Var9, i37Var12);
        e = lof.W(i37Var7, i37Var8, i37Var3, i37Var2, i37Var9);
        Collections.unmodifiableSet(EnumSet.noneOf(i37.class));
        ylc[] ylcVarArr = {new ylc(i37Var2, 9223372036854774807L), new ylc(i37Var3, 9223372036854774806L), new ylc(i37Var7, 9223372036854774805L), new ylc(i37Var8, 9223372036854774804L), new ylc(i37Var9, 9223372036854774803L)};
        EnumMap enumMap = new EnumMap(i37.class);
        for (int i = 0; i < 5; i++) {
            ylc ylcVar = ylcVarArr[i];
            enumMap.put((Enum) ylcVar.a, ylcVar.b);
        }
        f = enumMap;
    }

    public i37(int i) {
        super(str, i);
        this.a = i;
    }

    public static i37 valueOf(String str) {
        return (i37) Enum.valueOf(i37.class, str);
    }

    public static i37[] values() {
        return (i37[]) t.clone();
    }
}
