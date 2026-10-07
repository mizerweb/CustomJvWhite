package defpackage;

import one.me.sdk.database.OneMeRoomDatabase;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public final class j35 {
    public final ny8 a;

    public j35(h5 h5Var) {
        this.a = h5Var.d(HttpStatus.SC_FORBIDDEN);
    }

    public final Object a(af7 af7Var) {
        return ((OneMeRoomDatabase) this.a.getValue()).o(new g35(0, af7Var));
    }

    public final Object b(cf7 cf7Var, nq4 nq4Var) {
        OneMeRoomDatabase oneMeRoomDatabase = (OneMeRoomDatabase) this.a.getValue();
        return vd7.Q(nq4Var, new p05(oneMeRoomDatabase, cf7Var, null, 1), oneMeRoomDatabase);
    }
}
