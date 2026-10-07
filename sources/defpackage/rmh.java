package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rmh implements ux9 {
    public final String a;
    public final String b;
    public final String c;

    public rmh(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.ux9
    public final String a() {
        return this.b;
    }

    public final String toString() {
        return zo5.w(qv1.q("TextFormat(id: ", this.a, ", sampleMimeType: ", this.b, ", language: "), this.c, ")");
    }
}
