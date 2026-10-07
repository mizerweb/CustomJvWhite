package defpackage;

import android.database.Cursor;
import java.io.IOException;
import one.me.sdk.database.DbCorruptionException;

/* JADX INFO: loaded from: classes.dex */
public final class mu4 extends n31 {
    public final n31 b;
    public final a1c c;
    public final sre d;

    public mu4(n31 n31Var, a1c a1cVar, sre sreVar) {
        super(n31Var.a);
        this.b = n31Var;
        this.c = a1cVar;
        this.d = sreVar;
    }

    @Override // defpackage.n31
    public final void f(id7 id7Var) throws Exception {
        try {
            gm0.x("DbCorruption", "onConfigure", null);
            this.b.f(id7Var);
        } catch (Exception e) {
            gm0.V("DbCorruption", "fail in onConfigure", new DbCorruptionException("fail in onConfigure", e));
            throw e;
        }
    }

    @Override // defpackage.n31
    public final void g(id7 id7Var) throws Exception {
        try {
            gm0.Y("DbCorruption", "onCorruption");
            dol.b(id7Var);
            i(id7Var);
            this.c.b(3);
        } catch (Exception e) {
            gm0.V("DbCorruption", "fail in onCorruption", new DbCorruptionException("fail in onCorruption", e));
            throw e;
        }
    }

    @Override // defpackage.n31
    public final void i(id7 id7Var) throws Exception {
        try {
            gm0.x("DbCorruption", "onCreate", null);
            this.b.i(id7Var);
        } catch (Exception e) {
            gm0.V("DbCorruption", "fail in onCreate", new DbCorruptionException("fail in onCreate", e));
            throw e;
        }
    }

    @Override // defpackage.n31
    public final void k(id7 id7Var, int i, int i2) throws Exception {
        try {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "DbCorruption", "onDowngrade " + i + " -> " + i2, null);
                }
            }
            this.b.k(id7Var, i, i2);
        } catch (Exception e) {
            gm0.V("DbCorruption", "fail in onDowngrade", new DbCorruptionException("fail in onDowngrade", e));
            throw e;
        }
    }

    @Override // defpackage.n31
    public final void n(id7 id7Var) throws Exception {
        try {
            gm0.x("DbCorruption", "onOpen", null);
            if (q(id7Var)) {
                this.b.n(id7Var);
                return;
            }
            dol.b(id7Var);
            i(id7Var);
            this.c.b(2);
        } catch (Exception e) {
            gm0.V("DbCorruption", "fail in onOpen", new DbCorruptionException("fail in onOpen", e));
            throw e;
        }
    }

    @Override // defpackage.n31
    public final void p(id7 id7Var, int i, int i2) throws Exception {
        try {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "DbCorruption", "onUpgrade: " + i + "->" + i2, null);
                }
            }
            this.b.p(id7Var, i, i2);
        } catch (Exception e) {
            gm0.V("DbCorruption", "fail in onUpgrade", new DbCorruptionException("fail in onUpgrade", e));
            throw e;
        }
    }

    public final boolean q(id7 id7Var) throws IOException {
        Cursor cursorY = id7Var.Y("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
        try {
            String string = cursorY.moveToNext() ? cursorY.getString(0) : null;
            cursorY.close();
            j48 j48Var = (j48) this.d.invoke();
            if (j48Var.a.equals(string) || j48Var.b.equals(string)) {
                gm0.x("DbCorruption", "check identity ok", null);
                return true;
            }
            DbCorruptionException dbCorruptionException = new DbCorruptionException("identity hash", null, 2, null);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "DbCorruption", qv1.l("fatal corruption error: required hash: ", j48Var.a, ", found: ", string), dbCorruptionException);
                }
            }
            return false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(cursorY, th);
                throw th2;
            }
        }
    }
}
