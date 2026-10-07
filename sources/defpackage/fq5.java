package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class fq5 {
    private final boolean a;
    private final boolean b;

    public static class a {
        private boolean a = false;
        private boolean b = false;

        public fq5 a() {
            return new fq5(this.a, this.b, null);
        }

        public a b() {
            this.a = true;
            return this;
        }

        public a c() {
            this.b = true;
            return this;
        }
    }

    public /* synthetic */ fq5(boolean z, boolean z2, fqk fqkVar) {
        this.a = z;
        this.b = z2;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fq5)) {
            return false;
        }
        fq5 fq5Var = (fq5) obj;
        return this.a == fq5Var.a && this.b == fq5Var.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }
}
