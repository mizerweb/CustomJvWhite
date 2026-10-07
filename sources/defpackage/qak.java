package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qak implements tak {
    public final long a;
    public final byte[] b;
    public final boolean c;

    public qak(long j, boolean z, byte[] bArr) {
        this.a = j;
        this.b = bArr;
        this.c = z;
    }

    @Override // defpackage.tak
    public final byte[] b() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        tak takVar = (tak) obj;
        long jD = takVar.d();
        long j = this.a;
        return j != jD ? Long.compare(j, takVar.d()) : Integer.compare(this.b.length, takVar.e());
    }

    @Override // defpackage.tak
    public final long d() {
        return this.a;
    }

    @Override // defpackage.tak
    public final int e() {
        return this.b.length;
    }

    @Override // defpackage.tak
    public final long f() {
        return this.a + ((long) this.b.length);
    }

    @Override // defpackage.tak
    public final boolean g() {
        return this.c;
    }

    public final String toString() {
        long length = this.b.length;
        long j = this.a;
        return j + ".." + ((length + j) - 1);
    }
}
