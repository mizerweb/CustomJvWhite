package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class te3 extends kih {
    public final u8b c;

    public te3(u8b u8bVar) {
        this.c = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te3) && this.c.equals(((te3) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(chats=" + this.c + ")";
    }
}
