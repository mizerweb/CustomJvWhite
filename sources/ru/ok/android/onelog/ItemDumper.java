package ru.ok.android.onelog;

import defpackage.c;
import defpackage.ckc;
import defpackage.h2d;
import defpackage.mv8;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class ItemDumper {

    @Deprecated
    public static final String COUNT = "count";

    @Deprecated
    public static final String CUSTOM = "custom";

    @Deprecated
    public static final String DATA = "data";

    @Deprecated
    public static final String GROUPS = "groups";

    @Deprecated
    public static final String NETWORK = "network";

    @Deprecated
    public static final String OPERATION = "operation";

    @Deprecated
    public static final String TIME = "time";

    @Deprecated
    public static final String TIMESTAMP = "timestamp";

    @Deprecated
    public static final String TYPE = "type";

    @Deprecated
    public static final String UID = "uid";

    private ItemDumper() {
    }

    @Deprecated
    public static String dump(OneLogItem oneLogItem) {
        try {
            StringWriter stringWriter = new StringWriter();
            dump(oneLogItem, stringWriter);
            return stringWriter.toString();
        } catch (IOException unused) {
            c.e("WTF! StringWriter thrown IOException");
            return null;
        }
    }

    @Deprecated
    public static void dump(OneLogItem oneLogItem, OutputStream outputStream) throws IOException {
        dump(oneLogItem, new ckc(outputStream));
    }

    @Deprecated
    public static void dump(OneLogItem oneLogItem, Writer writer) throws IOException {
        h2d h2dVar = new h2d(writer);
        dump(oneLogItem, h2dVar);
        h2dVar.flush();
    }

    @Deprecated
    public static void dump(OneLogItem oneLogItem, mv8 mv8Var) throws IOException {
        OneLogItemSerializer.INSTANCE.serialize(mv8Var, oneLogItem);
    }
}
