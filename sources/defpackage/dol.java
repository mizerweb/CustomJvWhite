package defpackage;

import android.database.Cursor;
import java.util.concurrent.ConcurrentHashMap;
import one.me.sdk.database.DbCorruptionException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dol {
    public static final void a(ConcurrentHashMap concurrentHashMap, cf7 cf7Var) {
        concurrentHashMap.entrySet().removeIf(new u6(1, new n94(0, cf7Var)));
    }

    public static final void b(id7 id7Var) {
        c(id7Var, "PRAGMA foreign_keys = OFF;");
        id7Var.l();
        try {
            Cursor cursorY = id7Var.Y("SELECT name FROM sqlite_master WHERE type='table' AND name != 'sqlite_sequence'");
            while (cursorY.moveToNext()) {
                try {
                    String string = cursorY.getString(0);
                    try {
                        String str = "DROP TABLE IF EXISTS `" + string + "`";
                        gm0.n("DbCorruption", str);
                        id7Var.I(str);
                    } catch (Exception e) {
                        String str2 = "fail to drop table " + string;
                        gm0.V("DbCorruption", str2, new DbCorruptionException(str2, e));
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(cursorY, th);
                        throw th2;
                    }
                }
            }
            cursorY.close();
            id7Var.o0();
            id7Var.E();
            c(id7Var, "PRAGMA foreign_keys = ON;");
        } catch (Throwable th3) {
            id7Var.E();
            c(id7Var, "PRAGMA foreign_keys = ON;");
            throw th3;
        }
    }

    public static final void c(id7 id7Var, String str) {
        try {
            id7Var.I(str);
        } catch (Exception e) {
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "DbCorruption", "fail to exec ".concat(str), e);
            }
        }
    }
}
