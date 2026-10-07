package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class t31 {
    public static final ifh g = new ifh(new va(17));
    public final String a;
    public final boolean b;
    public final o31 c;
    public final String d;
    public ByteBuffer e;
    public int f = np0.r;

    public t31(String str, boolean z, o31 o31Var) {
        this.a = str;
        this.b = z;
        this.c = o31Var;
        this.d = zo5.p(t31.class.getName(), "/", str);
    }

    public final boolean a() {
        if (this.e == null) {
            return false;
        }
        this.c.b(e());
        this.e = null;
        return true;
    }

    public final void b() {
        if (this.e == null) {
            return;
        }
        ByteBuffer byteBufferE = e();
        int iCapacity = byteBufferE.capacity();
        String str = this.a;
        if (iCapacity >= 17408) {
            ore.c(qt4.j(byteBufferE.capacity(), str, " buffer insufficient despite having capacity of "));
            return;
        }
        int iMin = Math.min(byteBufferE.capacity() * 2, 17408);
        StringBuilder sbR = c0a.r(byteBufferE.capacity(), "enlarging buffer ", str, ", increasing from ", " to ");
        sbR.append(iMin);
        gm0.n(this.d, sbR.toString());
        o31 o31Var = this.c;
        ByteBuffer byteBufferA = o31Var.a(iMin);
        ByteBuffer byteBufferE2 = e();
        byteBufferE2.flip();
        byteBufferA.put(byteBufferE2);
        if (this.b) {
            f(0);
        }
        o31Var.b(byteBufferE2);
        this.e = byteBufferA;
        this.f = iMin;
    }

    public final void c() {
        if (this.e == null) {
            this.e = this.c.a(this.f);
        }
    }

    public final boolean d() {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null || byteBuffer.position() != 0) {
            return false;
        }
        return a();
    }

    public final ByteBuffer e() {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ore.p("Required value was null.");
        return null;
    }

    public final void f(int i) {
        if (this.e == null) {
            return;
        }
        ByteBuffer byteBufferE = e();
        byteBufferE.mark();
        byteBufferE.position(i);
        int iRemaining = byteBufferE.remaining();
        ifh ifhVar = g;
        int iMin = Math.min(iRemaining, ((byte[]) ifhVar.getValue()).length);
        int i2 = 0;
        while (iMin > 0) {
            byteBufferE.put((byte[]) ifhVar.getValue(), 0, iMin);
            i2 += iMin;
            iMin = Math.min(iRemaining - i2, ((byte[]) ifhVar.getValue()).length);
        }
        byteBufferE.reset();
    }

    public final String toString() {
        ByteBuffer byteBuffer = this.e;
        int i = this.f;
        StringBuilder sb = new StringBuilder("BufferHolder{name='");
        sb.append(this.a);
        sb.append("', allocator=");
        sb.append(this.c);
        sb.append(", plainData=");
        sb.append(this.b);
        sb.append(", maxSize=17408, buffer=");
        sb.append(byteBuffer);
        sb.append(", lastSize=");
        return zo5.t(sb, i, "}");
    }
}
