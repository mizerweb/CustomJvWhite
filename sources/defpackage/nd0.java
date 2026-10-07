package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nd0 extends f2 {
    /* JADX WARN: Illegal instructions before constructor call */
    public nd0(int i) {
        short s = 1;
        if (i != 1) {
            s = 2;
            if (i != 2) {
                throw null;
            }
        }
        super("registration_failed", q1f.c(new ylc("reason", Short.valueOf(s))));
    }
}
