package defpackage;

import android.media.metrics.EditingSession;

/* JADX INFO: loaded from: classes4.dex */
public final class v26 implements AutoCloseable {
    public EditingSession a;
    public boolean b;

    @Override // java.lang.AutoCloseable
    public final void close() {
        EditingSession editingSession = this.a;
        if (editingSession != null) {
            editingSession.close();
            this.a = null;
        }
    }
}
