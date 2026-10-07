package com.my.tracker.core.o;

import com.my.tracker.core.proto.ExternalProtoWritersSetter;
import com.my.tracker.core.proto.ProtoWriter;
import com.my.tracker.core.proto.WriterTools;
import com.my.tracker.core.utils.BiConsumer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class q implements ExternalProtoWritersSetter {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    private q() {
    }

    public synchronized void a(int i, ProtoWriter protoWriter, WriterTools writerTools) {
        BiConsumer biConsumer = (BiConsumer) this.a.get(Integer.valueOf(i));
        if (biConsumer != null) {
            writerTools.reset();
            biConsumer.accept(protoWriter, writerTools);
        }
    }

    @Override // com.my.tracker.core.proto.ExternalProtoWritersSetter
    public synchronized void setWriter(int i, BiConsumer biConsumer) {
        this.a.put(Integer.valueOf(i), biConsumer);
    }

    @Override // com.my.tracker.core.proto.ExternalProtoWritersSetter
    public synchronized void setWriterArgString(int i, BiConsumer biConsumer) {
        this.b.put(Integer.valueOf(i), biConsumer);
    }

    public static q a() {
        return new q();
    }

    public synchronized void a(int i, ProtoWriter protoWriter, String str) {
        BiConsumer biConsumer = (BiConsumer) this.b.get(Integer.valueOf(i));
        if (biConsumer != null) {
            biConsumer.accept(protoWriter, str);
        }
    }
}
