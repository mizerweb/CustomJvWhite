package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class v69 {
    public final String a;
    public final boolean b;

    public v69(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v69) {
            String str = ((v69) obj).a;
            String str2 = this.a;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                if (this.b) {
                    return str2.equals(str);
                }
                Pattern pattern = xoh.a;
                if (str2.length() == str.length() && str.regionMatches(true, 0, str2, 0, str2.length())) {
                    return true;
                }
            }
        }
        return false;
    }
}
