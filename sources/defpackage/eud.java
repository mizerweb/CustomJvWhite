package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eud extends qud {
    public final String a;

    public eud(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eud) && this.a.equals(((eud) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("InternalShareChannelLink(link=", this.a, ")");
    }
}
