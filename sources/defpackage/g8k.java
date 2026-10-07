package defpackage;

import java.util.Objects;
import java.util.function.BiFunction;
import one.video.calls.sdk_private.bz;

/* JADX INFO: loaded from: classes3.dex */
public final class g8k {
    public b5k a;
    public f8k b;
    public int c;
    public b8k d;
    public ku8 e;
    public long[] f;
    public BiFunction g;
    public volatile byte[] h;

    public final z4k a(pbk pbkVar) throws bz {
        if (pbkVar.a.equals(this.b.a)) {
            return this.a.a(pbkVar.n());
        }
        if (pbkVar.n() == w4k.d || pbkVar.n() == w4k.c) {
            throw new bz("invalid version");
        }
        if (pbkVar.n() != w4k.a) {
            throw new bz("invalid version");
        }
        e8k e8kVar = pbkVar.a;
        f8k f8kVar = this.b;
        Objects.toString(e8kVar);
        Objects.toString(f8kVar);
        b5k b5kVar = new b5k(new f8k(pbkVar.a), new ku8());
        b5kVar.d(this.h);
        return b5kVar.a(pbkVar.n());
    }
}
