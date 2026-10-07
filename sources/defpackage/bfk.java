package defpackage;

import one.me.metric.battery.internal.obfuscated.o;

/* JADX INFO: loaded from: classes2.dex */
public final class bfk implements jgk {
    public final o a;

    public bfk(o oVar) {
        this.a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfk) && this.a == ((bfk) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InvalidData(reason=" + this.a + ')';
    }
}
