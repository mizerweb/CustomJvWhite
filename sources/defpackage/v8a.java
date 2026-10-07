package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v8a implements x8a {
    public final List a;

    public v8a(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v8a) && this.a.equals(((v8a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v0h.d("ContactsUpdate(ids=", ")", this.a);
    }
}
