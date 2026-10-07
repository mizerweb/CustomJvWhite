package com.my.tracker.core;

import android.app.Application;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.my.tracker.TrackerUtils;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.handlers.AttributionHandler;
import com.my.tracker.core.handlers.MyTrackerActivityHandler;
import com.my.tracker.core.net.HttpCore;
import com.my.tracker.core.net.HttpResult;
import com.my.tracker.core.o.d0;
import com.my.tracker.core.o.k;
import com.my.tracker.core.o.q;
import com.my.tracker.core.o.s;
import com.my.tracker.core.o.x;
import com.my.tracker.core.proto.ByteArrayProtoWriter;
import com.my.tracker.core.proto.ProtoWriter;
import com.my.tracker.core.proto.WriterTools;
import com.my.tracker.core.utils.Consumer;
import defpackage.hed;
import defpackage.np0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b implements EngineCore {
    private final AttributionHandler a;
    private final EngineMiniCore b;
    private final AsyncCore c;
    private final HttpCore d;
    private final d0 e;
    private final EnginePrefs f;
    private final SQLiteDatabase g;
    private final MyTrackerActivityHandler h;
    private final ByteArrayProtoWriter i;
    private final ByteArrayProtoWriter j;
    private final EngineCore.InsertEventTools k;
    private final ByteArrayProtoWriter l;
    private final com.my.tracker.core.proto.a m;
    private final k n;
    public boolean o;
    private long p;

    public b(EngineMiniCore engineMiniCore, AsyncCore asyncCore, com.my.tracker.core.proto.a aVar, d0 d0Var, EnginePrefs enginePrefs, SQLiteDatabase sQLiteDatabase, MyTrackerActivityHandler myTrackerActivityHandler, HttpCore httpCore) {
        ByteArrayProtoWriter byteArrayProtoWriter = new ByteArrayProtoWriter(16384);
        this.i = byteArrayProtoWriter;
        ByteArrayProtoWriter byteArrayProtoWriter2 = new ByteArrayProtoWriter(np0.r);
        this.j = byteArrayProtoWriter2;
        this.k = new EngineCore.InsertEventTools(byteArrayProtoWriter, byteArrayProtoWriter2);
        this.l = new ByteArrayProtoWriter(65536);
        this.o = false;
        this.b = engineMiniCore;
        this.c = asyncCore;
        this.m = aVar;
        this.e = d0Var;
        this.f = enginePrefs;
        this.g = sQLiteDatabase;
        this.h = myTrackerActivityHandler;
        this.a = AttributionHandler.newHandler(this);
        this.n = k.a(this);
        this.d = httpCore;
    }

    public void a(d0 d0Var) {
        String trackerUrl = this.b.getTrackerConfig().getTrackerUrl();
        try {
            com.my.tracker.core.o.b bVarD = d0Var.d();
            try {
                if (bVarD != null) {
                    while (bVarD.moveToNext()) {
                        long jA = bVarD.a();
                        byte[] bArrJ = bVarD.j();
                        this.l.reset();
                        this.l.writeRawBlob(bArrJ);
                        HttpResult httpResultA = a(trackerUrl, this.l);
                        if (httpResultA == null || !httpResultA.successful) {
                            break;
                            break;
                        }
                        String str = httpResultA.response;
                        if (!TextUtils.isEmpty(str)) {
                            this.a.handleServerAttribution(str);
                        }
                        d0Var.a(jA);
                    }
                } else {
                    Tracer.d("MyTrackerEngine error: iterator is null");
                    if (bVarD == null) {
                        return;
                    }
                }
                bVarD.close();
            } catch (Throwable th) {
                if (bVarD != null) {
                    try {
                        bVarD.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            Tracer.e("MyTrackerEngine error: ", th3);
        }
    }

    public void b() {
        this.p = this.f.getLastUpdateTimestampSec();
        this.h.setActionEngineCoreFlush(new hed(13, this));
    }

    public void c() {
        this.o = true;
        flushIfNeeded();
    }

    @Override // com.my.tracker.core.EngineCore
    public void flush() {
        a();
    }

    @Override // com.my.tracker.core.EngineCore
    public void flushIfNeeded() {
        int forcingPeriod;
        if (this.e.f() != 0 || ((forcingPeriod = this.b.getTrackerConfig().getForcingPeriod()) > 0 && forcingPeriod >= this.b.getTimeCore().currentTimeSec() - this.p)) {
            a();
        }
    }

    @Override // com.my.tracker.core.EngineCore
    public Application getApplication() {
        return this.b.getApplication();
    }

    @Override // com.my.tracker.core.EngineCore
    public long getApplicationLastUpdateTimestampSec() {
        return this.p;
    }

    @Override // com.my.tracker.core.EngineCore
    public AsyncCore getAsyncCore() {
        return this.c;
    }

    @Override // com.my.tracker.core.EngineCore
    public EngineMiniCore getEngineMiniCore() {
        return this.b;
    }

    @Override // com.my.tracker.core.EngineCore
    public EnginePrefs getEnginePrefs() {
        return this.f;
    }

    @Override // com.my.tracker.core.EngineCore
    public HttpCore getHttpCore() {
        return this.d;
    }

    @Override // com.my.tracker.core.EngineCore
    public EnginePrefs getPrefs() {
        return this.f;
    }

    @Override // com.my.tracker.core.EngineCore
    public SQLiteDatabase getSQLiteDatabase() {
        return this.g;
    }

    @Override // com.my.tracker.core.EngineCore
    public TimeCore getTimeCore() {
        return this.b.getTimeCore();
    }

    @Override // com.my.tracker.core.EngineCore
    public TrackerConfig getTrackerConfig() {
        return this.b.getTrackerConfig();
    }

    @Override // com.my.tracker.core.EngineCore
    public void handleReferrerAttribution(String str) {
        this.a.handleReferrerAttribution(str);
    }

    @Override // com.my.tracker.core.EngineCore
    public void insertEventInWorker(final long j, final int i, final boolean z, final boolean z2, final long j2, final EngineCore.EventPacker eventPacker) {
        this.b.onEngineWorkerWithEngineCore(new Consumer() { // from class: c6k
            @Override // com.my.tracker.core.utils.Consumer
            public final void accept(Object obj) {
                ((EngineCore) obj).insertEventSync(j, i, z, z2, j2, eventPacker);
            }
        });
    }

    @Override // com.my.tracker.core.EngineCore
    public void insertEventSync(long j, int i, boolean z, boolean z2, long j2, EngineCore.EventPacker eventPacker) {
        try {
            EngineCore.InsertEventTools insertEventTools = this.k;
            insertEventTools.reset();
            byte[] bArrInvoke = eventPacker.invoke(insertEventTools);
            if (bArrInvoke != null) {
                a(j, i, z, z2, j2, bArrInvoke);
            }
        } catch (Throwable th) {
            Tracer.e("MyTrackerRepository error: event serialization failed, type: " + j, th);
        }
    }

    @Override // com.my.tracker.core.EngineCore
    public boolean insertSession(long j, long j2) {
        return this.e.a(j, j2);
    }

    @Override // com.my.tracker.core.EngineCore
    public HttpResult sendHttpPost(String str, byte[] bArr, boolean z) {
        return this.d.doPost(str, bArr, z);
    }

    @Override // com.my.tracker.core.EngineCore
    public void setApplicationLastUpdateTimestampSec(long j) {
        this.p = j;
    }

    @Override // com.my.tracker.core.EngineCore
    public void timespentWritePacketHeader(ProtoWriter protoWriter, long j) {
        TrackerConfig.ReadOnlyCopy readOnlyCopyA = getTrackerConfig().a();
        WriterTools writerToolsA = WriterTools.a(this.i, this.j, readOnlyCopyA, this.b.getCurrentEngineInfoState());
        this.m.a(protoWriter, 1, readOnlyCopyA, this.b.getCurrentEngineInfoState(), j, this.e.e(), writerToolsA);
    }

    private void a(long j, int i, boolean z, boolean z2, long j2, byte[] bArr) {
        if (this.e.a(j, i, z, z2, j2, bArr)) {
            flushIfNeeded();
        }
    }

    public void a(String str, long j, Map map) {
        if (TrackerUtils.paramsAreIncorrect(map)) {
            return;
        }
        EngineCore.InsertEventTools insertEventTools = this.k;
        insertEventTools.reset();
        byte[] bArrA = a(str, map, insertEventTools);
        if (bArrA != null) {
            this.e.a(j, bArrA);
        }
    }

    private byte[] a(String str, Map map, EngineCore.InsertEventTools insertEventTools) {
        try {
            ByteArrayProtoWriter byteArrayProtoWriter = insertEventTools.mainWriter;
            byteArrayProtoWriter.writeMapStringString(1, map, insertEventTools.secondWriter);
            byteArrayProtoWriter.writeField(2, str);
            return byteArrayProtoWriter.toByteArray();
        } catch (Throwable th) {
            Tracer.e("MyTrackerRepository error: event serialization failed, type: custom", th);
            return null;
        }
    }

    public String a(Intent intent) {
        return this.n.a(intent);
    }

    public void a(EngineInfoState engineInfoState) {
        Tracer.d("createAndStorePartialPacket: start");
        TrackerConfig.ReadOnlyCopy readOnlyCopyA = this.b.getTrackerConfig().a();
        this.l.reset();
        int iA = a(this.l, this.e, readOnlyCopyA, engineInfoState, this.m);
        Tracer.d("createAndStorePartialPacket: writeResult=" + iA);
        if (iA == 1) {
            this.e.a();
            this.e.a(this.l.toByteArray());
        } else if (iA == 2) {
            this.e.a();
        }
        this.l.trimToDefaultSize();
    }

    public void a() {
        if (this.o) {
            if (!this.d.isConnected()) {
                Tracer.d("MyTracker: no network connection");
                return;
            }
            this.h.resetFlushTimer();
            String strA = a(this.b.getCurrentEngineInfoState(), this.e);
            if (strA != null) {
                this.a.handleServerAttribution(strA);
            }
            a(this.e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    private String a(EngineInfoState engineInfoState, d0 d0Var) {
        String str;
        HttpResult httpResultA;
        TrackerConfig.ReadOnlyCopy readOnlyCopyA = this.b.getTrackerConfig().a();
        String trackerUrl = this.b.getTrackerConfig().getTrackerUrl();
        this.l.reset();
        if (a(this.l, d0Var, readOnlyCopyA, engineInfoState, this.m) == 1 && (httpResultA = a(trackerUrl, this.l)) != null) {
            if (httpResultA.successful) {
                Tracer.d("Events were sent successfully");
                d0Var.a();
            }
            str = httpResultA.response;
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
        } else {
            str = null;
        }
        this.l.trimToDefaultSize();
        return str;
    }

    private static int a(ProtoWriter protoWriter, d0 d0Var, TrackerConfig.ReadOnlyCopy readOnlyCopy, EngineInfoState engineInfoState, com.my.tracker.core.proto.a aVar) {
        if (!d0Var.h()) {
            return 3;
        }
        return aVar.a(protoWriter, readOnlyCopy, engineInfoState, d0Var.g(), d0Var.e(), d0Var.b(), d0Var.c());
    }

    private HttpResult a(String str, ByteArrayProtoWriter byteArrayProtoWriter) {
        if (this.m.a(byteArrayProtoWriter, this.b.getTimeCore().currentTimeSec())) {
            return this.d.doPost(str, byteArrayProtoWriter.toByteArray(), true);
        }
        return null;
    }

    public static b a(a aVar, AsyncCore asyncCore, d0 d0Var, EnginePrefs enginePrefs, SQLiteDatabase sQLiteDatabase, MyTrackerActivityHandler myTrackerActivityHandler, q qVar) {
        return new b(aVar, asyncCore, com.my.tracker.core.proto.a.a(s.a(aVar.getApplication(), enginePrefs), qVar), d0Var, enginePrefs, sQLiteDatabase, myTrackerActivityHandler, x.a(aVar.getTrackerConfig(), aVar.getApplication()));
    }
}
