package defpackage;

import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.my.tracker.MyTrackerConfig;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.serialization.UnknownFieldException;
import net.jpountz.lz4.LZ4Exception;
import one.me.android.OneMeApplication;
import ru.ok.tamtam.nano.ProtoException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qr7 implements qt9, tt9, MyTrackerConfig.OkHttpClientProvider, MyTracker.AttributionListener, ied {
    public final /* synthetic */ int a;

    public /* synthetic */ qr7(int i) {
        this.a = i;
    }

    public static /* synthetic */ void d() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void e(int i) {
        throw new UnknownFieldException(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void g(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void k(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void l(String str, int i, Object obj, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void o(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void p(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void q(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void s(String str) {
        throw new LZ4Exception(str);
    }

    public static /* synthetic */ void t(Throwable th) throws ProtoException {
        throw new ProtoException(th);
    }

    public static /* synthetic */ void u(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void w(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void x(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void y(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void z(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public boolean A() {
        switch (this.a) {
            case 8:
                return false;
            default:
                int i = OneMeApplication.g;
                return !gm0.c();
        }
    }

    @Override // defpackage.ied
    public boolean a(lfe lfeVar) {
        zv8[] zv8VarArr = jed.g;
        return true;
    }

    @Override // defpackage.tt9
    public int b(Object obj) {
        String str = ((nt9) obj).a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }

    @Override // defpackage.qt9
    public List c(String str, boolean z, boolean z2) {
        return ut9.e(str, z, z2);
    }

    @Override // com.my.tracker.MyTrackerConfig.OkHttpClientProvider
    public qsb getOkHttpClient() {
        fab fabVar = fab.a;
        return ((h5e) ((qzb) fab.b.getValue()).getAccessor().c(1112)).a;
    }

    @Override // com.my.tracker.MyTracker.AttributionListener
    public void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution) {
        fab.d.a(myTrackerAttribution.getDeeplink());
    }
}
