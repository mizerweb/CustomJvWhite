package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dxd implements cub, rah {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ dxd(int i, Context context, boolean z) {
        this.a = i;
        this.b = context;
        this.c = z;
    }

    @Override // defpackage.cub
    public void a(Object obj) {
        SharedPreferences.Editor editorEdit = fml.b(this.b).edit();
        editorEdit.putBoolean("proxy_retention", this.c);
        editorEdit.apply();
    }

    @Override // defpackage.rah
    public Object get() {
        int i = this.a;
        boolean z = this.c;
        Context context = this.b;
        switch (i) {
            case 1:
                return woh.g(context, z, true);
            case 2:
                return woh.o(context, false, z);
            case 3:
                return woh.o(context, true, z);
            default:
                return woh.s(context, z);
        }
    }
}
