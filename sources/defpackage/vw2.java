package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vw2 {
    public long a;
    public long b;
    public int c;
    public Serializable d;
    public Object e;

    public ww2 a() {
        if (((List) this.e) == null) {
            this.e = Collections.EMPTY_LIST;
        }
        return new ww2((ex2) this.d, this.c, this.a, this.b, (List) this.e);
    }
}
