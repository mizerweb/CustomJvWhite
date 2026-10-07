package defpackage;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class nd7 implements ebh {
    public final /* synthetic */ int a;
    public final Closeable b;

    public /* synthetic */ nd7(Closeable closeable, int i) {
        this.a = i;
        this.b = closeable;
    }

    private final void l() {
    }

    @Override // defpackage.ebh
    public final void a(int i, double d) {
        int i2 = this.a;
        Closeable closeable = this.b;
        switch (i2) {
            case 0:
                ((SQLiteProgram) closeable).bindDouble(i, d);
                break;
            default:
                ((tse) closeable).a(i, d);
                break;
        }
    }

    @Override // defpackage.ebh
    public final void c(int i, long j) {
        int i2 = this.a;
        Closeable closeable = this.b;
        switch (i2) {
            case 0:
                ((SQLiteProgram) closeable).bindLong(i, j);
                break;
            default:
                ((tse) closeable).c(i, j);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ((SQLiteProgram) this.b).close();
                break;
        }
    }

    @Override // defpackage.ebh
    public final void d(int i, byte[] bArr) {
        int i2 = this.a;
        Closeable closeable = this.b;
        switch (i2) {
            case 0:
                ((SQLiteProgram) closeable).bindBlob(i, bArr);
                break;
            default:
                ((tse) closeable).d(i, bArr);
                break;
        }
    }

    @Override // defpackage.ebh
    public final void e(int i) {
        int i2 = this.a;
        Closeable closeable = this.b;
        switch (i2) {
            case 0:
                ((SQLiteProgram) closeable).bindNull(i);
                break;
            default:
                ((tse) closeable).e(i);
                break;
        }
    }

    @Override // defpackage.ebh
    public final void g0(int i, String str) {
        int i2 = this.a;
        Closeable closeable = this.b;
        switch (i2) {
            case 0:
                ((SQLiteProgram) closeable).bindString(i, str);
                break;
            default:
                ((tse) closeable).g0(i, str);
                break;
        }
    }

    @Override // defpackage.ebh
    public void u() {
        ((SQLiteProgram) this.b).clearBindings();
    }
}
