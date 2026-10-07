package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class tkk {
    public final jp a;
    public final do6 b;

    public /* synthetic */ tkk(jp jpVar, do6 do6Var) {
        this.a = jpVar;
        this.b = do6Var;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof tkk)) {
            return false;
        }
        tkk tkkVar = (tkk) obj;
        return f55.h(this.a, tkkVar.a) && f55.h(this.b, tkkVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        qg7 qg7Var = new qg7(this);
        qg7Var.e(this.a, "key");
        qg7Var.e(this.b, "feature");
        return qg7Var.toString();
    }
}
