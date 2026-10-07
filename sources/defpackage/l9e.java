package defpackage;

import java.net.ProtocolException;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.collections.a;
import one.video.calls.sdk_private.wss.b;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class l9e implements mtj {
    public static final List x = Collections.singletonList(twd.HTTP_1_1);
    public final dle a;
    public final b b;
    public final Random c;
    public final long d;
    public final long f;
    public final String g;
    public y8e h;
    public j9e i;
    public ptj j;
    public qtj k;
    public final fkh l;
    public String m;
    public b9e n;
    public long q;
    public boolean r;
    public String t;
    public boolean u;
    public int v;
    public boolean w;
    public ntj e = null;
    public final ArrayDeque o = new ArrayDeque();
    public final ArrayDeque p = new ArrayDeque();
    public int s = -1;

    public l9e(pkh pkhVar, dle dleVar, b bVar, Random random, long j, long j2) {
        this.a = dleVar;
        this.b = bVar;
        this.c = random;
        this.d = j;
        this.f = j2;
        this.l = pkhVar.e();
        String str = dleVar.b;
        if (!HttpGet.METHOD_NAME.equals(str)) {
            c.o(qv1.k("Request must be GET: ", str));
            throw null;
        }
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        gm0.g(16L, 0L, 16L);
        this.g = a.a(a.T0(0, bArr, 16));
    }

    public final void a(pne pneVar, yf2 yf2Var) {
        hu7 hu7Var = pneVar.f;
        int i = pneVar.d;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(x05.i(sb, pneVar.c, '\''));
        }
        String strA = hu7Var.a(HTTP.CONN_DIRECTIVE);
        if (strA == null) {
            strA = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strA)) {
            throw new ProtocolException(qv1.g('\'', "Expected 'Connection' header value 'Upgrade' but was '", strA));
        }
        String strA2 = hu7Var.a("Upgrade");
        if (strA2 == null) {
            strA2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strA2)) {
            throw new ProtocolException(qv1.g('\'', "Expected 'Upgrade' header value 'websocket' but was '", strA2));
        }
        String strA3 = hu7Var.a("Sec-WebSocket-Accept");
        String str = strA3 != null ? strA3 : null;
        byte[] bytes = zo5.w(new StringBuilder(), this.g, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes(pt2.a);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bytes, 0, bytes.length);
        String strA4 = a.a(new d71(messageDigest.digest()).a);
        if (strA4.equals(str)) {
            if (yf2Var == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA4 + "' but was '" + str + '\'');
    }

    public final boolean b(int i, String str) {
        String str2;
        synchronized (this) {
            d71 d71Var = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    byte[] bytes = str.getBytes(pt2.a);
                    d71Var = new d71(bytes);
                    d71Var.c = str;
                    if (bytes.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.u && !this.r) {
                    this.r = true;
                    this.p.add(new h9e(i, d71Var));
                    f();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Exception exc, pne pneVar) {
        synchronized (this) {
            if (this.u) {
                return;
            }
            this.u = true;
            b9e b9eVar = this.n;
            this.n = null;
            ptj ptjVar = this.j;
            this.j = null;
            qtj qtjVar = this.k;
            this.k = null;
            this.l.e();
            try {
                this.b.onFailure(this, exc, pneVar);
            } finally {
                if (b9eVar != null) {
                    uqi.d(b9eVar);
                }
                if (ptjVar != null) {
                    uqi.d(ptjVar);
                }
                if (qtjVar != null) {
                    uqi.d(qtjVar);
                }
            }
        }
    }

    public final void d(String str, b9e b9eVar) {
        ntj ntjVar = this.e;
        synchronized (this) {
            try {
                this.m = str;
                this.n = b9eVar;
                this.k = new qtj(b9eVar.b, this.c, ntjVar.a, ntjVar.c, this.f);
                this.i = new j9e(this);
                long j = this.d;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.l.c(new k9e(str.concat(" ping"), this, nanos), nanos);
                }
                if (!this.p.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.j = new ptj(b9eVar.a, this, ntjVar.a, ntjVar.e);
    }

    public final void e() {
        while (this.s == -1) {
            ptj ptjVar = this.j;
            ptjVar.y();
            if (ptjVar.i) {
                ptjVar.l();
            } else {
                l31 l31Var = ptjVar.l;
                int i = ptjVar.f;
                if (i != 1 && i != 2) {
                    byte[] bArr = uqi.a;
                    throw new ProtocolException("Unknown opcode: ".concat(Integer.toHexString(i)));
                }
                while (true) {
                    if (!ptjVar.e) {
                        long j = ptjVar.g;
                        if (j > 0) {
                            ptjVar.a.q0(j, l31Var);
                        }
                        if (ptjVar.h) {
                            if (ptjVar.j) {
                                tfa tfaVar = ptjVar.m;
                                if (tfaVar == null) {
                                    tfaVar = new tfa(ptjVar.d, 1);
                                    ptjVar.m = tfaVar;
                                }
                                Inflater inflater = (Inflater) tfaVar.d;
                                l31 l31Var2 = tfaVar.c;
                                if (l31Var2.b != 0) {
                                    ore.p("Failed requirement.");
                                    return;
                                }
                                if (tfaVar.b) {
                                    inflater.reset();
                                }
                                l31Var2.r0(l31Var);
                                l31Var2.v0(65535);
                                long bytesRead = inflater.getBytesRead() + l31Var2.b;
                                do {
                                    ((hd8) tfaVar.e).b(BuildConfig.MAX_TIME_TO_UPLOAD, l31Var);
                                } while (inflater.getBytesRead() < bytesRead);
                            }
                            l9e l9eVar = ptjVar.b;
                            if (i != 1) {
                                l9eVar.b.onMessage(l9eVar, l31Var.f0(l31Var.b));
                                break;
                            } else {
                                l9eVar.b.onMessage(l9eVar, l31Var.P());
                                break;
                            }
                        }
                        while (!ptjVar.e) {
                            ptjVar.y();
                            if (!ptjVar.i) {
                                break;
                            } else {
                                ptjVar.l();
                            }
                        }
                        if (ptjVar.f != 0) {
                            int i2 = ptjVar.f;
                            byte[] bArr2 = uqi.a;
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(Integer.toHexString(i2)));
                        }
                    } else {
                        qr7.k("closed");
                        return;
                    }
                }
            }
        }
    }

    public final void f() {
        byte[] bArr = uqi.a;
        j9e j9eVar = this.i;
        if (j9eVar != null) {
            this.l.c(j9eVar, 0L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070 A[Catch: all -> 0x0079, TRY_ENTER, TryCatch #3 {all -> 0x0079, blocks: (B:28:0x0070, B:31:0x007c, B:33:0x0080, B:34:0x0087, B:36:0x0093, B:39:0x0097, B:40:0x0098, B:41:0x0099, B:43:0x009d, B:73:0x010f, B:75:0x0113, B:84:0x0129, B:85:0x012b, B:61:0x00c8, B:65:0x00ed, B:66:0x00f6, B:62:0x00dc, B:67:0x00f7, B:69:0x0101, B:70:0x0104, B:86:0x012c, B:87:0x0131, B:35:0x0088, B:72:0x010c), top: B:102:0x006e, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:28:0x0070, B:31:0x007c, B:33:0x0080, B:34:0x0087, B:36:0x0093, B:39:0x0097, B:40:0x0098, B:41:0x0099, B:43:0x009d, B:73:0x010f, B:75:0x0113, B:84:0x0129, B:85:0x012b, B:61:0x00c8, B:65:0x00ed, B:66:0x00f6, B:62:0x00dc, B:67:0x00f7, B:69:0x0101, B:70:0x0104, B:86:0x012c, B:87:0x0131, B:35:0x0088, B:72:0x010c), top: B:102:0x006e, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:28:0x0070, B:31:0x007c, B:33:0x0080, B:34:0x0087, B:36:0x0093, B:39:0x0097, B:40:0x0098, B:41:0x0099, B:43:0x009d, B:73:0x010f, B:75:0x0113, B:84:0x0129, B:85:0x012b, B:61:0x00c8, B:65:0x00ed, B:66:0x00f6, B:62:0x00dc, B:67:0x00f7, B:69:0x0101, B:70:0x0104, B:86:0x012c, B:87:0x0131, B:35:0x0088, B:72:0x010c), top: B:102:0x006e, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0099 A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:28:0x0070, B:31:0x007c, B:33:0x0080, B:34:0x0087, B:36:0x0093, B:39:0x0097, B:40:0x0098, B:41:0x0099, B:43:0x009d, B:73:0x010f, B:75:0x0113, B:84:0x0129, B:85:0x012b, B:61:0x00c8, B:65:0x00ed, B:66:0x00f6, B:62:0x00dc, B:67:0x00f7, B:69:0x0101, B:70:0x0104, B:86:0x012c, B:87:0x0131, B:35:0x0088, B:72:0x010c), top: B:102:0x006e, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009d A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:28:0x0070, B:31:0x007c, B:33:0x0080, B:34:0x0087, B:36:0x0093, B:39:0x0097, B:40:0x0098, B:41:0x0099, B:43:0x009d, B:73:0x010f, B:75:0x0113, B:84:0x0129, B:85:0x012b, B:61:0x00c8, B:65:0x00ed, B:66:0x00f6, B:62:0x00dc, B:67:0x00f7, B:69:0x0101, B:70:0x0104, B:86:0x012c, B:87:0x0131, B:35:0x0088, B:72:0x010c), top: B:102:0x006e, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:28:0x0070, B:31:0x007c, B:33:0x0080, B:34:0x0087, B:36:0x0093, B:39:0x0097, B:40:0x0098, B:41:0x0099, B:43:0x009d, B:73:0x010f, B:75:0x0113, B:84:0x0129, B:85:0x012b, B:61:0x00c8, B:65:0x00ed, B:66:0x00f6, B:62:0x00dc, B:67:0x00f7, B:69:0x0101, B:70:0x0104, B:86:0x012c, B:87:0x0131, B:35:0x0088, B:72:0x010c), top: B:102:0x006e, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ed A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:28:0x0070, B:31:0x007c, B:33:0x0080, B:34:0x0087, B:36:0x0093, B:39:0x0097, B:40:0x0098, B:41:0x0099, B:43:0x009d, B:73:0x010f, B:75:0x0113, B:84:0x0129, B:85:0x012b, B:61:0x00c8, B:65:0x00ed, B:66:0x00f6, B:62:0x00dc, B:67:0x00f7, B:69:0x0101, B:70:0x0104, B:86:0x012c, B:87:0x0131, B:35:0x0088, B:72:0x010c), top: B:102:0x006e, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0101 A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:28:0x0070, B:31:0x007c, B:33:0x0080, B:34:0x0087, B:36:0x0093, B:39:0x0097, B:40:0x0098, B:41:0x0099, B:43:0x009d, B:73:0x010f, B:75:0x0113, B:84:0x0129, B:85:0x012b, B:61:0x00c8, B:65:0x00ed, B:66:0x00f6, B:62:0x00dc, B:67:0x00f7, B:69:0x0101, B:70:0x0104, B:86:0x012c, B:87:0x0131, B:35:0x0088, B:72:0x010c), top: B:102:0x006e, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0113 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #3 {all -> 0x0079, blocks: (B:28:0x0070, B:31:0x007c, B:33:0x0080, B:34:0x0087, B:36:0x0093, B:39:0x0097, B:40:0x0098, B:41:0x0099, B:43:0x009d, B:73:0x010f, B:75:0x0113, B:84:0x0129, B:85:0x012b, B:61:0x00c8, B:65:0x00ed, B:66:0x00f6, B:62:0x00dc, B:67:0x00f7, B:69:0x0101, B:70:0x0104, B:86:0x012c, B:87:0x0131, B:35:0x0088, B:72:0x010c), top: B:102:0x006e, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x011a  */
    /* JADX WARN: Code duplicated, block: B:79:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0124  */
    /* JADX WARN: Code duplicated, block: B:86:0x012c A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:28:0x0070, B:31:0x007c, B:33:0x0080, B:34:0x0087, B:36:0x0093, B:39:0x0097, B:40:0x0098, B:41:0x0099, B:43:0x009d, B:73:0x010f, B:75:0x0113, B:84:0x0129, B:85:0x012b, B:61:0x00c8, B:65:0x00ed, B:66:0x00f6, B:62:0x00dc, B:67:0x00f7, B:69:0x0101, B:70:0x0104, B:86:0x012c, B:87:0x0131, B:35:0x0088, B:72:0x010c), top: B:102:0x006e, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x00dc, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final boolean g() {
        Object objPoll;
        String str;
        int i;
        ?? r4;
        ?? r8;
        ?? r7;
        int i2;
        d71 d71Var;
        d71 d71VarF0;
        l31 l31Var;
        i9e i9eVar;
        synchronized (this) {
            try {
                if (this.u) {
                    return false;
                }
                qtj qtjVar = this.k;
                Object objPoll2 = this.o.poll();
                String str2 = null;
                try {
                    if (objPoll2 == null) {
                        objPoll = this.p.poll();
                        if (objPoll instanceof h9e) {
                            i = this.s;
                            str = this.t;
                            if (i != -1) {
                                b9e b9eVar = this.n;
                                this.n = null;
                                ptj ptjVar = this.j;
                                this.j = null;
                                qtj qtjVar2 = this.k;
                                this.k = null;
                                this.l.e();
                                r4 = b9eVar;
                                r7 = ptjVar;
                                r8 = qtjVar2;
                            } else {
                                this.l.c(new j9e(this.m + " cancel", this), 60000000000L);
                                r4 = 0;
                                r7 = 0;
                                r8 = 0;
                            }
                        } else {
                            if (objPoll == null) {
                                return false;
                            }
                            str = null;
                        }
                        if (objPoll2 != null) {
                            qtjVar.b(10, (d71) objPoll2);
                        } else if (objPoll instanceof i9e) {
                            i9eVar = (i9e) objPoll;
                            qtjVar.g(i9eVar.a);
                            synchronized (this) {
                                this.q -= (long) i9eVar.a.a.length;
                            }
                        } else {
                            if (objPoll instanceof h9e) {
                                throw new AssertionError();
                            }
                            h9e h9eVar = (h9e) objPoll;
                            i2 = h9eVar.a;
                            d71Var = h9eVar.b;
                            qtjVar.getClass();
                            d71VarF0 = d71.d;
                            if (i2 == 0 || d71Var != null) {
                                if (i2 != 0) {
                                    if (i2 >= 1000 || i2 >= 5000) {
                                        str2 = "Code must be in range [1000,5000): " + i2;
                                    } else if ((1004 <= i2 && i2 < 1007) || (1015 <= i2 && i2 < 3000)) {
                                        str2 = "Code " + i2 + " is reserved and may not be used.";
                                    }
                                    if (str2 != null) {
                                        throw new IllegalArgumentException(str2.toString());
                                    }
                                }
                                l31Var = new l31();
                                l31Var.x0(i2);
                                if (d71Var != null) {
                                    l31Var.o0(d71Var);
                                }
                                d71VarF0 = l31Var.f0(l31Var.b);
                            }
                            try {
                                qtjVar.b(8, d71VarF0);
                                qtjVar.h = true;
                                if (r4 != 0) {
                                    this.b.onClosed(this, i, str);
                                }
                            } catch (Throwable th) {
                                qtjVar.h = true;
                                throw th;
                            }
                        }
                        if (r4 != 0) {
                            uqi.d(r4);
                        }
                        if (r7 != 0) {
                            uqi.d(r7);
                        }
                        if (r8 != 0) {
                            uqi.d(r8);
                        }
                        return true;
                    }
                    objPoll = null;
                    str = null;
                    if (objPoll2 != null) {
                        qtjVar.b(10, (d71) objPoll2);
                    } else if (objPoll instanceof i9e) {
                        i9eVar = (i9e) objPoll;
                        qtjVar.g(i9eVar.a);
                        synchronized (this) {
                            this.q -= (long) i9eVar.a.a.length;
                        }
                    } else {
                        if (objPoll instanceof h9e) {
                            throw new AssertionError();
                        }
                        h9e h9eVar2 = (h9e) objPoll;
                        i2 = h9eVar2.a;
                        d71Var = h9eVar2.b;
                        qtjVar.getClass();
                        d71VarF0 = d71.d;
                        if (i2 == 0) {
                            if (i2 != 0) {
                                if (i2 >= 1000) {
                                    str2 = "Code must be in range [1000,5000): " + i2;
                                } else {
                                    str2 = "Code must be in range [1000,5000): " + i2;
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            l31Var = new l31();
                            l31Var.x0(i2);
                            if (d71Var != null) {
                                l31Var.o0(d71Var);
                            }
                            d71VarF0 = l31Var.f0(l31Var.b);
                        } else {
                            if (i2 != 0) {
                                if (i2 >= 1000) {
                                    str2 = "Code must be in range [1000,5000): " + i2;
                                } else {
                                    str2 = "Code must be in range [1000,5000): " + i2;
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            l31Var = new l31();
                            l31Var.x0(i2);
                            if (d71Var != null) {
                                l31Var.o0(d71Var);
                            }
                            d71VarF0 = l31Var.f0(l31Var.b);
                        }
                        qtjVar.b(8, d71VarF0);
                        qtjVar.h = true;
                        if (r4 != 0) {
                            this.b.onClosed(this, i, str);
                        }
                    }
                    if (r4 != 0) {
                        uqi.d(r4);
                    }
                    if (r7 != 0) {
                        uqi.d(r7);
                    }
                    if (r8 != 0) {
                        uqi.d(r8);
                    }
                    return true;
                } catch (Throwable th2) {
                    if (r4 != 0) {
                        uqi.d(r4);
                    }
                    if (r7 != 0) {
                        uqi.d(r7);
                    }
                    if (r8 != 0) {
                        uqi.d(r8);
                    }
                    throw th2;
                }
                String str3 = str;
                String str4 = str3;
                i = -1;
                r4 = str4;
                r7 = str3;
                r8 = str4;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
