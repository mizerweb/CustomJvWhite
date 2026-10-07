package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jf8 {
    public final ny8 a;

    public jf8(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(String str, String str2, byte b) {
        ae9 ae9Var = (ae9) this.a.getValue();
        ul9 ul9Var = new ul9();
        ul9Var.put("informer_id", str2);
        ul9Var.put("informer_type", Byte.valueOf(b));
        ae9.k(ae9Var, "INFORMER", str, ul9Var.b(), 8);
    }

    public final void b(byte b, String str) {
        a("informer_close", str, b);
    }
}
