package com.my.tracker.userlifecycle.o;

import com.my.tracker.TrackerUtils;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.EngineMiniCore;
import com.my.tracker.core.proto.ByteArrayProtoWriter;
import defpackage.c5f;
import defpackage.zj1;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final EngineMiniCore a;

    public a(EngineMiniCore engineMiniCore) {
        this.a = engineMiniCore;
    }

    public void a(final String str, final String str2, Map map) {
        long jCurrentTimeSec = this.a.getTimeCore().currentTimeSec();
        final Map<String, String> mapCopyParams = TrackerUtils.copyParams(map);
        final boolean z = this.a.getCurrentEngineInfoState().kidMode;
        this.a.insertEventWithEngineCore(7L, 18, true, true, jCurrentTimeSec, new EngineCore.EventPacker() { // from class: j2k
            @Override // com.my.tracker.core.EngineCore.EventPacker
            public final byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
                return this.a.a(mapCopyParams, z, str, str2, insertEventTools);
            }
        });
    }

    public void b(String str, String str2, Map map) {
        this.a.insertEventWithEngineCore(8L, 19, true, true, this.a.getTimeCore().currentTimeSec(), new zj1(this, TrackerUtils.copyParams(map), this.a.getCurrentEngineInfoState().kidMode, str, str2));
    }

    public static a a(EngineMiniCore engineMiniCore) {
        return new a(engineMiniCore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] b(Map map, boolean z, String str, String str2, EngineCore.InsertEventTools insertEventTools) {
        if (TrackerUtils.paramsAreIncorrect(map)) {
            return null;
        }
        return a(z, str, str2, map, insertEventTools);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] a(Map map, boolean z, String str, String str2, EngineCore.InsertEventTools insertEventTools) {
        if (TrackerUtils.paramsAreIncorrect(map)) {
            return null;
        }
        return a(z, str, str2, map, insertEventTools);
    }

    public byte[] b(Map map, EngineCore.InsertEventTools insertEventTools) {
        ByteArrayProtoWriter byteArrayProtoWriter = insertEventTools.mainWriter;
        byteArrayProtoWriter.writeMapStringString(1, map, insertEventTools.secondWriter);
        return byteArrayProtoWriter.toByteArray();
    }

    public byte[] a(boolean z, String str, String str2, Map map, EngineCore.InsertEventTools insertEventTools) {
        ByteArrayProtoWriter byteArrayProtoWriter = insertEventTools.mainWriter;
        byteArrayProtoWriter.writeMapStringString(1, map, insertEventTools.secondWriter);
        if (!z) {
            byteArrayProtoWriter.writeField(2, str);
            byteArrayProtoWriter.writeField(3, str2);
        }
        return byteArrayProtoWriter.toByteArray();
    }

    public void a(Map map) {
        this.a.insertEventWithEngineCore(9L, 20, false, true, this.a.getTimeCore().currentTimeSec(), new c5f(this, 15, TrackerUtils.copyParams(map)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] a(Map map, EngineCore.InsertEventTools insertEventTools) {
        if (TrackerUtils.paramsAreIncorrect(map)) {
            return null;
        }
        return b(map, insertEventTools);
    }
}
