package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ld7 extends SQLiteOpenHelper {
    public static final /* synthetic */ int h = 0;
    public final Context a;
    public final pgg b;
    public final n31 c;
    public final boolean d;
    public boolean e;
    public final rid f;
    public boolean g;

    public ld7(Context context, String str, final pgg pggVar, final n31 n31Var, boolean z) {
        super(context, str, null, n31Var.a, new DatabaseErrorHandler() { // from class: jd7
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = ld7.h;
                pgg pggVar2 = pggVar;
                id7 id7Var = (id7) pggVar2.a;
                if (id7Var == null || !cqk.d(id7Var.a, sQLiteDatabase)) {
                    id7Var = new id7(sQLiteDatabase);
                    pggVar2.a = id7Var;
                }
                n31Var.g(id7Var);
            }
        });
        this.a = context;
        this.b = pggVar;
        this.c = n31Var;
        this.d = z;
        this.f = new rid(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    public final id7 b(boolean z) {
        rid ridVar = this.f;
        try {
            ridVar.a((this.g || getDatabaseName() == null) ? false : true);
            this.e = false;
            SQLiteDatabase sQLiteDatabaseL = l(z);
            if (!this.e) {
                return g(sQLiteDatabaseL);
            }
            close();
            return b(z);
        } finally {
            ridVar.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        rid ridVar = this.f;
        try {
            ridVar.a(ridVar.a);
            super.close();
            this.b.a = null;
            this.g = false;
        } finally {
            ridVar.b();
        }
    }

    public final id7 g(SQLiteDatabase sQLiteDatabase) {
        pgg pggVar = this.b;
        id7 id7Var = (id7) pggVar.a;
        if (id7Var != null && cqk.d(id7Var.a, sQLiteDatabase)) {
            return id7Var;
        }
        id7 id7Var2 = new id7(sQLiteDatabase);
        pggVar.a = id7Var2;
        return id7Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.sqlite.SQLiteDatabase] */
    public final SQLiteDatabase l(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.g;
        Context context = this.a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return z ? getWritableDatabase() : getReadableDatabase();
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                this = z ? getWritableDatabase() : getReadableDatabase();
                return this;
            } catch (Throwable th) {
                th = th;
                if (th instanceof kd7) {
                    kd7 kd7Var = (kd7) th;
                    int iD = qt4.D(kd7Var.a);
                    th = kd7Var.b;
                    if (iD == 0 || iD == 1 || iD == 2 || iD == 3) {
                        throw th;
                    }
                    if (iD != 4) {
                        ore.o();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return z ? this.getWritableDatabase() : this.getReadableDatabase();
                } catch (kd7 e) {
                    throw e.b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.e;
        n31 n31Var = this.c;
        if (!z && n31Var.a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            n31Var.f(g(sQLiteDatabase));
        } catch (Throwable th) {
            throw new kd7(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.c.i(g(sQLiteDatabase));
        } catch (Throwable th) {
            throw new kd7(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.e = true;
        try {
            this.c.k(g(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new kd7(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.e) {
            try {
                this.c.n(g(sQLiteDatabase));
            } catch (Throwable th) {
                throw new kd7(5, th);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.e = true;
        try {
            this.c.p(g(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new kd7(3, th);
        }
    }
}
