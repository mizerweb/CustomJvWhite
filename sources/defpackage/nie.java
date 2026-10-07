package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nie {
    private final String a;

    public nie(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            return f55.h(this.a, ((nie) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public String toString() {
        dc9 dc9Var = new dc9("RemoteModelSource", 23);
        dc9Var.O(this.a, "firebaseModelName");
        return dc9Var.toString();
    }
}
