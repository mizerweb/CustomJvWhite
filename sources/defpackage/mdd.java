package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mdd extends Enum implements ddd {
    public static final idd a;
    public static final /* synthetic */ mdd[] b;

    static {
        idd iddVar = new idd();
        a = iddVar;
        b = new mdd[]{iddVar, new mdd() { // from class: jdd
            @Override // defpackage.ddd
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new mdd() { // from class: kdd
            @Override // defpackage.ddd
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new mdd() { // from class: ldd
            @Override // defpackage.ddd
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static mdd valueOf(String str) {
        return (mdd) Enum.valueOf(mdd.class, str);
    }

    public static mdd[] values() {
        return (mdd[]) b.clone();
    }
}
