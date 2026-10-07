package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class ibh extends jbh {
    public final int d;

    public ibh(id7 id7Var, String str, int i) {
        super(id7Var, str);
        this.d = i;
    }

    @Override // defpackage.vxe
    public final void B(int i, String str) {
        l();
        n1g.a0(25, "column index out of range");
        throw null;
    }

    @Override // defpackage.vxe
    public final String B0(int i) {
        l();
        n1g.a0(21, "no row");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    @Override // defpackage.vxe
    public final boolean M0() throws IllegalAccessException, InvocationTargetException {
        int iD = qt4.D(this.d);
        id7 id7Var = this.a;
        if (iD == 0) {
            id7Var.o0();
            id7Var.E();
        } else if (iD == 1) {
            id7Var.E();
        } else if (iD == 2) {
            id7Var.l();
        } else if (iD == 3) {
            id7Var.y();
        } else {
            if (iD != 4) {
                ore.o();
                return false;
            }
            SQLiteDatabase sQLiteDatabase = id7Var.a;
            ny8 ny8Var = id7.e;
            if (((Method) ny8Var.getValue()) != null) {
                ny8 ny8Var2 = id7.d;
                if (((Method) ny8Var2.getValue()) != null) {
                    Method method = (Method) ny8Var.getValue();
                    Object objInvoke = ((Method) ny8Var2.getValue()).invoke(sQLiteDatabase, null);
                    if (objInvoke != null) {
                        method.invoke(objInvoke, 0, null, 0, null);
                    } else {
                        ore.k("Required value was null.");
                    }
                } else {
                    id7Var.l();
                }
            } else {
                id7Var.l();
            }
        }
        return false;
    }

    @Override // defpackage.vxe
    public final void a(int i, double d) {
        l();
        n1g.a0(25, "column index out of range");
        throw null;
    }

    @Override // defpackage.vxe
    public final void c(int i, long j) {
        l();
        n1g.a0(25, "column index out of range");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c = true;
    }

    @Override // defpackage.vxe
    public final void d(int i, byte[] bArr) {
        l();
        n1g.a0(25, "column index out of range");
        throw null;
    }

    @Override // defpackage.vxe
    public final void e(int i) {
        l();
        n1g.a0(25, "column index out of range");
        throw null;
    }

    @Override // defpackage.vxe
    public final byte[] getBlob(int i) {
        l();
        n1g.a0(21, "no row");
        throw null;
    }

    @Override // defpackage.vxe
    public final int getColumnCount() {
        l();
        return 0;
    }

    @Override // defpackage.vxe
    public final String getColumnName(int i) {
        l();
        n1g.a0(21, "no row");
        throw null;
    }

    @Override // defpackage.vxe
    public final double getDouble(int i) {
        l();
        n1g.a0(21, "no row");
        throw null;
    }

    @Override // defpackage.vxe
    public final long getLong(int i) {
        l();
        n1g.a0(21, "no row");
        throw null;
    }

    @Override // defpackage.vxe
    public final boolean isNull(int i) {
        l();
        n1g.a0(21, "no row");
        throw null;
    }
}
