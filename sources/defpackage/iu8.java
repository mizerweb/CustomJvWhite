package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iu8 implements Closeable {
    public int a;

    static {
        sa6.c(m4h.values());
    }

    public static JsonParseException b(String str, xt8 xt8Var) {
        return new JsonParseException(str, xt8Var, null);
    }

    public abstract char[] A();

    public abstract int E();

    public abstract int I();

    public final boolean K(n4h n4hVar) {
        return n4hVar.c.a(this.a);
    }

    public abstract cv8 P();

    public abstract xt8 l();

    public abstract String y();
}
