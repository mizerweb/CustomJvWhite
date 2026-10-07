package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.Pipe;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.net.ssl.SSLContext;
import one.video.upload.exceptions.FileSizeInterruptException;
import one.video.upload.exceptions.GetSSLContextInterruptException;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class dki {
    public static final lu8 p = new lu8();
    public static SSLContext q;
    public final RandomAccessFile a;
    public final String b;
    public final int c;
    public final cki d;
    public final bki e;
    public final aki f;
    public final ze9 g;
    public final lr6 h;
    public final SSLContext i;
    public final ed7 j;
    public final String k;
    public final int l;
    public final String m;
    public final CompletableFuture n;
    public final euc o;

    public dki(Uri uri, RandomAccessFile randomAccessFile, String str, int i, cki ckiVar, bki bkiVar, aki akiVar, ze9 ze9Var) throws FileSizeInterruptException, GetSSLContextInterruptException, IOException {
        lr6 lr6Var;
        SSLContext sSLContext;
        int iIntValue;
        this.a = randomAccessFile;
        this.b = str;
        this.c = i;
        this.d = ckiVar;
        this.e = bkiVar;
        this.f = akiVar;
        this.g = ze9Var;
        int iD = qt4.D(i);
        if (iD == 0) {
            try {
                long length = randomAccessFile.length();
                if (length <= 0) {
                    throw new IllegalArgumentException("The file must not be empty");
                }
                lr6Var = new lr6(length, true);
            } catch (InterruptedException e) {
                throw new FileSizeInterruptException(e);
            } catch (ClosedByInterruptException e2) {
                throw new FileSizeInterruptException(e2);
            }
        } else {
            if (iD != 1) {
                ore.o();
                throw null;
            }
            lr6Var = new lr6(0L, false);
        }
        this.h = lr6Var;
        if ((cqk.d(uri.getScheme(), "https") ? this : null) != null) {
            lu8 lu8Var = p;
            try {
                if (q == null) {
                    synchronized (lu8Var) {
                        if (q == null) {
                            SSLContext sSLContext2 = SSLContext.getInstance("TLSv1.2");
                            sSLContext2.init(null, null, null);
                            q = sSLContext2;
                        }
                    }
                }
                sSLContext = q;
            } catch (InterruptedException e3) {
                throw new GetSSLContextInterruptException(e3);
            } catch (ClosedByInterruptException e4) {
                throw new GetSSLContextInterruptException(e4);
            }
        } else {
            sSLContext = null;
        }
        this.i = sSLContext;
        this.j = new ed7(lr6Var, ckiVar.a);
        String host = uri.getHost();
        if (host == null) {
            ore.p("Host is null");
            throw null;
        }
        this.k = host;
        int port = uri.getPort();
        Integer numValueOf = port <= 0 ? null : Integer.valueOf(port);
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            Integer num = sSLContext != null ? 443 : null;
            iIntValue = num != null ? num.intValue() : 80;
        }
        this.l = iIntValue;
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getPath());
        String query = uri.getQuery();
        if (query != null) {
            sb.append("?");
            sb.append(query);
        }
        this.m = sb.toString();
        this.n = new CompletableFuture();
        this.o = new euc(this, ze9Var);
    }

    public final void a(boolean z) {
        euc eucVar = this.o;
        List listR = eucVar.r();
        int i = 0;
        if (!(listR instanceof Collection) || !listR.isEmpty()) {
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                if ((((wdf) it.next()) instanceof agi) && (i = i + 1) < 0) {
                    xw3.U0();
                    throw null;
                }
            }
        }
        mf mfVar = new mf(i, this.g, 5);
        vuf vufVar = new vuf(23, this);
        String str = this.k;
        String str2 = this.m;
        String str3 = this.b;
        ed7 ed7Var = this.j;
        int i2 = this.c;
        RandomAccessFile randomAccessFile = this.a;
        lr6 lr6Var = this.h;
        aki akiVar = this.f;
        agi agiVar = new agi(str, str2, str3, ed7Var, i2, randomAccessFile, lr6Var, eucVar, akiVar, mfVar, this.i, z, vufVar);
        InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, this.l);
        mfVar.b(HTTP.CONN_DIRECTIVE, new zn3(8));
        if (akiVar != null) {
            agiVar.k = SystemClock.elapsedRealtime();
        }
        i1m i1mVar = agiVar.e;
        ((SocketChannel) i1mVar.a).connect(inetSocketAddress);
        mfVar.b(HTTP.CONN_DIRECTIVE, new zn3(15));
        SocketChannel socketChannel = (SocketChannel) i1mVar.a;
        ((ze9) eucVar.b).b("Poller", new zn3(15));
        socketChannel.register((Selector) eucVar.c, 8, agiVar);
    }

    public final void b() {
        CompletableFuture completableFuture = this.n;
        int iD = qt4.D(this.c);
        if (iD != 0) {
            if (iD != 1) {
                ore.o();
                return;
            }
            try {
                if (!completableFuture.isDone()) {
                    completableFuture.complete(null);
                    return;
                }
                nr6 nr6Var = (nr6) completableFuture.get();
                if (nr6Var != null) {
                    nr6Var.a();
                }
            } catch (Throwable th) {
                this.g.r("Uploader", new yfi(6), new bpg(19, th));
            }
        }
    }

    public final boolean c(long j, boolean z) {
        int iD = qt4.D(this.c);
        if (iD == 0) {
            ore.k("onSizeUpdate must be called only in conjunction with [UploadMode.STREAMING_FILE]");
            return false;
        }
        if (iD != 1) {
            ore.o();
            return false;
        }
        nr6 nr6Var = (nr6) this.n.get();
        int i = 7;
        if (nr6Var == null) {
            this.g.f("Uploader", new yfi(7));
            return false;
        }
        Pipe pipe = nr6Var.b;
        Pipe.SinkChannel sinkChannelSink = pipe.sink();
        if (sinkChannelSink.isOpen() && pipe.source().isOpen()) {
            try {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(9);
                byteBufferAllocate.putLong(j);
                byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
                byteBufferAllocate.flip();
                sinkChannelSink.write(byteBufferAllocate);
                return true;
            } catch (IOException e) {
                nr6Var.a.r("FileInfoUpdateSender", new s35(25), new mp5(i, e));
            }
        }
        return false;
    }

    public final boolean d() {
        try {
            euc eucVar = this.o;
            eucVar.getClass();
            Selector selectorOpen = Selector.open();
            try {
                eucVar.c = selectorOpen;
                eucVar.x();
                try {
                    eucVar.A(selectorOpen);
                    eucVar.c = null;
                    selectorOpen.close();
                    b();
                    ed7 ed7Var = this.j;
                    lr6 lr6Var = (lr6) ed7Var.c;
                    return lr6Var.b && lr6Var.a == ed7Var.V();
                } catch (Throwable th) {
                    eucVar.c = null;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    rx8.n(selectorOpen, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            b();
            throw th4;
        }
    }
}
