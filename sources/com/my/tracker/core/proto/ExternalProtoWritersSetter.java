package com.my.tracker.core.proto;

import com.my.tracker.core.utils.BiConsumer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public interface ExternalProtoWritersSetter {

    /* JADX INFO: loaded from: classes2.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Writer {
        public static final int CELL_AND_WIFI_INFO = 4;
        public static final int LOCATION_INFO = 2;
        public static final int NETWORK_INFO = 3;
        public static final int REMOTE_CONFIG_STRING = 1;
    }

    void setWriter(int i, BiConsumer<ProtoWriter, WriterTools> biConsumer);

    void setWriterArgString(int i, BiConsumer<ProtoWriter, String> biConsumer);
}
