package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface dbh extends Closeable {
    String getDatabaseName();

    id7 getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
