package one.video.calls.sdk.net.signaling.wt.nal.internal;

import defpackage.abk;
import defpackage.dek;
import defpackage.fw2;
import defpackage.h82;
import defpackage.j95;
import defpackage.kck;
import defpackage.mek;
import defpackage.ore;
import defpackage.pak;
import defpackage.pdk;
import defpackage.pt2;
import defpackage.qdk;
import defpackage.qf7;
import defpackage.qr7;
import defpackage.r5k;
import defpackage.s81;
import defpackage.sbi;
import defpackage.sdk;
import defpackage.ti8;
import defpackage.uak;
import defpackage.vdk;
import defpackage.wdk;
import defpackage.xdk;
import defpackage.z7k;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Metadata;
import one.video.calls.sdk.net.signaling.wt.nal.NALLog;
import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;
import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 A2\u00020\u0001:\u0003BCAB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u0017\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010$J\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010)J'\u0010*\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010'\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00107\u001a\n 6*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010?R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010@¨\u0006D"}, d2 = {"Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket;", "Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket;", "", ApiProtocol.KEY_ENDPOINT, "hostname", "Lone/video/calls/sdk/net/signaling/wt/nal/NALLog;", "log", "Ltech/kwik/flupke/Http3Client;", "client", "Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$CompressorDecompressor;", "compressorDecompressor", "Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket$Listener;", "listener", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lone/video/calls/sdk/net/signaling/wt/nal/NALLog;Ltech/kwik/flupke/Http3Client;Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$CompressorDecompressor;Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket$Listener;)V", "Lsbi;", "connect", "(Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket$Listener;)V", "T", "action", "context", "Lkotlin/Function2;", "handler", "handleAsync", "(Ljava/lang/String;Ljava/lang/Object;Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket$Listener;Lqf7;)V", "message", "send", "(Ljava/lang/String;)V", "", "code", "reason", "close", "(ILjava/lang/String;)V", "Ltech/kwik/flupke/webtransport/Session;", "session", "configureSession", "(Ltech/kwik/flupke/webtransport/Session;Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket$Listener;)V", "openSession", "Ltech/kwik/flupke/webtransport/WebTransportStream;", "stream", "sendStreamData", "(Ltech/kwik/flupke/webtransport/WebTransportStream;Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket$Listener;)V", "readStreamData", "(Ltech/kwik/flupke/webtransport/Session;Ltech/kwik/flupke/webtransport/WebTransportStream;Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket$Listener;)V", "Ljava/lang/String;", "Lone/video/calls/sdk/net/signaling/wt/nal/NALLog;", "Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$CompressorDecompressor;", "Ljava/util/LinkedList;", "messageQueue", "Ljava/util/LinkedList;", "Ljava/util/concurrent/locks/ReentrantLock;", "messageQueueLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "messageQueueCondition", "Ljava/util/concurrent/locks/Condition;", "", "released", "Z", "getId", "()Ljava/lang/String;", "id", "Ltech/kwik/flupke/Http3Client;", "Ltech/kwik/flupke/webtransport/Session;", "Companion", "CompressorDecompressor", "CompressorOutput", "nal"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WebTransportSocket implements NALSocket {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int INITIAL_MESSAGE_SIZE = 1024;

    @Deprecated
    public static final String LOG_TAG = "WebTransportSocket";
    private final dek client;
    private final CompressorDecompressor compressorDecompressor;
    private final String endpoint;
    private final String hostname;
    private final NALLog log;
    private final LinkedList<String> messageQueue = new LinkedList<>();
    private final Condition messageQueueCondition;
    private final ReentrantLock messageQueueLock;
    private volatile boolean released;
    private pdk session;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0012J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$CompressorDecompressor;", "", "", "rawData", "", "offset", "length", "Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$CompressorDecompressor$CompressedOutProvider;", "output", "Lsbi;", "compress", "([BIILone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$CompressorDecompressor$CompressedOutProvider;)V", "compressedData", "", "decompress", "([BII)Ljava/lang/String;", "release", "()V", "CompressedOutProvider", "nal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface CompressorDecompressor {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$CompressorDecompressor$CompressedOutProvider;", "", "getOutputStream", "Ljava/io/OutputStream;", "length", "", "nal"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public interface CompressedOutProvider {
            OutputStream getOutputStream(int length);
        }

        void compress(byte[] rawData, int offset, int length, CompressedOutProvider output);

        String decompress(byte[] compressedData, int offset, int length);

        void release();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$CompressorOutput;", "Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$CompressorDecompressor$CompressedOutProvider;", "<init>", "()V", "Ljava/io/OutputStream;", "output", "Lsbi;", "setOutput", "(Ljava/io/OutputStream;)V", "", "length", "getOutputStream", "(I)Ljava/io/OutputStream;", "flush", "", "messageLenData", "[B", "Ljava/nio/ByteBuffer;", "messageLenBuffer", "Ljava/nio/ByteBuffer;", "outputStream", "Ljava/io/OutputStream;", "nal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CompressorOutput implements CompressorDecompressor.CompressedOutProvider {
        private final ByteBuffer messageLenBuffer;
        private final byte[] messageLenData;
        private OutputStream outputStream;

        public CompressorOutput() {
            byte[] bArr = new byte[8];
            this.messageLenData = bArr;
            this.messageLenBuffer = ByteBuffer.wrap(bArr);
        }

        public final void flush() throws IOException {
            OutputStream outputStream = this.outputStream;
            if (outputStream != null) {
                outputStream.flush();
            }
        }

        @Override // one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket.CompressorDecompressor.CompressedOutProvider
        public final OutputStream getOutputStream(int length) throws IOException {
            OutputStream outputStream = this.outputStream;
            if (outputStream == null) {
                qr7.k("wt stream compressor has no output");
                return null;
            }
            ti8.a(length, this.messageLenBuffer);
            outputStream.write(this.messageLenData, 0, this.messageLenBuffer.position());
            return outputStream;
        }

        public final void setOutput(OutputStream output) {
            this.outputStream = output;
        }
    }

    public WebTransportSocket(String str, String str2, NALLog nALLog, dek dekVar, CompressorDecompressor compressorDecompressor, NALSocket.Listener listener) {
        this.endpoint = str;
        this.hostname = str2;
        this.log = nALLog;
        this.client = dekVar;
        this.compressorDecompressor = compressorDecompressor;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.messageQueueLock = reentrantLock;
        this.messageQueueCondition = reentrantLock.newCondition();
        handleAsync("connect-and-read", sbi.a, listener, new s81(29, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sbi _init_$lambda$0(WebTransportSocket webTransportSocket, sbi sbiVar, NALSocket.Listener listener) {
        webTransportSocket.connect(listener);
        return sbi.a;
    }

    private final void configureSession(pdk pdkVar, NALSocket.Listener listener) {
        final int i = 1;
        fw2 fw2Var = new fw2(this, i, listener);
        xdk xdkVar = (xdk) pdkVar;
        xdkVar.getClass();
        xdkVar.j = fw2Var;
        final int i2 = 0;
        xdk xdkVar2 = (xdk) pdkVar;
        xdkVar2.i = new Consumer(this) { // from class: utj
            public final /* synthetic */ WebTransportSocket b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i3 = i2;
                WebTransportSocket webTransportSocket = this.b;
                qdk qdkVar = (qdk) obj;
                switch (i3) {
                    case 0:
                        WebTransportSocket.configureSession$lambda$1(webTransportSocket, qdkVar);
                        break;
                    default:
                        WebTransportSocket.configureSession$lambda$2(webTransportSocket, qdkVar);
                        break;
                }
            }
        };
        xdkVar2.h = new Consumer(this) { // from class: utj
            public final /* synthetic */ WebTransportSocket b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i3 = i;
                WebTransportSocket webTransportSocket = this.b;
                qdk qdkVar = (qdk) obj;
                switch (i3) {
                    case 0:
                        WebTransportSocket.configureSession$lambda$1(webTransportSocket, qdkVar);
                        break;
                    default:
                        WebTransportSocket.configureSession$lambda$2(webTransportSocket, qdkVar);
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSession$lambda$0(WebTransportSocket webTransportSocket, NALSocket.Listener listener, Long l, String str) {
        webTransportSocket.log.log(LOG_TAG, "session has terminated with " + l + ", " + str);
        webTransportSocket.close(l != null ? (int) l.longValue() : 0, str == null ? "-" : str);
        int iLongValue = l != null ? (int) l.longValue() : 0;
        if (str == null) {
            str = "-";
        }
        listener.onClosed(iLongValue, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSession$lambda$1(WebTransportSocket webTransportSocket, qdk qdkVar) {
        webTransportSocket.log.log(LOG_TAG, "Got new BIDI stream");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSession$lambda$2(WebTransportSocket webTransportSocket, qdk qdkVar) {
        webTransportSocket.log.log(LOG_TAG, "Got new UNI stream");
    }

    private final void connect(NALSocket.Listener listener) {
        try {
            URI uriCreate = URI.create(this.endpoint);
            if (uriCreate.getPort() < 0) {
                uriCreate = new URI(uriCreate.getScheme(), uriCreate.getUserInfo(), uriCreate.getHost(), 443, uriCreate.getPath(), uriCreate.getQuery(), uriCreate.getFragment());
            }
            xdk xdkVarA = new sdk(uriCreate, this.hostname, this.client).a(uriCreate);
            this.session = xdkVarA;
            configureSession(xdkVarA, listener);
            openSession(xdkVarA, listener);
        } catch (Throwable th) {
            listener.onFailure(th);
        }
    }

    private final <T> void handleAsync(String action, T context, NALSocket.Listener listener, qf7 handler) {
        Thread thread = new Thread(new h82(this, action, handler, context, listener));
        thread.setName("wt-" + action);
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleAsync$lambda$0(WebTransportSocket webTransportSocket, String str, qf7 qf7Var, Object obj, NALSocket.Listener listener) {
        NALLog nALLog;
        StringBuilder sb;
        webTransportSocket.log.log(LOG_TAG, str + " thread is about to start");
        try {
            qf7Var.invoke(obj, listener);
            nALLog = webTransportSocket.log;
            sb = new StringBuilder();
        } catch (Throwable th) {
            try {
                webTransportSocket.log.logException(LOG_TAG, str + " thread raised an exception", th);
                listener.onFailure(th);
                nALLog = webTransportSocket.log;
                sb = new StringBuilder();
            } catch (Throwable th2) {
                webTransportSocket.log.log(LOG_TAG, str + " thread has finished");
                throw th2;
            }
        }
        sb.append(str);
        sb.append(" thread has finished");
        nALLog.log(LOG_TAG, sb.toString());
    }

    private final void openSession(pdk pdkVar, NALSocket.Listener listener) throws IOException {
        xdk xdkVar = (xdk) pdkVar;
        wdk wdkVar = wdk.b;
        xdkVar.c(wdkVar, new kck(5), new kck(6));
        sdk sdkVar = xdkVar.d;
        sdkVar.b.lock();
        try {
            List list = (List) sdkVar.c.remove(Long.valueOf(xdkVar.c));
            if (list != null) {
                list.forEach(new r5k(3, xdkVar));
                sdkVar.d -= list.size();
            }
            sdkVar.b.unlock();
            listener.onOpen();
            xdk xdkVar2 = (xdk) pdkVar;
            if (xdkVar2.e == wdk.a) {
                ore.k("Session is not opened yet");
                return;
            }
            if (xdkVar2.e != wdkVar) {
                qr7.k("Session is closed");
                return;
            }
            pak pakVarB = ((z7k) xdkVar2.a.b).b(true);
            uak uakVar = pakVarB.e;
            mek mekVar = new mek();
            mekVar.a = pakVarB;
            mekVar.b = uakVar;
            abk abkVar = pakVarB.f;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            int iC = ti8.c(65L, byteBufferAllocate);
            for (int i = 0; i < iC; i++) {
                abkVar.write(byteBufferAllocate.get());
            }
            long j = xdkVar2.c;
            abk abkVar2 = mekVar.a.f;
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(8);
            int iC2 = ti8.c(j, byteBufferAllocate2);
            for (int i2 = 0; i2 < iC2; i2++) {
                abkVar2.write(byteBufferAllocate2.get());
            }
            xdkVar2.k.add(mekVar);
            xdkVar2.l.add(mekVar);
            vdk vdkVar = new vdk(0);
            vdkVar.b = mekVar;
            handleAsync("send", vdkVar, listener, new WebTransportSocket$openSession$1$1(this));
            readStreamData(pdkVar, vdkVar, listener);
        } catch (Throwable th) {
            sdkVar.b.unlock();
            throw th;
        }
    }

    private final void readStreamData(pdk pdkVar, qdk qdkVar, NALSocket.Listener listener) throws IOException {
        try {
            InputStream inputStreamB = qdkVar.b();
            if (inputStreamB == null) {
                throw new IOException("wt stream has no input");
            }
            byte[] bArr = new byte[1024];
            loop0: while (true) {
                try {
                    int iD = ti8.d(inputStreamB);
                    if (iD > bArr.length) {
                        bArr = new byte[iD];
                    }
                    int i = 0;
                    while (i < iD) {
                        int i2 = inputStreamB.read(bArr, i, iD - i);
                        if (i2 < 0) {
                            break loop0;
                        } else {
                            i += i2;
                        }
                    }
                    listener.onMessage(this.compressorDecompressor.decompress(bArr, 0, i));
                } catch (EOFException unused) {
                    this.log.log(LOG_TAG, "Got EOF while trying to parse next packet length. Guess the stream is closed, exit silently");
                }
            }
            this.log.log(LOG_TAG, "stream closed, leave recv loop");
            this.log.log(LOG_TAG, "Read thread has completed");
        } catch (Throwable th) {
            try {
                boolean z = this.released;
                NALLog nALLog = this.log;
                if (z) {
                    nALLog.log(LOG_TAG, "Read thread has completed");
                } else {
                    nALLog.logException(LOG_TAG, "Error on read from wt stream", th);
                    throw th;
                }
            } catch (Throwable th2) {
                this.log.log(LOG_TAG, "Read thread has completed");
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendStreamData(qdk qdkVar, NALSocket.Listener listener) throws IOException {
        ReentrantLock reentrantLock;
        CompressorOutput compressorOutput = new CompressorOutput();
        while (true) {
            try {
                reentrantLock = this.messageQueueLock;
                reentrantLock.lock();
                try {
                    try {
                        this.messageQueueCondition.await();
                        if (this.released) {
                            break;
                        }
                        compressorOutput.setOutput(qdkVar.a());
                        while (!this.messageQueue.isEmpty()) {
                            byte[] bytes = this.messageQueue.remove(0).getBytes(pt2.a);
                            try {
                                this.compressorDecompressor.compress(bytes, 0, bytes.length, compressorOutput);
                                compressorOutput.flush();
                            } catch (IOException e) {
                                this.log.logException(LOG_TAG, "Error on write to wt stream", e);
                                throw e;
                            }
                        }
                        reentrantLock.unlock();
                    } catch (InterruptedException e2) {
                        this.log.logException(LOG_TAG, "Send stream interrputed", e2);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                this.log.log(LOG_TAG, "Write thread has completed");
                throw th2;
            }
        }
        reentrantLock.unlock();
        this.log.log(LOG_TAG, "Write thread has completed");
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket
    public final void close(int code, String reason) {
        try {
            if (!this.released) {
                this.released = true;
                ReentrantLock reentrantLock = this.messageQueueLock;
                reentrantLock.lock();
                try {
                    this.messageQueueCondition.signalAll();
                    reentrantLock.unlock();
                    pdk pdkVar = this.session;
                    if (pdkVar != null) {
                        ((xdk) pdkVar).a(code, reason);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                this.log.logException(LOG_TAG, "Error on close wt session", th2);
            } finally {
                this.compressorDecompressor.release();
            }
        }
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket
    public final void send(String message) {
        ReentrantLock reentrantLock = this.messageQueueLock;
        reentrantLock.lock();
        try {
            this.messageQueue.add(message);
            this.messageQueueCondition.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$Companion;", "", "<init>", "()V", "INITIAL_MESSAGE_SIZE", "", "LOG_TAG", "", "nal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
