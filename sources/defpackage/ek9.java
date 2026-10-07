package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class ek9 extends mdh implements tf7 {
    public /* synthetic */ long e;
    public /* synthetic */ String f;

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        ek9 ek9Var = new ek9(3, (lq4) obj3);
        ek9Var.e = jLongValue;
        ek9Var.f = (String) obj2;
        return ek9Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        long j = this.e;
        String str = this.f;
        ch3.d0(obj);
        if (j == -1) {
            str = null;
        }
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }
}
