package defpackage;

import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class pp0 {
    private final int a;
    private final boolean b;
    private final Executor c;
    private final s1k d;

    public static class a {
        private int a = 0;
        private boolean b;
        private Executor c;
        private s1k d;

        public pp0 a() {
            return new pp0(this.a, this.b, this.c, this.d, null);
        }

        public a b() {
            this.b = true;
            return this;
        }

        public a c(int i, int... iArr) {
            this.a = i;
            if (iArr != null) {
                for (int i2 : iArr) {
                    this.a = i2 | this.a;
                }
            }
            return this;
        }

        public a d(Executor executor) {
            this.c = executor;
            return this;
        }

        public a e(s1k s1kVar) {
            this.d = s1kVar;
            return this;
        }
    }

    public /* synthetic */ pp0(int i, boolean z, Executor executor, s1k s1kVar, omk omkVar) {
        this.a = i;
        this.b = z;
        this.c = executor;
        this.d = s1kVar;
    }

    public final int a() {
        return this.a;
    }

    public final s1k b() {
        return this.d;
    }

    public final Executor c() {
        return this.c;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pp0)) {
            return false;
        }
        pp0 pp0Var = (pp0) obj;
        return this.a == pp0Var.a && this.b == pp0Var.b && f55.h(this.c, pp0Var.c) && f55.h(this.d, pp0Var.d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), this.c, this.d});
    }
}
