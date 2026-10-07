package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s4g {
    public final boolean direct;
    public final String message;

    public s4g(String str, boolean z) {
        this.message = str;
        this.direct = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s4g s4gVar = (s4g) obj;
        if (this.direct != s4gVar.direct) {
            return false;
        }
        return this.message.equals(s4gVar.message);
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + (this.direct ? 1 : 0);
    }
}
