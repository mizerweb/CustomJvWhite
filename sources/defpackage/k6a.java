package defpackage;

import one.me.sdk.media.transformer.MediaTransformException;

/* JADX INFO: loaded from: classes3.dex */
public final class k6a extends m6a {
    public final MediaTransformException f;
    public final y5a g;

    public k6a(long j, long j2, w5a w5aVar, n6a n6aVar, MediaTransformException mediaTransformException, y5a y5aVar) {
        super(j, j2, 0L, w5aVar, n6aVar);
        this.f = mediaTransformException;
        this.g = y5aVar;
    }

    public final MediaTransformException b() {
        return this.f;
    }

    public final y5a c() {
        return this.g;
    }

    public final String toString() {
        n6a n6aVar = this.e;
        String strF = gzl.f(n6aVar.a.b);
        String strC = gzl.c(n6aVar.c);
        w5a w5aVar = this.d;
        String str = w5aVar.c;
        String strD = gzl.d(w5aVar);
        String strE = gzl.e(w5aVar, "                  ");
        long j = this.a;
        long j2 = this.b;
        String strA = gzl.a(j, j2);
        StringBuilder sbQ = qv1.q("\n            MediaTransformResult.Failure(\n              in={", strF, "\n              }\n              inputMedias={", strC, "\n              }\n              out=");
        nbh.G(sbQ, str, "\n              request={", strD, "\n                  settings={");
        sbQ.append(strE);
        sbQ.append("\n                  }\n              }\n              took=");
        sbQ.append((Object) strA);
        sbQ.append(", ");
        sbQ.append((j2 - j) / 1000.0f);
        sbQ.append(" s\n              error=");
        sbQ.append(this.f);
        sbQ.append("\n            )\n        ");
        return s5h.x0(sbQ.toString());
    }
}
