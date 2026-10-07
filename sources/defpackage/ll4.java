package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ll4 implements Serializable {
    public final String a;
    public final kl4 b;
    public final String c;

    public ll4(String str, kl4 kl4Var, String str2) {
        this.a = str;
        this.b = kl4Var;
        this.c = str2;
    }

    public final String a() {
        kl4 kl4Var = kl4.b;
        String str = this.a;
        kl4 kl4Var2 = this.b;
        if (kl4Var2 == kl4Var || kl4Var2 == kl4.a) {
            String str2 = this.c;
            if (ch3.s(str2)) {
                return zo5.p(str, " ", str2);
            }
        }
        return str;
    }

    public final String toString() {
        return zo5.w(qv1.q("{firstName='", this.a, "', type=", String.valueOf(this.b), "', lastName="), this.c, "}");
    }
}
