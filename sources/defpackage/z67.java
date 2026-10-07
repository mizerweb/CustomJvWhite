package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class z67 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z67)) {
            return false;
        }
        z67 z67Var = (z67) obj;
        return Objects.equals(this.a, z67Var.a) && Objects.equals(this.b, z67Var.b) && Objects.equals(this.c, z67Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
