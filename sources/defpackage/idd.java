package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final enum idd extends mdd {
    public idd() {
        super("ALWAYS_TRUE", 0);
    }

    @Override // defpackage.ddd
    public final boolean apply(Object obj) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Predicates.alwaysTrue()";
    }
}
