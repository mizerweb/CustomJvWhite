package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class v2c {
    public final Context a;
    public final p4c b;
    public final ny8 c;

    public v2c(Context context, p4c p4cVar, ny8 ny8Var) {
        this.a = context;
        this.b = p4cVar;
        this.c = ny8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence a(String str, List list, boolean z, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            CharSequence charSequenceD = "";
            p4c p4cVar = this.b;
            if (i >= length) {
                return (!z || strArr.length == 0) ? "" : TextUtils.concat(p4cVar.k.d(str), " ", a.a1(strArr));
            }
            String str2 = strArr[i];
            if (str2 != null && str2.length() != 0 && b().f(str2, list)) {
                CharSequence charSequenceD2 = p4cVar.k.d(str);
                if (b().f(str2.toString(), list)) {
                    j7c j7cVarB = b();
                    String string = str2.toString();
                    charSequenceD = j7c.d(string, j7cVarB.c().c(string.toString(), list), pq3.j.e(this.a).m());
                }
                return TextUtils.concat(charSequenceD2, " ", charSequenceD);
            }
            i++;
        }
    }

    public final j7c b() {
        return (j7c) this.c.getValue();
    }
}
