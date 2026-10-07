package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pam extends uam {
    private String a;
    private boolean b;
    private int c;
    private byte d;

    @Override // defpackage.uam
    public final uam a(boolean z) {
        this.b = true;
        this.d = (byte) (1 | this.d);
        return this;
    }

    @Override // defpackage.uam
    public final uam b(int i) {
        this.c = 1;
        this.d = (byte) (this.d | 2);
        return this;
    }

    @Override // defpackage.uam
    public final vam c() {
        String str;
        if (this.d == 3 && (str = this.a) != null) {
            return new ram(str, this.b, this.c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" libraryName");
        }
        if ((this.d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        ore.k("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public final uam d(String str) {
        this.a = str;
        return this;
    }
}
