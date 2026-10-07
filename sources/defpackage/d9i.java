package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 d9i[], still in use, count: 1, list:
  (r0v1 d9i[]) from 0x005c: CONSTRUCTOR (r1v2 ma6) = (r0v1 d9i[]) A[MD:(java.lang.Enum[]):void (m)] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class d9i {
    INTEGER(0),
    FLOAT(1),
    LONG(2),
    STRING(3),
    STRINGS_SET(4),
    BOOLEAN(5),
    BIG_STRING(16),
    BIG_STRINGS_SET(17);

    public static final LinkedHashMap b;
    public final int a;

    static {
        ma6 ma6Var = new ma6(d9iVarArr);
        int iP0 = wm9.P0(yw3.W0(ma6Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0 >= 16 ? iP0 : 16);
        Iterator it = ma6Var.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                b = linkedHashMap;
                return;
            } else {
                Object next = y1Var.next();
                linkedHashMap.put(Integer.valueOf(((d9i) next).a), next);
            }
        }
    }

    public d9i(int i) {
        super(str, i);
        this.a = i;
    }

    public static d9i valueOf(String str) {
        return (d9i) Enum.valueOf(d9i.class, str);
    }

    public static d9i[] values() {
        return (d9i[]) k.clone();
    }

    public final int a() {
        return this == BIG_STRINGS_SET ? BIG_STRING.a() : this.a;
    }
}
