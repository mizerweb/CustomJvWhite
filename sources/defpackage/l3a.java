package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class l3a implements h2a {
    public final p3a a;

    public l3a(p3a p3aVar) {
        this.a = p3aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != l3a.class) {
            return false;
        }
        return Objects.equals(this.a, ((l3a) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
