package defpackage;

import android.os.SystemClock;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import one.video.upload.exceptions.EndOfStreamException;
import one.video.upload.exceptions.UploadServerErrorException;
import one.video.upload.exceptions.UploadUrlExpiredException;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class agi implements wdf {
    public final euc a;
    public final SSLContext b;
    public final aki c;
    public final mf d;
    public ewe h;
    public wze i;
    public xde j;
    public final String l;
    public final String m;
    public final String n;
    public final ed7 o;
    public final int p;
    public final RandomAccessFile q;
    public final lr6 r;
    public final mf s;
    public boolean t;
    public final vuf u;
    public sq3 x;
    public final i1m e = new i1m(2);
    public final ifh f = new ifh(new bd4(this, 0));
    public final ifh g = new ifh(new bd4(this, 1));
    public long k = -1;
    public int v = 1;
    public final kr6 w = new kr6(9, false);
    public final byte[] y = new byte[8096];

    public agi(String str, String str2, String str3, ed7 ed7Var, int i, RandomAccessFile randomAccessFile, lr6 lr6Var, euc eucVar, aki akiVar, mf mfVar, SSLContext sSLContext, boolean z, vuf vufVar) {
        this.a = eucVar;
        this.b = sSLContext;
        this.c = akiVar;
        this.d = mfVar;
        this.l = str;
        this.m = str2;
        this.n = str3;
        this.o = ed7Var;
        this.p = i;
        this.q = randomAccessFile;
        this.r = lr6Var;
        this.s = mfVar;
        this.t = z;
        this.u = vufVar;
    }

    public final void A() throws ClosedChannelException {
        this.d.b(HTTP.CONN_DIRECTIVE, new zn3(19));
        SocketChannel socketChannel = (SocketChannel) this.e.a;
        euc eucVar = this.a;
        ((ze9) eucVar.b).b("Poller", new zn3(19));
        socketChannel.register((Selector) eucVar.c, 4, this);
    }

    public final void E(int i) {
        this.v = i;
        this.s.b("UploadConnection", new dt0(i, 4));
    }

    @Override // defpackage.wdf
    public final void G() throws IOException {
        String str;
        Object objValueOf;
        String str2;
        mf mfVar;
        this.d.b(HTTP.CONN_DIRECTIVE, new zn3(16));
        xde xdeVar = this.j;
        if (xdeVar != null && ((SSLEngine) xdeVar.e).getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            xde xdeVar2 = this.j;
            if (xdeVar2 != null) {
                xdeVar2.N();
                return;
            }
            return;
        }
        this.d.b(HTTP.CONN_DIRECTIVE, new zn3(11));
        int iD = qt4.D(this.v);
        ifh ifhVar = this.g;
        int i = this.p;
        String str3 = this.n;
        String str4 = this.l;
        String str5 = this.m;
        if (iD == 0) {
            if (!this.t) {
                l();
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
            printWriter.println("GET " + str5 + " HTTP/1.1");
            StringBuilder sb = new StringBuilder("Host: ");
            sb.append(str4);
            printWriter.println(sb.toString());
            printWriter.println("Content-Type: application/x-binary; charset=x-user-defined");
            printWriter.println("Content-Disposition: attachment; fileName=\"" + str3 + "\"");
            printWriter.println("Content-Length: 0");
            int i2 = zfi.$EnumSwitchMapping$0[qt4.D(i)];
            if (i2 == 1) {
                str = "parallel";
            } else {
                if (i2 != 2) {
                    ore.o();
                    return;
                }
                str = "unknown-size";
            }
            printWriter.println("X-Uploading-Mode: ".concat(str));
            printWriter.println("Connection: keep-alive");
            printWriter.println("");
            printWriter.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            t0k t0kVar = this.i;
            if (t0kVar == null) {
                t0kVar = (phe) ifhVar.getValue();
            }
            t0kVar.write(ByteBuffer.wrap(byteArray));
            E(2);
            y();
            return;
        }
        if (iD != 2) {
            if (iD != 3) {
                qr7.q(v0h.n(this.v), " in readyForWritePayload", "Unexpected state of UploadConnection: ");
                return;
            }
            sq3 sq3Var = this.x;
            if (sq3Var == null) {
                ore.k("Required value was null.");
                return;
            }
            long j = sq3Var.b;
            while (true) {
                long j2 = sq3Var.c;
                mfVar = this.s;
                if (j2 >= j) {
                    break;
                }
                long j3 = sq3Var.a + j2;
                int iMin = Math.min((int) (j - j2), 8096);
                RandomAccessFile randomAccessFile = this.q;
                randomAccessFile.seek(j3);
                byte[] bArr = this.y;
                int i3 = randomAccessFile.read(bArr, 0, iMin);
                if (i3 == -1) {
                    mfVar.b("UploadConnection", new yvg(27));
                    ore.q("Upload file read error");
                    return;
                }
                t0k t0kVar2 = this.i;
                if (t0kVar2 == null) {
                    t0kVar2 = (phe) ifhVar.getValue();
                }
                int iWrite = t0kVar2.write(ByteBuffer.wrap(bArr, 0, i3));
                if (iWrite == 0) {
                    mfVar.b("UploadConnection", new vbi(1, sq3Var));
                    break;
                }
                sq3Var.b(iWrite);
            }
            if (j == sq3Var.c) {
                mfVar.b("UploadConnection", new yvg(28));
            }
            if (j == sq3Var.c) {
                E(5);
                y();
                return;
            }
            return;
        }
        sq3 sq3Var2 = this.x;
        if (sq3Var2 == null) {
            ore.p("Required value was null.");
            return;
        }
        long j4 = sq3Var2.a;
        long j5 = sq3Var2.b;
        int[] iArr = zfi.$EnumSwitchMapping$0;
        int i4 = iArr[qt4.D(i)];
        lr6 lr6Var = this.r;
        if (i4 == 1) {
            objValueOf = Long.valueOf(lr6Var.a);
        } else {
            if (i4 != 2) {
                ore.o();
                return;
            }
            objValueOf = lr6Var.b ? String.valueOf(lr6Var.a) : "*";
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        PrintWriter printWriter2 = new PrintWriter(byteArrayOutputStream2);
        printWriter2.println("POST " + str5 + " HTTP/1.1");
        StringBuilder sb2 = new StringBuilder("Host: ");
        sb2.append(str4);
        printWriter2.println(sb2.toString());
        printWriter2.println("Content-Type: application/x-binary; charset=x-user-defined");
        printWriter2.println("Content-Disposition: attachment; fileName=\"" + str3 + "\"");
        StringBuilder sbS = qt4.s(j4, "Content-Range: bytes ", "-");
        sbS.append((j4 + j5) - 1);
        sbS.append("/");
        sbS.append(objValueOf);
        printWriter2.println(sbS.toString());
        printWriter2.println("Content-Length: " + j5);
        int i5 = iArr[qt4.D(i)];
        if (i5 == 1) {
            str2 = "parallel";
        } else {
            if (i5 != 2) {
                ore.o();
                return;
            }
            str2 = "unknown-size";
        }
        printWriter2.println("X-Uploading-Mode: ".concat(str2));
        printWriter2.println("Connection: keep-alive");
        printWriter2.println("");
        printWriter2.flush();
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        t0k t0kVar3 = this.i;
        if (t0kVar3 == null) {
            t0kVar3 = (phe) ifhVar.getValue();
        }
        t0kVar3.write(ByteBuffer.wrap(byteArray2));
        E(4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.b(HTTP.CONN_DIRECTIVE, new zn3(13));
        i1m i1mVar = this.e;
        ((SocketChannel) i1mVar.a).close();
        this.a.K((SocketChannel) i1mVar.a);
    }

    public final void l() throws IOException {
        Object s7Var;
        zpe zpeVar = zpe.b;
        so2 so2Var = so2.b;
        ed7 ed7Var = this.o;
        lr6 lr6Var = (lr6) ed7Var.c;
        int i = ed7Var.b;
        ArrayList arrayList = (ArrayList) ed7Var.d;
        long j = 0;
        if (!arrayList.isEmpty()) {
            int i2 = 0;
            for (int i3 = 1; i2 < arrayList.size() - i3; i3 = 1) {
                sq3 sq3Var = (sq3) arrayList.get(i2);
                int i4 = i2 + 1;
                sq3 sq3Var2 = (sq3) arrayList.get(i4);
                boolean z = sq3Var.d;
                long j2 = j;
                long j3 = sq3Var.a;
                long j4 = sq3Var.b;
                if (z && sq3Var2.d && j3 + j4 == sq3Var2.a) {
                    arrayList.remove(i4);
                    arrayList.remove(i2);
                    long j5 = j4 + sq3Var2.b;
                    sq3 sq3Var3 = new sq3(j3, j5);
                    sq3Var3.b(j5);
                    sq3Var3.a();
                    arrayList.add(i2, sq3Var3);
                } else {
                    i2 = i4;
                }
                j = j2;
            }
            long j6 = j;
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    s7Var = zpeVar;
                    break;
                }
                sq3 sq3Var4 = (sq3) arrayList.get(i5);
                i5++;
                sq3 sq3Var5 = (sq3) ww3.u1(i5, arrayList);
                long j7 = sq3Var4.a + sq3Var4.b;
                long jMin = -1;
                if (sq3Var5 == null) {
                    long j8 = lr6Var.a;
                    jMin = j7 < j8 ? Math.min(i, j8 - j7) : -1L;
                    if (!lr6Var.b && ((long) i) + j7 >= lr6Var.a) {
                        s7Var = so2Var;
                        break;
                    }
                } else {
                    long j9 = sq3Var5.a;
                    if (j7 < j9) {
                        jMin = Math.min(i, j9 - j7);
                    }
                }
                if (jMin > j6) {
                    sq3 sq3Var6 = new sq3(j7, jMin);
                    s7Var = new s7(sq3Var6);
                    ed7Var.s(i5, sq3Var6);
                    break;
                }
            }
        } else if (!lr6Var.b && lr6Var.a <= i) {
            s7Var = so2Var;
            break;
        } else {
            sq3 sq3Var7 = new sq3(0L, Math.min(i, lr6Var.a));
            s7Var = new s7(sq3Var7);
            ed7Var.s(0, sq3Var7);
        }
        boolean z2 = s7Var instanceof s7;
        mf mfVar = this.s;
        if (z2) {
            this.x = ((s7) s7Var).a;
            mfVar.b("UploadConnection", new bd4(this, 2));
            E(3);
            A();
            return;
        }
        if (s7Var.equals(zpeVar)) {
            this.x = null;
            mfVar.b("UploadConnection", new yvg(29));
            E(6);
            close();
            return;
        }
        if (!s7Var.equals(so2Var)) {
            ore.o();
            return;
        }
        int i6 = this.p;
        if (i6 != 2) {
            ore.c("Unexpected mode: ".concat(i6 != 1 ? i6 != 2 ? "null" : "STREAMING_FILE" : "FIXED_FILE"));
            return;
        }
        mfVar.b("UploadConnection", new yfi(0));
        this.x = null;
        E(1);
        this.d.b(HTTP.CONN_DIRECTIVE, new zn3(12));
        SelectionKey selectionKeyKeyFor = ((SocketChannel) this.e.a).keyFor((Selector) this.a.c);
        if (selectionKeyKeyFor == null) {
            return;
        }
        selectionKeyKeyFor.interestOps(selectionKeyKeyFor.interestOps() & (-5));
    }

    @Override // defpackage.wdf
    public final void l0() throws UploadUrlExpiredException, IOException {
        boolean zI;
        this.d.b(HTTP.CONN_DIRECTIVE, new zn3(18));
        xde xdeVar = this.j;
        if (xdeVar != null && ((SSLEngine) xdeVar.e).getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            xde xdeVar2 = this.j;
            if (xdeVar2 != null) {
                xdeVar2.N();
                return;
            }
            return;
        }
        this.d.b(HTTP.CONN_DIRECTIVE, new zn3(10));
        m8e m8eVar = this.h;
        if (m8eVar == null) {
            m8eVar = (ohe) this.f.getValue();
        }
        kr6 kr6Var = this.w;
        ByteBuffer byteBuffer = (ByteBuffer) kr6Var.c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) kr6Var.b;
        int i = m8eVar.read(byteBuffer);
        byteBuffer.flip();
        final int i2 = 0;
        if (i > 0) {
            try {
                kr6Var.a = null;
                linkedHashMap.clear();
                zI = kr6Var.I();
                if (zI) {
                    byteBuffer.clear();
                } else {
                    kr6Var.a = null;
                    linkedHashMap.clear();
                    byteBuffer.compact();
                }
            } catch (Throwable th) {
                kr6Var.a = null;
                linkedHashMap.clear();
                throw th;
            }
        } else {
            if (i != 0) {
                throw new EndOfStreamException("Unexpected end of stream");
            }
            zI = false;
        }
        if (zI) {
            final Integer num = (Integer) kr6Var.a;
            final int i3 = 1;
            hj8 hj8Var = new hj8(HttpStatus.SC_BAD_REQUEST, 499, 1);
            if (num != null && hj8Var.c(num.intValue())) {
                throw new UploadUrlExpiredException(qv1.j("http status code: ", num));
            }
            hj8 hj8Var2 = new hj8(500, 599, 1);
            if (num != null && hj8Var2.c(num.intValue())) {
                throw new UploadServerErrorException(qv1.j("http status code: ", num));
            }
            int iD = qt4.D(this.v);
            mf mfVar = this.s;
            if (iD == 1) {
                mfVar.b("UploadConnection", new af7() { // from class: xfi
                    @Override // defpackage.af7
                    public final Object invoke() {
                        String str;
                        int i4 = i2;
                        Integer num2 = num;
                        switch (i4) {
                            case 0:
                                str = "Upload status received. statusCode: ";
                                break;
                            default:
                                str = "Chunk status received. statusCode: ";
                                break;
                        }
                        return qv1.j(str, num2);
                    }
                });
                String str = (String) linkedHashMap.get("Range");
                int iD2 = qt4.D(this.p);
                ed7 ed7Var = this.o;
                if (iD2 == 0) {
                    z0m.a(ed7Var, str, new u8h(18));
                } else {
                    if (iD2 != 1) {
                        ore.o();
                        return;
                    }
                    z0m.a(ed7Var, str, new u8h(17));
                }
                l();
                dki dkiVar = (dki) this.u.b;
                int i4 = dkiVar.d.b - 1;
                for (int i5 = 0; i5 < i4; i5++) {
                    dkiVar.a(false);
                }
                this.t = false;
                return;
            }
            if (iD != 4) {
                qr7.q(v0h.n(this.v), " in readyForReadPayload", "Unexpected state of UploadConnection: ");
                return;
            }
            mfVar.b("UploadConnection", new af7() { // from class: xfi
                @Override // defpackage.af7
                public final Object invoke() {
                    String str2;
                    int i6 = i3;
                    Integer num2 = num;
                    switch (i6) {
                        case 0:
                            str2 = "Upload status received. statusCode: ";
                            break;
                        default:
                            str2 = "Chunk status received. statusCode: ";
                            break;
                    }
                    return qv1.j(str2, num2);
                }
            });
            if (num != null && num.intValue() == 201) {
                sq3 sq3Var = this.x;
                if (sq3Var != null) {
                    sq3Var.a();
                }
                l();
                return;
            }
            if (num != null && num.intValue() == 200) {
                sq3 sq3Var2 = this.x;
                if (sq3Var2 != null) {
                    sq3Var2.a();
                }
                this.x = null;
                E(6);
                close();
            }
        }
    }

    @Override // defpackage.wdf
    public final void onConnected() throws IOException {
        zn3 zn3Var = new zn3(14);
        mf mfVar = this.d;
        mfVar.b(HTTP.CONN_DIRECTIVE, zn3Var);
        if (this.k != -1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.k;
            this.k = -1L;
            aki akiVar = this.c;
            if (akiVar != null) {
                akiVar.e(jElapsedRealtime);
            }
        }
        i1m i1mVar = this.e;
        boolean zFinishConnect = ((SocketChannel) i1mVar.a).finishConnect();
        Boolean boolValueOf = Boolean.valueOf(zFinishConnect);
        if (!zFinishConnect) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            A();
            SSLContext sSLContext = this.b;
            if (sSLContext == null) {
                return;
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) ((SocketChannel) i1mVar.a).getRemoteAddress();
            SSLEngine sSLEngineCreateSSLEngine = sSLContext.createSSLEngine(inetSocketAddress.getHostName(), inetSocketAddress.getPort());
            sSLEngineCreateSSLEngine.setUseClientMode(true);
            sSLEngineCreateSSLEngine.beginHandshake();
            xde xdeVar = new xde(sSLEngineCreateSSLEngine);
            this.h = new ewe(this, xdeVar, false, 6);
            this.i = new wze(this, 6, xdeVar);
            this.j = new xde(this, xdeVar, mfVar);
        }
    }

    public final void y() throws ClosedChannelException {
        this.d.b(HTTP.CONN_DIRECTIVE, new zn3(9));
        SocketChannel socketChannel = (SocketChannel) this.e.a;
        euc eucVar = this.a;
        ((ze9) eucVar.b).b("Poller", new zn3(9));
        socketChannel.register((Selector) eucVar.c, 1, this);
    }
}
