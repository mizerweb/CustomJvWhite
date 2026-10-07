package defpackage;

import java.security.SecureRandom;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s5k extends p5k {
    public static final byte[] e = {-49, 33, -83, 116, -27, -102, 97, 17, -66, 29, -116, 2, 30, 101, -72, -111, -62, -94, 17, 22, 122, -69, -116, 94, 7, -98, 9, -30, -56, -88, 51, -100};
    public byte[] a;
    public byte[] b;
    public hfk c;
    public List d;

    static {
        new SecureRandom();
    }

    @Override // defpackage.p5k
    public final jfk b() {
        return jfk.server_hello;
    }

    @Override // defpackage.p5k
    public final byte[] d() {
        return this.a;
    }
}
