package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s6l {
    private final Map a;
    private final Map b;
    private final zpb c;

    public s6l(Map map, Map map2, zpb zpbVar) {
        this.a = map;
        this.b = map2;
        this.c = zpbVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new j6l(byteArrayOutputStream, this.a, this.b, this.c).t(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
