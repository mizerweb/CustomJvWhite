package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class k9e extends kjh {
    public final /* synthetic */ l9e e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9e(String str, l9e l9eVar, long j) {
        super(str, true);
        this.e = l9eVar;
        this.f = j;
    }

    @Override // defpackage.kjh
    public final long a() {
        qtj qtjVar;
        l9e l9eVar = this.e;
        synchronized (l9eVar) {
            try {
                if (!l9eVar.u && (qtjVar = l9eVar.k) != null) {
                    int i = l9eVar.w ? l9eVar.v : -1;
                    l9eVar.v++;
                    l9eVar.w = true;
                    if (i != -1) {
                        StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                        sb.append(l9eVar.d);
                        sb.append("ms (after ");
                        l9eVar.c(new SocketTimeoutException(zo5.t(sb, i - 1, " successful ping/pongs)")), null);
                    } else {
                        try {
                            qtjVar.b(9, d71.d);
                        } catch (IOException e) {
                            l9eVar.c(e, null);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f;
    }
}
