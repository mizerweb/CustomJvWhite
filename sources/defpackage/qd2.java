package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class qd2 implements c56 {
    public final String a;

    public qd2(String str) {
        this.a = nbh.u("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = nbh.v(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return zo5.p(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.a, str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", c(this.a, str, objArr));
        }
    }

    @Override // defpackage.c56
    public Object e() {
        return this;
    }

    @Override // defpackage.c56
    public boolean n(CharSequence charSequence, int i, int i2, l9i l9iVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
            return true;
        }
        l9iVar.c = (l9iVar.c & 3) | 4;
        return false;
    }
}
