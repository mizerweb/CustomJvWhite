package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class je6 implements Enumeration {
    public final Enumeration a;

    public je6(ke6 ke6Var) {
        this.a = Collections.enumeration(ke6Var.a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.a.nextElement());
    }
}
