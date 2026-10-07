package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class h45 extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(uqi.e);
                return simpleDateFormat;
            case 1:
                return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
            case 2:
                return new SimpleDateFormat("HH:mm:ss", Locale.US);
            case 3:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
            case 4:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return zjl.d();
                }
                if (Looper.myLooper() != null) {
                    return new us7(new Handler(Looper.myLooper()));
                }
                return null;
            case 5:
                return new zcj();
            case 6:
                return Boolean.FALSE;
            default:
                return 0L;
        }
    }
}
