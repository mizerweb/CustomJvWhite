package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import one.me.sdk.media.transformer.MediaTransformException;

/* JADX INFO: loaded from: classes3.dex */
public final class n6a {
    public final w5a a;
    public final long b = System.currentTimeMillis();
    public final ArrayList c = new ArrayList();
    public volatile int d = -1;
    public volatile int e = -1;
    public final AtomicReference f = new AtomicReference();
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference(new y5a(0));

    public n6a(w5a w5aVar) {
        this.a = w5aVar;
    }

    public final long a() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            long j2 = ((xx9) arrayList.get(i)).b;
            if (j2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j += j2;
        }
        return j;
    }

    public final void b(MediaTransformException mediaTransformException) {
        this.g.set(mediaTransformException);
    }

    public final String toString() {
        w5a w5aVar = this.a;
        String strF = gzl.f(w5aVar.b);
        String strC = gzl.c(this.c);
        String str = w5aVar.c;
        String strE = gzl.e(w5aVar, "              ");
        String strD = gzl.d(w5aVar);
        StringBuilder sbQ = qv1.q("\n            MediaTransformRequest(\n              in={", strF, "\n              }\n              inputMedias={", strC, "\n              }\n              out=");
        nbh.G(sbQ, str, "\n              anc={", strE, "\n              }\n              request={");
        sbQ.append(strD);
        sbQ.append("\n              }\n            )\n        ");
        return s5h.x0(sbQ.toString());
    }
}
