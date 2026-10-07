package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kqa implements nqa {
    public final String a;
    public final g4b b;

    public kqa(String str, g4b g4bVar) {
        this.a = str;
        this.b = g4bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqa)) {
            return false;
        }
        kqa kqaVar = (kqa) obj;
        return cqk.d(this.a, kqaVar.a) && this.b.equals(kqaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProcessBotCommand(botCommand=" + this.a + ", sliceData=" + this.b + ")";
    }
}
