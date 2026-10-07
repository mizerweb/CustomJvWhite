package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.io.EOFException;
import java.lang.reflect.Constructor;
import java.util.ConcurrentModificationException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements c4b, n74, mf7, acj {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    public static /* synthetic */ void c() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void d(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void e(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void n() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void o(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void p(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void r(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void t() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void u(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void v(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override // defpackage.n74
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        switch (this.a) {
            case 17:
                return Integer.valueOf(((yy4) obj).r);
            default:
                return new r75((qt3) obj);
        }
    }

    public Constructor b() {
        switch (this.a) {
            case 19:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(jj6.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(jj6.class).getConstructor(null);
        }
    }

    @Override // defpackage.c4b
    public Object h(fka fkaVar) {
        return wc9.a(fkaVar);
    }

    @Override // defpackage.acj
    public long now() {
        return jt5.a();
    }

    public void w(String str) {
        gm0.Y("OneMeScheduledFuture", str);
    }
}
