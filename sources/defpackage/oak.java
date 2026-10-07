package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class oak extends abk {
    @Override // defpackage.abk
    public final void b(long j) {
    }

    @Override // defpackage.abk
    public final void l() {
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        throw new IOException("Stream is not writable");
    }
}
