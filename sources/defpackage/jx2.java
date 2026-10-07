package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jx2 {
    public final String a;
    public final String b;
    public final List c;
    public final long d;
    public final boolean e;

    public jx2(m9 m9Var) {
        this.a = (String) m9Var.c;
        this.b = (String) m9Var.d;
        List list = (List) m9Var.e;
        this.c = list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
        this.d = m9Var.a;
        this.e = m9Var.b;
    }
}
