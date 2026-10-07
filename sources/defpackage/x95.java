package defpackage;

import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class x95 implements Closeable {
    public final Cursor a;

    public x95(Cursor cursor) {
        this.a = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
