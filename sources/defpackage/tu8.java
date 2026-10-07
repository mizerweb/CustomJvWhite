package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class tu8 extends qn8 {
    public final tu8 g;
    public final ljf h;
    public tu8 i;
    public String j;
    public int k;
    public int l;

    public tu8(tu8 tu8Var, int i, ljf ljfVar, int i2, int i3, int i4) {
        this.g = tu8Var;
        this.h = ljfVar;
        this.b = i2;
        this.k = i3;
        this.l = i4;
        this.c = -1;
        this.d = i;
    }

    @Override // defpackage.qn8
    public final String e() {
        return this.j;
    }

    public final void q(String str) {
        this.j = str;
        ljf ljfVar = this.h;
        if (ljfVar == null || !ljfVar.N(str)) {
            return;
        }
        Closeable closeable = (Closeable) ljfVar.c;
        throw new JsonParseException(closeable instanceof iu8 ? (iu8) closeable : null, c0a.o("Duplicate field '", str, "'"));
    }
}
