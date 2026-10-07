package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d5k {
    public final f8k a;
    public final w4k b;
    public final int c;
    public volatile cr0 d;
    public volatile hak e;
    public final rak f;
    public final ArrayList g;
    public final ArrayList h;
    public final vn7 i;
    public final ArrayList j;
    public final int k;
    public volatile int l;
    public volatile int m;
    public volatile boolean n = false;
    public volatile int o;
    public volatile byte p;
    public volatile int q;

    public d5k(f8k f8kVar, w4k w4kVar, int i, i05 i05Var, ku8 ku8Var, hak hakVar) {
        int i2 = 0;
        this.a = f8kVar;
        this.b = w4kVar;
        this.d = i05Var;
        this.e = hakVar;
        this.c = w4kVar == w4k.c ? 2 : w4kVar == w4k.d ? 3 : 1;
        this.g = new ArrayList();
        this.h = new ArrayList();
        new ArrayList();
        this.i = new vn7(1, new atj(6, this));
        this.j = new ArrayList();
        int i3 = c5k.a[w4kVar.ordinal()];
        if (i3 == 1) {
            i2 = 3000;
        } else if (i3 == 2) {
            i2 = i == 1 ? 16384 : 100;
        } else if (i3 == 3) {
            i2 = i == 1 ? 65535 : 300;
        }
        this.k = i2;
        this.f = new rak();
    }

    public final String a(List list) {
        return "CryptoStream[" + this.b.name().charAt(0) + "|" + ((String) list.stream().map(new f05(17)).map(new f05(18)).collect(Collectors.joining(","))) + "]";
    }

    public final void b(g5k g5kVar) throws Exception {
        try {
            boolean zC = this.f.c(g5kVar);
            rak rakVar = this.f;
            long j = rakVar.c - rakVar.d;
            if (g5kVar.f() - (((long) this.q) + j) > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
                throw new bJ(14);
            }
            if (!zC) {
                long j2 = this.f.d;
                g5kVar.toString();
                return;
            }
            while (true) {
                if ((!this.n || j < this.o) && (this.n || j < 4)) {
                    return;
                }
                if (!this.n && j >= 4) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                    this.q += this.f.a(byteBufferAllocate);
                    this.p = byteBufferAllocate.get(0);
                    byteBufferAllocate.put(0, (byte) 0);
                    this.o = byteBufferAllocate.getInt();
                    if (this.o > this.k) {
                        throw new o("TLS message size too large: " + this.o, gfk.internal_error);
                    }
                    this.n = true;
                    j -= 4;
                }
                if (this.n && j >= this.o) {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(this.o + 4);
                    byteBufferAllocate2.putInt(this.o);
                    byteBufferAllocate2.put(0, this.p);
                    int iA = this.f.a(byteBufferAllocate2);
                    this.q += iA;
                    j -= (long) iA;
                    this.n = false;
                    this.g.add(this.i.e(byteBufferAllocate2, this.d, this.c));
                    if (byteBufferAllocate2.hasRemaining()) {
                        throw new RuntimeException();
                    }
                }
            }
        } catch (IOException unused) {
            hs4.b();
        }
    }

    public final void c(p5k p5kVar) {
        byte[] bArrD = p5kVar.d();
        this.j.add(ByteBuffer.wrap(bArrD));
        this.m += bArrD.length;
        this.e.f(new am(26, this), 10, this.b, new o01(28, this));
        this.e.h();
        this.h.add(p5kVar);
    }

    public final String toString() {
        return a(Collections.EMPTY_LIST);
    }
}
