package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class w0f implements z09, Closeable {
    public final String a;
    public final v0f b;
    public boolean c;

    public w0f(String str, v0f v0fVar) {
        this.a = str;
        this.b = v0fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) {
        if (m09Var == m09.ON_DESTROY) {
            this.c = false;
            g19Var.f().f(this);
        }
    }
}
