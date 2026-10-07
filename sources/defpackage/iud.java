package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iud extends qud {
    public final List a;

    public iud(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iud) && this.a.equals(((iud) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v0h.d("ShowAvatarMenu(actions=", ")", this.a);
    }
}
