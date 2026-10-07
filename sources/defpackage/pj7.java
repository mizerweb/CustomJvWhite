package defpackage;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pj7 extends rt8 {
    public final int a;
    public final l38 b;
    public final boolean c;
    public kv8 d;
    public boolean e;

    static {
        qt8.WRITE_NUMBERS_AS_STRINGS.getClass();
        qt8.ESCAPE_NON_ASCII.getClass();
        qt8.STRICT_DUPLICATE_DETECTION.getClass();
    }

    public pj7(int i, l38 l38Var) {
        this.a = i;
        this.b = l38Var;
        this.d = new kv8(0, null, qt8.STRICT_DUPLICATE_DETECTION.a(i) ? new ljf(this) : null);
        this.c = qt8.WRITE_NUMBERS_AS_STRINGS.a(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.e) {
            return;
        }
        this.b.close();
        this.e = true;
    }

    public final String o0(BigDecimal bigDecimal) throws JsonGenerationException {
        if (!qt8.WRITE_BIGDECIMAL_AS_PLAIN.a(this.a)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale >= -9999 && iScale <= 9999) {
            return bigDecimal.toPlainString();
        }
        rt8.A(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        throw null;
    }

    public final boolean r0(qt8 qt8Var) {
        return (this.a & qt8Var.b) != 0;
    }
}
