package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pk0 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ pk0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.a;
        a8g a8gVar = pq3.j;
        Context context = this.b;
        switch (i2) {
            case 0:
                a8gVar.e(context).m();
                i = -1;
                break;
            case 1:
                a8gVar.e(context).m();
                i = -1728053248;
                break;
            default:
                CharSequence charSequenceB = ((ynh) obj).b(context);
                return charSequenceB == null ? "" : charSequenceB;
        }
        return Integer.valueOf(i);
    }
}
