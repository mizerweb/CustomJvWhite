package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zii {
    public final String a;
    public final long b;
    public final String c;

    public zii(bo boVar) {
        this.a = boVar.a;
        this.b = boVar.b;
        this.c = boVar.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadResult{token='");
        sb.append(ch3.y(this.a));
        sb.append("', attachId=");
        sb.append(this.b);
        sb.append(", thumbhashBase64.length=");
        String str = this.c;
        return qt4.p(sb, str != null ? str.length() : 0, '}');
    }
}
