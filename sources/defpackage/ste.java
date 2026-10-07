package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ste {
    public final /* synthetic */ int a;
    public final String b;

    public ste(String str, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = str;
                break;
            case 3:
                this.b = nbh.u("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
                break;
            default:
                str.getClass();
                this.b = str;
                break;
        }
    }

    public static CharSequence b(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static String d(String str, String str2, Object... objArr) {
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

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(b(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    sb.append(b(it.next()));
                }
            }
        } catch (IOException e) {
            c.e(e);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", d(this.b, str, objArr));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "TracerFeature::".concat(this.b);
            default:
                return super.toString();
        }
    }

    public ste(c46 c46Var) {
        this.a = 0;
        this.b = ste.class.getName();
    }
}
