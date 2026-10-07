package com.my.tracker.applifecycle.o;

import android.app.Activity;
import android.text.TextUtils;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.handlers.MyTrackerActivityHandler;
import com.my.tracker.core.proto.ByteArrayProtoWriter;
import com.my.tracker.core.utils.BiConsumer;
import com.my.tracker.core.utils.TimePoint;
import defpackage.c5f;
import defpackage.d7i;
import defpackage.ore;
import defpackage.qo;
import defpackage.sck;
import defpackage.wg5;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final EngineCore.EventPacker b = new ore(17);
    private final MyTrackerActivityHandler a;

    public d(MyTrackerActivityHandler myTrackerActivityHandler) {
        this.a = myTrackerActivityHandler;
    }

    public void a(EngineCore engineCore, String str, String str2, long j, long j2) {
        engineCore.insertEventInWorker(14L, 14, true, false, engineCore.getTimeCore().currentTimeSec(), new sck(this, str, str2, j, j2, 0));
    }

    /* JADX INFO: renamed from: b */
    public byte[] a(long j, String str, e.a aVar, EngineCore.InsertEventTools insertEventTools) {
        ByteArrayProtoWriter byteArrayProtoWriter = insertEventTools.mainWriter;
        ByteArrayProtoWriter byteArrayProtoWriter2 = insertEventTools.secondWriter;
        byteArrayProtoWriter.writeField(1, j);
        if (!TextUtils.isEmpty(str)) {
            byteArrayProtoWriter2.writeField(1, str);
        }
        if (aVar != null) {
            byteArrayProtoWriter2.writeField(2, aVar.a);
            byteArrayProtoWriter2.writeField(3, aVar.b);
            byteArrayProtoWriter2.writeField(4, aVar.c);
        }
        if (byteArrayProtoWriter2.size() > 0) {
            byteArrayProtoWriter.writeField(2, byteArrayProtoWriter2);
        }
        return byteArrayProtoWriter.toByteArray();
    }

    /* JADX INFO: renamed from: c */
    public byte[] a(String str, String str2, long j, long j2, EngineCore.InsertEventTools insertEventTools) {
        ByteArrayProtoWriter byteArrayProtoWriter = insertEventTools.mainWriter;
        byteArrayProtoWriter.writeField(1, str);
        if (!TextUtils.isEmpty(str2)) {
            byteArrayProtoWriter.writeField(2, str2);
        }
        byteArrayProtoWriter.writeField(3, j2);
        byteArrayProtoWriter.writeField(4, j);
        return byteArrayProtoWriter.toByteArray();
    }

    /* JADX INFO: renamed from: d */
    public byte[] b(String str, String str2, long j, long j2, EngineCore.InsertEventTools insertEventTools) {
        ByteArrayProtoWriter byteArrayProtoWriter = insertEventTools.mainWriter;
        byteArrayProtoWriter.writeField(1, str);
        if (!TextUtils.isEmpty(str2)) {
            byteArrayProtoWriter.writeField(2, str2);
        }
        byteArrayProtoWriter.writeField(3, j2);
        byteArrayProtoWriter.writeField(4, j);
        return byteArrayProtoWriter.toByteArray();
    }

    public static d a(MyTrackerActivityHandler myTrackerActivityHandler) {
        return new d(myTrackerActivityHandler);
    }

    public void a() {
        this.a.setActionTrackLaunch(new BiConsumer() { // from class: uck
            @Override // com.my.tracker.core.utils.BiConsumer
            public final void accept(Object obj, Object obj2) {
                long jLongValue = ((Long) obj2).longValue();
                this.a.a((EngineCore) obj, jLongValue);
            }
        });
    }

    public void a(EngineCore engineCore, Activity activity, TimePoint timePoint) {
        this.a.manualOnActivityStarted(engineCore, activity, timePoint);
    }

    public static /* synthetic */ byte[] a(EngineCore.InsertEventTools insertEventTools) {
        return new byte[0];
    }

    public void a(EngineCore engineCore, long j) {
        engineCore.insertEventSync(3L, 11, engineCore.insertSession(j, engineCore.getPrefs().getLastStopTimestampAndClearSec()), true, j, b);
    }

    public void a(EngineCore engineCore, long j, long j2, String str, e.a aVar) {
        engineCore.insertEventSync(1L, 12, true, false, j, new wg5(this, j2, str, aVar, 5));
    }

    public void a(EngineCore engineCore, long j, String str, String str2, String str3, String str4, String str5) {
        engineCore.insertEventSync(5L, 17, true, false, j, new qo(this, str, str2, str3, str4, str5));
    }

    public void a(EngineCore engineCore, long j, String str, String str2) {
        engineCore.insertEventSync(2L, 13, true, false, j, new d7i((Object) this, str, str2, 3));
    }

    public void a(EngineCore engineCore, long j, String str) {
        engineCore.insertEventSync(33L, 41, true, false, j, new c5f(this, 16, str));
    }

    /* JADX INFO: renamed from: b */
    public byte[] a(String str, String str2, String str3, String str4, String str5, EngineCore.InsertEventTools insertEventTools) {
        ByteArrayProtoWriter byteArrayProtoWriter = insertEventTools.mainWriter;
        ByteArrayProtoWriter byteArrayProtoWriter2 = insertEventTools.secondWriter;
        byteArrayProtoWriter.writeField(1, str3);
        byteArrayProtoWriter.writeField(2, str4);
        byteArrayProtoWriter.writeField(3, str);
        byteArrayProtoWriter.writeField(4, str2);
        if (!TextUtils.isEmpty(str5)) {
            byteArrayProtoWriter2.writeField(1, str5);
            if (byteArrayProtoWriter2.size() > 0) {
                byteArrayProtoWriter.writeField(5, byteArrayProtoWriter2);
            }
        }
        return byteArrayProtoWriter.toByteArray();
    }

    /* JADX INFO: renamed from: b */
    public byte[] a(String str, EngineCore.InsertEventTools insertEventTools) {
        ByteArrayProtoWriter byteArrayProtoWriter = insertEventTools.mainWriter;
        byteArrayProtoWriter.writeField(1, str);
        return byteArrayProtoWriter.toByteArray();
    }

    public void b(EngineCore engineCore, String str, String str2, long j, long j2) {
        engineCore.insertEventInWorker(31L, 39, true, false, engineCore.getTimeCore().currentTimeSec(), new sck(this, str, str2, j, j2, 1));
    }

    /* JADX INFO: renamed from: b */
    public byte[] a(String str, String str2, EngineCore.InsertEventTools insertEventTools) {
        ByteArrayProtoWriter byteArrayProtoWriter = insertEventTools.mainWriter;
        byteArrayProtoWriter.writeField(1, str);
        if (!TextUtils.isEmpty(str2)) {
            byteArrayProtoWriter.writeField(2, str2);
        }
        return byteArrayProtoWriter.toByteArray();
    }
}
