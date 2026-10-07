package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class s1k {
    private final b a;
    private final float b;

    public static class a {
        private final b a;
        private float b;

        public a(b bVar) {
            this.a = bVar;
        }

        public s1k a() {
            return new s1k(this.a, this.b, null);
        }

        public a b(float f) {
            this.b = f;
            return this;
        }
    }

    public interface b {
        boolean a(float f);
    }

    public /* synthetic */ s1k(b bVar, float f, iqk iqkVar) {
        this.a = bVar;
        this.b = f;
    }

    public final float a() {
        return this.b;
    }

    public final b b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s1k)) {
            return false;
        }
        s1k s1kVar = (s1k) obj;
        return f55.h(this.a, s1kVar.a) && this.b == s1kVar.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
