package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final class xdk implements pdk {
    public final x70 a;
    public final kr6 b;
    public final long c;
    public final sdk d;
    public volatile wdk e;
    public final Thread g;
    public Consumer h;
    public Consumer i;
    public BiConsumer j;
    public final ReentrantLock f = new ReentrantLock();
    public final ConcurrentLinkedQueue k = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue l = new ConcurrentLinkedQueue();

    public xdk(x70 x70Var, kr6 kr6Var, t81 t81Var, t81 t81Var2, sdk sdkVar) {
        this.a = x70Var;
        this.b = kr6Var;
        long j = ((oek) kr6Var.a).a.a;
        this.c = j;
        this.d = sdkVar;
        this.e = wdk.a;
        this.h = (Consumer) Optional.ofNullable(t81Var).orElse(new t81(10));
        this.i = (Consumer) Optional.ofNullable(t81Var2).orElse(new t81(10));
        this.j = new udk();
        ((HashMap) kr6Var.b).put(10307L, new lbk(12));
        Thread thread = new Thread(new v1k(this, 6, kr6Var), zo5.j(j, "webtransport-connectstream-"));
        this.g = thread;
        thread.start();
    }

    public final void a(long j, String str) throws IOException {
        if (c(wdk.c, new kck(3), new kck(4))) {
            if (j < 0 || j > 4294967295L) {
                ore.p("Application error code must be a 32-bit unsigned integer");
                return;
            }
            if (str.getBytes().length > 1024) {
                ore.p("Error message must not be longer than 1024 bytes");
                return;
            }
            int i = (int) j;
            Charset charset = StandardCharsets.UTF_8;
            if (str.getBytes(charset).length > 1024) {
                ore.p("Error message must not be longer than 1024 bytes");
                return;
            }
            oek oekVar = (oek) this.b.a;
            wki wkiVar = oekVar.b;
            byte[] bytes = str.getBytes(charset);
            int length = bytes.length + 4;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ti8.b(length) + ti8.b(10307L) + length);
            ti8.a(10307, byteBufferAllocate);
            ti8.a(length, byteBufferAllocate);
            byteBufferAllocate.putInt(i);
            byteBufferAllocate.put(bytes);
            wkiVar.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            byteBufferAllocate.position();
            oekVar.b.close();
            c(wdk.d, new kck(7), new kck(2));
            this.k.forEach(new t81(12));
            this.l.forEach(new t81(11));
            this.g.interrupt();
            this.j.accept(Long.valueOf(j), str);
            this.d.c(this);
        }
    }

    public final void b(hek hekVar) {
        wdk wdkVar = wdk.b;
        boolean zE = hekVar.e();
        wdk wdkVar2 = this.e;
        if (!zE) {
            if (wdkVar2 != wdkVar) {
                hekVar.a(386759528L);
                return;
            }
            this.l.add(hekVar);
            Consumer consumer = this.h;
            vdk vdkVar = new vdk(1);
            vdkVar.b = hekVar;
            consumer.accept(vdkVar);
            return;
        }
        if (wdkVar2 != wdkVar) {
            hekVar.a(386759528L);
            hekVar.b(386759528L);
            return;
        }
        this.k.add(hekVar);
        this.l.add(hekVar);
        Consumer consumer2 = this.i;
        vdk vdkVar2 = new vdk(0);
        vdkVar2.b = hekVar;
        consumer2.accept(vdkVar2);
    }

    public final boolean c(wdk wdkVar, Predicate predicate, Predicate predicate2) {
        this.f.lock();
        try {
            if (predicate2.test(this.e)) {
                this.f.unlock();
                return false;
            }
            if (predicate.test(this.e)) {
                this.e = wdkVar;
                this.f.unlock();
                return true;
            }
            throw new IllegalStateException("Invalid state transition from " + this.e + " to " + wdkVar);
        } catch (Throwable th) {
            this.f.unlock();
            throw th;
        }
    }

    public final void d(long j, String str) {
        if (c(wdk.c, new kck(7), new kck(8))) {
            c(wdk.d, new kck(7), new kck(2));
            this.k.forEach(new t81(12));
            this.l.forEach(new t81(11));
            try {
                ((oek) this.b.a).b.close();
            } catch (IOException unused) {
            }
            this.d.c(this);
            this.j.accept(Long.valueOf(j), str);
        }
    }
}
