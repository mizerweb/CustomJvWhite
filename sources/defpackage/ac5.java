package defpackage;

import android.util.Log;
import com.vk.push.common.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class ac5 implements Logger {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ ac5(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.vk.push.common.Logger
    public final Logger createLogger(String str) {
        switch (this.a) {
            case 0:
                return new ac5(this.b + ':' + str, 0);
            default:
                return new ac5("rustore-".concat(str), 1);
        }
    }

    @Override // com.vk.push.common.Logger
    public final void debug(String str, Throwable th) {
        int i = this.a;
        String str2 = this.b;
        switch (i) {
            case 0:
                Log.d(str2, str, th);
                break;
            default:
                gm0.l(str2, str, th);
                break;
        }
    }

    @Override // com.vk.push.common.Logger
    public final void error(String str, Throwable th) {
        int i = this.a;
        String str2 = this.b;
        switch (i) {
            case 0:
                Log.e(str2, str, th);
                break;
            default:
                gm0.V(str2, str, th);
                break;
        }
    }

    @Override // com.vk.push.common.Logger
    public final void info(String str, Throwable th) {
        int i = this.a;
        String str2 = this.b;
        switch (i) {
            case 0:
                Log.i(str2, str, th);
                break;
            default:
                gm0.x(str2, str, th);
                break;
        }
    }

    @Override // com.vk.push.common.Logger
    public final void verbose(String str, Throwable th) {
        int i = this.a;
        String str2 = this.b;
        switch (i) {
            case 0:
                Log.v(str2, str, th);
                break;
            default:
                gm0.T(str2, str, th);
                break;
        }
    }

    @Override // com.vk.push.common.Logger
    public final void warn(String str, Throwable th) {
        int i = this.a;
        String str2 = this.b;
        switch (i) {
            case 0:
                Log.w(str2, str, th);
                break;
            default:
                gm0.V(str2, str, th);
                break;
        }
    }

    @Override // com.vk.push.common.Logger
    public final Logger createLogger(Object obj) {
        switch (this.a) {
            case 0:
                break;
        }
        return Logger.DefaultImpls.createLogger(this, obj);
    }
}
