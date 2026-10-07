package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class vdk implements qdk {
    public final /* synthetic */ int a;
    public /* synthetic */ hek b;

    @Override // defpackage.qdk
    public final OutputStream a() {
        switch (this.a) {
            case 0:
                return this.b.a();
            default:
                return null;
        }
    }

    @Override // defpackage.qdk
    public final InputStream b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.b();
    }
}
