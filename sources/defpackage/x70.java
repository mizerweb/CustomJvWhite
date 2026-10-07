package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.camera2.CameraManager;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import androidx.media3.common.VideoFrameProcessingException;
import com.vk.push.core.base.AidlException;
import com.vk.push.core.network.http.HttpClient;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.net.ssl.X509TrustManager;
import one.video.calls.sdk_private.bq;
import one.video.calls.sdk_private.dQ;
import one.video.calls.sdk_private.dS;
import one.video.calls.sdk_private.dj;
import one.video.calls.sdk_private.dy;
import org.apache.http.HttpStatus;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class x70 implements gqb, gek {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;

    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
    public x70(String str, String str2, int i, Duration duration, dek dekVar, w5k w5kVar, ku8 ku8Var) {
        int i2;
        w8k w8kVar = new w8k();
        ArrayList arrayList = new ArrayList();
        w8kVar.a = HttpClient.DEFAULT_TIMEOUT_IN_MILLIS;
        w8kVar.b = 3;
        w8kVar.c = 3;
        w8kVar.d = 2500000L;
        w8kVar.e = 250000L;
        w8kVar.f = 250000L;
        w8kVar.g = 2;
        w8kVar.h = 1500;
        String str3 = System.getenv("QUIC_VERSION");
        int i3 = 1;
        if (str3 != null) {
            String lowerCase = str3.trim().toLowerCase();
            if (lowerCase.equals("1") || !lowerCase.equals("2")) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        long millis = duration.toMillis();
        w8kVar.b = AidlException.HOST_IS_NOT_MASTER;
        w8kVar.c = 100;
        boolean z = dekVar.b;
        X509TrustManager x509TrustManager = dekVar.d;
        e8k e8kVar = null;
        X509TrustManager x509TrustManager2 = x509TrustManager != null ? x509TrustManager : null;
        x5k x5kVar = dekVar.e;
        if (str == null) {
            ore.k("Cannot create connection when URI is not set");
            throw null;
        }
        boolean z2 = false;
        int iCharCount = 0;
        while (iCharCount < 2) {
            int iCodePointAt = "h3".codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                if (millis < 1) {
                    ore.p("Connect timeout must be larger than 0.");
                    throw null;
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(hfk.TLS_AES_128_GCM_SHA256);
                }
                x5k x5kVar2 = x5kVar;
                int i4 = i2;
                String str4 = str2 == null ? str : str2;
                int i5 = d8k.a[qt4.D(i4)];
                if (i5 == i3) {
                    e8kVar = e8k.b;
                } else if (i5 == 2) {
                    e8kVar = e8k.c;
                }
                z7k z7kVar = new z7k(str, str4, i, millis, w8kVar, e8kVar, ku8Var, arrayList, w5kVar);
                i05 i05Var = z7kVar.y;
                if (z) {
                    i05Var.s = new y7k();
                    i05Var.t = new dzh(14);
                }
                if (x509TrustManager2 != null) {
                    i05Var.s = x509TrustManager2;
                }
                i05Var.t = new yki(x5kVar2);
                this.c = new HashMap();
                Object[] objArr = {1L, 7L, 8L};
                ArrayList arrayList2 = new ArrayList(3);
                for (int i6 = 0; i6 < 3; i6++) {
                    Object obj = objArr[i6];
                    Objects.requireNonNull(obj);
                    arrayList2.add(obj);
                }
                this.h = Collections.unmodifiableList(arrayList2);
                this.b = z7kVar;
                this.d = new xtj(20);
                HashMap map = new HashMap();
                this.e = map;
                map.put(1L, 0L);
                map.put(7L, 0L);
                this.f = new HashMap();
                final int i7 = 1;
                this.g = new CountDownLatch(1);
                HashMap map2 = (HashMap) this.c;
                map2.put(0L, new Consumer(this) { // from class: kek
                    public final /* synthetic */ x70 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        int i8 = i7;
                        x70 x70Var = this.b;
                        switch (i8) {
                            case 0:
                                new Thread(new v1k(x70Var, 7, (pak) obj2)).start();
                                return;
                            default:
                                InputStream inputStreamB = ((hek) obj2).b();
                                try {
                                    if (ti8.g(inputStreamB) != 4) {
                                        x70Var.e(266L);
                                    }
                                    byte[] bArrC = x70.c(inputStreamB, ti8.d(inputStreamB));
                                    HashMap map3 = new HashMap();
                                    map3.put(1L, 0L);
                                    map3.put(7L, 0L);
                                    map3.put(8L, 0L);
                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrC);
                                    while (byteBufferWrap.remaining() > 0) {
                                        try {
                                            map3.put(Long.valueOf(ti8.h(byteBufferWrap)), Long.valueOf(ti8.h(byteBufferWrap)));
                                        } catch (bq e) {
                                            throw new IOException(e);
                                        }
                                    }
                                    ((HashMap) x70Var.f).putAll(map3);
                                    ((CountDownLatch) x70Var.g).countDown();
                                    return;
                                } catch (IOException unused) {
                                    x70Var.e(260L);
                                    return;
                                }
                        }
                    }
                });
                map2.put(2L, new t81(15, this));
                map2.put(3L, new t81(16));
                map2.put(1L, new t81(14, this));
                this.i = new zdk();
                final int i8 = 0;
                z7kVar.E.i = new Consumer(this) { // from class: kek
                    public final /* synthetic */ x70 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        int i9 = i8;
                        x70 x70Var = this.b;
                        switch (i9) {
                            case 0:
                                new Thread(new v1k(x70Var, 7, (pak) obj2)).start();
                                return;
                            default:
                                InputStream inputStreamB = ((hek) obj2).b();
                                try {
                                    if (ti8.g(inputStreamB) != 4) {
                                        x70Var.e(266L);
                                    }
                                    byte[] bArrC = x70.c(inputStreamB, ti8.d(inputStreamB));
                                    HashMap map3 = new HashMap();
                                    map3.put(1L, 0L);
                                    map3.put(7L, 0L);
                                    map3.put(8L, 0L);
                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrC);
                                    while (byteBufferWrap.remaining() > 0) {
                                        try {
                                            map3.put(Long.valueOf(ti8.h(byteBufferWrap)), Long.valueOf(ti8.h(byteBufferWrap)));
                                        } catch (bq e) {
                                            throw new IOException(e);
                                        }
                                    }
                                    ((HashMap) x70Var.f).putAll(map3);
                                    ((CountDownLatch) x70Var.g).countDown();
                                    return;
                                } catch (IOException unused) {
                                    x70Var.e(260L);
                                    return;
                                }
                        }
                    }
                };
                return;
            }
            iCharCount += Character.charCount(iCodePointAt);
            x5kVar = x5kVar;
            i3 = i3;
            millis = millis;
            z2 = z2;
            i2 = i2;
        }
        ore.k("Application protocol must be set");
        throw null;
    }

    public static byte[] c(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int iA = vm9.a(inputStream, bArr, i);
        if (iA < i) {
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            bArr = bArr2;
        }
        if (bArr.length == i) {
            return bArr;
        }
        throw new EOFException("Stream closed by peer");
    }

    public o9b a(InputStream inputStream) throws IOException, dj {
        String str;
        Map.Entry simpleEntry;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 1);
        int i = pushbackInputStream.read();
        if (i == -1) {
            return null;
        }
        pushbackInputStream.unread(i);
        long jG = ti8.g(pushbackInputStream);
        int iD = ti8.d(pushbackInputStream);
        int i2 = (int) jG;
        if (i2 == 0) {
            if (iD > BuildConfig.MAX_TIME_TO_UPLOAD) {
                throw new dj("max data size exceeded", HttpStatus.SC_BAD_REQUEST);
            }
            iek iekVar = new iek();
            iekVar.a = ByteBuffer.allocate(0);
            iekVar.a = ByteBuffer.wrap(c(pushbackInputStream, iD));
            return iekVar;
        }
        if (i2 != 1) {
            if (i2 != 3) {
                if (i2 == 4) {
                    qek qekVar = new qek();
                    HashMap map = new HashMap();
                    qekVar.a = map;
                    map.put(1L, 0L);
                    map.put(7L, 0L);
                    map.put(8L, 0L);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(c(pushbackInputStream, iD));
                    while (byteBufferWrap.remaining() > 0) {
                        try {
                            qekVar.a.put(Long.valueOf(ti8.h(byteBufferWrap)), Long.valueOf(ti8.h(byteBufferWrap)));
                        } catch (bq e) {
                            throw new IOException(e);
                        }
                    }
                    return qekVar;
                }
                if (i2 != 5 && i2 != 7 && i2 != 13) {
                    pushbackInputStream.skip(iD);
                    return new odk();
                }
            }
            throw new dy(nbh.s(jG, "Frame type ", " not yet implemented"));
        }
        if (iD > BuildConfig.MAX_TIME_TO_UPLOAD) {
            throw new dj("max header size exceeded", HttpStatus.SC_REQUEST_URI_TOO_LONG);
        }
        jek jekVar = new jek();
        jekVar.a = new HashMap();
        yr8.e(Collections.EMPTY_MAP, new ydk(0));
        byte[] bArrC = c(pushbackInputStream, iD);
        xtj xtjVar = (xtj) this.d;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
        ArrayList arrayList = (ArrayList) xtjVar.d;
        h6f h6fVar = (h6f) xtjVar.c;
        PushbackInputStream pushbackInputStream2 = new PushbackInputStream(byteArrayInputStream, 16);
        ArrayList arrayList2 = new ArrayList();
        xtj.i(8, pushbackInputStream2);
        xtj.i(7, pushbackInputStream2);
        int i3 = pushbackInputStream2.read();
        pushbackInputStream2.unread(i3);
        while (i3 >= 0) {
            if ((i3 & np0.m) == 128) {
                byte bM = xtj.m(pushbackInputStream2);
                pushbackInputStream2.unread(bM);
                boolean z = (bM & 64) == 64;
                int i4 = (int) xtj.i(6, pushbackInputStream2);
                if (z) {
                    String[] strArr = (String[]) h6fVar.b;
                    if (strArr[i4] == null) {
                        throw new dQ();
                    }
                    simpleEntry = new AbstractMap.SimpleImmutableEntry(strArr[i4], ((String[]) h6fVar.c)[i4]);
                } else {
                    simpleEntry = i4 < arrayList.size() ? (Map.Entry) arrayList.get(i4) : null;
                }
            } else if ((i3 & 192) == 64) {
                byte bM2 = xtj.m(pushbackInputStream2);
                pushbackInputStream2.unread(bM2);
                boolean z2 = (bM2 & 16) == 16;
                int i5 = (int) xtj.i(4, pushbackInputStream2);
                if (!z2) {
                    throw new dS("non static ref in parseLiteralHeaderFieldWithNameReference");
                }
                String str2 = ((String[]) h6fVar.b)[i5];
                if (str2 == null) {
                    throw new dQ();
                }
                simpleEntry = new AbstractMap.SimpleEntry(str2, xtjVar.k(pushbackInputStream2));
            } else {
                if ((i3 & 224) != 32) {
                    throw new dS(zo5.h(i3, "Error: unknown instruction: "));
                }
                byte bM3 = xtj.m(pushbackInputStream2);
                pushbackInputStream2.unread(bM3);
                boolean z3 = (bM3 & 8) == 8;
                byte[] bArr = new byte[(int) xtj.i(3, pushbackInputStream2)];
                xtj.l(pushbackInputStream2, bArr);
                if (z3) {
                    ((cek) xtjVar.b).getClass();
                    str = cek.a(bArr);
                } else {
                    str = new String(bArr, StandardCharsets.ISO_8859_1);
                }
                simpleEntry = new AbstractMap.SimpleEntry(str, xtjVar.k(pushbackInputStream2));
            }
            if (simpleEntry != null) {
                arrayList2.add(simpleEntry);
            }
            i3 = pushbackInputStream2.read();
            pushbackInputStream2.unread(i3);
        }
        Map map2 = (Map) arrayList2.stream().collect(Collectors.toMap(new lbk(14), new lbk(jekVar), new bu4(jekVar)));
        map2.entrySet().stream().filter(new kck(10)).forEach(new r5k(4, jekVar));
        yr8.e(map2, new ydk(1));
        return jekVar;
    }

    public oek b(eth ethVar, Duration duration) {
        URI uri = (URI) ethVar.a;
        if (!((CountDownLatch) this.g).await(duration.toMillis(), TimeUnit.MILLISECONDS)) {
            throw new dj("No SETTINGS frame received in time.");
        }
        if (((Long) d(8L).orElse(0L)).longValue() != 1) {
            throw new dj("Server does not support Extended Connect (RFC 9220).");
        }
        HashMap map = new HashMap();
        int port = uri.getPort();
        if (port <= 0) {
            port = 443;
        }
        String strJ = qt4.j(port, uri.getHost(), ":");
        String path = uri.getPath();
        int length = path.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                path = "/";
                break;
            }
            int iCodePointAt = path.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        if (uri.getQuery() != null && !uri.getQuery().isEmpty()) {
            path = zo5.p(path, "?", uri.getQuery());
        }
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(":authority", strJ), new AbstractMap.SimpleEntry(":method", "CONNECT"), new AbstractMap.SimpleEntry(":protocol", "webtransport"), new AbstractMap.SimpleEntry(":scheme", "https"), new AbstractMap.SimpleEntry(":path", path)};
        HashMap map2 = new HashMap(5);
        for (int i = 0; i < 5; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map2.put(key, value) != null) {
                ore.p(c0a.n(key, "duplicate key: "));
                return null;
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map2);
        if (mapUnmodifiableMap.keySet().stream().anyMatch(new kck(9))) {
            ore.p("Pseudo headers must start with ':'");
            return null;
        }
        pak pakVarB = ((z7k) this.b).b(true);
        abk abkVar = pakVarB.f;
        zdk zdkVar = (zdk) this.i;
        ArrayList arrayList = new ArrayList();
        mapUnmodifiableMap.entrySet().forEach(new ock(1, arrayList));
        map.entrySet().forEach(new ock(2, arrayList));
        zdkVar.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(arrayList.stream().mapToInt(new ao8(17)).sum() + 10);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 0);
        arrayList.forEach(new y81(zdkVar, 8, byteBufferAllocate));
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
        ti8.a(byteBufferAllocate.limit(), byteBufferAllocate2);
        byte[] bArr = new byte[byteBufferAllocate.limit() + byteBufferAllocate2.limit() + 1];
        bArr[0] = 1;
        byteBufferAllocate2.get(bArr, 1, byteBufferAllocate2.limit());
        byteBufferAllocate.get(bArr, byteBufferAllocate2.limit() + 1, byteBufferAllocate.limit());
        abkVar.write(bArr);
        o9b o9bVarA = a(pakVarB.e);
        if (!(o9bVarA instanceof jek)) {
            if (o9bVarA != null) {
                throw new ProtocolException("Expected headers frame, got ".concat(o9bVarA.getClass().getSimpleName()));
            }
            throw new ProtocolException("Got empty response from server");
        }
        try {
            String str = (String) ((jek) o9bVarA).a.get(":status");
            if (str != null) {
                try {
                    Integer.parseInt(str);
                    int i2 = Integer.parseInt(str);
                    if (i2 < 200 || i2 >= 300) {
                        throw new dj("CONNECT request failed", i2);
                    }
                    return new oek(this, pakVarB);
                } catch (NumberFormatException unused) {
                }
            }
            throw new pek();
        } catch (pek unused2) {
            throw new ProtocolException("Malformed response from server: missing status code");
        }
    }

    public Optional d(long j) {
        try {
            ((CountDownLatch) this.g).await(10L, TimeUnit.SECONDS);
            return Optional.ofNullable((Long) ((HashMap) this.f).get(Long.valueOf(j)));
        } catch (InterruptedException unused) {
            return Optional.empty();
        }
    }

    public void e(long j) {
        z7k z7kVar = (z7k) this.b;
        z7kVar.e(j, null, 2);
        z7kVar.B.h();
    }

    @Override // defpackage.gqb
    public e89 f() {
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            yab.i0((dq4) this.g, null, 0, new qz9(this, r72Var, null, 23), 3);
            r72Var.a = "FetchData for PipeCameraPresence0";
        } catch (Exception e) {
            u72Var.c(e);
        }
        return u72Var;
    }

    public void g() {
        try {
            abk abkVar = ((z7k) this.b).b(false).f;
            abkVar.write(0);
            HashMap map = new HashMap();
            map.put(1L, 0L);
            map.put(7L, 0L);
            map.put(8L, 0L);
            map.putAll((HashMap) this.e);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(map.size() << 4);
            map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(new bo8(byteBufferAllocate, 7));
            int iPosition = byteBufferAllocate.position();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(ti8.b(iPosition) + 1 + iPosition);
            byteBufferAllocate2.put((byte) 4);
            ti8.a(iPosition, byteBufferAllocate2);
            byteBufferAllocate2.put(byteBufferAllocate.array(), 0, iPosition);
            abkVar.write(byteBufferAllocate2.array(), 0, byteBufferAllocate2.limit());
        } catch (IOException unused) {
            e(260L);
        }
    }

    public void h(u70 u70Var) {
        if (!this.a || u70Var.equals((u70) this.h)) {
            return;
        }
        this.h = u70Var;
        jc0 jc0Var = (jc0) ((ot4) this.c).b;
        jc0Var.e();
        u70 u70Var2 = jc0Var.g;
        if (u70Var2 == null || u70Var.equals(u70Var2)) {
            return;
        }
        jc0Var.g = u70Var;
        u89 u89Var = jc0Var.e;
        if (u89Var != null) {
            u89Var.f(-1, new p51(13));
        }
    }

    public u70 i() {
        Handler handler = (Handler) this.d;
        Context context = (Context) this.b;
        if (this.a) {
            u70 u70Var = (u70) this.h;
            u70Var.getClass();
            return u70Var;
        }
        this.a = true;
        w70 w70Var = (w70) this.g;
        if (w70Var != null) {
            w70Var.a.registerContentObserver(w70Var.b, false, w70Var);
        }
        p90.q(context).registerAudioDeviceCallback((v70) this.e, handler);
        u70 u70VarC = u70.c(context, context.registerReceiver((cg) this.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (p70) this.j, (AudioDeviceInfo) this.i);
        this.h = u70VarC;
        return u70VarC;
    }

    @Override // defpackage.gqb
    public void j(eqb eqbVar) {
        j0 j0Var;
        eqbVar.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        do {
            if (!it.hasNext()) {
                j0Var = null;
                break;
            }
            j0Var = (j0) it.next();
        } while (!j0Var.b.equals(eqbVar));
        if (j0Var != null) {
            ((CopyOnWriteArrayList) this.c).remove(j0Var);
        }
        synchronized (this.b) {
            try {
                if (this.a && ((CopyOnWriteArrayList) this.c).isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.a = false;
                    Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
                    if (((AtomicBoolean) this.h).compareAndSet(true, false)) {
                        sgg sggVar = (sgg) this.i;
                        if (sggVar != null) {
                            sggVar.b(null);
                        }
                        this.i = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() throws VideoFrameProcessingException {
        SparseArray sparseArray = (SparseArray) this.h;
        for (int i = 0; i < sparseArray.size(); i++) {
            gi8 gi8Var = (gi8) sparseArray.get(sparseArray.keyAt(i));
            if (!gi8Var.d) {
                gi8Var.d = true;
                gi8Var.a.m();
                md5 md5Var = gi8Var.b;
                if (md5Var != null) {
                    md5Var.release();
                }
            }
        }
    }

    public void l(p70 p70Var) {
        if (Objects.equals(p70Var, (p70) this.j)) {
            return;
        }
        this.j = p70Var;
        h(u70.b((Context) this.b, p70Var, (AudioDeviceInfo) this.i));
    }

    public void m(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, (AudioDeviceInfo) this.i)) {
            return;
        }
        this.i = audioDeviceInfo;
        h(u70.b((Context) this.b, (p70) this.j, audioDeviceInfo));
    }

    @Override // defpackage.gqb
    public void n(Executor executor, eqb eqbVar) {
        List listUnmodifiableList;
        Throwable th;
        executor.getClass();
        eqbVar.getClass();
        ((CopyOnWriteArrayList) this.c).add(new j0(executor, eqbVar));
        synchronized (this.b) {
            try {
                if (!this.a && !((CopyOnWriteArrayList) this.c).isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.a = true;
                    o();
                }
                listUnmodifiableList = Collections.unmodifiableList((List) this.d);
                th = (Throwable) this.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executor.execute(new i0(th, new j0(executor, eqbVar), listUnmodifiableList, 0));
    }

    public void o() throws IllegalAccessException, InvocationTargetException {
        if (!((AtomicBoolean) this.h).compareAndSet(false, true)) {
            Log.i("PipePresenceSrc", "Monitoring is already active. Ignoring redundant start call.");
            return;
        }
        Log.i("PipePresenceSrc", "Starting to collect camera ID flow.");
        sgg sggVar = (sgg) this.i;
        if (sggVar != null) {
            sggVar.b(null);
        }
        sfe sfeVar = new sfe();
        sfeVar.a = true;
        this.i = e9i.j0(new j3(new fz6(new xc3((xx6) this.f, 25), new voc(this, sfeVar, (lq4) null, 5), 3), 14, new vqa(this, (lq4) null, 10)), (dq4) this.g);
    }

    public void p() {
        Context context = (Context) this.b;
        if (this.a) {
            this.h = null;
            p90.q(context).unregisterAudioDeviceCallback((v70) this.e);
            context.unregisterReceiver((cg) this.f);
            w70 w70Var = (w70) this.g;
            if (w70Var != null) {
                w70Var.a.unregisterContentObserver(w70Var);
            }
            this.a = false;
        }
    }

    public void q(List list, Throwable th) {
        boolean z;
        List listUnmodifiableList;
        Throwable th2;
        synchronized (this.b) {
            try {
                if (th != null) {
                    z = ((Throwable) this.e) == null || !((List) this.d).isEmpty();
                    this.e = th;
                    this.d = Collections.EMPTY_LIST;
                } else {
                    list.getClass();
                    boolean z2 = (((Throwable) this.e) == null && ((List) this.d).equals(list)) ? false : true;
                    this.e = null;
                    this.d = list;
                    z = z2;
                }
                listUnmodifiableList = Collections.unmodifiableList((List) this.d);
                th2 = (Throwable) this.e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder("Data changed. Notifying ");
            sb.append(((CopyOnWriteArrayList) this.c).size());
            sb.append(" observers. Error: ");
            sb.append(th2 != null);
            Log.d("CameraPresenceSrc", sb.toString());
            for (j0 j0Var : (CopyOnWriteArrayList) this.c) {
                j0Var.a.execute(new i0(th2, j0Var, listUnmodifiableList, 0));
            }
        }
    }

    public x70(cnf cnfVar, imc imcVar, imc imcVar2, imc imcVar3, imc imcVar4, imc imcVar5, imc imcVar6, imc imcVar7, imc imcVar8, boolean z) {
        this.b = cnfVar;
        this.c = imcVar;
        this.d = imcVar2;
        this.e = imcVar3;
        this.f = imcVar4;
        this.g = imcVar5;
        this.h = imcVar6;
        this.i = imcVar7;
        this.j = imcVar8;
        this.a = z;
    }

    public x70(q8e q8eVar, dq4 dq4Var, List list, Context context) {
        this.b = new Object();
        this.c = new CopyOnWriteArrayList();
        this.e = null;
        this.a = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ejl.a((String) it.next(), null, null));
        }
        this.d = arrayList;
        this.f = q8eVar;
        this.g = dq4Var;
        this.h = new AtomicBoolean(false);
        this.j = (CameraManager) context.getSystemService("camera");
    }

    public x70(Context context, ex3 ex3Var, wm7 wm7Var, o02 o02Var, Executor executor, ef5 ef5Var, boolean z, boolean z2, boolean z3) {
        this.b = context;
        this.c = ex3Var;
        this.d = wm7Var;
        this.e = o02Var;
        this.g = executor;
        this.f = ef5Var;
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.a = z2;
        gi8 gi8Var = new gi8(new hj6(wm7Var, o02Var, z, z2));
        sparseArray.put(1, gi8Var);
        sparseArray.put(4, gi8Var);
        sparseArray.put(2, new gi8(new ly0(wm7Var, o02Var, z3)));
        sparseArray.put(3, new gi8(new tlh(wm7Var, o02Var)));
    }

    public x70(Context context, ot4 ot4Var, p70 p70Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = ot4Var;
        this.j = p70Var;
        this.i = audioDeviceInfo;
        Handler handlerQ = vqi.q(null);
        this.d = handlerQ;
        this.e = new v70(this);
        this.f = new cg(2, this);
        u70 u70Var = u70.c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new w70(this, handlerQ, applicationContext.getContentResolver(), uriFor) : null;
    }
}
