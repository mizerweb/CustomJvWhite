package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s7b extends ewk {
    public final long a;
    public final String b;

    public s7b(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7b)) {
            return false;
        }
        s7b s7bVar = (s7b) obj;
        return this.a == s7bVar.a && cqk.d(this.b, s7bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "AudioRecord(recordAudioId=", ", filePath=", this.b);
        sbT.append(")");
        return sbT.toString();
    }
}
