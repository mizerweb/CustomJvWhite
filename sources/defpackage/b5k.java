package defpackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import one.video.calls.sdk_private.aP;

/* JADX INFO: loaded from: classes3.dex */
public final class b5k {
    public static final byte[] k = {-81, -65, -20, 40, -103, -109, -46, 76, -98, -105, -122, -15, -100, 97, 17, -32, 67, -112, -88, -103};
    public static final byte[] l = {56, 118, 44, -9, -11, 89, 52, -77, 77, 23, -102, -26, -92, -56, 12, -83, -52, -69, 127, 10};
    public static final byte[] m = {13, -19, -29, -34, -9, 0, -90, -37, -127, -109, -127, -66, 110, 38, -99, -53, -7, -67, 46, -39};
    public hfk a;
    public final f8k b;
    public final ku8 d;
    public byte[] e;
    public boolean h;
    public byte[] i;
    public final z4k[] f = new z4k[w4k.values().length];
    public final z4k[] g = new z4k[w4k.values().length];
    public final boolean[] j = new boolean[w4k.values().length];
    public final int c = 1;

    public b5k(f8k f8kVar, ku8 ku8Var) {
        this.b = f8kVar;
        this.d = ku8Var;
    }

    public final synchronized z4k a(w4k w4kVar) {
        z4k z4kVar;
        try {
            z4kVar = this.c == 1 ? this.g[w4kVar.ordinal()] : this.f[w4kVar.ordinal()];
            if (z4kVar == null) {
                throw new aP(w4kVar, this.j[w4kVar.ordinal()]);
            }
        } catch (Throwable th) {
            throw th;
        }
        return z4kVar;
    }

    public final void b(w4k w4kVar, hfk hfkVar, e8k e8kVar) {
        z4k z4kVar;
        z4k z4kVar2;
        if (hfkVar == hfk.TLS_AES_128_GCM_SHA256) {
            z4kVar = new z4k(e8kVar, 1, this.d, 0);
            z4kVar2 = new z4k(e8kVar, 2, this.d, 0);
        } else if (hfkVar == hfk.TLS_AES_256_GCM_SHA384) {
            z4kVar = new a5k(e8kVar, 1, this.d, 0);
            z4kVar2 = new a5k(e8kVar, 2, this.d, 0);
        } else if (hfkVar != hfk.TLS_CHACHA20_POLY1305_SHA256) {
            c.q(hfkVar, "unsupported cipher suite ");
            return;
        } else {
            z4kVar = new z4k(e8kVar, 1, this.d, 1);
            z4kVar2 = new z4k(e8kVar, 2, this.d, 1);
        }
        this.f[w4kVar.ordinal()] = z4kVar;
        if (w4kVar != w4k.b) {
            this.g[w4kVar.ordinal()] = z4kVar2;
        }
        z4kVar.o = z4kVar2;
        z4kVar2.o = z4kVar;
    }

    public final void c(String str, w4k w4kVar) {
        ArrayList arrayList = new ArrayList();
        String strA = nl9.a(this.e);
        String strA2 = nl9.a(this.f[w4kVar.ordinal()].b);
        StringBuilder sbQ = qv1.q("CLIENT_", str, " ", strA, " ");
        sbQ.append(strA2);
        arrayList.add(sbQ.toString());
        String strA3 = nl9.a(this.e);
        String strA4 = nl9.a(this.g[w4kVar.ordinal()].b);
        StringBuilder sbQ2 = qv1.q("SERVER_", str, " ", strA3, " ");
        sbQ2.append(strA4);
        arrayList.add(sbQ2.toString());
        try {
            Files.write((Path) null, arrayList, StandardOpenOption.APPEND);
        } catch (IOException unused) {
            this.h = false;
        }
    }

    public final synchronized void d(byte[] bArr) {
        byte[] bArr2;
        try {
            this.i = bArr;
            e8k e8kVar = this.b.a;
            rai raiVarA = rai.a();
            if (e8kVar.a == 1) {
                bArr2 = l;
            } else {
                bArr2 = e8kVar.b() ? m : k;
            }
            byte[] bArrC = raiVarA.c(bArr2, this.i);
            this.f[0] = new z4k(e8kVar, bArrC, 1, this.d);
            this.g[0] = new z4k(e8kVar, bArrC, 2, this.d);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized z4k e(w4k w4kVar) {
        z4k z4kVar;
        try {
            z4kVar = this.c == 1 ? this.f[w4kVar.ordinal()] : this.g[w4kVar.ordinal()];
            if (z4kVar == null) {
                throw new aP(w4kVar, this.j[w4kVar.ordinal()]);
            }
        } catch (Throwable th) {
            throw th;
        }
        return z4kVar;
    }
}
