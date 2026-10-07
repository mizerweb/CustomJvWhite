package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zxa {
    public final int a;
    public final int b;

    public zxa(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(id7 id7Var) {
        throw new jib("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void b(qxe qxeVar) {
        if (!(qxeVar instanceof abh)) {
            throw new jib("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        a(((abh) qxeVar).a);
    }
}
