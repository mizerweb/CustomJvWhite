package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class md7 implements dbh {
    public final Context a;
    public final String b;
    public final n31 c;
    public final boolean d;
    public final boolean e;
    public final ifh f = new ifh(new d2(22, this));
    public boolean g;

    public md7(Context context, String str, n31 n31Var, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = n31Var;
        this.d = z;
        this.e = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ifh ifhVar = this.f;
        if (ifhVar.d()) {
            ((ld7) ifhVar.getValue()).close();
        }
    }

    @Override // defpackage.dbh
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.dbh
    public final id7 getWritableDatabase() {
        return ((ld7) this.f.getValue()).b(true);
    }

    @Override // defpackage.dbh
    public final void setWriteAheadLoggingEnabled(boolean z) {
        ifh ifhVar = this.f;
        if (ifhVar.d()) {
            ((ld7) ifhVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.g = z;
    }
}
