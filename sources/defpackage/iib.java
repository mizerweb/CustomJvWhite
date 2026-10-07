package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iib extends IllegalStateException {
    public final t3f a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final lvj g;

    public iib(t3f t3fVar, String str, String str2, String str3, String str4, String str5, lvj lvjVar) {
        this.a = t3fVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = lvjVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Current state. \n                |type:");
        sb.append(this.g);
        sb.append(",\n                |scopeId:");
        sb.append(this.a);
        sb.append(", \n                |current:");
        nbh.G(sb, this.b, ", \n                |parent:", this.c, ", \n                |internalTargetInstanceId:");
        nbh.G(sb, this.d, ", \n                |target:", this.e, ", \n                |fullSnapshot:");
        sb.append(this.f);
        sb.append(", \n                |");
        return s5h.y0(sb.toString());
    }
}
